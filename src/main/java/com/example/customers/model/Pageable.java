package com.example.customers.model;

public class Pageable {

    private int itemsCount;
    private int pageNumber;

    public Pageable() {}

    public Pageable(int itemsCount, int pageNumber) {
        this.itemsCount = itemsCount;
        this.pageNumber = pageNumber;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
