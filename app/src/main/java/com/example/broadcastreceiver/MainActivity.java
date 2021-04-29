package com.example.broadcastreceiver;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Escuchador objetoEscuchador ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        Escuchador objetoEscuchador = new Escuchador();
        IntentFilter filtro = new IntentFilter();
        filtro.addAction("marvel.intent.action.external.omcexc");
        this.registerReceiver(objetoEscuchador, filtro);
*/
        objetoEscuchador = new Escuchador();
        IntentFilter filtro = new IntentFilter();
        filtro.addAction("marvel.intent.action.external.omcexc");
        this.registerReceiver(objetoEscuchador, filtro);

        Intent mintent = new Intent();
        mintent.setAction("marvel.intent.action.external.omcexc");
       /* mintent.putExtra("names", "GetBodyTemp");
        mintent.putExtra("names", "GetAllTemp");
        mintent.putExtra("names", "GetAbnormalTemp");*/

        mintent.putExtra("HideFaceWeb", "no");

        this.sendBroadcast(mintent);

    }


    @Override
    protected void onPause () {
        unregisterReceiver(objetoEscuchador);
        super.onPause();
    }


}