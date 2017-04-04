package ke.co.senseidevs.playground.utils;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.util.Timer;

public class AService extends Service {

    private Timer timer;

    public AService() {
        timer = new Timer("senseidev");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("Another", "STarting this");
        logger();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        timer.cancel();
        Log.e("Another", "The service is destroyed");
        super.onDestroy();
    }

    private void logger() {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.e("Service", "Logging from service");
    }

}
