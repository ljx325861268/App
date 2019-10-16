package li.emily.fastfoodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import li.emily.fastfoodapp.model.Item;
import li.emily.fastfoodapp.model.ItemDatabase;

public class AddToOrderActivity extends AppCompatActivity {

    public int currentQuantity = 1;

    ImageView image;
    TextView name;
    TextView description;
    TextView price;
    EditText quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_order);

        image = findViewById(R.id.id_ordering_image);
        name = findViewById(R.id.id_name);
        description = findViewById(R.id.id_description);
        price = findViewById(R.id.id_price);
        quantity = findViewById(R.id.id_quantity);


        Intent intent = getIntent();
        int id = intent.getIntExtra("ID",0);
        Item i = ItemDatabase.getItemByID(id);

        image.setImageResource(i.getImageID());
        name.setText(i.getName());
        description.setText(i.getDescription());
        price.setText(String.valueOf(i.getPrice()));
        quantity.setText(String.valueOf(currentQuantity));

    }

    public void onClickPlus(View v) {
        currentQuantity++;
        quantity.setText(String.valueOf(currentQuantity));
    }

    public void onClickMinus(View v){
        if(currentQuantity > 0) {
            currentQuantity--;
            quantity.setText(String.valueOf(currentQuantity));
        }
    }

    public void onClickAdd(View v){
        String priceString = price.getText().toString();
        double amount = currentQuantity * Double.valueOf(priceString);
        ItemDatabase.addToPrice(amount);
        System.out.println(ItemDatabase.getTotalPrice().toBigInteger());

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

}
