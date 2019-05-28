package com.briup.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class EsShopcaritem implements Serializable {
    private Long id;

    private Integer num;

    private BigDecimal cost;

    private BigDecimal bookId;

    private BigDecimal shopcarId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getBookId() {
        return bookId;
    }

    public void setBookId(BigDecimal bookId) {
        this.bookId = bookId;
    }

    public BigDecimal getShopcarId() {
        return shopcarId;
    }

    public void setShopcarId(BigDecimal shopcarId) {
        this.shopcarId = shopcarId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", num=").append(num);
        sb.append(", cost=").append(cost);
        sb.append(", bookId=").append(bookId);
        sb.append(", shopcarId=").append(shopcarId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}