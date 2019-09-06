package com.ai.firezchat;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Build;

public class ProgDialog {

    public  ProgressDialog dialog;
    public void pdShow(Context context, String s) {
        dialog=new ProgressDialog(context);
        dialog.setIndeterminate(true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            dialog.setIndeterminateDrawable(context.getDrawable(R.mipmap.logochat));
        }
        dialog.setMessage(s);

        dialog.show();
    }
    public void pdDismiss()
    {
        dialog.dismiss();
    }



}

