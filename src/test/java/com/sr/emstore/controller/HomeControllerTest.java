package com.sr.emstore.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.sr.emstore.util.PageConstants;

public class HomeControllerTest {
	
	@Test
	public void testHome() {
		HomeController homeController = new HomeController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/"))
			.andExpect(MockMvcResultMatchers.view()
					.name(PageConstants.HOME_PAGE));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
