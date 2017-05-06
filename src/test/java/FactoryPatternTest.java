import factory_pattern.ProductFactory;
import org.junit.Test;

/**
 * Created by vallus on 06/05/17.
 */
public class FactoryPatternTest {

    @Test
    public void testFactoryPattern() {
        ProductFactory productFactory = new ProductFactory();
        productFactory.createProduct("A");
        productFactory.createProduct("B");
    }

}
