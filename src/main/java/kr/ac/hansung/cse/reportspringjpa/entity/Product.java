package kr.ac.hansung.cse.reportspringjpa.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="상품 이름은 필수입니다.")
    private String name;

    @NotBlank(message="브랜드는 필수입니다.")
    private String brand;

    @NotBlank(message="제조국은 필수입니다.")
    private String madeIn;

    @DecimalMin(value = "0.0", inclusive = true, message = "가격은 0 이상이어야 합니다.")
    private double price;

}