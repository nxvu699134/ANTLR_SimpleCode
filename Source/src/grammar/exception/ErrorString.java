package grammar.exception;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 01/Dec/2017
 */

public class ErrorString
{
	public static String DUPLICATE_MSG = "line [%s:%s]: \"%s\" is already defined in the scope";
	public static String BAD_ARRAY_SIZE_MSG = "line [%s:%s]: Bad array size";
	public static String MAIN_NOT_FOUND = "Main method not found";
	public static String IDENTIFIER_NOT_FOUND = "line [%s:%s]: identifier \"%s\" not found";
	public static String ARGUMENT_MISMATCH = "line [%s:%s]: Argument mismatch: \"%s\" has %d argument(s)";
	public static String INCORRECT_ARGUMENT_TYPE = "line [%s:%s]: Incorrect argument type : found type [%s], expected type [%s]";
	public static String UNEXPECTED_RETURN_TYPE = "line [%s:%s]: Unexpected return type";
	public static String BREAK_OUTSIDE_FOR = "line [%s:%s]: Break outside for statement";
	public static String CONTINUE_OUTSIDE_FOR = "line [%s:%s]: Continue outside for statement";
	public static String ARRAY_INDEX_WRONG_TYPE = "line [%s:%s]: array index wrong type, expected [int]";
	public static String INCOMPATIBLE_TYPES = "line [%s:%s]: Incompatible types, found [%s], expected [%s]";
	public static String WRONG_TYPE_OPERANDS_BIN_OP = "line [%s:%s]: Operator %s cannot be applied to [%s], [%s]";
}
