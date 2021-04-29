package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.core.app.NotificationCompat;

public class Escuchador extends BroadcastReceiver {
 TextView msajePantalla;
    String datas1;
    @Override
    public void onReceive(Context context, Intent intent) {
        String identificador = intent.getStringExtra("names").toString();
        String action = intent.getAction();
        boolean resultado = action.toString().equals("marvel.intent.action.external.execute");
      /*  if(resultado) {
            Bundle bundle = intent.getExtras();
            Object objn1=bundle.get("names");
            Object objd1=bundle.get("datas");
            if(objn1!=null && objd1!=null) {
                String names1=objn1.toString();
                 datas1=objd1.toString();
                if(names1.equals("GetBodyTemp")) {
                    System.out.println("GetBodyTemp:"+datas1);
                    msajePantalla.setText(datas1);
                    asignoValor(resultado);
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
                    builder
                            .setContentTitle("Title")
                            .setContentText(datas1)
                            .setSmallIcon(R.mipmap.ic_launcher)
                            .setVisibility(NotificationCompat.VISIBILITY_PUBLIC);
                }
            }
        }*/
    }
    private void asignoValor(boolean isAvion){
        if(isAvion){
            msajePantalla.setText(datas1);
            msajePantalla.setTextSize(25);
        }else {
            msajePantalla.setText("No cambio");


}}}