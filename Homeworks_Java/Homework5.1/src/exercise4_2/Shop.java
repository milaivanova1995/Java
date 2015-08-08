package exercise4_2;

import exercise3.Stock;

public class Shop {
	
	 private String name;
     private String location;
     private Stock[] stock;
    
     public Shop() {}
    
     public Shop(String name, String location, Stock[] stock) {
    	 
             setName(name);
             setLocation(location);
             setStock(stock);
     }
    
     public String getName() {
             return name;
     }
    
     public void setName(String name) {
             this.name = name;
     }
    
     public String getLocation() {
             return location;
     }
    
     public void setLocation(String location) {
             this.location = location;
     }
    
     public Stock[] getStock() {
             return stock;
     }
    
     public void setStock(Stock[] stock) {
             this.stock = stock;
     }
     
     
     public void addProduct(Stock product) {
    	 
             product.setAvailable(true);
             System.out.println("The product was added.");
     }
    
     public void removeProduct(Stock product) {
    	 
             product.setAvailable(false);
             System.out.println("The product is unavailable.");
     }

     
    
}

//Недовършена
