package org.openmrs.module.kenyaemr.cashier.api.model;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.OpenmrsData;
import org.openmrs.module.kenyaemr.cashier.api.base.entity.model.BaseSerializableOpenmrsMetadata;
import org.openmrs.module.stockmanagement.api.model.StockItem;

import java.math.BigDecimal;

public class ItemPrice extends BaseOpenmrsData {
	public static final long serialVersionUID = 0L;

	private Integer itemPriceId;

	private String name;
	private BigDecimal price;
	private StockItem item;

	public ItemPrice() {
		super();
	}

	public ItemPrice(BigDecimal price, String name) {
		super();

		this.price = price;
		setName(name);
	}

	@Override
	public Integer getId() {
		return itemPriceId;
	}

	@Override
	public void setId(Integer id) {
		itemPriceId = id;
	}

	public StockItem getItem() {
		return item;
	}

	public void setItem(StockItem item) {
		this.item = item;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
