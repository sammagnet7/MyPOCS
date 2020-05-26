package com.bagic.Channelservices.extReqRespModel;

import com.bagic.Channelservices.reqRespModel.Proposer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper=true)
public class QuickQuoteExtReq {

	Proposer prop;
	
}
