package ke.co.senseidevs.playground.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import ke.co.senseidevs.playground.R;
import ke.co.senseidevs.playground.utils.AService;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        findViewById(R.id.start_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(HomeActivity.this, AService.class));
            }
        });

        findViewById(R.id.stop_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(HomeActivity.this, AService.class));
            }
        });

    }

}
