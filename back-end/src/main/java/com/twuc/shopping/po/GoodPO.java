package com.twuc.shopping.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "good")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GoodPO {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String price;
}
