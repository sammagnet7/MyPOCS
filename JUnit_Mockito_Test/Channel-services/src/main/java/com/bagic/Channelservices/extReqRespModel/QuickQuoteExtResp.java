package com.bagic.Channelservices.extReqRespModel;

import com.bagic.Channelservices.reqRespModel.Proposer;
import com.bagic.Channelservices.reqRespModel.Quote;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper=true)
public class QuickQuoteExtResp {
	
	Proposer prop;
	
	Quote q;
	
	
}
