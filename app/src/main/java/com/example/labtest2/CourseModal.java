package com.example.labtest2;

public class CourseModal {

    private String productName;
    private String productDuration;
    private String productTracks;
    private String productDescription;
    private int id;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String courseName) {
        this.productName = courseName;
    }

    public String getProductDuration() {
        return productDuration;
    }

    public void setProductDuration(String courseDuration) {
        this.productDuration = courseDuration;
    }

    public String getProductTracks() {
        return productTracks;
    }

    public void setProductTracks(String courseTracks) {
        this.productTracks = courseTracks;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CourseModal(String productName, String productDuration, String productTracks, String productDescription) {
        this.productName = productName;
        this.productDuration = productDuration;
        this.productTracks = productTracks;
        this.productDescription = productDescription;
    }
}
