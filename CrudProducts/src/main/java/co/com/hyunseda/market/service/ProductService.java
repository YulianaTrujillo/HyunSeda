package co.com.hyunseda.market.service;


import co.com.hyunseda.market.access.IProductRepository;
import co.com.hyunseda.market.market.Category;
import co.com.hyunseda.market.market.Product;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

/**
 *
 * @author Libardo Pantoja, Julio Hurtado
 */
public class ProductService {

private Connection conn;
    private IProductRepository repository;
    /**
     * Constructor que inicia la base de datos
     * @author Libardo, Julio
     */
    public ProductService(IProductRepository repository) {
        this.repository = repository;
    }

    public boolean saveProduct(String name, String description, List<Category> catSelect) {
        //Un producto tiene que poder buscarse por una o varias categorias?
        //Hay que modificar la tabla de producto para añadir la categoria?
        //Es necesario hace un repositorio de categoria? No tiene sentido con lo explicado
        Product newProduct = new Product();//Es necesario aplicar la regla de inversion de dependencias?
        newProduct.setName(name);
        newProduct.setDescription(description);
        newProduct.setCategories(catSelect);
        
        //Validate product
        if (newProduct.getName().isEmpty() ) {
            return false;
        }
        return repository.save(newProduct);

    }

    public List<Product> findAllProducts() {
        List<Product> products = new ArrayList<>();
        products = repository.findAll();

        return products;
    }
    
    public Product findProductById(Long id){
        return repository.findById(id);
    }
    
    public List<Product> findProductByName(String name){
         List<Product> products = new ArrayList<>();
        products = repository.findByName(name);

        return products;
    }
    
    public boolean deleteProduct(Long id){
        return repository.delete(id);
    }

    public boolean editProduct(Long productId, Product prod) {
        
        //Validate product
        if (prod == null || prod.getName().isEmpty() ) {
            return false;
        }
        return repository.edit(productId, prod);
    }



}
