package com.hjw.githublibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by centling on 2018/3/12.
 */

public class Utils {
    public static void showToast(Context context) {
        Toast.makeText(context, "hello world", Toast.LENGTH_SHORT).show();
    }
}
