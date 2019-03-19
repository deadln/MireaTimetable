package ru.startandroid.develop.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sBut = (Button) findViewById(R.id.startButton);

        sBut.setOnClickListener(oclBtn);
    }

    View.OnClickListener oclBtn = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            setContentView(R.layout.monday);
        }
    };

    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub

        menu.add(0,1,1,"Понедельник");
        menu.add(0,2,2,"Вторник");
        menu.add(0,3,3,"Среда");
        menu.add(0,4,4,"Четверг");
        menu.add(0,5,5,"Пятница");
        menu.add(0,6,6,"Суббота");

        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub

        switch(item.getItemId())
        {
            case 1:
                setContentView(R.layout.monday);
                break;

            case 2:
                setContentView(R.layout.tuesday);
                break;

            case 3:
                setContentView(R.layout.wednesday);
                break;

            case 4:
                setContentView(R.layout.thursday);
                break;

            case 5:
                setContentView(R.layout.friday);
                break;

            case 6:
                setContentView(R.layout.saturday);
                break;

        }

        //Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

}
