package com.shubhanshusv.workout_app;

import android.os.Bundle;
import android.app.Activity;
import android.util.StringBuilderPrinter;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.graphics.Typeface;
import android.content.res.Resources;
import android.util.TypedValue;
import org.w3c.dom.Text;
import java.util.List;

public class MainActivity extends Activity{

    private workouts obj = new workouts();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void find_workout(View view){

        TextView title = (TextView)findViewById(R.id.para);
        Spinner menu = (Spinner)findViewById(R.id.menu);

        String part = String.valueOf(menu.getSelectedItem());

        List<String> display = obj.load_workouts(part);

        StringBuilder plan = new StringBuilder();

        for(String work : display){

            plan.append(work).append("\n");

        }

        title.setText(plan);

    }


}
