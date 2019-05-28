package com.briup.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EsBook implements Serializable {
    private Long id;

    private String name;

    private BigDecimal price;

    private String author;

    private String publisher;

    private Date pubdate;

    private String description;

    private Integer categoryId;

    private String images;

    private BigDecimal click;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public BigDecimal getClick() {
        return click;
    }

    public void setClick(BigDecimal click) {
        this.click = click;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", author=").append(author);
        sb.append(", publisher=").append(publisher);
        sb.append(", pubdate=").append(pubdate);
        sb.append(", description=").append(description);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", images=").append(images);
        sb.append(", click=").append(click);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}