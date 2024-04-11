package com.kttkpm.movieservice.until;

import com.squareup.okhttp.MediaType;

import java.util.*;

public class Constants {
    public static final String REQUEST_MAPPING_V1 = "/api/v1";
    public static final String REQUEST_MAPPING_V2 = "/api/v2";
    public static final String VCB_MAPPING_V1 = "/vcb/api/v1";
    public static final String MOBILE = "/mobile";
    public static final String COMMON_DATE_TIME_FORMAT = "dd/MM/yyyy HH:mm:ss";
    public static final String COMMON_DATE_TIME_FORMAT_2 = "HH:mm:ss dd/MM/yyyy";
    public static final String COMMON_DATE_TIME_FORMAT_3 = "dd-MM-yyyy HH:mm:ss";
    public static final String COMMON_DATE_FORMAT = "dd/MM/yyyy";
    public static final String COMMON_MONTH_FORMAT = "MM/yyyy";
    public static final String COMMON_DATE_FORMAT_BOO = "yyyyMMdd";
    public static final String COMMON_DATE_FORMAT_BOO_24H = "yyyyMMdd HH:mm:ss";
    public static final String COMMON_DATE_FORMAT_24H = "dd/MM/yyyy hh24:mi:ss";
    public static final String COMMON_DATE_FORMAT_24H_VTP = "yyyyMMddHHmmss";
    public static final String ORACLE_DATE_FORMAT = "DD-MM-YYYY";
    public static final String MOMO_DATE_FORMAT = "YYYY-MM-DD HH:mm:ss";
    public static final String LOCALE_VN = "vi_VN";
    public static final String TIMEZONE_VN = "Asia/Ho_Chi_Minh";
    public static final String EXCEL_DATE_FORMAT = "dd-MMM-yyyy";
    public static final String OCR_DATE_FORMAT = "dd-MM-yyyy";
    public static final String ORDER_DATE_FORMAT = "yyyy-MM-dd";
    public static final String OCS_DATE_TIME_FORMAT = "yyyy/MM/dd HH:mm:ss";
    public static final String UTC_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    public static final String TIME_ZONE_UTC = "UTC";
    public static final int AMOUNT_ZERO = 0;
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    public static final MediaType XML = MediaType.parse("application/xml");
    public static final MediaType TEXT_XML = MediaType.parse("text/xml");
    public static final MediaType FORM_URL_ENCODED = MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");
    /*
     * man hinh tim kiem customer, contract, vehicle
     */
    public static final String CUSTOMER_TYPE_SCREEN = "CUSTOMER";
    public static final String DEFAULT_CUSTOMER_RANK = "LOYAL";
    public static final String CONTRACT_TYPE_SCREEN = "CONTRACT";
    public static final String VEHICLE_TYPE_SCREEN = "VEHICLE";
    public static final String TERMINAL_CONTRACT_PAYMENT = "TERMINAL_CONTRACT_PAYMENT";
    public static final String ADJUSTMENT_SCREEN = "1";
    public static final String BATCH_ADJUSTMENT_SCREEN = "2";
    // ly do tac dong, loai tac dong
    public static final String ACT_REASON_ACTIVE = "1";
    //The vat ly RFID
    public static final String VEHICLE_CC = "VEHICLE_CC";
    public static final String VEHICLE_RFID = "RFID";
    public static final String VEHICLE_TRANSFER = "TRANSFER";
    public static final String VEHICLE_NOT_RFID = "NOT_RFID";
    public static final String VEHICLE_ACTIVE = "VEHICLE_ACTIVE";
    public static final String VEHICLE_OWN = "VEHICLE_OWN";
    public static final String VEHICLE_RFID_AND_NOT_RFID = "VEHICLE_RFID_AND_NOT_RFID";
    // Loai khach hang
    public static final Long AUTH = 1L;
    public static final Long REP = 2L;
    public static final Long CUSTOMER = 0L;
    public static final Long[] CUSTOMER_ENTERPRISE = {2L, 3L, 4L, 5L, 6L};
    public static final Long[] CUSTOMER_PERSONAL = {1L, 7L};
    public static final Long CUS_ENTERPRISE = 2L;
    public static final Long CUS_PERSONAL = 1L;
    // Cach tinh thoi gian hieu luc cua ve (theo tram/doan)
    public static final String METHOD_CHARGE = "METHOD_CHARGE";
    public static final String PLATE_TYPE = "PLATE_TYPE";

    //Chiet khau, khuyen mai
    public static final String PROMOTION_NEW = "0";
    public static final String PROMOTION_ACTIVE = "1";
    public static final String PROMOTION_INACTIVE = "2";
    public static final String PROMOTION_APPROVED = "1";
    public static final String PROMOTION_UNAPPROVED = "0";
    public static final String PROMOTION_KM = "1";
    public static final String PROMOTION_CK = "2";
    public static final String PROMOTION_NL = "3";
    public static final String PROMOTION_LVL_CUSTOMER = "0";
    public static final String PROMOTION_LVL_CONTRACT = "1";
    public static final String PROMOTION_LVL_VEHICLE = "2";

    //ExceptionType
    public static final String EXCEPTION_VEHICLE = "1";
    public static final String EXCEPTION_TICKET = "2";
    public static final String EXCEPTION_PRIORITY = "3";
    public static final String EXCEPTION_BAN = "4";

    //Service plan type
    public static final Long SERVICE_PLAN_TYPE_PRIORITY = 2L;
    public static final Long SERVICE_PLAN_TYPE_BAN = 3L;
    public static final Long SERVICE_PLAN_TYPE_TURN = 1L;
    public static final Long SERVICE_PLAN_TYPE_MONTH = 4L;
    public static final Long SERVICE_PLAN_TYPE_QUART = 5L;

    //Phi dich vu
    public static final Integer SERVICE_FEE_NEW = 0;
    public static final Integer SERVICE_FEE_ACTIVE = 1;
    public static final Integer SERVICE_FEE_INACTIVE = 2;
    public static final Integer SERVICE_FEE_APPROVED = 1;
    public static final Integer SERVICE_FEE_UNAPPROVED = 0;

    //Other
    public static final String TRAM_KIN = "0";
    public static final String MODULE_CRM = "CRM";
    public static final String MODULE_BOT = "BOT";
    public static final String MODULE_MOT = "MOT";
    public static final String MODULE_BILLING = "BILLING";
    public static final String TIME_ONE_DAY = " 23:59:59";
    public static final String SAME_TIME_ONE_DAY = " 23:59:58";
    public static final String SLASH = "/";
    public static final Long OFFER_LEVEL_DEFAULT = 2L;
    public static final String MESSAGE_CODE = "MESSAGE_CODE";
    public static final String MESSAGE_ERROR_VI = "MESSAGE_ERROR_VI";
    public static final String MESSAGE_ERROR_EN = "MESSAGE_ERROR_EN";
    public static final String CONTRACT_KEY_GEN = "PWD";
    public static final String REMOTE_ADDRESS = "IP";
    public static final Long ATTACHMENT_EXCEPTION = 2L;
    public static final String BOO1 = "BOO1";
    public static final String BOO2 = "BOO2";
    public static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";
    public static final String STR_EMPTY = "";
    public static final int SIZE_LIST_ZERO = 0;
    public static final String GROUPS = "ETC - Chủ phương tiện";

