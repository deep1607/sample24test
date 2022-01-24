package com.ibm.services.impl;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.ibm.model.GetCardAccountEnquiryResponseWrapper;
import com.ibm.model.GetCardAccountEnquiryP;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(GetCardAccountEnquiryTest.class)
public class GetCardAccountEnquiryTest {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private GetCardAccountEnquiryImpl getCardAccountEnquiryImpl;
	
	@MockBean
	private GetCardAccountEnquiryResponseWrapper response;
	
	@Test
	public void testGetCardAccountEnquiryGet() throws Exception {
	
	HttpHeaders httpHeaders = getHeaders();
	
	when(getCardAccountEnquiryImpl.execute(Mockito.any(GetCardAccountEnquiryP.class))).thenReturn(response);
	
	mvc.perform(MockMvcRequestBuilders.get("/cards/cardsAccounts").param("cif", "test").param("legalId", "test").param("accountNumber", "test").param("cardNumber", "test").param("cardStatus", "test").param("accountId", "test").param("cif", "test").param("cutOffDate", "test").param("cardNumber", "test").headers(httpHeaders)
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}
	
	public HttpHeaders getHeaders() throws Exception {

		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, String> myMap = new HashMap<String, String>();
		ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource("header.json").getFile());
		byte[] mapData = Files.readAllBytes(Paths.get( file.getAbsolutePath()));
		myMap = objectMapper.readValue(mapData, HashMap.class);

		HttpHeaders httpHeaders = new HttpHeaders();
		myMap.entrySet().stream().forEach(entry -> {
			httpHeaders.add(entry.getKey(), entry.getValue());
		});
		return httpHeaders;
	}
}