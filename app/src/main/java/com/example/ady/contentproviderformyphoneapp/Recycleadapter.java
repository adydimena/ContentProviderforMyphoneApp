package com.example.ady.contentproviderformyphoneapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ady on 11/27/2017.
 */
public class Recycleadapter extends RecyclerView.Adapter<Recycleadapter.ViewHolder> {
    List<MyContacts> myContacts = new ArrayList<>();
    //private final View.OnClickListener mOnClickListener = new MyOnClickListener();
    public Recycleadapter(List<MyContacts> contacts) {
        this.myContacts = contacts;

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_view_layout,null);
       // view.setOnClickListener();
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (myContacts.get(position) != null);
        holder.tvname.setText("Name: " + myContacts.get(position).getName() + "\n"
                + "Number: " + myContacts.get(position).getNumber() + "\n"
                + "Email: " + myContacts.get(position).getEmail() + "\n"
                + "Address: " + myContacts.get(position).getAddress() + "\n"
                + "Sport: " + myContacts.get(position).getSport() + "\n"
        );
       // holder.bind(myContacts.get(position), listener);
    }
    @Override
    public int getItemCount() {
        return myContacts.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvname;
        public ViewHolder(View itemView) {
            super(itemView);
            tvname = itemView.findViewById(R.id.name);
        }

    }


}