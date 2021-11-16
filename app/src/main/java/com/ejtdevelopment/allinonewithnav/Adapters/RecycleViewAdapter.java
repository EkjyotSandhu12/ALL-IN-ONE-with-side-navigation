package com.ejtdevelopment.allinonewithnav.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ejtdevelopment.allinonewithnav.ModelClass.RecycleViewModel;
import com.ejtdevelopment.allinonewithnav.R;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>{

    ArrayList<RecycleViewModel> list;
    Context context;

    public RecycleViewAdapter(ArrayList<RecycleViewModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { // inflate the layout to make use of it

        View view = LayoutInflater.from(context).inflate(R.layout.recycle_view_sample,parent,false);

        return new ViewHolder(view); // returns the inflated layout with views postioned using view holder class
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) { // setup the internal data

        RecycleViewModel rvm = list.get(position);

        holder.picture.setImageResource(rvm.getImage());
        holder.name.setText(rvm.getName());
        holder.occupation.setText(rvm.getOccupation());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{  // set up the positions of the views in layout

        ImageView picture;
        TextView name,occupation;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            picture = itemView.findViewById(R.id.RecycleImageView);
            name = itemView.findViewById(R.id.RecycleName);
            occupation = itemView.findViewById(R.id.RecycleOccupation);
        }
    }

}
