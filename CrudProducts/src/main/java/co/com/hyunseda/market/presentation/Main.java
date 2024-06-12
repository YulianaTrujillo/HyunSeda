
package co.com.hyunseda.market.presentation;

import co.com.hyunseda.market.access.FactoryCategory;
import co.com.hyunseda.market.access.FactoryProduct;
import co.com.hyunseda.market.access.ICategoryRepository;
import co.com.hyunseda.market.access.IProductRepository;
import co.com.hyunseda.market.presentation.GUIProducts;
import co.com.hyunseda.market.service.CategoryService;
import co.com.hyunseda.market.service.ProductService;

/**
 *
 * @author Libardo Pantoja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IProductRepository ipr = FactoryProduct.getInstance().getRepository("default");
        ICategoryRepository cr = FactoryCategory.getInstance().getRepository("default");
        
        CategoryService categoryService = new CategoryService(cr);
        ProductService productService = new ProductService(ipr);
        
        GUIInicio instanceI = new GUIInicio(categoryService, productService );
        GUIProducts instance = new GUIProducts(categoryService, productService);
        GUICategory instance2 = new GUICategory(categoryService);
        
        
        
        
        instanceI.setVisible(true);
    }
    
}
