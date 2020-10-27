package com.example.broadcastreceiversdemois1313;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
       // throw new UnsupportedOperationException("Not yet implemented");

        AlertDialog.Builder builder=new AlertDialog.Builder(context);
        builder.setMessage("Hello");
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}
