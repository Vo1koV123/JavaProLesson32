package com.example.glovodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table("products")
public class Product implements Serializable {
    @Id
    private Integer id;
    private String name;
    private double cost;
    private int orderid;
}
