package com.bagic.Channelservices.extReqRespModel;

import com.bagic.Channelservices.reqRespModel.Proposer;
import com.bagic.Channelservices.reqRespModel.Quote;


public class QuickQuoteExtResp {
	
	Proposer prop;
	
	Quote q;
	
	
	public Proposer getProp() {
		return prop;
	}

	public void setProp(Proposer prop) {
		this.prop = prop;
	}

	public Quote getQ() {
		return q;
	}

	public void setQ(Quote q) {
		this.q = q;
	}

}
