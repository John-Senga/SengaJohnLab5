package com.senga.john.sengajohnlab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent i = new Intent(this, backgroundService.class);
        startService(i);
    }

    public void changeActivity(View v){
        Intent i = null, chooser = null;

        if(v.getId() == R.id.btnAcvtivityMain){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.615221, 120.988762"));
            chooser = Intent.createChooser(i, "Please select an application");
            startActivity(chooser);
        }
    }
}
