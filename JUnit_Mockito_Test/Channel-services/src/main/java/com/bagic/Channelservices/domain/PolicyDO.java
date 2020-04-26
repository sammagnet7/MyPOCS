package com.bagic.Channelservices.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bagic.Channelservices.dto.PolicyDTO;

@Component
public class PolicyDO {
	
	@Autowired
	PolicyDTO pdto;

	public String getQuoteId() {
		return pdto.getQuoteId();
	}

	public void setQuoteId(String quoteId) {
		pdto.setQuoteId(quoteId);
	}

	public String getPolicyName() {
		return pdto.getPolicyName();
	}

	public void setPolicyName(String policyName) {
		pdto.setPolicyName(policyName);
	}

	


}
