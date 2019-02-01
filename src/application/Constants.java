package application;

public interface Constants {

	String TRADE = "Trade";
	String CASHFLOW = "Cashflow";
	String POSITION = "Position";
	String ON_DEMAND = "On Demand";
	String ON_DEMAND_EOD = "On Demand EOD";
	String DYNAMIC_POLLING = "Dynamic Polling";
	String EOD = "EOD";
	
	String COB_DATE_IN_COMMAND = "cob_dt";
	String EVENT_TYPE_IN_COMMAND = "event_type";
	String COB_DATE_DISPLAY_NAME = "COB Date";
	String EVENT_TYPE_DISPLAY_NAME = "Event Type";
	String MKT_S_CD_DISPLAY_NAME = "Mkt Snapshot CD";
	String MKT_S_CD_IN_COMMAND = "mkt_snapshot_cd";
	
	String DEFAULT_HOST = "kst-rabbitmq-nonprod.kochind.com";
	String DEFAULT_USERNAME = "krishna.ammanabrolu@kochind.com";
	String DEFAULT_PASSWORD = "krishnaammanabrolu2018";
	String DEFAULT_vHOST = "dev2_cxlAdapter";

	String CXL_OD_Q ="cxl_adaptor_on_demand_parameters_q";
	String CXL_EOD_Q ="cxl_adaptor_eod_parameters_q";

}

