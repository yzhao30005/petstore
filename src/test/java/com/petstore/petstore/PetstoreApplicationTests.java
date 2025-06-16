package com.petstore.petstore;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import com.petstore.petstore.controller.PetstoreController;
import com.petstore.petstore.controller.repository.ProductRepository;
import com.petstore.petstore.model.Product;

@SpringBootTest
@AutoConfigureMockMvc
class PetstoreApplicationTests {

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private ProductRepository productRepository;

	@Test
	void testGetProduct() throws Exception {
	  Product product = new Product();
	  product.setName("test");
	  product.setDescription("This is a test");
	  product.setQuantity(2);

	  productRepository.save(product);

    mockMvc
    .perform(get(PetstoreController.BASE_URL)
        .contentType(APPLICATION_JSON)        )
    .andExpect(status().isOk());
	}

}
