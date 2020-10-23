package com.twuc.shopping.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Good {
    private String name;
    private String price;
    private String priceUnit;
    private String url;
}
