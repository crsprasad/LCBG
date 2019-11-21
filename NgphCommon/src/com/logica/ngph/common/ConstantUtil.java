package com.logica.ngph.common;

public class ConstantUtil {
	public static final String MESSAGE_TYPE = "MESSAGETYPE";
	public static final String LHS = "LHS";
	public static final String ACTIONS = "ACTIONS";
	public static final String ACTION_BRANCH = "BRANCH";
	public static final String ACTION_DEPARTMENT = "DEPARTMENT";
	public static final String ACTION_PARAM = "ACTION";
	public static final String MESSAGE_TYPE_ALL = "ALL";
	public static final String BEAN_CONTEXT = "BeanContext";
	public static final String DATA_ACCESS_PROBLEM = "Data Access Problem";
	public static final String CODE_NAME_EMPTY = "Code or Name is Empty";
	public static final String RULE_CONDITION_REQUIRED = "Rule Condition is required";
	public static final String RULE_ID_REQUIRED = "Rule ID is required";
	public static final String DUPLICATE_RULE_ID = "Rule ID is duplicate";
	public static final String GIVE_VALID_RULECONDITION = "Please Give Valid Rule Condition";
	public static final String ADD_AND_OR = "Please Add AND or OR";
	public static final String RULE_ACTION = "Rule Action";
	public static final String PAYMENT_ACTION = "Payment Action";
	public static final String CANONICAL_VALUE_DATE_EXCEPTION = "Value Date Is In Invalid Format";

	public static final String RECEIVED = "1";

	public static final String AWAITING_REPAIR = "2";

	public static final String WAREHOUSED = "3";
	public static final String AWAITING_ACCOUNTING = "4";
	public static final String ACCOUNTING_COMPLETED = "5";
	public static final String AWAITING_LIQUIDITY = "6";
	public static final String LIQUIDITY_COMPLETED = "7";
	public static final String AWAITING_AML = "8";
	public static final String AML_COMPLETED = "9";
	public static final String AWAITING_BILLING = "10";
	public static final String BILLING_COMPLETED = "11";
	public static final String AWAITING_ACKNOWLEDGEMENT = "12";
	public static final String COMPLETED = "13";
	public static final String FINALISED = "14";
	public static final String AWAITING_RELEASE = "15";
	public static final String EXCEPTIONS = "16";
	public static final String AWAITING_AUTHORISATION = "17";
	public static final String REJECTED_BY_CHANNEL = "18";
	public static final String INVALIDS = "19";
	public static final String RECEIVED_I = "31";
	public static final String INTERVENED = "32";
	public static final String AWAITING_REPAIR_I = "33";
	public static final String AWAITING_ACCOUNTING_I = "34";
	public static final String ACCOUNTING_COMPLETED_I = "35";
	public static final String ACCOUNTING_MISMATCH_I = "36";
	public static final String AWAITING_LIQUIDITY_I = "37";
	public static final String LIQUIDITY_COMPLETED_I = "38";
	public static final String AWAITING_AML_I = "39";
	public static final String AML_COMPLETED_I = "40";
	public static final String AWAITING_BILLING_I = "41";
	public static final String BILLING_COMPLETED_I = "42";
	public static final String SEND_TO_HOST_I = "43";
	public static final String PROCESSED_MANUALLY_I = "44";

	public static final String ENQUIRY_MSG_TYPE = "ENQUIRYMESSAGETYPE";
	public static final String EnquirySubMsgType = "ENQUIRYSUBMESSAGETYPE";
	public static final String EnquiryChannel = "ENQUIRYCHANNEL";
	public static final String ENQUIRY_CURRENCY = "ENQUIRY_CURRENCY";
	public static final String FEEDBACKPATH = "C:/OFF_WORK/NGPHWORKSPACE/NgphWeb/WebContent/WEB-INF/Feedbacks/";
	public static final String BANNERPATH = "C:/Banner.txt";
	public static final String INBOUNDMESSAGECOUNT = "INBOUNDMESSAGECOUNT";
	public static final String OUTBOUNDMESSAGECOUNT = "OUTBOUNDMESSAGECOUNT";
	public static final String TOTALAMOUNT = "TOTALAMOUNT";
	public static final String RECIVED = "RECIVED";
	public static final String RECIVEDAUTHORIZATION = "RECIVEDAUTHORIZATION";
	public static final String INBOUNDCHANNELCOUNT = "INBOUNDCHANNELCOUNT";
	public static final String OUTBOUNDCHANNELCOUNT = "OUTBOUNDCHANNELCOUNT";
	public static final String CLOSINGBALANCEVSCURRENCY = "CLOSINGBALANCEVSCURRENCY";
	public static final String CLOSINGBALANCEVSCURRENCYDATE = "CLOSINGBALANCEVSCURRENCYDATE";
	public static final String AUTHORIZATIONMESSAGE = "AUTHORIZATIONMESSAGE";
	public static final String GROUPMAINTENANANCEBRANCHCODE = "GROUPMAINTENANANCEBRANCHCODE";
	public static final String GROUPMAINTENANANCEBRANCHNAME = "GROUPMAINTENANANCEBRANCHNAME";
	public static final String MSGTYPE = "MSGTYPE";
	public static final String MSGSUBTYPE = "MSGSUBTYPE";
	public static final String CHANNEL = "CHANNEL";
	public static final String HOSTNAME_H = "HOSTNAME_H";
	public static final String HOSTID_H = "HOSTID_H";
	public static final String HOSTNAME_P = "HOSTNAME_P";
	public static final String HOSTID_P = "HOSTID_P";
	public static final String CURRENCY = "CURRENCY";
	public static final String GROUPIDANDGROUPNAME = "GROUPIDANDGROUPNAME";
	public static final String BRANCHCODE = "BRANCHCODE";
	public static final String BRANCHNAME = "BRANCHNAME";
	public static final String CHECKGROUPID = "CHECKGROUPID";
	public static final String REPORTCOLUMNS = "REPORTCOLUMNS";
	public static final String OUTWARDQUEUE = "Received,Awaiting Repair,WAREHOUSED,Awaiting Accounting,Accounting Completed,Awaiting Liquidity,"
			+ "Liquidity Completed,Awaiting AML,AML Completed,Awaiting Billing,Billing Completed,Awaiting Acknowledgement,COMPLETED,FINALISED,"
			+ "Awaiting Release,EXCEPTIONS,Awaiting Authorisation,Rejected by Channel,INVALIDS,Deleted";
	public static final String INWARDQUEUE = "RECEIVED_I,INTERVENED,AWAITING_REPAIR_I,AWAITING_ACCOUNTING_I,ACCOUNTING_COMPLETED_I,ACCOUNTING_MISMATCH_I,"
			+ "AWAITING_LIQUIDITY_I,LIQUIDITY_COMPLETED_I,AWAITING_AML_I,AML_COMPLETED_I,AWAITING_BILLING_I,"
			+ "BILLING_COMPLETED_I,SEND_TO_HOST_I,PROCESSED_MANUALLY_I";
	public static final String BUSINESSDATE = "BUSINESSDATE";
	public static final String STATUS = "STATUS";
	public static final String TASKLIST = "TASKLIST";
	public static final String RECEIVERBANKNAME = "RECEIVERBANKNAME";

