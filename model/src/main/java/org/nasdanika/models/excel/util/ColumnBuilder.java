package org.nasdanika.models.excel.util;

import java.util.List;

import org.nasdanika.models.excel.RowSheet;

public interface ColumnBuilder<T> {
	
	List<RowBuilder> getHeaderBuilders();
	
	List<RowBuilder> getElementBuilders(T element);
	
	List<RowBuilder> getFooterBuilders();
	
	void buildDescription(RowSheet rowSheet);
	
	/**
	 * Number of columns/cells per row this builder builds
	 * @return
	 */
	int width();

}
