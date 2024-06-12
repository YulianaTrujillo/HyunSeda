package co.com.hyunseda.market.market;

import java.util.List;

/**
 *
 * @author Libardo Pantoja, Julio Hurtado
 */
public class Product {


    private Long productId;

    private String name;
    
    private String description;
    
    private String slug;
    
    private double price;
    
    private int stock;
    
    private List<String> keywords;
    
    private List<String> images;
    
    private String characteristics;
    
    private List<Category> categories;
    
    //private Location location;
    
    private User user;

    public Product(Long productId, String name, String description, String slug, double price, int stock, 
            List<String> keywords, List<String> images, String characteristics, List<Category> categories, User user) {
        
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.slug = slug;
        this.price = price;
        this.stock = stock;
        this.keywords = keywords;
        this.images = images;
        this.characteristics = characteristics;
        this.categories = categories;
    }

    

    public Product() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }*/

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
    
    

}
