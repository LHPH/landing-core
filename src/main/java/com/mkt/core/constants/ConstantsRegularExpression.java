package com.mkt.core.constants;

public class ConstantsRegularExpression {
	
	public static final String MESSAGE_ERROR_MAX_MIN_LENGTH="La cadena no cumple con la longitud minima o maxima requerida";
	public static final String MESSAGE_ERROR_PATTERN="La cadena no tiene el formato adecuado";
	public static final String MESSAGE_ERROR_REQUIRED="La cadena es requerida";
	
	public static final String REGEX_NAME="[a-zA-Z]+(\\s[a-zA-Z]+)*";
	public static final String REGEX_PHONES="[0-9]{10}";
	public static final String REGEX_EMAIL="(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
	public static final String REGEX_NUMERICS="[0-9]+";
	
	private ConstantsRegularExpression() {}

}
