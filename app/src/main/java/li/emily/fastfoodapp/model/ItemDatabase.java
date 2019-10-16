package li.emily.fastfoodapp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import li.emily.fastfoodapp.R;

public class ItemDatabase {
    private static BigDecimal totalPrice = new BigDecimal(0);

    private static final HashMap<Integer, Item> items = new HashMap<Integer,Item>();

    public static ArrayList<Item> getItems() {
        return new ArrayList<Item>((List) Arrays.asList(items.values().toArray()));
    }

    public static Item getItemByID(int id){
        return items.get(id);
    }

    public static void addToPrice(double price){
        totalPrice = totalPrice.add(BigDecimal.valueOf(price));
    }

    public static BigDecimal getTotalPrice(){
        return totalPrice;
    }

    static{
        items.put(1, new Item(1, R.drawable.doublecheeseburger, "Double Cheeseburger", 5.49, "abc"));
        items.put(2, new Item(2, R.drawable.bkstacker, "BK Stacker", 4.49, "abc"));
        items.put(3, new Item(3, R.drawable.chickncrisp, "Chick n Crisp", 3.39, "abc"));
        items.put(4, new Item(4, R.drawable.chickennuggets, "4 Chicken Nuggets", 2.99, "abc"));
        items.put(5, new Item(5, R.drawable.chickenwrap, "Chicken Wrap", 1.59, "abc"));
        items.put(6, new Item(6, R.drawable.sidesalad, "Side Salad", 1.49, "abc"));
        items.put(7, new Item(7, R.drawable.frenchfries, "French Fries", 1.29, "abc"));
        items.put(8, new Item(8, R.drawable.onionrings, "Onion Rings", 1.29, "abc"));
        items.put(9, new Item(9, R.drawable.sandwich, "Sandwich", 3.79, "abc"));
        items.put(10, new Item(10, R.drawable.whopper, "Whopper", 3.79, "abc"));
        items.put(11, new Item(11, R.drawable.coffee, "Coffee", 2.00, "abc"));
        items.put(12, new Item(12, R.drawable.cone, "Cone", 1.59, "abc"));
        items.put(13, new Item(13, R.drawable.shake, "Shakes", 1.89, "abc"));
        items.put(14, new Item(14, R.drawable.softdrink, "Soft Drink", 1.19, "abc"));
        items.put(15, new Item(15, R.drawable.sundaes, "Sundaes", 2.99, "abc"));
    }
}
