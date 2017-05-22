package factory_pattern;

/**
 * Simple factory shows two different concrete products being created using the ProductFactory.
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
