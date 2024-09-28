package backend.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product_image")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@NamedQueries({
        @NamedQuery(
                name = "ProductImage.getImage",
                query = "select pi from ProductImage pi where pi.id =: id"
        )
})
public class ProductImage {

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private long id;
    @Column(length = 250)
    private String path;
    @Column(length = 250)
    private String alternative;

}
