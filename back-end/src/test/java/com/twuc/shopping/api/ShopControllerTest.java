package com.twuc.shopping.api;

import com.twuc.shopping.po.GoodPO;
import com.twuc.shopping.repository.ShopRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ShopControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    ShopRepository shopRepository;
    @Test
    public void should_get_goods_list() throws Exception {
        GoodPO saved = shopRepository.save(GoodPO.builder()
                .name("可乐1").price("单价：1元/瓶").build());
//        mockMvc.perform(get("/goods"))
//                .andExpect(jsonPath("$[0].name", is("可乐1")))
//                .andExpect(jsonPath("$[0].price", is("单价：1元/瓶")))
//                .andExpect(status().isOk());
    }

}