    public static final String GROUPS_APP_CPT = "CPT";
    public static final String OCS_STATION = "0";
    public static final String OCS_STAGE = "2";
    public static final String GATEWAY = "GATEWAY";
    public static final Long RACH_MIEU_STATION = 5018L;
    public static final Long STATION_OPEN = 1L;

    public static final String VIETTEL_PAY_PREFIX = "VTPay";
    public static final String RESPONSE_CODE_PBH_SUCCESS = "1";
    public static final String RESPONSE_CODE_PBH_FAIL = "0";

    public static final long ONE_DAY_MILLI_SECONDS = 24 * 60 * 60 * 1000;
    public static final String MSG_TITLE = "MSG_TITLE";
    public static final String MSG_SMS = "MSG_SMS";
    public static final String MSG_NOTIFY = "MSG_NOTIFY";
    public static final String MSG_OTHERS = "OTHERS";
    public static final String KEY_REGIS_VEHICLE_LINK = "PARAM_REGIS_VEHICLE_LINK";
    public static final String MAX_CUSTOMER_CONTRACT = "MAX_CUSTOMER_CONTRACT";
    public static final String CUSTOMER_REGISTER_PERSONAL = "CUSTOMER_REGISTER_PERSONAL";

    public static final String BOO2_EPC_BEGIN = "3416214B94";
    public static final String EKYC_TOKEN = "EKYC_TOKEN";
    public static final Long IS_LOCK_DEFAULT = 0L;
    public static final String EMAIL_NOTIFICATION_DEFAULT = "1";
    public static final String SMS_NOTIFICATION_DEFAULT = "0";
    public static final String PUSH_NOTIFICATION_DEFAULT = "1";

    public interface REGIS_VEHICLE_LINK {
        String DANG_KIEM = "1";
        String TCDB = "2";
    }

    public interface OCS_PARTY_CODE {
        String MUA_VE = "MUA_VE_TQ";
        String NAP_TIEN_CONG_VTP = "NAP_TIEN_CONG_VTP";
        String NAP_TIEN_APP_VTP = "NAP_TIEN_APP_VTP";
        String NAP_TIEN_CONG_MOMO = "NAP_TIEN_CONG_MOMO";
        String NAP_TIEN_APP_MOMO = "NAP_TIEN_APP_MOMO";
        String NAP_TIEN_APP_ = "NAP_TIEN_APP_";
        String NAP_TIEN_CONG_VNPAY = "NAP_TIEN_CONG_VNPAY";
        String DIEU_CHINH_TK_CRM = "DIEU_CHINH_TK_CRM";
        String DIEU_CHINH_TK_CRM_NOT_SEND_SMS = "NOT_SEND_SMS";
        String DIEU_CHINH_TK_GOP_HD = "DIEU_CHINH_TK_GOP_HD";
        String TRU_TIEN_TRANSFER_VEHICLE = "TRU_TIEN_TRANSFER_VEHICLE";
        String CONG_TIEN_TRANSFER_VEHICLE = "CONG_TIEN_TRANSFER_VEHICLE";
        String TRU_TIEN_DK_SMS = "TRU_TIEN_DANG_KY_SMS";
        String CONG_TIEN_KHUYEN_MAI_VCAR = "CONG_TIEN_KHUYEN_MAI_VCAR";
        String NOT_SEND_SMS = "NOT_SEND_SMS";
        String NAP_TIEN_TU_DONG_MOMO = "NAP_TIEN_TU_DONG_MOMO";
        String NAP_TIEN_TU_DONG_VPBANK = "NAP_TIEN_TU_DONG_VPBANK";
        String MUA_VE_BUS = "MUA_VE_BUS";
        String DANTHE = "DANTHE";
    }

    public interface USER_PARTNER {
        String VT_POST = "ETC_VIETTELPOST";
        String VT_PAY = "VTPAY";
        String ETC_BOO1 = "ETC_BOO1";
    }

    public interface LOGIN_USER_TYPE {
        Long CONTRACT = 0L;
        Long PLATE_NUMBER = 1L;
    }

    public interface CONFIG_PARAM_COMMON {
        String DAY_UPDATE_PROFILE = "DAY_UPDATE_PROFILE";
        String DAY_EXP_ADD_PROFILE = "DAY_EXP_ADD_PROFILE";
        String DAY_EXP_ADD_PROFILE2 = "DAY_EXP_ADD_PROFILE2";
        String MAX_PROFILES_INVALID = "MAX_PROFILES_INVALID";
        String KHCN_MAX_VEHICLE_IN_CONTRACT = "KHCN_MAX_VEHICLE_IN_CONTRACT";
        String DAY_CHARGE_SMS_01 = "DAY_CHARGE_SMS_01";
        String DAY_CHARGE_SMS_02 = "DAY_CHARGE_SMS_02";
        String DAY_DELAY_QUICK_SALE = "DAY_DELAY_QUICK_SALE";
        String START_DATE_QUICK_SALE = "START_DATE_QUICK_SALE";
        String AMOUNT_VCAR = "AMOUNT_VCAR";
        String TIME_SCAN_SMS_DEBIT = "TIME_SCAN_SMS_DEBIT";
        String TIME_TOPUP_SMS_DEBIT = "TIME_TOPUP_SMS_DEBIT";
    }

    public interface DEPOSIT_LIMIT_COMMON {
        String ENTERPRISE = "ENTERPRISE_DEPOSIT_LIMIT";
        String INDIVIDUAL = "INDIVIDUAL_DEPOSIT_LIMIT";
    }

    public interface TABLE_NAME_COMMON {
        String CONFIG_PARAM = "CONFIG_PARAM";
        String CHANGE_EPC_RESULT = "CHANGE_EPC_RESULT";
        String DEPOSIT_LIMIT = "DEPOSIT_LIMIT";
        String VEHICLE_MARK = "VEHICLE_MARK";
        String VEHICLE_BRAND = "VEHICLE_BRAND";
        String PLATE_TYPE = "PLATE_TYPE";
        String CF_FEE_CHANGE_EPC = "CONFIG_FEE_CHANGE_EPC";
        String SERVICE_TYPE = "SERVICE_TYPE";
        String SERVICE_RULES = "SERVICE_RULES";
        String SERVICE_CONFIG = "SERVICE_CONFIG";
        String VERIFY_CONFIG = "VERIFY_CONFIG";
        String TRAFFIC_ACCOUNT_CONFIG = "TRAFFIC_ACCOUNT_CONFIG";
        String ALLOW_ACCESS_SERVICE = "ALLOW_ACCESS_SERVICE";
        String ACCOUNT_REGISTER = "ACCOUNT_REGISTER";
        String TABLE_NAME = "table_name";
        String EPASS_ACCOUNT_REGIS = "EPASS_ACCOUNT_REGIS";
        String VIETMAP_CONFIG = "VIETMAP_CONFIG";
    }

