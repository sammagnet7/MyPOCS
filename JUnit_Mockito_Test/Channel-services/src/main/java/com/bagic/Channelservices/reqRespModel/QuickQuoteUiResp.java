package com.bagic.Channelservices.reqRespModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper=true)
public class QuickQuoteUiResp {
	
	Proposer prop;
	Quote q;

}
