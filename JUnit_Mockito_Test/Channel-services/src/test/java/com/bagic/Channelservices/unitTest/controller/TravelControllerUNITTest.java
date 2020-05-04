package com.bagic.Channelservices.unitTest.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.bagic.Channelservices.bl.TravelBL;
import com.bagic.Channelservices.controller.TravelController;

@SpringBootTest
class TravelControllerUNITTest {

	@InjectMocks
	TravelController tc;
	
	@Mock
	TravelBL tbl;
	
	@BeforeEach
	private void init() {
		//Given
		when(tbl.demoMethod(Mockito.anyString())).thenReturn("Mocked");		
	}
	
	
	@Test
	void testDemoMethod() {
		//when
		String s= tc.demoMethod("Unit testing");
		//then
		assertEquals(s, "Mocked");
	}

}
