package com.target.myretail.model;

import org.springframework.data.annotation.Id;

public class Price {
	@Id
	private String id;
	private String value;
	private String currencyCode;

	public Price() {}

	public Price(String id, String value, String currencyCode) {
		this.id = id;
		this.value = value;
		this.currencyCode = currencyCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	@Override
	public String toString() {
		return String.format(
				"current_price"
		);
	}
}
