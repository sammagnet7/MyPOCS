package com.bagic.Channelservices.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bagic.Channelservices.domain.PolicyDO;
import com.bagic.Channelservices.domain.ProposerDO;
import com.bagic.Channelservices.reqRespModel.Proposer;
import com.bagic.Channelservices.reqRespModel.QuickQuoteUiResp;
import com.bagic.Channelservices.reqRespModel.QuikQuoteUiReq;
import com.bagic.Channelservices.reqRespModel.Quote;

@Component
public class TravelBL {
	
	@Autowired
	PolicyDO polDO;
	
	@Autowired
	ProposerDO propDO;
	
	public QuickQuoteUiResp quickquote(QuikQuoteUiReq q) {
		this.UiReqConvertion(q);
		propDO.quickQuote();
		QuickQuoteUiResp resp = new QuickQuoteUiResp();
		resp.setProp(new Proposer());
		resp.setQ(new Quote());
		this.UiRespConvertion(resp);
		if(resp.getProp().getName().equalsIgnoreCase("Mocked")) {
			resp.getProp().setName("Mocked-BL_updated");
		}
		return resp;	
	}
	
	private void UiReqConvertion(QuikQuoteUiReq q) {
		propDO.setId(q.getProp().getId());
		propDO.setName(q.getProp().getName());
	}
	
	private void UiRespConvertion(QuickQuoteUiResp resp) {
		resp.getProp().setId(propDO.getId());
		resp.getProp().setName(propDO.getName());
		resp.getQ().setQuoteId(polDO.getQuoteId());
		resp.getQ().setPolicyName(polDO.getPolicyName());
	}

	public String demoMethod(String demo) {
		return "Hi "+demo;
	}

}
