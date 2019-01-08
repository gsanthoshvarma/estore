package com.sr.emstore.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"/WEB-INF/applicationContext.xml"})
public class AdminControllerTest {
	
	@Autowired
	private SimpleDriverDataSource dataSource;
	
	@Test
	public void sampleTest() {
		System.out.println(dataSource);
	}

}
