/*
package com.example.whatsapp.Adapter;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp.R;
import com.example.whatsapp.model.Item;

import java.util.List;

class MyViewholderWithoutChild extends RecyclerView.ViewHolder{
public TextView textView;
    int i;
    public MyViewholderWithoutChild(@NonNull View itemView) {
        super(itemView);
        textView =(TextView)itemView.findViewById(R.id.textview);
    }
}

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Item>items;
    Context context;
    SparseBooleanArray expandState = new SparseBooleanArray();
    public MyAdapter (List<Item>items){
        this.items =items;
        for (int i =0;i<items.size();i++);

       // expandState.append(i,false);
    }

    @Override
    public int getItemViewType(int position) {

        if (items.get(position).)
            return 1;
        else
            return 0;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //return null;
        this.context =parent.getContext();
        if (viewType==0){
            LayoutInflater inflater = LayoutInflater.from(context);
            View view = inflater.inflate(R.layout.childview,parent,false);
            return new MyViewholderWithoutChild(view);

        }
        else {
            LayoutInflater inflater = LayoutInflater.from(context);
            View view = inflater.inflate(R.layout.childview,parent,false);
            return new MyViewholderWithoutChild(view);

        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
*/
