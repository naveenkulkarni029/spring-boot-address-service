package org.nbk.demo.employees.addresses.domain.response;

public class ResponseAddress {

	private String message = "Created Successfully";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponseAddress [message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}
}