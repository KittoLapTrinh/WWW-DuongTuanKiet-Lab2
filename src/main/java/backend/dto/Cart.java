package backend.dto;

import backend.models.Product;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cart extends Product {
    private double quantity;
    private double price;
}
