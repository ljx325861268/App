package li.emily.fastfoodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import li.emily.fastfoodapp.model.Item;
import li.emily.fastfoodapp.model.ItemDatabase;
import li.emily.fastfoodapp.view.ItemAdapter;

public class MainActivity extends AppCompatActivity implements ItemAdapter.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv_main);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Item> items = ItemDatabase.getItems();
        ItemAdapter itemAdapter = new ItemAdapter(this, items);
        recyclerView.setAdapter(itemAdapter);
    }


}
