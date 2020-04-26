package com.bagic.Channelservices.infrastructure;

import org.springframework.stereotype.Component;

import com.bagic.Channelservices.extReqRespModel.QuickQuoteExtReq;
import com.bagic.Channelservices.extReqRespModel.QuickQuoteExtResp;
import com.bagic.Channelservices.reqRespModel.Proposer;
import com.bagic.Channelservices.reqRespModel.Quote;

@Component
public class TravelService {
	
	public QuickQuoteExtResp travelRestMethodCall(QuickQuoteExtReq req) {

		QuickQuoteExtResp resp = new QuickQuoteExtResp();
		Proposer p = new Proposer();
		p.setId("AGExtId901");
		p.setName("External");

		Quote q= new Quote();
		q.setPolicyName("Ext-policy");
		q.setQuoteId("ExtQuote901");
		
		resp.setProp(p);
		resp.setQ(q);
		return resp;
	}

}
