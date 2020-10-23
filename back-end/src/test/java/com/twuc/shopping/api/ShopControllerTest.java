package com.twuc.shopping.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twuc.shopping.bo.Good;
import com.twuc.shopping.po.GoodPO;
import com.twuc.shopping.repository.ShopRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
                .name("可乐").price("3").priceUnit("元/瓶").url("https://www.coca-cola.com.cn/content/dam/journey/cn/zh/private/brand/%E4%BA%A7%E5%93%81%E5%9B%BE%E5%8F%AF%E4%B9%90.png").build());
        GoodPO saved1 = shopRepository.save(GoodPO.builder()
                .name("雪碧").price("3").priceUnit("元/瓶").url("https://www.coca-cola.com.cn/content/dam/journey/cn/zh/private/brand/%E4%BA%A7%E5%93%81%E5%9B%BE%E9%9B%AA%E7%A2%A7.png").build());
        GoodPO saved2 = shopRepository.save(GoodPO.builder()
                .name("芬达").price("3").priceUnit("元/瓶").url("https://www.coca-cola.com.cn/content/dam/journey/cn/zh/private/brand/%E4%BA%A7%E5%93%81%E5%9B%BE%E8%8A%AC%E8%BE%BE.png").build());
        GoodPO saved3 = shopRepository.save(GoodPO.builder()
                .name("醒目").price("4").priceUnit("元/瓶").url("https://www.coca-cola.com.cn/content/dam/journey/cn/zh/private/brand/%E4%BA%A7%E5%93%81%E5%9B%BE%E9%86%92%E7%9B%AE.png").build());
        GoodPO saved4 = shopRepository.save(GoodPO.builder()
                .name("美汁源").price("4.5").priceUnit("元/瓶").url("https://www.coca-cola.com.cn/content/dam/journey/cn/zh/private/brand/%E4%BA%A7%E5%93%81%E5%9B%BE%E7%BE%8E%E6%B1%81%E6%BA%90.png").build());
        GoodPO saved5 = shopRepository.save(GoodPO.builder()
                .name("冰露").price("1").priceUnit("元/瓶").url("https://www.coca-cola.com.cn/content/dam/journey/cn/zh/private/brand/%E4%BA%A7%E5%93%81%E5%9B%BE%E5%86%B0%E9%9C%B2.png").build());
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
    @Test
    public void should_add_good_to_list() throws Exception {
        Good good = Good.builder().name("神仙水").price("单价：100元/瓶").build();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(good);
        mockMvc.perform(post("/goods").content(jsonString).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}