    public interface SMS_STATUS {
        Long DEBIT = 0L;
        Long PAID = 1L;
        Long CANCEL = 2L;
    }

    public interface CONFIG_NAME {
        String ENABLE_TRAFFIC_ACCOUNT = "ENABLE_TRAFFIC_ACCOUNT";
    }

    public interface CATEGORY_CODE {
        String MAX_MOTOBIKE_PER_CONTRACT = "MAX_MOTOBIKE_PER_CONTRACT";
        String MAX_OTO_PER_CONTRACT = "MAX_OTO_PER_CONTRACT";

        String RATE_LIMIT_VIETMAP = "RATE_LIMIT_VIETMAP";
    }

    public interface CHANGE_EPC_CF_CODE {
        String CONDITION_CHECKIN = "IS_CHECK_CONDITION_CHECKIN";
        String NUM_CHECKIN_EPC = "NUM_CHECKIN_EPC";
        String NUM_STATION_CHECKIN_EPC = "NUM_STATION_CHECKIN_EPC";
        String DAYS_WARRANTY_EPC = "DAYS_WARRANTY_EPC";
    }

    public interface STATUS {
        String ACTIVE = "1";
        String INACTIVE = "0";
    }

    public interface SERVICE_PLAN_SMS {
        Long PERSONAL = 3001L;
        Long ENTERPRISE = 3002L;
        Long PERSONAL_3003 = 3003L;
    }

    public interface LUCKY_CODE {
        int CUSTNEW = 1;
        int NAPTIEN = 2;
        int LKVTPAY = 3;
    }

    public interface VDTC_INFO {
        String SENDER_FULLNAME = "Công ty giao thông số VN (VDTC)";
        String SENDER_ADDRESS = "Số 1 Trần Hữu Dực";
        String SENDER_PHONE = "0866.623.368";
        String SENDER_EMAIL = "cskh@vdtc.com.vn";
        Long SENDER_WARD = 494L;
        Long SENDER_DISTRICT = 25L;
        Long SENDER_PROVINCE = 1L;
    }

    public interface REASON_TYPE { //loai yeu cau
        String FREE = "0";            // mien phi
        String PAID = "1";            // tra phi
    }

    public interface ATTACHMENT_FILE_STATUS {
        String ACTIVE = "1";            // 1. Hoat dong
        String IN_ACTIVE = "2";         //2. Khong hoat dong
    }

    public interface ACT_TYPE {
        Long LK_VTPAY = 13L;
        Long ADD_VEHICLE = 3L;
        Long MODIFY_CUSTOMER= 4L;
        Long MODIFY_VEHICLE = 5L;
        Long MODIFY_CONTRACT = 14L;
        Long CLOSE_BRIEFCASES = 20L;
        Long CHARGE_TICKET = 24L;
        Long DESTROY_TICKET = 25L;
        Long NAP_TIEN = 32L;
        Long BOO1_SYNC = 260L;
        Long BOO1_CHECK_VEHICLE = 270L;
        Long SEND_SMS = 280L;
        Long SEND_EMAIL = 290L;
        Long CALL_PAY_APP_MOMO_API = 296L;
        Long CALL_PAY_CONFIRM_MOMO_API = 297L;
        Long QUERY_TRANSACTION_BIDV = 298L;
        Long CREATE_SALE_ORDER = 299L;
        Long VERIFY_SALE_ORDER = 300L;
        Long RESULT_SALE_ORDER = 301L;
        Long IMPORT_BL_WL_T_Q = 302L;
        Long SERVICE_REGISTER = 61L;
        Long ADD_CONTRACT = 11L;
        String REGISTER_DKTKCN = "DKTKCN";
        Long DELETE_VEHICLE = 22L;
        Long CONTRACT_ADJUST = 35L;
        Long GET_CHARGE = 1000001L;
        Long QUERY_SESSION = 1000002L;
        Long CHECK_IN = 1000003L;
        Long SMS_REG = 281L;
        Long SWAP_RFID = 19L;
        Long TRANSFER_VEHICLE= 23L;
        Long QUERY_VEHICLE = 303L;
        Long QUERY_CONTRACT = 304L;
        Long DELETE_CONTRACT = 50L;
        Long CHECK_SESSION = 305L;
        Long TICKET_ADJUST = 306L;
        Long PBH_VTT = 307L;
        Long UPDATE_EPC_EXCEPTION = 308L;
        Long SMS_CANCEL = 310L;
        Long SMS_MOD = 311L;
        Long QUERY_ORDER_VTT = 312L;
        Long QUICK = 313L;
        Long PROMOTION_102021 = 314L;
        Long CONG_TIEN_VCAR = 315L;
        Long QUERY_BALANCE = 316L;
        Long LIXI_2022 = 317L;
        Long RECOVER_VEHICLE = 318L;
        Long APPROVE_PROFILE_CONTRACT = 4001L;
        Long APPROVE_PROFILE_VEHICLE = 4003L;
        Long ADD_OCS_SUP_OFFER = 4005L;
        Long DESTROY_OLD_SUP_OFFER = 4006L;
        Long EPASS_TICKET_STICK = 4006L;
        Long CALL_PAY_AUTO_TOPUP_MOMO = 6000L;
        Long CALL_QUERY_STATUS_MOMO = 6001L;
        Long CALL_PAY_AUTO_TOPUP_VPBANK = 6002L;
        Long CALL_TOKEN_AUTO_TOPUP_VPBANK = 6003L;
        Long CALL_PAY_TOPUP_BIDV = 6004L;
        Long BUY_BUS_TICKET = 1004051L;
        Long CALL_TOKEN_SINVOICE = 7005L;
        Long CALL_CREATE_SINVOICE = 7006L;
        Long ADDITIONAL_CONTRACT_PROFILE = 6L;
        String STICK_EPASS_ACT_TYPE = "STICK_EPASS";
        String CALL_EKYC = "CALL_EKYC";
        Long CHARGE_RFID = 318L;
        Long NAP_TIEN_NOI_BO = 9222L;
        Long SWAP_PLATE_NUMBER = 101L;
    }

