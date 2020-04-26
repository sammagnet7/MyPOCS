package com.bagic.Channelservices.dto;

import org.springframework.stereotype.Component;

@Component
public class PolicyDTO {

	private String QuoteId;
	
	private String policyName;

	public String getQuoteId() {
		return QuoteId;
	}

	public void setQuoteId(String quoteId) {
		QuoteId = quoteId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}


}
