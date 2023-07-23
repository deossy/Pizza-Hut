package com.dessy.pizzahut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {
    ImageView beranda, order, ph, inbox, account, scan, delivery, takeaway, dinein, quick, point, voucher, menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        delivery = findViewById(R.id.delivery);
        delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Delivery.class);
                startActivity(intent);
            }
        });
        takeaway = findViewById(R.id.takeaway);
        takeaway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, TakeAway.class);
                startActivity(intent);
            }
        });

        dinein = findViewById(R.id.dinein);
        dinein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Dinein.class);
                startActivity(intent);
            }
        });

        quick = findViewById(R.id.quick);
        quick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Quick.class);
                startActivity(intent);
            }
        });

        point = findViewById(R.id.point);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Point.class);
                startActivity(intent);
            }
        });

        voucher = findViewById(R.id.voucher);
        voucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Voucher.class);
                startActivity(intent);
            }
        });

        menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Menu.class);
                startActivity(intent);
            }
        });

        beranda = findViewById(R.id.beranda);
        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Home.class);
                startActivity(intent);
            }
        });
        order = findViewById(R.id.order);
        order.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Home.this, MyOrder.class);
                 startActivity(intent);
             }
        });
        ph = findViewById(R.id.ph);
        ph.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                Intent intent = new Intent(Home.this, Ph.class);
                startActivity(intent);
             }
        });
        inbox = findViewById(R.id.inbox);
        inbox.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                   Intent intent = new Intent(Home.this, Inbox.class);
                   startActivity(intent);
              }
        });
        account = findViewById(R.id.account);
        account.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(Home.this, Account.class);
                  startActivity(intent);
              }
        });
        scan = findViewById(R.id.scan);
        scan.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Home.this, Scan.class);
                 startActivity(intent);

             }
        });
    }
}