    public interface ACT_REASON {
        Long DEFAULT = 0L;
        Long ADD_VEHICLE = 2L;
        Long CLOSE_BRIEFCASES = 39L;
        Long ACTIVE_RFID = 32L;
        Long CUS_REQ_MOD_CONTRACT = 26L;
        Long SMS_REG_CUS = 2801L;
        Long FREE = 90L;
        Long DELETE_CONTRACT = 100L;
        List<Long> DAU_NOI_AO = Arrays.asList(161L, 309L);
        Long DAU_NOI_AO_VEHICLE = 161L;
        Long DAU_NOI_AO_CONTRACT = 309L;
        Long TICKET_ADJUST_DATE = 306L;
        Long TICKET_ADJUST_VEHICLE_GROUP = 307L;
        Long UPDATE_EPC_EXCEPTION = 308L;
        Long SMS_CANCEL = 310L;
        Long SMS_MOD = 311L;
        Long QUICK = 312L;
        Long LOCK_BY_PROMOTION_102021 = 313L;
        Long UNLOCK_BY_PROMOTION_102021 = 315L;
        Long QUERY_BALANCE = 316L;
        Long DAU_NOI_LAN_2 = 106L;
        Long DANG_KY_LAN_DAU = 105L;
        Long DANG_KY_LAN_HAI = 106L;
        Long KY_PL_LAN_DAU = 103L;
        Long KY_PL_LAN_HAI = 104L;
        String DAN_THE_LAN_1 = "DAN_THE_LAN_1";
        String CUST_STICK_EPASS = "CUST_STICK_EPASS";
        Long CUSTOMER_REQUEST = 9L;
        Long CHARGE_RFID = 318L;
        Long CHANGE_RFID_PROMOTION = 99L;
    }

    public interface DOCUMENT_TYPE {
        Long PYCDT = 22L;
        Long DVYC = 14L;

        Long CMT = 1L;
        Long TCC = 2L;
        Long HC = 3L;
        Long CMQD = 4L;
        Long DKKD = 8L;
        Long DKKD_MT = 32L;
        Long DKKD_MS = 33L;
        Long PLATE_PHOTO = 18L;
        Long DANG_KIEM = 17L;
        Long DANG_KIEM_MT = 36L;
        Long DANG_KIEM_MS = 37L;
        Long DANG_KY_XE = 16L;
        Long DANG_KY_XE_MT = 34L;
        Long DANG_KY_XE_MS = 35L;
        Long ANH_CAN_THE = 23L;
        Long TOAN_CANH_XE = 43L;
        Long ANH_DAU_XE_SAU_DAN_THE = 44L;
        Long GIAY_DE_NGHI_TK_EPASS = 42L;

        List<Long> CONTRACT_PROFILE_OCR = Arrays.asList(DKKD, DKKD_MT, DKKD_MS, CMT);
        List<Long> VEHICLE_PROFILE_OCR = Arrays.asList(PLATE_PHOTO, DANG_KIEM, DANG_KIEM_MS, DANG_KIEM_MS, DANG_KY_XE, DANG_KY_XE_MT, DANG_KY_XE_MS, ANH_CAN_THE);
    }

    public interface VIET_MAP {
        String CODE = "VML_SERVICE";
        String NAME = "VML";
        // action type for contract
        String ACT_TYPE_LINK = "VML_LINK";
        String ACT_TYPE_UNLINK = "VML_UNLINK";
        // action type for customer
        String ACT_TYPE_LINK_CUST = "VML_LINK_CUST";
        String ACT_TYPE_UNLINK_CUST = "VML_UNLINK_CUST";

    }

    public interface BOO_NAME {
        String BOO1 = "VETC";
        String BOO2 = "VDTC";
    }

    public interface BOO_CODE {
        String BOO1 = "BOO1";
        String BOO2 = "BOO2";
    }

    public interface BOO_INFO {
        Long CUST_ID = 1L;
        Long CONTRACT_ID = 1L;
        String PROFILE_STATUS = "2";
    }

    public interface CATEGORY_STATUS {
        String ACTIVE = "1"; //hoạt động
        String INACTIVE = "0"; // không hoạt động
    }

    public interface BOO_STATUS {
        String NOT_REGISTRY = "NAN";
        String ACTIVE = "ACT";
        String DESTROY = "DES";
        String SUCCESS = "SUCCESS";
        String RECEIVED = "RECEIVED";
        String REJECT = "REJECT";
        String RESPONSE_CODE_SUCCESS = "0";
        String RE_STICK_ETAG = "RE_STICK_ETAG";
        String STICK_EPASS = "STICK_EPASS";
    }

    public interface BOT_CONFIRM {
        Long YES = 1L;
        Long NO = 0L;
    }

    public interface SERVICE_PLAN_STATUS {
        Long DELETED = 0L;
    }

    public interface REASON_CHANGE_BOO {
        String CHANGE_PLATE_NUMBER = "DBS";
        String CHANGE_EPC = "DET";
        String CHANGE_INFO_REGISTER = "TDK";
        String OPEN_OR_CLOSE_EPC = "DME";
        String CHANGE_OTHER_INFO = "TKH";
        String CANCEL_EPC = "HTK";
        String INSERT_EXCEPTION = "I";
        String UPDATE_EXCEPTION = "U";
    }

    public interface VIETTEL_PAY_EXCEPTION_FIELD {
        List<String> EXCEPTION_FIELD = Arrays.asList("message", "autoRenew_VTP");
    }

    public interface VIETTEL_PAY_TYPE_REGISTER {
        String CANCEL = "0";
        String REGISTER = "1";
    }

    public interface VIETTEL_PAY_TOPUP_STATUS {
        String SUCCESS = "1";
        String FAIL = "0";
    }

    public interface OTP_CATEGORY {
        String TABLE_NAME = "OTP_CONFIG";
        String CODE_DAU_NOI = "DAU_NOI";
        String CODE_MERGES_CONTRACT = "MERGES_CONTRACT";
        String CODE_SPLIT_CONTRACT = "SPLIT_CONTRACT";
        String CODE_CHARGE_TICKET = "CHARGE_TICKET";
        String CODE_DESTROY_CONTRACT = "DESTROY_CONTRACT";
        String CODE_DESTROY_RFID = "DESTROY_RFID";
        String CODE_CONTRACT_ADJUST_BALANCE = "CONTRACT_ADJUST_BALANCE";
        String CODE_TRANSFER_OWNER = "TRANSFER_OWNER";
        String CODE_APPEND_CONTRACT = "APPEND_CONTRACT";
        String ON = "1";
        String OFF = "0";
        String CODE_CONTRACT_BATCH_ADJUST_BALANCE = "CONTRACT_BATCH_ADJUST_BALANCE";
        String CODE_TICKET_ADJUSTMENT = "TICKET_ADJUSTMENT";
        String CODE_TICKET_ADJUSTMENT_VEHICLE_GROUP = "TICKET_ADJUSTMENT_VEHICLE_GROUP";
    }

