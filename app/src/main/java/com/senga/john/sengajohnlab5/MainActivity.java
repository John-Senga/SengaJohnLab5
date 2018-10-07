package com.senga.john.sengajohnlab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, backgroundService.class);
        startService(i);
    }

    public void changeActivity(View v){
        Intent i = null, chooser = null;

        if(v.getId() == R.id.btnAcvtivity2){
            i = new Intent(this, activity_2.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.625462, 121.001920"));
            chooser = Intent.createChooser(i, "Please select an application");
            startActivity(chooser);
        }
    }
}
