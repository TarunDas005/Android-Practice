package com.example.jannat.practiceupto19;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout=new RelativeLayout(this);
        relativeLayout.setBackgroundColor(Color.GREEN);

        Button button=new Button(this);
        button.setText("Set");
        button.setTextColor(Color.RED);

        Button button1=new Button(this);
        button1.setText("Reset");
        button1.setTextColor(Color.BLACK);

        EditText editText=new EditText(this);

        button.setId(1);
        editText.setId(2);
        button1.setId(3);

        RelativeLayout.LayoutParams buttonDetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams userNameDetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams button1Details=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        //buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        buttonDetails.setMargins(100, 0, 0, 0);

        userNameDetails.addRule(RelativeLayout.ABOVE, button.getId());
        userNameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        userNameDetails.setMargins(0, 0, 0, 50);

        button1Details.addRule(RelativeLayout.BELOW, editText.getId());
        button1Details.addRule(RelativeLayout.CENTER_VERTICAL);
        button1Details.setMargins(450,0,0,0);
        //button1Details.addRule(RelativeLayout.END_OF,button.getId());
        //button1Details.setMargins(0,0,200,0);
        /*button1Details.addRule(RelativeLayout.ABOVE, button.getId());
        button1Details.addRule(RelativeLayout.END_OF, editText.getId());
        button1Details.setMargins(0,0,0,50);
        */

        Resources r= getResources();
        int px=(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());
        editText.setWidth(px);


        relativeLayout.addView(button, buttonDetails);
        relativeLayout.addView(editText, userNameDetails);
        relativeLayout.addView(button1, button1Details);
        setContentView(relativeLayout);

        Button setText=(Button)findViewById(1);
        setText.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View V)
                    {
                        EditText editText1=(EditText)findViewById(2);
                        editText1.setText("Aronno");
                    }
                }
        );

        Button resetText=(Button)findViewById(3);
        resetText.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View V){
                        EditText editText1=(EditText)findViewById(2);
                        editText1.setText("");
                    }
                }
        );
        //relativeLayout.addView(editText,userNameDetails);
        /*relativeLayout.addView(button);
        setContentView(relativeLayout);*/
    }

}
