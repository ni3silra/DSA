package com.enums;

public enum EmpCode {

	ASSOCIATE, SENIOR_ASSOCIATE, MANAGER, SENIOR_MANAGER;

	// also implement this method properly
	public static EmpCode getEnum(int code) {

		switch (code) {
		case 10001:
			return ASSOCIATE;
		case 10002:
			return SENIOR_ASSOCIATE;
		case 10003:
			return MANAGER;
		case 10004:
			return SENIOR_MANAGER;
		default:
			throw new IllegalArgumentException();
		}
	}

} // end of public enum EmpCode
//