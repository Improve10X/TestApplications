package com.example.testapplications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class WhatsAppRvAdapter extends RecyclerView.Adapter<WhatsAppRvHolder> {
    public WhatsappItem[] items;
    public WhatsAppRvAdapter(WhatsappItem[]whatsappItems){
        items = whatsappItems;
    }
    @NonNull
    @Override
    public WhatsAppRvHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.whatsappitem,parent,false);
        WhatsAppRvHolder viewHolder = new WhatsAppRvHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WhatsAppRvHolder holder, int position) {
        WhatsappItem item = items[position];
        holder.profileTxt.setText(item.heading1);
        holder.discTxt.setText(item.disc);
        holder.timeTxt.setText(item.timeAndDay);
        holder.unreadmsgTxt.setText(item.unReadMessage);
        Picasso.get().load(item.imageUrl1).into(holder.whatsapp1Iv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
