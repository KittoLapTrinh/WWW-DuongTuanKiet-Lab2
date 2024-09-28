package backend.models;


import backend.enums.ProductStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@NamedQueries({
        @NamedQuery(
                name = "Product.findAll", query = "select p from Product p where p.productStatus =: status"
        ),
        @NamedQuery(
                name = "Product.getProductByName", query = "select p.name from Product p where p.id =: id"
        ),
        @NamedQuery(
                name = "Product.getProductIdAndNamdInProductPrice",
                query = "select p from Product p where p.id IN (select DISTINCT pp.product.id from ProductPrice pp)"
        )
})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long id;
    @Column(length = 150)
    private String name;
    @Column(length = 250)
    private String description;
    @Column(length = 25)
    private String unit;
    @Column(name = "manufacturer_name", length = 100)
    private String manufacturer;
    @Column(name = "status", columnDefinition = "INT(11)")
    private ProductStatus productStatus;
}
