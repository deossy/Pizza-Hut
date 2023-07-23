package com.dessy.pizzahut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Transaksi extends AppCompatActivity {

    Integer byr, price, kembalian;
    String terima, greeting, clock;
    EditText bayar, kembali;
    TextView thx, nama, ucapan, jam, order;
    Button transaksi;
    ImageView beranda, myorder, ph, account, inbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi);

        kembali = (EditText) findViewById(R.id.kembali);
        bayar = (EditText) findViewById(R.id.bayar);

        EditText menu = findViewById(R.id.menu);
        EditText harga = findViewById(R.id.harga);

        menu.setText(getIntent().getStringExtra("Data1"));
        harga.setText(getIntent().getStringExtra("Data2"));

        thx = (TextView) findViewById(R.id.thx);
        nama = (TextView) findViewById(R.id.nama);
        ucapan = (TextView) findViewById(R.id.ucapan);
        jam = (TextView) findViewById(R.id.jam);

        transaksi = (Button) findViewById(R.id.transaksi);
        transaksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byr = Integer.parseInt(bayar.getText().toString());
                price = Integer.parseInt(getIntent().getStringExtra("Data2"));
                kembalian = byr - price;
                kembali.setText(kembalian.toString());

                terima = "THANK YOU!";
                thx.setText(terima);

                nama.setText(getIntent().getStringExtra("name"));

                greeting = "Estimated time to meet Pizza Hut";
                ucapan.setText(greeting);

                clock = "06.00 PM";
                jam.setText(clock);
            }
        });
        beranda = findViewById(R.id.beranda);
        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Transaksi.this, Home.class);
                startActivity(intent);
            }
        });
        myorder = findViewById(R.id.myorder);
        myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Transaksi.this, MyOrder.class);
                startActivity(intent);
            }
        });
        ph = findViewById(R.id.ph);
        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Transaksi.this, Ph.class);
                startActivity(intent);
            }
        });
        inbox = findViewById(R.id.inbox);
        inbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Transaksi.this, Inbox.class);
                startActivity(intent);
            }
        });
        account = findViewById(R.id.account);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Transaksi.this, Account.class);
                startActivity(intent);
            }
        });
    }
}