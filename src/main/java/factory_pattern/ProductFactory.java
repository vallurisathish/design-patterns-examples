package factory_pattern;

/**
 * Created by vallus on 06/05/17.
 */
public class ProductFactory {

    public Product createProduct(String type) {
        if("A".equals(type)) {
            return new ProductA();
        }
        else {
            return new ProductB();
        }
    }
}
