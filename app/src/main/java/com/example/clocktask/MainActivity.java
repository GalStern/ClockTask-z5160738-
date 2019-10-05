package com.example.clocktask;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Date;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchTo12HRTime(View view) {

        TimeZone timezone = TimeZone.getDefault();

        Date sydneytime = new Date();
        TextView sydney = findViewById(R.id.sydney);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        sdf.setTimeZone(timezone.getTimeZone("GMT+10:00"));
        String sydneyTime = sdf.format(sydneytime);
        sydney.setText("Sydney"+ "\n" +sydneyTime);

        Date paristime = new Date();
        TextView paris = findViewById(R.id.paris);
        SimpleDateFormat parisf = new SimpleDateFormat("HH:mm");
        parisf.setTimeZone(timezone.getTimeZone("GMT+2:00"));
        String parisTime = parisf.format(paristime);
        paris.setText("Paris"+ "\n" + parisTime);

        Date latime = new Date();
        TextView la = findViewById(R.id.la);
        SimpleDateFormat laf = new SimpleDateFormat("HH:mm");
        laf.setTimeZone(timezone.getTimeZone("GMT-7:00"));
        String laTime = laf.format(latime);
        la.setText("Los Angeles"+ "\n" + laTime);

        Date nytime = new Date();
        TextView newyork = findViewById(R.id.newYork);
        SimpleDateFormat nyf = new SimpleDateFormat("HH:mm");
        nyf.setTimeZone(timezone.getTimeZone("GMT-4:00"));
        String newYorkTime = nyf.format(nytime);
        newyork.setText("New York" + "\n" +newYorkTime);

        Date shangt = new Date();
        TextView shanghai = findViewById(R.id.shanghai);
        SimpleDateFormat shangf = new SimpleDateFormat("HH:mm");
        shangf.setTimeZone(timezone.getTimeZone("GMT+8:00"));
        String shanghaiTime = shangf.format(shangt);
        shanghai.setText("Shanghai" + "\n" + shanghaiTime);
    }

    public void switchTo24HRTime(View view) {
        TimeZone timezone = TimeZone.getDefault();

        Date sydneytime = new Date();
        TextView syd = findViewById(R.id.sydney);
        SimpleDateFormat sydf = new SimpleDateFormat("h:mm a");
        sydf.setTimeZone(timezone.getTimeZone("GMT+10:00"));
        String sydneyTime = sydf.format(sydneytime);
        syd.setText("Sydney"+ "\n" + sydneyTime);

        Date paristime = new Date();
        TextView paris = findViewById(R.id.paris);
        SimpleDateFormat parisf = new SimpleDateFormat("h:mm a");
        parisf.setTimeZone(timezone.getTimeZone("GMT+2:00"));
        String parisTime = parisf.format(paristime);
        paris.setText("Paris"+ "\n" + parisTime);

        Date latime = new Date();
        TextView la = findViewById(R.id.la);
        SimpleDateFormat laf = new SimpleDateFormat("h:mm a");
        laf.setTimeZone(timezone.getTimeZone("GMT-7:00"));
        String tokyoTime = laf.format(latime);
        la.setText("Los Angeles"+ "\n" + tokyoTime);

        Date nytime = new Date();
        TextView newyork = findViewById(R.id.newYork);
        SimpleDateFormat nyf = new SimpleDateFormat("h:mm a");
        nyf.setTimeZone(timezone.getTimeZone("GMT-4:00"));
        String londonTime = nyf.format(nytime);
        newyork.setText("New York" + "\n" + londonTime);

        Date shangt = new Date();
        TextView shanghai = findViewById(R.id.shanghai);
        SimpleDateFormat shangf = new SimpleDateFormat("h:mm a");
        shangf.setTimeZone(timezone.getTimeZone("GMT+8:00"));
        String shanghaiTime = shangf.format(shangt);
        shanghai.setText("Shanghai" + "\n" + shanghaiTime);
    }

}