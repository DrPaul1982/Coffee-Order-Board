package org.example;


public class Order {

    private int id;

    private String clientName;

    public Order(int id, String clientName) {
        this.id = id;
        this.clientName = clientName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return
                id + " | " + clientName;
    }
}