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
    public void add_goods() throws Exception {
        shopRepository.deleteAll();
        GoodPO saved = shopRepository.save(GoodPO.builder()
                .name("可乐").price("单价：1元/瓶").build());
        GoodPO saved1 = shopRepository.save(GoodPO.builder()
                .name("雪碧").price("单价：2元/瓶").build());
        GoodPO saved2 = shopRepository.save(GoodPO.builder()
                .name("美年达").price("单价：3元/瓶").build());
        GoodPO saved3 = shopRepository.save(GoodPO.builder()
                .name("王老吉").price("单价：4元/瓶").build());
        GoodPO saved4 = shopRepository.save(GoodPO.builder()
                .name("咖啡").price("单价：5元/瓶").build());
        GoodPO saved5 = shopRepository.save(GoodPO.builder()
                .name("橙汁").price("单价：6元/瓶").build());
    }
    @Test
    public void should_get_goods_list() throws Exception {
        GoodPO saved = shopRepository.save(GoodPO.builder()
                .name("可乐1").price("单价：1元/瓶").build());
        mockMvc.perform(get("/goods"))
                .andExpect(jsonPath("$[0].name", is("可乐1")))
                .andExpect(jsonPath("$[0].price", is("单价：1元/瓶")))
                .andExpect(status().isOk());
    }

}