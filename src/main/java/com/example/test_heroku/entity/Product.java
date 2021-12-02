package com.example.test_heroku.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Product {

    @Id
    @GeneratedValue
    private Long productId;

    private String name;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                '}';
    }
}
