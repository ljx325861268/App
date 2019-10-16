package li.emily.fastfoodapp.view;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import li.emily.fastfoodapp.R;
import li.emily.fastfoodapp.model.Item;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {


    private ArrayList<Item> items;
    private OnNoteListener mOnNoteListener;

    public ItemAdapter(OnNoteListener onNoteListener, ArrayList<Item> items){
        this.mOnNoteListener = onNoteListener;
        this.items = items;
    }


    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ItemViewHolder(v, mOnNoteListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item i = items.get(position);
        holder.name.setText(i.getName());
        holder.imageView.setImageResource(i.getImageID());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView name;
        public ImageView imageView;
        public OnNoteListener onNoteListener;

        public ItemViewHolder(View v, OnNoteListener onNoteListener){
            super(v);
            this.name = (TextView) v.findViewById(R.id.id_name);
            this.imageView = (ImageView) v.findViewById(R.id.id_imageView);
            this.onNoteListener = onNoteListener;
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onNoteListener.onNoteClick(getAdapterPosition());
        }
    }

    public interface OnNoteListener {
        void onNoteClick(int position);
    }
}
