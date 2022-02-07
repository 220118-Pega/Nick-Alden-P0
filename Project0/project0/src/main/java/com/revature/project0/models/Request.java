package com.revature.project0.models;

// create the main class the actual reimbursement request
// properties of the reimbursement requests
public class Request {
	private int id;
	private String  reason;
	private float amount;
	private Status type;
	
	
	public Request(int id, String reason, float amount, Status type) {
		super();
		this.id = id;
		this.reason = reason;
		this.amount = amount;
		this.type = type;
	}
	
	public Request() {
		
	}
// getters and setters 
	public int getId() {
		return id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Status getType() {
		return type;
	}

	public void setType(Status type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", reason=" + reason + ", amount=" + amount + ", type=" + type + "]";
	}
	
	
}
