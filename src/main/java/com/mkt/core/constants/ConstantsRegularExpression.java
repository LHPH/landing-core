package com.mkt.core.constants;

public class ConstantsRegularExpression {
	
	public static final String MESSAGE_ERROR_MAX_MIN_LENGTH="La cadena no cumple con la longitud minima o maxima requerida";
	public static final String MESSAGE_ERROR_PATTERN="La cadena no tiene el formato adecuado";
	public static final String MESSAGE_ERROR_REQUIRED="La cadena es requerida";
	
	public static final String REGEX_NAME="[a-zA-Z]+(\\s[a-zA-Z]+)*";
	public static final String REGEX_PHONES="[0-9] {10}";
	public static final String REGEX_EMAIL="";
	public static final String REGEX_NUMERICS="[0-9]+";
	
	private ConstantsRegularExpression() {}

}
