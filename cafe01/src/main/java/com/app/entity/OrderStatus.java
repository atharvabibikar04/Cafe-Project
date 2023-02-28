package com.app.entity;

public enum OrderStatus {
	
	CANCELLED {
		@Override
		public String orderStatusDescription() {
			return "Order was rejected";
		}
	},

	PROCESSING {
		@Override
		public String orderStatusDescription() {
			return "Order is being processed";
		}
	},
	DELIVERED {
		@Override
		public String orderStatusDescription(){
			return "Customer received products";
		}
	};

	public abstract String orderStatusDescription();
	
}
