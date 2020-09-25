package com.twuc.shopping;

import com.twuc.shopping.repository.ShopRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ShoppingApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	ShopRepository shopRepository;
	@Test
	public void should_get_goods_list() throws Exception {
		mockMvc.perform(get("/user/1"))
				.andExpect(jsonPath("$.name", is("dgf")))
				.andExpect(jsonPath("$.email", is("a@b.com")))
				.andExpect(status().isOk());
	}
}
