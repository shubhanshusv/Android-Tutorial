package com.shubhanshusv.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting data send via intent from activity 2
        Bundle act1_dis = getIntent().getExtras();

        // If no text is typed in activity 2 edit text box
        if(act1_dis == null){

                return;

        }

        // If something is typed in activity 2 edit text box

        // Storing message sent from activity 2 in a local string
        String act1_msg = act1_dis.getString("2");

        // Displaying message recieved from activity 2
        TextView dis1 = (TextView)findViewById(R.id.act1_dis);
        dis1.setText(act1_msg);

    }

    public void activity2(View view){

        Intent i = new Intent(this,Main2Activity.class);

        final EditText act1_msg = (EditText)findViewById(R.id.act1_msg);

        // Getting text typed in edit text box of activity 1
        String msg2 = act1_msg.getText().toString();

        // Sending message typed to activity 2
        i.putExtra("1",msg2);

        startActivity(i);
    }

}
