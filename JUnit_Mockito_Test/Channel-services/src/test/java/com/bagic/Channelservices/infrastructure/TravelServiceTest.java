package com.bagic.Channelservices.infrastructure;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bagic.Channelservices.extReqRespModel.QuickQuoteExtReq;
import com.bagic.Channelservices.extReqRespModel.QuickQuoteExtResp;

@SpringBootTest
class TravelServiceTest {
	
	@Autowired
	TravelService tsrv;

	@Test
	void testTravelRestMethodCall() {
		
		QuickQuoteExtReq q =new QuickQuoteExtReq();
		
		QuickQuoteExtResp resp = tsrv.travelRestMethodCall(q);
		
		assertThat(resp).isExactlyInstanceOf(QuickQuoteExtResp.class);
	}

}
