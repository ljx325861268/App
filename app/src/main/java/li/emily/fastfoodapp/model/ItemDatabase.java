package li.emily.fastfoodapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import li.emily.fastfoodapp.R;

public class ItemDatabase {
    private static final HashMap<Integer, Item> items = new HashMap<Integer,Item>();

    public static ArrayList<Item> getItems() {
        return new ArrayList<Item>((List) Arrays.asList(items.values().toArray()));
    }

    public static Item getItemByID(int id){
        return items.get(id);
    }

    static{
        items.put(1, new Item(1, R.drawable.burger, "Hamburger", 2.00, "abc"));
        items.put(2, new Item(2, R.drawable.burger, "Cheeseburger", 3.00, "abc"));
        items.put(3, new Item(3, R.drawable.burger, "Big Mac", 7.00, "abc"));
        items.put(4, new Item(4, R.drawable.burger, "Small Mac", 5.00, "abc"));
        items.put(5, new Item(5, R.drawable.burger, "Medium Mac", 6.00, "abc"));
        items.put(6, new Item(6, R.drawable.burger, "Small Fries", 3.00, "abc"));
        items.put(7, new Item(7, R.drawable.burger, "Medium Fries", 4.00, "abc"));
        items.put(8, new Item(8, R.drawable.burger, "Large Fries", 5.00, "abc"));
        items.put(9, new Item(9, R.drawable.burger, "Small Ice Cream", 2.00, "abc"));
        items.put(10, new Item(10, R.drawable.burger, "Large Ice Cream", 2.00, "abc"));
        items.put(11, new Item(11, R.drawable.burger, "Coffee", 2.00, "abc"));
        items.put(12, new Item(12, R.drawable.burger, "Small Soft Drink", 2.00, "abc"));
        items.put(13, new Item(13, R.drawable.burger, "Medium Soft Drink", 2.00, "abc"));
        items.put(14, new Item(14, R.drawable.burger, "Large Soft Drink", 2.00, "abc"));
        items.put(15, new Item(15, R.drawable.burger, "Water", 2.00, "abc"));
    }
}
