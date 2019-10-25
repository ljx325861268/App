package li.emily.fastfoodapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import li.emily.fastfoodapp.model.Item;
import li.emily.fastfoodapp.model.ItemDatabase;
import li.emily.fastfoodapp.model.OrderDatabase;
import li.emily.fastfoodapp.view.ItemAdapter;
import li.emily.fastfoodapp.view.ViewOrderAdapter;

public class OrderList extends AppCompatActivity{

    TextView totalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_list);

        RecyclerView recyclerView = findViewById(R.id.id_rv_order_list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Item> items = OrderDatabase.getItems();
        ViewOrderAdapter itemAdapter = new ViewOrderAdapter(items);
        recyclerView.setAdapter(itemAdapter);

        totalAmount = findViewById(R.id.id_totalAmount);
        String total = String.format("%.2f", OrderDatabase.getTotalPrice().doubleValue());
        totalAmount.setText(total);
    }


}