    public interface BOO_ERROR_CODE {
        String METHOD_NOT_ALLOWED = "METHOD_NOT_ALLOWED";
        String INVALID_PARAMS = "INVALID_PARAMS";
        String SUCCESS = "0";
        String FAIL = "1";
    }

    public interface VALID_TYPE_ONLINE_REG {
        List<String> TYPE = Arrays.asList("LX", "GV", "BL", "WL");
        List<String> ACTION_TYPE = Arrays.asList("I", "U");
        String VEHICLE_TYPE = "LX";
        String SERVICE_PLAN = "GV";
        String BLACK_LIST = "BL";
        String WHITE_lIST = "WL";
    }

    public enum RFIDStatus {
        NEW(0),
        ACTIVE(1),
        DESTROY(2),
        CLOSE(3),
        OPEN(4),
        TRANSFER(5);
        public final int code;

        RFIDStatus(int code) {
            this.code = code;
        }
    }

    public static final Long BOO2ChargeBOO2 = 1L;
    public static final Long BOO2ChargeBOO1 = 2L;
    public static final Long BOO1ChargeBOO2 = 3L;

    public interface MOMO_MESSAGE {
        String PARTNER_REF_ID = "partnerRefId";
        String PARTNER_CODE = "partnerCode";
        String AMOUNT = "amount";
        String CONFIRM_APP_TRANSACTION = "capture";
        String CANCEL_APP_TRANSACTION = "revertAuthorize";
        String REQUEST_WEB_TYPE = "captureMoMoWallet";
    }

    public interface BOT_REFUND {
        Long YES = 1L;
        Long NO = 0L;
    }

    public interface AUTO_RENEW {
        String YES = "1";
        String NO = "0";
    }

    public enum BooEtagStatus {
        OPEN(1),
        CLOSE(2),
        DESTROY(0);
        public final int code;

        BooEtagStatus(int code) {
            this.code = code;
        }
    }

    public interface VIETTEL_PAY_SERVICE {
        String COMMAND = "PAYMENT";
        String CMD = "TRANS_INQUIRY";
    }

    public interface EXCEPTION_LIST_TYPE {
        String LX = "1";
        String GV = "2";
        String WL = "3";
        String BL = "4";
    }

    public interface ActionType {
        String ON_OFF_PARKING_SERVICE = "ON_OFF_PARKING_SERVICE";
        String ON_OFF_FUEL_SERVICE = "ON_OFF_FUEL_SERVICE";
        String ON_OFF_VERIFY_METHOD = "ON_OFF_VERIFY_SERVICE";
        String CHANGE_PASS_CODE = "CHANGE_PASSC_CODE";
        String ON_OFF_ROAD_PARKING_SERVICE = "ON_OFF_ROAD_PARKING_SERVICE";
    }

    public interface ActionReason {
        String ON_PARKING_SERVICE = "ON_PARKING_SERVICE";
        String OFF_PARKING_SERVICE = "OFF_PARKING_SERVICE";
        String ON_FUEL_SERVICE = "ON_FUEL_SERVICE";
        String OFF_FUEL_SERVICE = "OFF_FUEL_SERVICE";
        String ON_ROAD_PARKING_SERVICE = "ON_ROAD_PARKING_SERVICE";
        String OFF_ROAD_PARKING_SERVICE = "OFF_ROAD_PARKING_SERVICE";
        String ON_APP_VERIFY = "ON_VERIFY_FROM_APP_CPT";
        String OFF_APP_VERIFY = "OFF_VERIFY_FROM_APP_CPT";
        String ON_LANE_VERIFY = "ON_VERIFY_FROM_LANE";
        String OFF_LANE_VERIFY = "OFF_VERIFY_FROM_LANE";
        String CUSTOMER_REQUIRE_CHANGE_PASSCODE = "CUSTOMER_REQUEST";
    }

    public interface USER_ATTRIBUTE {
        String SHOP_ID = "shop_id";
        String SHOP_NAME = "shop_name";
        String SHOP_CODE = "shop_code";
        String STAFF_ID = "staff_id";
        String PARTNER_CODE = "partner_code";
        String PARTNER_TYPE = "partner_type";
        String WAREHOUSE_ID = "warehouse_id";
        String PHONE_NUMBER = "phone_number";
        String PHONE_NUMBER_CTV = "phone_number_ctv";
        String STAFF_NAME = "name";
    }

    public interface ACTION_TYPE {
        String REGISTER_CUSTOMER = "REGISTER_CUSTOMER";
        String UPDATE_CONTACT_PROFILE = "5";
        String CREATE_OTO = "CREATE_OTO";
        String CREATE_MOTO = "CREATE_MOTO";
    }

    public interface IM_VTT_VDTC_CODE {
        //RfidType WINDSHIELD dan kinh
        String ETC_FREE_WINDSHIELD = "ETC_FREE";
        String ETC_FEE_120_WINDSHIELD = "ETC_FEE_120";

        //RfidType LAMP dan den
        String ETC_FREE_LAMP = "ETC_FREE_LAMP";
        String ETC_FEE_120_LAMP = "ETC_FEE_120_LAMP";

        String ETC_FREE_LAMP_0422 = "ETC_FREE_LAMP_0422";
        String ETC_FEE_120_LAMP_0422 = "ETC_FEE_120_LAMP_0422";
        String ETC_FREE_0422 = "ETC_FREE_0422";
        String ETC_FEE_120_0422 = "ETC_FEE_120_0422";

    }

    public interface STICKY_TYPE {
        Long SHOP = 0L;
        Long HOME = 1L;
    }

    public interface SUPERAPP_CONSTANT {
        Long CUST_TYPE_PERSONAL = 1L;
        Long CUST_TYPE_ORGANIZATION = 2L;
        String ACT_TYPE_CODE = "SUPERAPP_REG";
        String DOCUMENT_TYPE_CODE = "CMND";
    }

    public interface CASE_UPDATE_VEHICLE {
        int REGISTER_VEHICLE = 1;
        int ASSIGN_VEHICLE = 2;
        int SWAP_VEHICLE = 3;
    }

    public interface APP_CLIENT_ID {
        String APP_CHU_PT = "mobile-app-chupt";
        String PORTAL_CHU_PT = "portal-chu-pt";
        String APP_CTV_DAI_LY = "mobile-app-ctv-daily";
        String BOO1 = "boo1";
        String CMS = "cms";
        String VT_PAY = "viettelpay";
        String MOMO = "momo";
        String CRM = "crm";
        String BOT = "portal-bot";
        String MOT = "portal-mot";
        String OCS = "ocs";
        String VCAR = "vcar";
        String BIDV = "bidv";
        String VNPAY = "vnpay";
        String CRM_PUBLIC = "crm-public";
        String APP_CTV_DAI_LY_PUBLIC = "mobile-app-ctv-daily-public";
        String APP_DASHBOARD_PUBLIC = "mobile-app-dashboard-public";
        String APP_VIETMAP = "vietmap";
        String BOT_AUTO = "botauto";
        List<String> ALLOWED_CLIENT = Arrays.asList(BOO1, MOMO, CMS, VT_PAY, BOT, MOT, OCS, "tcdb", APP_CTV_DAI_LY, BIDV, VNPAY, "dashboard", "baohiem", VCAR, "shopeepay", BOT_AUTO);
    }

