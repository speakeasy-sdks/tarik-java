/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package tarik.LK.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Item - Represents info about each position in order
 */
public class Item {
    /**
     * Item name
     */
    @JsonProperty("name")
    public String name;

    public Item withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * This field could be decimal string
     */
    @JsonProperty("price")
    public Double price;

    public Item withPrice(Double price) {
        this.price = price;
        return this;
    }
    
    /**
     * This field could be numeric string
     */
    @JsonProperty("quantity")
    public Long quantity;

    public Item withQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    /**
     * This field could be numeric string
     */
    @JsonProperty("sku")
    public Long sku;

    public Item withSku(Long sku) {
        this.sku = sku;
        return this;
    }
    
    public Item(@JsonProperty("name") String name, @JsonProperty("price") Double price, @JsonProperty("quantity") Long quantity, @JsonProperty("sku") Long sku) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.sku = sku;
  }
}
