package com.app.entity;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart extends BaseEntity {

	
	@OneToMany(mappedBy = "cart") // one cart will have may cartItems
	private Set<CartItem> cartItem =new HashSet<CartItem>(); //cart will have HashSet/ list of cartItems
	
	@OneToOne
	private User user;

	
	public Cart(Set<CartItem> cartItem) {
		super();
		this.cartItem = cartItem;
	}
	
	

	
	
	
	
	
	
}
