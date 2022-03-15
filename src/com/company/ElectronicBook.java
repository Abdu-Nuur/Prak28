package com.company;

public class ElectronicBook implements BookType{
    private String fragment;
    private int pageSize;
    private String publishingHouse;
    private FileInfo electronicBook;

    public ElectronicBook(String fragment, int pageSize, String publishingHouse, FileInfo electronicBook) {
        this.fragment = fragment;
        this.pageSize = pageSize;
        this.publishingHouse = publishingHouse;
        this.electronicBook = electronicBook;
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

    public FileInfo getElectronicBook() {
        return electronicBook;
    }

    public void setElectronicBook(FileInfo electronicBook) {
        this.electronicBook = electronicBook;
    }

    @Override
    public String toString() {
        return "ElectronicBook{" +
                "fragment = " + fragment +
                "  pageSize = " + pageSize +
                "  publishingHouse = " + publishingHouse +
                "  ElectronicBookbook = " + electronicBook +
                ' ';
    }
}
