package com.bytehonor.sdk.define.bytehonor.error;

public class ParameterExcption extends StandardException {

	private static final long serialVersionUID = 4735132729826163119L;

	public ParameterExcption() {
		super();
		this.setCode(400);
	}

	public ParameterExcption(String message) {
		super(400, message);
	}
}