    public interface APP_THIRTY_ID {
        String VTT = "VTT";
        String OCS = "OCS";
        String BOO1 = "BOO1";
        String MOMO = "MOMO";
        String BIDV = "BIDV";
        String VNPAY = "VNPAY";
        String VTPAY = "VIETTELPAY";
        String EMAIL = "EMAIL";
        String SMS = "SMSBranchName";
        String VTP = "Viettel Post";
        String IM_VTT = "IM";
        String VPBANK = "VPBANK";
        String EKYC = "EKYC";
        String SINVOICE = "SINVOICE";
    }

    public interface MOMO_APP_ERROR_CODE {
        String SUCCESS = "0";
        String PAYMENT_FAILED = "1";
        String PEYMENT_YET = "2";
        String TRANS_IS_NOT_FOUND = "3";
        String AMOUNT_WRONG = "4";
        String INPUT_INVALID = "5";
        String CONTRACT_ID_IS_NOT_FOUND = "8";
        String CONTRACT_ID_IS_BLOCKED = "9";
        String SERVICE_ERROR = "12";
        String REQUEST_TIME_INVALID = "15";
    }

    public interface KEYCLOAK {
        String VTT = "VTT";
        String VDTC = "VDTC";
        String PW_DEFAULT = "Ep@VDTC2021";
    }

    public interface MOMO_PORTAL_CPT_CODE {
        int SUCCESS = 0;
        int ORDER_ID_ERROR = 1;
        int SAVE_TOPUP_ERROR = 2;
        int ADD_BALANCE_OCS_ERROR = 3;
        int QUERY_CONTRACT_ERROR = 4;
        int MOMO_RESPONSE_ERROR = 5;
    }

    public interface ROLE_CRM {
        String ROLE_ADMIN_CRM = "Role_Admin_CRM";
        String ROLE_QUANLY_TRACUU_DAUNOI = "Role_QuanLyTraCuu_DauNoi";
        String ROLE_CAUHINH = "Role_CauHinh";
        String ROLE_DAUNOI_TRACUU = "Role_DauNoi_TraCuu";
        String ROLE_QUANLYTRACUU = "Role_QuanLyTraCuu";
        String ROLE_TOPUP = "Role_Topup";
        String ROLE_TRACUU = "Role_TraCuu";
        String ROLE_BANK = "Role_Bank";
        String ROLE_VTPAY = "Role_VTPay";
        String ROLE_TCDB = "Role_TCDB";
        String ROLE_ADMIN_STATION = "Role_Admin_Station";
        String ROLE_DIEU_CHINH_VE = "Role_DieuChinh_Ve";
        String ROLE_BOO1 = "Role_Boo1";
        String ROLE_CBH = "Role_CBH";
        String ROLE_CC = "ROLE_CC";
        String ROLE_QUANTRI_WEBVIEW = "Role_QuanTri_Webview";
        String ROLE_PROFILE = "Role_Profiles";
        String ROLE_MANAGE_ACCOUNT_CTV = "Role_Manage_Account_CTV";
        String ROLE_DOITHE = "Role_DoiThe";
        String ROLE_DIEUCHINH_VE = "Role_DieuChinh_Ve";
        String ROLE_DIEUCHINHTK = "Role_DieuChinhTK";
        String ROLE_EPC_ERROR = "Role_Epc_Error";
        String ROLE_MOMO = "Role_Momo";
        String ROLE_CRM_APP_DAILY = "Role_CRM_App_DaiLy";
        String ROLE_CRM_APP_CPT = "Role_CRM_App_CPT";
        String ROLE_JOB = "Role_Job";
        String ROLE_VCAR = "Role_VCar";
        String ROLE_CRM_BOT = "Role_Crm_Bot";
        String ROLE_TUNGNK = "tungnk";
        String ROLE_ADMIN_POST_AUDIT = "Role_Admin_Post_Audit";
        String ROLE_VIEW_POST_AUDIT = "Role_View_Post_Audit";
        String Role_CRM_KHDN = "Role_CRM_KHDN";
    }

    public interface PLATE_TYPE_ID {
        int NGOAI_GIAO = 3746;
        int NUOC_NGOAI = 3747;
    }

    public interface MINIO_FOLDER_KEY {
        String CONTRACT_PROFILE = "CONTRACT_PROFILE";
        String VEHICLE_PROFILE = "VEHICLE_PROFILE";
        String OTHER = "OTHER";
    }

    public interface CUSTOMER_TYPE {
        Long VIE = 1L;
        Long FOR = 7L;
    }

    public interface OCR_RESULT {
        String OK = "Khớp";
        String NOK = "Không khớp";
    }

    public interface OCR_REQUIRE {
        String MT = "CMT_MT";
        String MS = "CMT_MS";
        String DKKD = "DKKD";
        String APT = "APT";
        String GDK = "GDK";
        String DKX = "DKX";
        String ANH_CAN_THE = "ATDX";
    }

    public static final Map<String, String> PROPERTY_MAPPING = initMap();

