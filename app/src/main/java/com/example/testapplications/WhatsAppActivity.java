package com.example.testapplications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class WhatsAppActivity extends AppCompatActivity {
    RecyclerView whatsappRv;
    public WhatsappItem[] whatsappItems;

    public WhatsAppRvAdapter whatsAppRvAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app);
        initViews();
        whatsAppData();
        connectAdapter();
        setupAdapter();
    }

    private void setupAdapter() {
        whatsappRv.setLayoutManager(new LinearLayoutManager(this));
        whatsappRv.setAdapter(whatsAppRvAdapter);
    }

    private void connectAdapter() {
        whatsAppRvAdapter = new WhatsAppRvAdapter(whatsappItems);
    }

    private void whatsAppData() {
        whatsappItems = new WhatsappItem[9];
        WhatsappItem item1 = new WhatsappItem();
        item1.imageUrl1="https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item1.heading1="Whitmans Chat";
        item1.disc="ned:Yeah,I think I know what..";
        item1.timeAndDay="2:00pm";
        item1.unReadMessage ="hii";
        whatsappItems[0]=item1;


        WhatsappItem item2 = new WhatsappItem();
        item2.imageUrl1="https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item2.heading1="Shiva Improve10x";
        item2.disc="Ned: Yeah,I think I know what....";
        item2.timeAndDay="11:45 AM";
        item2.unReadMessage ="3";
        whatsappItems[1]=item2;


        WhatsappItem item3 = new WhatsappItem();
        item3.imageUrl1="https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item3.heading1="Charan";
        item3.disc="thanks you";
        item3.timeAndDay="1:00Am";
        item3.unReadMessage ="1";
        whatsappItems[2]=item3;


        WhatsappItem item4 = new WhatsappItem();
        item4.imageUrl1="https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item4.heading1="SHiva kumar guddeti";
        item4.disc="hey whats app";
        item4.timeAndDay="12:45Pm";
        item4.unReadMessage ="4";
        whatsappItems[3]=item4;


        WhatsappItem item5 = new WhatsappItem();
        item5.imageUrl1="https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item5.heading1="SAi sri ";
        item5.disc="how are you dude";
        item5.timeAndDay="11:45Am";
        item5.unReadMessage ="3";
        whatsappItems[4]=item5;


        WhatsappItem item6 = new WhatsappItem();
        item6.imageUrl1="https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item6.heading1="Manhoar";
        item6.disc="where are you man";
        item6.timeAndDay="Yesterday";
        item6.unReadMessage ="4";
        whatsappItems[5]=item6;


        WhatsappItem item7 = new WhatsappItem();
        item7.imageUrl1="https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item7.heading1="jack";
        item7.disc="where are you man";
        item7.timeAndDay="Yesterday";
        item7.unReadMessage ="4";
        whatsappItems[6]=item7;

        WhatsappItem item8 = new WhatsappItem();
        item8.imageUrl1="https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item8.heading1="jack";
        item8.disc="where are you man";
        item8.timeAndDay="Yesterday";
        item8.unReadMessage ="4";
        whatsappItems[7]=item8;

        WhatsappItem item9 = new WhatsappItem();
        item9.imageUrl1="https://cdn-icons-png.flaticon.com/256/4825/4825112.png";
        item9.heading1="jack";
        item9.disc="where are you man";
        item9.timeAndDay="Yesterday";
        item9.unReadMessage ="4";
        whatsappItems[8]=item9;
    }

    private void initViews() {
        whatsappRv = findViewById(R.id.whatsapp_rv);
    }
}