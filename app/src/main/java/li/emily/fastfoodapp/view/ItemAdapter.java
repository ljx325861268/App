package li.emily.fastfoodapp.view;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import li.emily.fastfoodapp.R;
import li.emily.fastfoodapp.model.Item;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private Context context;
    private ArrayList<Item> items;

    public ItemAdapter(Context context, ArrayList<Item> items){
        this.context = context;
        this.items = items;
    }


    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.setItem(context, items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
