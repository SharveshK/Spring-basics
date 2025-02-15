package com.sk.simpleWebApp.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
@Entity
public class product {
    @Id
    private int prodId;
    private String prodName;
    private int prodPrice;

    public product(){

    }

}
