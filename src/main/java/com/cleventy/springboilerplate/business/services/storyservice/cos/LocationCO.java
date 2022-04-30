package com.cleventy.springboilerplate.business.services.storyservice.cos;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class LocationCO implements Serializable {
	
	private static final long serialVersionUID = -2011327655314164545L;
	
	private Long id;
    private double coordX;
    private double coordY;
    private String name;
    
}
