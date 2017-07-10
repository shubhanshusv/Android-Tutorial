package com.shubhanshusv.intents;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Getting data send via intent from activity 1
        Bundle act2_dis = getIntent().getExtras();

        // If no text is typed in activity 1 edit text box
        if(act2_dis == null){

            return;

        }

        // If something is typed in activity 1 edit text box

        // Storing message sent from activity 1 in a local string
        String act2_msg = act2_dis.getString("1");

        // Displaying message recieved from activity 1
        TextView dis2 = (TextView)findViewById(R.id.act2_dis);
        dis2.setText(act2_msg);
    }

    public void activity1(View view){

        Intent i = new Intent(this,MainActivity.class);

        final EditText act2_msg = (EditText)findViewById(R.id.act2_msg);

        // Getting text typed in edit text box of activity 2
        String msg1 = act2_msg.getText().toString();

        // Sending message typed to activity 1
        i.putExtra("2",msg1);

        startActivity(i);

    }
}
