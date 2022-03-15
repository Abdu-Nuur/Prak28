package com.company;

public class ElectronicBook implements BookType{
    private String fragment;
    private int pageSize;
    private String publishingHouse;
    private String ElectronicBookbook;

    public ElectronicBook(String fragment, int pageSize, String publishingHouse, String electronicBookbook) {
        this.fragment = fragment;
        this.pageSize = pageSize;
        this.publishingHouse = publishingHouse;
        ElectronicBookbook = electronicBookbook;
    }

    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getElectronicBookbook() {
        return ElectronicBookbook;
    }

    public void setElectronicBookbook(String electronicBookbook) {
        ElectronicBookbook = electronicBookbook;
    }

    @Override
    public String toString() {
        return "ElectronicBook{" +
                "fragment = " + fragment +
                "  pageSize = " + pageSize +
                "  publishingHouse = " + publishingHouse +
                "  ElectronicBookbook = " + ElectronicBookbook +
                ' ';
    }
}
