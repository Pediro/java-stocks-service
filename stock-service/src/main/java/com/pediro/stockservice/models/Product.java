package com.pediro.stockservice.models;

import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "products")
public class Product {

    private String name;
    private Set<String> tags;
    private String coverImage;    
    private String thumbnailImage;    
    private String description;    
    private Integer difficult;   
    private Integer price;

    @DynamoDBHashKey(attributeName = "name")    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @DynamoDBAttribute(attributeName = "tags")
    public Set<String> getTags() { return this.tags; }
    public void setTags(Set<String> tags) { this.tags = tags; }

    @DynamoDBAttribute(attributeName = "coverImage")
    public String getCoverImage() { return this.coverImage; }
    public void setCoverImage(String coverImage) { this.coverImage = coverImage; }

    @DynamoDBAttribute(attributeName = "thumbnailImage")
    public String getThumbnailImage() { return this.thumbnailImage; }
    public void setThumbnailImage(String thumbnailImage) { this.thumbnailImage = thumbnailImage; }

    @DynamoDBAttribute(attributeName = "description")
    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    @DynamoDBAttribute(attributeName = "difficult")
    public Integer getDifficult() { return this.difficult; }
    public void setDifficult(Integer difficult) { this.difficult = difficult; }

    @DynamoDBAttribute(attributeName = "price")
    public Integer getPrice() { return this.price; }
    public void setPrice(Integer price) { this.price = price; }
}