    private static Map<String, String> initMap() {
        Map<String, String> map = new HashMap<>();
        map.put("accountUser", "Tên đăng nhập");
        map.put("contractId", "Id hợp đồng");
        map.put("actType", "Loại tác động");
        map.put("plateNumber", "Biển số xe");
        map.put("type", "Loại");
        map.put("offerExternalId", "offerExternalId");
        map.put("fileBase64", "Nội dung file");
        map.put("signDate", "Ngày ký");
        map.put("effDate", "Ngày hiệu lực");
        map.put("expDate", "Ngày hết hiệu lực");
        map.put("emailNotification", "Thông báo bằng email");
        map.put("smsNotification", "Thông báo bằng SMS");
        map.put("pushNotification", "Thông báo trên App");
        map.put("billCycle", "Chu kỳ xuất hóa đơn");
        map.put("payCharge", "Quy định gói cước lượt trả tiền xe qua trạm");
        map.put("noticeName", "Họ và tên người thông báo cước");
        map.put("noticeStreet", "Số nhà, đường/ phố thông báo cước");
        map.put("noticeAreaCode", "Mã khu vực thông báo cước");
        map.put("noticePhoneNumber", "Số điện thoại thông báo cước");
        map.put("signName", "Người ký");
        map.put("actTypeId", "Loại tác động");
        map.put("documentTypeId", "Loại giấy tờ");
        map.put("fileName", "Tên file");
        map.put("promotionId", "Khuyến mãi");
        map.put("assignLevel", "Mức độ gán");
        map.put("fromDate", "Từ ngày");
        map.put("toDate", "Đến ngày");
        map.put("shopId", "Cửa hàng");
        map.put("servicePlanCode", "Mã bảng cước, giá vé");
        map.put("servicePlanTypeId", "Bảng cước, giá vé");
        map.put("ocsCode", "Mã OCS");
        map.put("vehicleGroupId", "Loại phương tiện tính phí");
        map.put("autoRenew", "Gia hạn tự động");
        map.put("fee", "Giá phí");
        map.put("scope", "Phạm vi áp dụng");
        map.put("startDate", "Ngày bắt đầu");
        map.put("fullName", "Họ và tên");
        map.put("phoneNumber", "Số điện thoại");
        map.put("accountUserId", "Id tài khoản");
        map.put("amount", "Tổng tiền");
        map.put("address", "Địa chỉ");
        map.put("customerName", "Tên khách hàng");
        map.put("stockModelCode", "Mã mặt hàng trên BCCS");
        map.put("price", "Giá tiền");
        map.put("vat", "Phí VAT");
        map.put("quantity", "Số lượng");
        map.put("transType", "Loại giao dịch");
        map.put("saleTransType", "Loại giao dịch");
        map.put("balanceBefore", "Số tiền sau giao dịch");
        map.put("custId", "Khách hàng");
        map.put("url", "Đường dẫn");
        map.put("versionName", "Tên phiên bản");
        map.put("partnerCode", "partnerCode");
        map.put("partnerRefId", "partnerRefId");
        map.put("requestType", "requestType");
        map.put("momoTransId", "momoTransId");
        map.put("signature", "Chữ ký");
        map.put("EPC", "Mã etag");
        map.put("movementType", "Loại trạm");
        map.put("accessKey", "accessKey");
        map.put("orderId", "orderId");
        map.put("orderInfo", "orderInfo");
        map.put("returnUrl", "returnUrl");
        map.put("requestId", "requestId");
        map.put("errorCode", "errorCode");
        map.put("message", "message");
        map.put("localMessage", "localMessage");
        map.put("payUrl", "payUrl");
        map.put("orderType", "orderType");
        map.put("transId", "transId");
        map.put("payType", "payType");
        map.put("responseTime", "responseTime");
        map.put("extraData", "extraData");
        map.put("aliasName", "Bí danh");
        map.put("seatNumber", "Số chỗ");
        return Collections.unmodifiableMap(map);
    }

    public interface NOTIFICATION_MSG_CODE {
        String DK_TK = "DK_TK";
        String DAN_THE_EPASS = "DAN_THE_EPASS";
        String MUA_VE_THANG = "MUA_VE_THANG";
        String MUA_VE_QUY = "MUA_VE_QUY";
        String HUY_TK = "HUY_TK";
        String NAPTIEN_TK = "NAPTIEN_TK";
        String DK_SMS = "DK_SMS";
        String DOI_MK = "DOI_MK";
        String DUYET_HS_OK = "DUYET_HS_OK";
        String DUYET_HS_NOK = "DUYET_HS_NOK";
        String DOI_THE_120 = "DOI_THE_120";
        String DOI_THE_YC = "DOI_THE_YC";
        String DOI_THE_YC_120 = "DOI_THE_YC_120";
        String CANH_BAO_HS = "CANH_BAO_HS";
        String CANH_BAO_EPC_ERROR = "CANH_BAO_EPC_ERROR";
        String KM_200_30_072021 = "KM_200_30_072021";
        String TC_HUY_TK = "TU_CHOI_HUY_TK";
        String RESET_TK_1 = "RESET_TK_1";
        String RESET_TK_2 = "RESET_TK_2";
        String MO_KHOA_TK = "MO_KHOA_TK";
        String KHOA_TK = "KHOA_TK";
        String TRU_TIEN_KICH_THICH_T10 = "TRU_TIEN_KICH_THICH_T10";
        String SUCCESS_LK_KT102021 = "SUCCESS_LK_KT102021";
        String SUCCESS_TOPUP_KT102021 = "SUCCESS_TOPUP_KT102021";
        String CONG_TIEN_VCAR = "CONG_TIEN_VCAR";
        String OTP = "OTP";
        String OTP_CTV = "OTP_CTV";
        String ON_SERVICE_UTILITIES = "ON_SERVICE_UTILITIES";
        String ON_OFF_SERVICE = "ON_OF_SERVICE";
        String ACTIVE_RFID_DEBIT = "ACTIVE_RFID_DEBIT";
        String TRU_TIEN_VE_BUS_LUOT_ETC = "TRU_TIEN_VE_BUS_LUOT_ETC";
        String TRU_TIEN_VE_BUS_LUOT_MUA_TRUOC_ETC = "TRU_TIEN_VE_BUS_LUOT_MUA_TRUOC_ETC";
        String TRU_TIEN_VE_BUS_THANG_MOT_TUYEN_ETC = "TRU_TIEN_VE_BUS_THANG_MOT_TUYEN_ETC";
        String TRU_TIEN_VE_BUS_THANG_LIEN_TUYEN_ETC = "TRU_TIEN_VE_BUS_THANG_LIEN_TUYEN_ETC";
        String TRU_TIEN_VE_BUS_BLOCK_ETC = "TRU_TIEN_VE_BUS_BLOCK_ETC";
        String EPASS_ADD_CUST_NO_FOR_CUSTOMER = "EPASS_ADD_CUST_NO_FOR_CUSTOMER";
        String DOI_THE_CUSTOM = "DOI_THE_CUSTOM";
    }

    public interface KPI_LOG {
        String APPLICATION_CODE = "ETC";
        String SERVICE_CODE = "CRM";
        String PUBLIC_USERNAME = "PUBLIC";
        String DEFAULT_RESULT_CODE_ERROR = "0";
        String DEFAULT_STATUS_ERROR = "0";
        String DEFAULT_MESSAGE_ERROR = "ERROR";
    }

    public interface COMMISSION_CHANNEL {
        String VTT = "VTT";
        String VTMAN = "VTMAN";
        String VDTC = "VDTC";
    }

    public interface VEHICLE_TYPE {
        List<Long> XE_CHUYEN_DUNG = Arrays.asList(41L);
    }

    public enum PromotionTopup {
        WL, BL, KMT, NONE
    }

    public enum StationType {
        OPEN("0", "1"), CLOSE("2", "0");
        public final String movementType;
        public final String stationType;

        StationType(String movementType, String stationType) {
            this.movementType = movementType;
            this.stationType = stationType;
        }
    }

    public interface APPLICATION {
        String APP_CPT = "APP_CPT";
    }

    public enum PersonalCustType {
        VIE("VIE"), FOR("FOR"), INVALID("INVALID");
        private String code;

        PersonalCustType(String code) {
            this.code = code;
        }

