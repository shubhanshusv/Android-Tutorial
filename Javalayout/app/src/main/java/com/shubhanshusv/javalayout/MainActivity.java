// Shubhanshu Verma
// Layout using JAVA

package com.shubhanshusv.javalayout;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.graphics.Typeface;
import android.content.res.Resources;
import android.util.TypedValue;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing objects

        RelativeLayout mylayout = new RelativeLayout(this);
        Button mybutton = new Button(this);
        EditText username = new EditText(this);
        EditText password = new EditText(this);
        TextView title = new TextView(this);

        // Setting background image
        mylayout.setBackgroundResource(R.drawable.backg);

        // Setting background color of button
        mybutton.setBackgroundColor(Color.parseColor("#17A589"));

        // Setting background color of edit text (username) and (password)
        // putting 01 to 99 before hex color code decides transparency, 01 being closer to transparent
        username.setBackgroundColor(Color.parseColor("#20ECF5FC"));
        password.setBackgroundColor(Color.parseColor("#20ECF5FC"));

        // Importing font from assets folder
        // src/main/assets/fonts/
        // copy your font in the fonts folder and import like this
        Typeface fonttype = Typeface.createFromAsset(getAssets(),"fonts/galax___.ttf");


        // Setting text on button
        mybutton.setText("LOGIN");

        // Setting IDs
        mybutton.setId('1');
        username.setId('2');
        password.setId('3');

        // Layout rules for title
        RelativeLayout.LayoutParams titlelayout = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        // Aligning button vertically
        titlelayout.addRule(RelativeLayout.ALIGN_PARENT_TOP);

        // Aligning button horizontally
        titlelayout.addRule(RelativeLayout.CENTER_HORIZONTAL);

        // Setting text size and color of button
        title.setTextSize(48);
        title.setTextColor(Color.WHITE);
        title.setText("GALAXY");
        title.setTypeface(fonttype);


        // Layout rules for button
        RelativeLayout.LayoutParams buttonlayout = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        // Aligning button vertically
        buttonlayout.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

        // Aligning button horizontally
        buttonlayout.addRule(RelativeLayout.CENTER_HORIZONTAL);

        // Setting text size and color of button
        mybutton.setTextSize(18);
        mybutton.setTextColor(Color.WHITE);

        // Converting dip(density independent pixels) into pixels
        // Specifying values in terms of absolute pixels will lead to different alignments on different devices
        // So pixel value is obtained in terms of density pixels (dp) to maintain uniformity

        Resources r = getResources();  //resources are basically used in order to get the resources assosciated with our device
        int px = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,300,r.getDisplayMetrics());
        int marpx = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,150,r.getDisplayMetrics());

        // 3 parameters
        // 1. The unit which we are going to translate
        // 2. No. of units we wish to translate
        // 3. Display Metrics

        //Setting margins for title
        titlelayout.setMargins(0,marpx,0,0);

        // Setting margins for button
        buttonlayout.setMargins(0, 0, 0, marpx);

        // Adding layout rules for button and title to mylayout
        mylayout.addView(mybutton,buttonlayout);
        mylayout.addView(title,titlelayout);

        // Layout rules for edit text (password)
        RelativeLayout.LayoutParams passwordlayout = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        // Layout rules for edit text (username)
        RelativeLayout.LayoutParams usernamelayout = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        // Setting alignment for edit text (username)
        passwordlayout.addRule(RelativeLayout.ABOVE, mybutton.getId());
        passwordlayout.addRule(RelativeLayout.CENTER_HORIZONTAL);
        passwordlayout.setMargins(0, 0, 0, 80);

        // Setting alignment for edit text (username)
        usernamelayout.addRule(RelativeLayout.ABOVE, password.getId());
        usernamelayout.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernamelayout.setMargins(0, 0, 0, 80);

        // Text formatting for username and password
        password.setHint("Password");            // this text is shown when nothing is typed
        password.setHintTextColor(Color.parseColor("#ECF5FC"));
        password.setGravity(Gravity.CENTER);     // setting alignment
        password.setTextColor(Color.parseColor("#ECF5FC"));
        username.setHint("Username");
        username.setHintTextColor(Color.parseColor("#ECF5FC"));
        username.setGravity(Gravity.CENTER);
        username.setTextColor(Color.parseColor("#ECF5FC"));

        // Setting width of edit text
        password.setWidth(px);
        username.setWidth(px);

        // Adding layout rules for edit text (username) and (password)
        mylayout.addView(password,passwordlayout);
        mylayout.addView(username,usernamelayout);
        setContentView(mylayout);

    }

}