	public static final String MESSAGECOUNT = "MESSAGECOUNT";
	public static final String ESBEI_TYPE = "ESBEI_TYPE";
	public static final String ESBEI_CONNECTION_TYPE = "ESBEI_CONNECTION_TYPE";

	public static final String STACKGRAPH = "STACKGRAPH";
	public static final String REGEXFORIPADDRESS = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	public static final String REGEXFORURL="^((ht|f)tp(s?))\\:\\/\\/(([a-zA-Z0-9\\-\\._]+(\\.[a-zA-Z0-9\\-\\._]+)+)|localhost)" +
			"(\\/?)([a-zA-Z0-9\\-\\.\\?\\,\\'\\/\\+&amp;%\\$#_]*)?([\\d\\w\\.\\/\\%\\+\\-\\=\\&amp;" +
			"\\?\\:\\\\\\&quot;\\'\\,\\|\\~\\;]*)$";
	public static final String REGEXFORINTEGERONLY="^[0-9]+$";
	public static final String REGEXFORFILEPATH="(/[\\w-_]/+)*";
	public static final String REGEXFORURLtest="(http|ftp|https):\\/\\/[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?";
	public static final String delimiter = "~";
	public static final String ALL = "ALL";
	public static final String ERRORMESSAGE = "Unable to Process. Message reference Not Found";

	public static final String REPAIR = "REPAIR";
	public static final String EVENTID_LCOPEN = "NGPHUI700";
	public static final String EVENTID_PRE_ADVISE = "NGPHUI705";
	public static final String EVENTID_AMEND_LC = "NGPHUI707";
	public static final String EVENTID_TRANSFER_DOCUMENT = "NGPHUI720";
	public static final String EVENTID_ACK_LC = "NGPHUI730";
	public static final String EVENTID_ADVICE_OF_REFUSAL = "NGPHUI734";
	public static final String EVENTID_LC_AUTHORIZE = "NGPHUI740";
	public static final String EVENTID_REIMBURSMENT_CLAIM = "NGPHUI742";
	public static final String EVENTID_ADVICE_OF_DISCREPANCY = "NGPHUI750";
	public static final String EVENTID_LC_AUTHORIZE_PAY = "NGPHUI752";
	public static final String EVENTID_ADVICE_OF_PAYMENT = "NGPHUI754";
	public static final String EVENTID_LC_ADVICE = "NGPHUI756";
	public static final String EVENTID_BANK_GUARANTEE = "NGPHUI760";
	public static final String EVENTID_AMEND_BG = "NGPHUI767";
	public static final String EVENTID_ACK_BG = "NGPHUI768";
	public static final String EVENTID_ADVICE_OF_REDUCTION = "NGPHUI769";
	public static final String EVENTID_FREE_FORMAT = "NGPHUI799";
	public static final String EVENTID_BANK_GUARANTEE_COVER = "NGPHUI760COV";
	public static final String EVENTID_AMEND_BG_COVER = "NGPHUI767COV";
	


	//
	public static final String EVENTID_SUBMIT = "001";
	public static final String EVENTID_APPROVE = "002";
	public static final String EVENTID_REJECT = "003";
	public static final String EVENTID_REPAIR_SUBMIT = "004";
	public static final String EVENTID_REPAIR_APPROVE = "005";
	public static final String EVENTID_REPAIR_REJECT = "006";
	
	
	
	public static final String EVENTLOGGINGCOMMENTSUBMIT = "Initiated";
	public static final String EVENTLOGGINGCOMMENTAPPROVAL = "Approved";
	public static final String EVENTLOGGINGCOMMENTREJECT = "Rejected";
	public static final String EVENTLOGGINGCOMMENTREAPIR = "Repair";
	
	public static final String ENQUIRY_STATE_NAME = "ENQUIRYSTATENAME";
	public static final String ENQUIRY_DISTRICT_NAME = "ENQUIRYDISTRICTNAME";
	public static final String ENQUIRY_CITY_NAME = "ENQUIRYCITYNAMENAME";
		
}
