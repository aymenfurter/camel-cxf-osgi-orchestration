package ch.aymenfurter.orchestration.mapping;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;

import ch.aymenfurter.OutputLocalizedPrice;

public class Country2GeoPriceResponse implements Processor {
public void process(Exchange ex) throws Exception {
		MessageContentsList msgList = (MessageContentsList) ex.getIn().getBody();
		String currency = (String) msgList.get(0);;		
		ex.getIn().setHeader(CxfConstants.OPERATION_NAME, "GetGeoIP");
		
		OutputLocalizedPrice response = new OutputLocalizedPrice();
		if (currency.contains("USD")) {
			response.setPrice("100");
		} else if (currency.contains("CHF")) {
			response.setPrice("200");
		} else {
			response.setPrice("500");
		}
		
		ex.getIn().setBody(response);
	}
}
