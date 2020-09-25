package com.twuc.shopping.api;

import com.twuc.shopping.bo.Good;
import com.twuc.shopping.po.GoodPO;
import com.twuc.shopping.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
    @PostMapping("/goods")
    public ResponseEntity add_user(@RequestBody Good good){
        GoodPO goodPO =GoodPO.builder().name(good.getName()).price(good.getPrice()).build();
        shopRepository.save(goodPO);
        return ResponseEntity.ok().build();
    }
}
