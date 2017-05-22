import factory_pattern.Product;
import factory_pattern.ProductFactory;
import org.junit.Test;

/**
 * Created by vallus on 06/05/17.
 */
public class FactoryPatternTest {

    @Test
    public void testFactoryPattern() {
        ProductFactory productFactory = new ProductFactory();
        Product productA = productFactory.createProduct("A");
        Product productB = productFactory.createProduct("B");
    }

}
