package li.emily.fastfoodapp.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import li.emily.fastfoodapp.R;
import li.emily.fastfoodapp.model.Item;
import li.emily.fastfoodapp.model.OrderDatabase;

public class ViewOrderAdapter extends RecyclerView.Adapter<ViewOrderAdapter.ItemViewHolder> {


    private ArrayList<Item> items;

    public ViewOrderAdapter(ArrayList<Item> items){
        this.items = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_order_layout,parent,false);
        return new ItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item i = items.get(position);
        holder.name.setText(i.getName());
        holder.imageView.setImageResource(i.getImageID());
        holder.quantity.setText(String.valueOf(OrderDatabase.getQuantity(i)));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        public TextView name;
        public ImageView imageView;
        public TextView quantity;

        public ItemViewHolder(View v){
            super(v);
            this.name = (TextView) v.findViewById(R.id.id_name_order);
            this.imageView = (ImageView) v.findViewById(R.id.id_imageView_order);
            this.quantity = (TextView) v.findViewById(R.id.id_view_order_quantity);
        }
    }

}
