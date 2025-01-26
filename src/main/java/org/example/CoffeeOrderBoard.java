package org.example;

import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.List;
import static org.example.Main.logger;


@Slf4j
public class CoffeeOrderBoard {
    private List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void add(String clientName) {
        orders.add(new Order(orders.size() + 1, clientName));
    }

    public Order deliver(){
        try {
            logger.info("First order was delivered and deleted from waiting list");
            if (!orders.isEmpty()) {
                return orders.remove(0);
            } else {
                logger.warn("There are no orders to deliver");
                return null;
            }
        }
        catch(Exception e){
            logger.error("Error while delivering the order", e);
            return null;
        }
    }


    public void draw() {
        try {
            if (orders.isEmpty()) {
                logger.warn("There are no orders to display");
                return;
            }
            logger.info("Displaying current orders in the queue:");
            System.out.println("Num | Name");
            for (Order order : orders) {
                System.out.println(order.getId() + "   | " + order.getClientName());
            }
        }
        catch(Exception e){
                    logger.error("Error while drawing the board", e);
                }
            }
        }


