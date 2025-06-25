package org.nasdanika.models.excel.util;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

import org.nasdanika.common.Util;
import org.nasdanika.models.excel.CellRow;
import org.nasdanika.models.excel.RowSheet;

/**
 * Column builder with a single header row, no footer row, and a single description row
 * @param <T>
 */
public abstract class TitleAndDescriptionColumnBuilder<T> implements ColumnBuilder<T> {
	
	/**
	 * Aggregates value to generate footer(s)
	 * @param <T>
	 */
	public interface Aggregator<T> {
		
		void add(T value);
		
		List<RowBuilder> getFooterBuilders();
		
		static <T> Aggregator<T> nop() {
			return new Aggregator<T>() {

				@Override
				public void add(T value) {
					
				}

				@Override
				public List<RowBuilder> getFooterBuilders() {
					return Collections.emptyList();
				}
				
			};
		}
		
		static <N extends Number> Aggregator<N> totalAggregator() {
			return new Aggregator<N>() {
				
				private double total;

				@Override
				public void add(N value) {
					if (value != null) {
						total += value.doubleValue();
					}					
				}

				@Override
				public List<RowBuilder> getFooterBuilders() {
					return Collections.singletonList(row -> {
						if (total == 0) {
							row.addBlankCell();
						} else {
							row.addNumericCell(total);
						}
					});
				}
				
			}; 			
			
		}
		
	}
	
	protected String title;
	protected String description;
	
	protected TitleAndDescriptionColumnBuilder(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	@Override
	public List<RowBuilder> getHeaderBuilders() {
		return Collections.singletonList(row -> {
			if (Util.isBlank(title)) {
				row.addBlankCell();
			} else {
				row.addStringCell(title);
			}
			for (int i = 1; i < width(); ++i) {
				row.addBlankCell();
			}
		});
	}
	
	@Override
	public void buildDescription(RowSheet rowSheet) {
		CellRow row = rowSheet.addCellRow();
		if (Util.isBlank(title)) {
			row.addBlankCell();
		} else {
			row.addStringCell(title);
		}
		if (Util.isBlank(description)) {
			row.addBlankCell();
		} else {
			row.addStringCell(description);
		}
		// Total(s)
		boolean pad = false; // No padding for the first footer
		for (RowBuilder footerBuilder: getFooterBuilders()) {
			if (pad) {
				row.addBlankCell();
				row.addBlankCell();
			}
			footerBuilder.build(row);			
			pad = true;
		}		
	}
	
	public static <T> ColumnBuilder<T> booleanColumnBuilder(
			String title, 
			String description, 
			Function<T,Boolean> valueProvider,
			Aggregator<Boolean> aggregator) {
		
		return new TitleAndDescriptionColumnBuilder<T>(title, description) {

			@Override
			public List<RowBuilder> getElementBuilders(T element) {
				return Collections.singletonList(row -> {
					Boolean value = valueProvider.apply(element);
					if (aggregator != null) {
						aggregator.add(value);
					}
					if (value == null) {
						row.addBlankCell();
					} else {
						row.addBooleanCell(value);
					}
				});
			}

			@Override
			public List<RowBuilder> getFooterBuilders() {
				return aggregator == null ? Collections.emptyList() : aggregator.getFooterBuilders();
			}

			@Override
			public int width() {
				return 1;
			}
			
		};
	}
	
	public static <T> ColumnBuilder<T> dateColumnBuilder(
			String title, 
			String description, 
			Function<T,Date> valueProvider,
			Aggregator<Date> aggregator) {
		return new TitleAndDescriptionColumnBuilder<T>(title, description) {

			@Override
			public List<RowBuilder> getElementBuilders(T element) {
				return Collections.singletonList(row -> {
					Date value = valueProvider.apply(element);
					if (aggregator != null) {
						aggregator.add(value);
					}
					if (value == null) {
						row.addBlankCell();
					} else {
						row.addDateCell(value);
					}
				});
			}

			@Override
			public List<RowBuilder> getFooterBuilders() {
				return aggregator == null ? Collections.emptyList() : aggregator.getFooterBuilders();
			}

			@Override
			public int width() {
				return 1;
			}
			
		};
	}
	
	public static <T, N extends Number> ColumnBuilder<T> numericColumnBuilder(
			String title, 
			String description, 
			Function<T,N> valueProvider,
			Aggregator<N> aggregator) {
		return new TitleAndDescriptionColumnBuilder<T>(title, description) {

			@Override
			public List<RowBuilder> getElementBuilders(T element) {
				return Collections.singletonList(row -> {
					N value = valueProvider.apply(element);
					if (aggregator != null) {
						aggregator.add(value);
					}
					if (value == null) {
						row.addBlankCell();
					} else {
						double dValue = value.doubleValue();
						if (dValue == 0) {
							row.addBlankCell();
						} else {
							row.addNumericCell(dValue);
						}
					}
				});
			}

			@Override
			public List<RowBuilder> getFooterBuilders() {
				return aggregator == null ? Collections.emptyList() : aggregator.getFooterBuilders();
			}

			@Override
			public int width() {
				return 1;
			}
			
		};
	}
	
	public static <T> ColumnBuilder<T> stringColumnBuilder(
			String title, 
			String description, 
			Function<T,String> valueProvider,
			Aggregator<String> aggregator) {
		return new TitleAndDescriptionColumnBuilder<T>(title, description) {

			@Override
			public List<RowBuilder> getElementBuilders(T element) {
				return Collections.singletonList(row -> {
					String value = valueProvider.apply(element);
					if (aggregator != null) {
						aggregator.add(value);
					}
					if (value == null) {
						row.addBlankCell();
					} else {
						row.addStringCell(value);
					}
				});
			}

			@Override
			public List<RowBuilder> getFooterBuilders() {
				return aggregator == null ? Collections.emptyList() : aggregator.getFooterBuilders();
			}

			@Override
			public int width() {
				return 1;
			}
			
		};
	}
	
	public static <T> ColumnBuilder<T> hyperlinkColumnBuilder(
			String title, 
			String description, 
			Function<T,String> valueProvider,
			Function<T,String> addressProvider,
			Aggregator<String> aggregator) {
		return new TitleAndDescriptionColumnBuilder<T>(title, description) {

			@Override
			public List<RowBuilder> getElementBuilders(T element) {
				return Collections.singletonList(row -> {
					String value = valueProvider.apply(element);
					if (aggregator != null) {
						aggregator.add(value);
					}
					if (value == null) {
						row.addBlankCell();
					} else {
						String address = addressProvider.apply(element);
						if (Util.isBlank(address)) {
							row.addStringCell(value);
						} else {
							row.addHyperlinkCell(value, address);
						}
					}
				});
			}

			@Override
			public List<RowBuilder> getFooterBuilders() {
				return aggregator == null ? Collections.emptyList() : aggregator.getFooterBuilders();
			}

			@Override
			public int width() {
				return 1;
			}
			
		};
	}

}
