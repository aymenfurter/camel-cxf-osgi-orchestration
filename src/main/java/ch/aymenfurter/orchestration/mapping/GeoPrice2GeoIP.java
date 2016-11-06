package ch.aymenfurter.orchestration.mapping;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;

import ch.aymenfurter.InputLocalizedPrice;

public class GeoPrice2GeoIP implements Processor {
public void process(Exchange ex) throws Exception {
		MessageContentsList msgList = (MessageContentsList) ex.getIn().getBody();
		
		InputLocalizedPrice geoPrice = (InputLocalizedPrice) msgList.get(0);;		
		ex.getIn().setHeader(CxfConstants.OPERATION_NAME, "GetGeoIP");		
		ex.getIn().setHeader(CxfConstants.OPERATION_NAMESPACE, "http://www.webservicex.net/");
		
		
		ex.getIn().setBody(geoPrice.getIpaddress());		
	}
}
