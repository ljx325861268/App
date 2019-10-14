package li.emily.fastfoodapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ItemDatabase {
    private static final HashMap<Integer, Item> items = new HashMap<Integer,Item>();

    public static ArrayList<Item> getItems() {
        return new ArrayList<Item>((List) Arrays.asList(items.values().toArray()));
    }

    public static Item getItemByID(int id){
        return items.get(id);
    }

    static{
        items.put(1, new Item(1, 1234, "Hamburger", 2.00, "abc"));
        items.put(2, new Item(2, 1234, "Cheeseburger", 3.00, "abc"));
        items.put(3, new Item(3, 1234, "Big Mac", 7.00, "abc"));
        items.put(4, new Item(4, 1234, "Small Mac", 5.00, "abc"));
        items.put(5, new Item(5, 1234, "Medium Mac", 6.00, "abc"));
        items.put(6, new Item(6, 1234, "Small Fries", 3.00, "abc"));
        items.put(7, new Item(7, 1234, "Medium Fries", 4.00, "abc"));
        items.put(8, new Item(8, 1234, "Large Fries", 5.00, "abc"));
        items.put(9, new Item(9, 1234, "Small Ice Cream", 2.00, "abc"));
        items.put(10, new Item(10, 1234, "Large Ice Cream", 2.00, "abc"));
        items.put(11, new Item(11, 1234, "Coffee", 2.00, "abc"));
        items.put(12, new Item(12, 1234, "Small Soft Drink", 2.00, "abc"));
        items.put(13, new Item(13, 1234, "Medium Soft Drink", 2.00, "abc"));
        items.put(14, new Item(14, 1234, "Large Soft Drink", 2.00, "abc"));
        items.put(15, new Item(15, 1234, "Water", 2.00, "abc"));
    }
}
