package com.company;

public class Client {
    private String clientName;
    private String clientEmail;
    private String likedBooks;
    private String satypAlyngynganKitepteri;

    public Client(String clientName, String clientEmail, String likedBooks, String satypAlyngynganKitepteri) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.likedBooks = likedBooks;
        this.satypAlyngynganKitepteri = satypAlyngynganKitepteri;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getLikedBooks() {
        return likedBooks;
    }

    public void setLikedBooks(String likedBooks) {
        this.likedBooks = likedBooks;
    }

    public String getSatypAlyngynganKitepteri() {
        return satypAlyngynganKitepteri;
    }

    public void setSatypAlyngynganKitepteri(String satypAlyngynganKitepteri) {
        this.satypAlyngynganKitepteri = satypAlyngynganKitepteri;
    }

    @Override
    public String toString() {
        return "Client " +
                "clientName = " + clientName +
                "  clientEmail = " + clientEmail +
                " likedBooks = " + likedBooks +
                "  satypAlyngynganKitepteri = " + satypAlyngynganKitepteri +
                ' ';
    }
}
