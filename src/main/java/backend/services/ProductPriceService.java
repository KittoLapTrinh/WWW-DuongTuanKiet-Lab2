package backend.services;

import backend.repositories.ProductPriceRepository;

import java.time.LocalDateTime;
import java.util.Map;

public class ProductPriceService {
    private final ProductPriceRepository productPriceRepository;

    public ProductPriceService() {
        productPriceRepository = new ProductPriceRepository();
    }

    public Double getPriceOfProduct(long productId){
        return productPriceRepository.getPrice(productId);
    }
    public Map<LocalDateTime, Double> getDateAndPriceByProductId(long productId) {
        return productPriceRepository.getDateAndPriceByProductId(productId);
    }
}
