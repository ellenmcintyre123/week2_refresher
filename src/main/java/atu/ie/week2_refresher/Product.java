package atu.ie.week2_refresher;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private long id;

    @NotBlank(message = "name can not be null")
    private String name;

    @Min(value = 1, message = "can not be 0")
    private double price;

}
