package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Application is starting");

        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("John Doe");
        board.add("Jane Doe");
        board.add("Alice");
        board.add("Bob");
        board.add("Charlie");
        board.draw();

        System.out.println("\nOrder delivered to: " + board.deliver());

        board.draw();
    }
}
