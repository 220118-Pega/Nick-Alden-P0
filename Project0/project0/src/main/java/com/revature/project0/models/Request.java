package com.revature.project0.models;

public class Request {
	private int id;
	private String  reason;
	private int amount;
	private Request request;
	
	public Request(int id, String reason, int amount, Request request) {
		super();
		this.id = id;
		this.reason = reason;
		this.amount = amount;
		this.request = request;
	}
	
	public Request() {
		
	}

	public int getId() {
		return id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}
	
	
}
