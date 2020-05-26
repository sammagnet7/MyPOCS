package com.bagic.Channelservices.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper=true)
@Component
public class ProposerDTO {
	
	private String id;
	private String name;

}
