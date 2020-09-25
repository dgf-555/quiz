package com.twuc.shopping.repository;

import com.twuc.shopping.po.GoodPO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShopRepository extends CrudRepository<GoodPO,Integer> {
    @Override
    List<GoodPO> findAll();
}
