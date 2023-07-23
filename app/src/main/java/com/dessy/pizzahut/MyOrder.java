package com.dessy.pizzahut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyOrder extends AppCompatActivity {

    String nama;
    ImageView udang, tempe, donat, beranda, order, ph, inbox, account;
    TextView pizzaudang, pizzatempe, pizzadonat;
    Integer harga1, harga2, harga3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        nama = getIntent().getStringExtra("username");

        pizzaudang = (TextView) findViewById(R.id.pizzaudang);
        pizzatempe = (TextView) findViewById(R.id.pizzatempe);
        pizzadonat = (TextView) findViewById(R.id.pizzadonat);

        harga1     = 50000;
        harga2     = 45000;
        harga3     = 54000;

        udang = (ImageView) findViewById(R.id.udang);
        udang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendData1 = new Intent(MyOrder.this, Transaksi.class);
                Intent sendData2 = new Intent(MyOrder.this, Transaksi.class);
                sendData1.putExtra("Data1", pizzaudang.getText().toString());
                sendData1.putExtra("Data2", harga1.toString());
                sendData1.putExtra("name", nama);
                startActivity(sendData1);
                finish();
            }
        });

        tempe = (ImageView) findViewById(R.id.tempe);
        tempe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendData1 = new Intent(MyOrder.this, Transaksi.class);
                Intent sendData2 = new Intent(MyOrder.this, Transaksi.class);
                sendData1.putExtra("Data1",pizzatempe.getText().toString());
                sendData1.putExtra("Data2", harga2.toString());
                sendData1.putExtra("name", nama);
                startActivity(sendData1);
                finish();
            }
        });

        donat = (ImageView) findViewById(R.id.donat);
        donat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent sendData1 =new Intent(MyOrder.this, Transaksi.class);
                Intent sendData2 = new Intent(MyOrder.this, Transaksi.class);
                sendData1.putExtra("Data1",pizzadonat.getText().toString());
                sendData1.putExtra("Data2", harga3.toString());
                sendData1.putExtra("name", nama);
                startActivity(sendData1);
                finish();
            }
        });

        beranda = findViewById(R.id.beranda);
        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyOrder.this, Home.class);
                startActivity(intent);
            }
        });
        order = findViewById(R.id.order);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyOrder.this, MyOrder.class);
                startActivity(intent);
            }
        });
        ph = findViewById(R.id.ph);
        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyOrder.this, Ph.class);
                startActivity(intent);
            }
        });
        inbox = findViewById(R.id.inbox);
        inbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyOrder.this, Inbox.class);
                startActivity(intent);
            }
        });
        account = findViewById(R.id.account);
        inbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyOrder.this, Account.class);
                startActivity(intent);
            }
        });



        }
    }