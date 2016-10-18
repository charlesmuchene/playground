package utilities;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

/**
 * Class for commonly used functions and constants
 *
 * Created by Charlo on 8/31/2016.
 */
public class A {

    /**
     * Show a toast to user
     * @param context Application's context
     * @param message Message to log
     */
    public static void toast(@NonNull Context context, @NonNull String message) {

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

    } // toast

    /**
     * Log messages to the log cat with Error level
     * @param messages Messages to log
     */
    public void log(@NonNull String... messages) {

        StringBuilder builder = new StringBuilder(messages.length);

        for (String message : messages) builder.append(message).append(" ");

        Log.e("Playground", builder.toString());

    } // log

} // Class A
