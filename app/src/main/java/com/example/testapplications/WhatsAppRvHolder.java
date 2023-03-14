package com.example.testapplications;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WhatsAppRvHolder extends RecyclerView.ViewHolder {
    public ImageView whatsapp1Iv;
    public TextView profileTxt;
    public TextView discTxt;
    public TextView timeTxt;
    public TextView unreadmsgTxt;


    public WhatsAppRvHolder(@NonNull View itemView) {
        super(itemView);
        whatsapp1Iv = itemView.findViewById(R.id.whatsapp1_iv);
        profileTxt = itemView.findViewById(R.id.profile_txt);
        discTxt = itemView.findViewById(R.id.disc_txt);
        timeTxt = itemView.findViewById(R.id.time_txt);
        unreadmsgTxt = itemView.findViewById(R.id.unreadmsg_txt);
    }
}
