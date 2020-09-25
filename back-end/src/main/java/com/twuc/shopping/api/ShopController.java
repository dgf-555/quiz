package com.twuc.shopping.api;

import com.twuc.shopping.po.GoodPO;
import com.twuc.shopping.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ShopController {
    @Autowired
    ShopRepository shopRepository;
    @CrossOrigin
    @GetMapping("/goods")
    public ResponseEntity get_goodList(){
        return ResponseEntity.ok(shopRepository.findAll());
    }
}
