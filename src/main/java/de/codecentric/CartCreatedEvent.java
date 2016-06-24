package de.codecentric;

import java.io.Serializable;

/**
 * A cart. E.g. a shopping cart. Example event type.
 * 
 * @author berthold.schulte@codecentric.de
 *
 */
public class CartCreatedEvent implements Serializable {

	private static final long serialVersionUID = -6915960334227425088L;
	private int totalAmount;
	private String billingCountry;
	private String type = this.getClass().getCanonicalName();

	public CartCreatedEvent(int amount, String billingCountry) {
		this.totalAmount = amount;
		this.billingCountry = billingCountry;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public String getBillingCountry() {
		return billingCountry;
	}

}
