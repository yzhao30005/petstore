package com.petstore.petstore;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.petstore.petstore.controller.PetstoreController;

@SpringBootTest
class PetstoreApplicationTests {

  @Autowired
  protected MockMvc mockMvc;

	@Test
	void testGetProduct() throws Exception {
    mockMvc
    .perform(get(PetstoreController.BASE_URL).contentType(APPLICATION_JSON)        )
    .andExpect(status().isOk());
	}

}
