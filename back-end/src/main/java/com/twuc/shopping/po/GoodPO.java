package com.twuc.shopping.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "good")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GoodPO {
    @Id
    @GeneratedValue(generator = "goodPO_id",strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String price;
    private String priceUnit;
    private String url;
}
