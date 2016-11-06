package ch.aymenfurter.orchestration.mapping;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;

import net.wsip.GeoIP;


public class GeoIP2Country implements Processor {
public void process(Exchange ex) throws Exception {
	MessageContentsList msgList = (MessageContentsList) ex.getIn().getBody();
	GeoIP geoIPs = (GeoIP) msgList.get(0);;		
	ex.getIn().setHeader(CxfConstants.OPERATION_NAME, "GetCurrencyByCountry");
	ex.getIn().setHeader(CxfConstants.OPERATION_NAMESPACE, "http://www.webserviceX.NET");

	String geoIP = geoIPs.getCountryName();
	ex.getIn().setBody(geoIP); 
	}
}
