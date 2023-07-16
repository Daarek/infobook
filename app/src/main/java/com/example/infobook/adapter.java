package com.example.infobook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.holder>{
    private final LayoutInflater inflater;
    private final List<Object> objects;
    public adapter(Context context,List<Object> objects){
        this.inflater = LayoutInflater.from(context);
        this.objects = objects;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        Object object = objects.get(position);
        holder.name.setText(object.getName());
        holder.order.setText(object.getOrder());
        holder.description.setText(object.getDescription());
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

    public static class holder extends RecyclerView.ViewHolder {

        final TextView order;
        final TextView name;
        final TextView description;

        holder(View view){
            super(view);
            order = view.findViewById(R.id.order);
            name = view.findViewById(R.id.name);
            description = view.findViewById(R.id.description);
        }
    }


}
