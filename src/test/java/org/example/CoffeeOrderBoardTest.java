package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeOrderBoardTest {

    private static final Logger logger = LoggerFactory.getLogger(CoffeeOrderBoardTest.class);
    private CoffeeOrderBoard board;

    @BeforeEach
    void addingClient() { // Переименовал для ясности
        board = new CoffeeOrderBoard(); // Инициализация объекта
        board.add("Mike");
        board.add("Alex");
        board.add("Alice");
        logger.info("Initialized CoffeeOrderBoard with clients before each test: {}", board.getOrders());
    }

    @Test
    void addTest() {
        logger.info("Test for adding a client (addTest). Before adding a new client: {}", board.getOrders());
        board.add("Mr.Check");
        logger.info("Test for adding a client (addTest). After adding Mr.Check: {}", board.getOrders());
        assertEquals(4, board.getOrders().size(), "The value of orders should be 4 after adding a new one.");

    }

    @Test
    void deliverTest() {
        logger.info("Test for delivering to a client (deliverTest). Before delivering: {}", board.getOrders());
        board.deliver();
        logger.info("Test for delivering to a client (deliverTest). After delivering: {}", board.getOrders());
        assertEquals(2, board.getOrders().size(), "The number of orders should be 2 after delivering one.");
        assertEquals("Alex", board.getOrders().get(0).getClientName(), "The first in the queue must be Alex.");
    }

    @Test
    void drawTest() {
        logger.info("Test for output information about order's queue (drawTest). Before drawing: {}", board.getOrders());
        board.draw();
        logger.info("\"Test for output information about order's queue (drawTest). After drawing: {}", board.getOrders());
        assertEquals("Mike", board.getOrders().get(0).getClientName(), "First order should be Mike.");
        assertEquals("Alex", board.getOrders().get(1).getClientName(), "Second order should be Alex.");
        assertEquals("Alice", board.getOrders().get(2).getClientName(), "Third order should be Alice.");
    }
}
