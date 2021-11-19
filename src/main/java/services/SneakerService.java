package services;
import models.Sneaker;
import java.util.ArrayList;
import java.util.List;

public class SneakerService {
    private static int nextId = 1;  // (1)
    private List<Sneaker> inventory = new ArrayList<>();  // (2)

    // (1)
    public Sneaker create(String name, String brand, String sport, int size, int quantity, float price) {
        // (2)
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);
        // (3)
        inventory.add(createdSneaker);
        // (4)
        return createdSneaker;
    }


}
