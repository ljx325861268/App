package li.emily.fastfoodapp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import li.emily.fastfoodapp.R;

public class OrderDatabase {

    private static final HashMap<Item, Integer> items = new HashMap<Item, Integer>();

    public static ArrayList<Item> getItems() {
        return new ArrayList<Item>((List) Arrays.asList(items.keySet().toArray()));
    }

    public static BigDecimal getTotalPrice(){
        double total = 0.00;
        for(Item item : items.keySet()){
            total += item.getPrice() * items.get(item);
        }
        return new BigDecimal(total);
    }

    public static void addToOrder(Item item, int quantity){
        items.put(item, quantity);
    }

    public static int getQuantity(Item item){
        if(!items.containsKey(item)){
            return 0;
        }
        return items.get(item);
    }
}
