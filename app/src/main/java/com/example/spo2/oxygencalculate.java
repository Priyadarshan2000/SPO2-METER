package com.example.spo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class oxygencalculate extends AppCompatActivity {

    private String Date;
    DateFormat df =new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    Date today = Calendar.getInstance().getTime();
    int o2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oxygencalculate);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Date = df.format(today);
        TextView Ro2 =this.findViewById(R.id.o2r);
        Button So2 = this .findViewById(R.id.SendO2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            o2 = bundle.getInt("o2r");
            Ro2.setText(String.valueOf(o2));
        }

        So2.setOnClickListener(v -> {
            Intent i =new Intent(Intent.ACTION_SEND);
            i.setType("message/rfc822");
            i.putExtra(Intent.EXTRA_SUBJECT,"Oxygen Meter");
            i.putExtra(Intent.EXTRA_TEXT,"Oxygen Level \n"+"at "+Date+" is "+o2);
            try{
                startActivity(Intent.createChooser(i,"SEND..."));
            }catch(ActivityNotFoundException e){
                Toast.makeText(this,"No sharing application is selected",Toast.LENGTH_SHORT).show();
            }
        });

    }
        @Override
    public void onBackPressed() {
        super.onBackPressed();
        }
}