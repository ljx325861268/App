package li.emily.fastfoodapp.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import li.emily.fastfoodapp.R;
import li.emily.fastfoodapp.model.Item;

public class ItemViewHolder extends RecyclerView.ViewHolder{
    public TextView name;
    public ImageView imageView;


    public ItemViewHolder(View v){
        super(v);
        name = (TextView) v.findViewById(R.id.id_name);
        imageView = (ImageView) v.findViewById(R.id.id_imageView);
    }

    public void setItem(Context context, Item item){
        name.setText(item.getName());
        imageView.setImageResource(item.getImageID());
    }
}


