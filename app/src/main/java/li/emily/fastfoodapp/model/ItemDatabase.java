package li.emily.fastfoodapp.model;

import java.math.BigDecimal;
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
        items.put(1, new Item(1, R.drawable.doublecheeseburger, "Double Cheeseburger", 10.00, "Make room for our Double Cheeseburger, " +
                "two signature flame-grilled beef patties topped with a simple layer of melted American cheese, " +
                "crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun."));
        items.put(2, new Item(2, R.drawable.bkstacker, "BK Stacker", 14.50, "Make room for our Bacon Double Cheeseburger, " +
                "two signature flame-grilled beef patties topped with smoked bacon and a simple layer of melted American cheese, crinkle cut pickles, " +
                "yellow mustard, and ketchup on a toasted sesame seed bun."));
        items.put(3, new Item(3, R.drawable.chickncrisp, "Chick n Crisp", 8.00, "Our New Crispy Sandwich is made with 100% white meat chicken filet, " +
                "seasoned and breaded and carefully layered with fresh lettuce, " +
                "ripe tomato, and creamy mayonnaise on a potato bun."));
        items.put(4, new Item(4, R.drawable.chickennuggets, "4 Chicken Nuggets", 5.00, "Made with white meat, " +
                "our bite-sized Chicken Nuggets are tender and juicy on the inside and crispy on the outside. Coated in a homestyle seasoned breading, " +
                "they are perfect for dipping in any of our delicious dipping sauces."));
        items.put(5, new Item(5, R.drawable.chickenwrap, "Chicken Wrap", 3.00, "Introducing the Crispy Taco featuring a crispy, crunchy tortilla, " +
                "filled with delicious, seasoned beef, shredded cheddar cheese and lettuce, " +
                "all topped with just the right amount of our savory taco sauce."));
        items.put(6, new Item(6, R.drawable.sidesalad, "Side Salad", 5.00, "Our Garden Side Salad is a blend of premium lettuces garnished with juicy tomatoes," +
                " home-style croutons, a three-cheese medley, and your choice of KEN’S® salad dressing. " +
                "Nutrition Information does not reflect home-style croutons or KEN’S salad dressing."));
        items.put(7, new Item(7, R.drawable.frenchfries, "French Fries", 2.00, "More delicious than ever, " +
                "our signature piping hot, " +
                "thick cut Salted French Fries are golden on the outside and fluffy on the inside."));
        items.put(8, new Item(8, R.drawable.onionrings, "Onion Rings", 2.00, "Served hot and crispy," +
                " our golden Onion Rings are the perfect treat for plunging into one of our bold or classic sauces."));
        items.put(9, new Item(9, R.drawable.sandwich, "Sandwich", 4.00, "Our New Grilled Chicken Caesar Sandwich" +
                " is made with 100% white meat seasoned chicken filet carefully layered with fresh lettuce, ripe tomato, creamy Caesar sauce, " +
                "bacon, and shaved parmesan cheese all on a potato bun."));
        items.put(10, new Item(10, R.drawable.whopper, "Whopper", 11.00, "Our BBQ Bacon WHOPPER® Sandwich features a ¼ lb* of savory fire-grilled beef, " +
                "topped with thick-cut smoked bacon, melted American cheese, freshly cut iceberg lettuce, creamy mayo, ripe tomatoes, ketchup, onions, crunchy pickles, " +
                "and layers of a sweet and smoky bbq sauce, " +
                "all on a warm, toasted, sesame seed bun."));
        items.put(11, new Item(11, R.drawable.coffee, "Coffee", 2.00, "Our BK® Café Coffee blend is made with 100%" +
                " Arabica beans and freshly brewed to deliver perfectly balanced flavor in every cup."));
        items.put(12, new Item(12, R.drawable.cone, "Cone", 1.50, "We didn’t invent soft serve, " +
                "but with one taste of our cool, creamy, and velvety Vanilla Soft Serve, " +
                "you’ll think we perfected it. Your choice of classic cone or cup."));
        items.put(13, new Item(13, R.drawable.shake, "OREO Shakes", 2.00, "Cool down with our creamy hand spun OREO® Shake." +
                " Velvety Vanilla Soft Serve, " +
                "OREO® cookie pieces and vanilla sauce are blended to perfection and finished with a sweet whipped topping just for you."));
        items.put(14, new Item(14, R.drawable.softdrink, "Coca-Cola", 1.00, "Perfect with any meal," +
                " enjoy the genuine taste of Coca-Cola"));
        items.put(15, new Item(15, R.drawable.sundaes, "Sundaes", 2.00, "Cool and creamy with a chocolate fudge swirl, " +
                "our made-to-order HERSHEY'S Chocolate Fudge Sundae is complemented by our velvety Vanilla Soft Serve."));
    }
}