        public static PersonalCustType getCustType(String code) {
            switch (code) {
                case "VIE":
                    return VIE;
                case "FOR":
                    return FOR;
                default:
                    return INVALID;
            }
        }

        public static boolean inValid(String code) {
            return getCustType(code).equals(INVALID);
        }
    }

    public enum EnterpriseCustType {
        JSC("JSC"), LTD("LTD"), SOE("SOE"), PVC("PVC"), GOV("GOV"), INVALID("INVALID");
        private String code;

        EnterpriseCustType(String code) {
            this.code = code;
        }

        public EnterpriseCustType getCustType(String code) {
            switch (code) {
                case "JSC":
                    return JSC;
                case "LTD":
                    return LTD;
                case "SOE":
                    return SOE;
                case "PVC":
                    return PVC;
                case "GOV":
                    return GOV;
                default:
                    return INVALID;
            }
        }

        public boolean inValid(String code) {
            return getCustType(code).equals(INVALID);
        }
    }

    public static String REGIS_PERSONAL_PROFILE = "REGIS_PERSONAL_PROFILE";
    public static String TRAFFIC_ACCOUNT_CONFIG = "TRAFFIC_ACCOUNT_CONFIG";
    public static String ENABLE_TRAFFIC_ACCOUNT = "ENABLE_TRAFFIC_ACCOUNT";

    public interface TOOL_REGISTRY_CONFIG {
        String TABLE_NAME_TOOL_REGISTRY_CONFIG = "TOOL_REGISTRY_CONFIG";
        String MAX_ITEM_IN_ONCE_QUERY ="MAX_ITEM_IN_ONCE_QUERY";
        String MAX_ITEM_IN_DAY = "MAX_ITEM_IN_DAY";
        String MAX_ITEM_ERROR_IN_24H = "MAX_ITEM_ERROR_IN_24H";
        String MAX_TIME_TO_KEEP_ERROR_DATA = "MAX_TIME_TO_KEEP_ERROR_DATA";

    }

    public interface SERVICE_TYPE_CODE {
        String FUEL_SERVICE = "FUEL_SERVICE";
        String PARKING_SERVICE = "PARKING_SERVICE";
        String ROAD_PARKING_SERVICE = "ROAD_PARKING_SERVICE";
    }

    public interface QueryConfig {
        String QUERY_REGISTER_LIMITED = "QUERY_REGISTER_LIMITED";
        String DATE_QUERY = "DATE_QUERY";
        String LIST_ERROR_DATA = "LIST_ERROR_DATA";
        String COUNT_DATA_IN_DAY = "COUNT_DATA_IN_DAY";
        String DATA_REGISTER = "DATA_REGISTER";
    }

    public interface RETRY_NAP_TIEN {
        String BIDV = "RETRY_NAP_TIEN_BIDV";
        String MB = "RETRY_NAP_TIEN_MB";
        String VIB = "RETRY_NAP_TIEN_VIB";
        String VPB = "RETRY_NAP_TIEN_VPB";
        String OCB = "RETRY_NAP_TIEN_OCB";
        String TPB = "RETRY_NAP_TIEN_TPB";
        String MSB = "RETRY_NAP_TIEN_MSB";
        String Agribank = "RETRY_NAP_TIEN_AGRIBANK";
        String PVcomBank = "RETRY_NAP_TIEN_PVCOMBANK";
        List<String> RETRY_NAP_TIEN_BANK = Arrays.asList(BIDV, MB, VIB, VPB, OCB, TPB, MSB, Agribank, PVcomBank);
    }

    public static final String OCS_CODE_UTTQ = "101010";
    public static final String SALE_TRAN_CODE = "DV";
    // VInvoice constants
    public static final String VND = "VND";
    public static final String TICKET_CODE = "TICKET_01";
    public static final String UNIT_NAME = "Cái";
    public static final String PAYMENT_METHOD = "Tiền mặt";

    public interface EBUS {
        String VND = "VND";
        String TICKET_CODE = "TICKET_01";
        String UNIT_NAME = "Cái";
        String BUYER_NAME = "Transerco";
        String BUYER_ADDRESS = "An Khánh Hoài Đức Hà Nội";
        String PAYMENT_METHOD = "Tiền mặt";
        String ADJUSTMENT_TYPE = "1";
        int EXCHANGE_RATE = 0;
        Long TAX_PERCENTAGE = 0L;
        Long TAXABLE_AMOUNT = 0L;
        Long TAX_AMOUNT = 0L;
        Long SELECTION = 1L;
        Long ITEM_DISCOUNT = 0L;
        String KEYCLOAK_KEYWORD = "TSC";
        String VNPAY_METHOD_CODE = "VNPAY_QRCODE";
        String SUCCESS_STATUS_CODE = "200";
        String BUS_NAME = "VÉ XE BUS TUYẾN";
    }

    public enum ActiveStatus {
        ACTIVE(1),
        INACTIVE(0);
        public final Integer value;

        ActiveStatus(Integer val) {
            this.value = val;
        }
    }

    public enum debitStatus{
        EMPTY(0L),
        DEBIT(1L),
        NOT_DEBIT(2L);
        public final Long value;
        debitStatus(Long val) {
            this.value = val;
        }
    }

    public interface SCREEN_VEHICLE {
        String KY_PHU_LUC = "KY_PHU_LUC";
        String DANG_KY_PT = "DANG_KY_PT";
    }

    public interface VCB_TOPUP {
        String VCB = "VCB";
        String PROVIDER_ID = "EPASS";
        String SERVICE_ID = "TOPUP";
        String SUCCESS = "SUCCESS";
        String SUCCESSFUL = "SUCCESSFUL";
        String FAILURE = "FAILURE";
        String INVALID_USER = "INVALID_USER";
        String INVALID_SIGNATURE = "INVALID_SIGNATURE";
        String BILL_ERR_DESC = "Lỗi OCS : Lỗi khi nạp tiền tài khoản ETC";
        String FAILURE_CODE = "1"; // that bai
        String SUCCESS_CODE = "0"; // thành công
        int CONTEXT_ERROR_CODE_0 = 0;
        int CONTEXT_ERROR_CODE_2 = 2;
        int CONTEXT_ERROR_CODE_17 = 17;
        int CONTEXT_ERROR_CODE_18 = 18;
    }
    public interface TEMPLATE_FILE_NAME {
        String DOI_BIEN_HANG_LOAT = "/template/import/template_doi_bsx_hang_loat.xlsx";
        String DOI_MAT_KHAU_HANG_LOAT = "/template/import/template_doi_mat_khau_hang_loat.xlsx";
        String KY_PHU_LUC_HOP_DONG = "/template/import/template_ky_phu_luc_hop_dong_hang_loat.xlsx";
        String TACH_HOP_DONG = "/template/import/template_tach_hop_dong_hang_loat.xlsx";
    }
}