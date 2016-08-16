package com.example.jannat.practiceonjava;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeLayout=new RelativeLayout(this);
        EditText userNameTextField = new EditText(this);
        EditText idTextField=new EditText(this);
        Button logInButton=new Button(this);
        TextView idText=new TextView(this);
        TextView userNameText=new TextView(this);

        relativeLayout.setBackgroundColor(Color.GREEN);
        logInButton.setBackgroundColor(Color.RED);
        logInButton.setText("Login");
        idText.setText("Id: ");
        idText.setTextAppearance(this, android.R.style.TextAppearance_Large);
        idText.setTypeface(idText.getTypeface(), Typeface.BOLD);

        userNameText.setText("User Name: ");
        userNameText.setTextAppearance(this, android.R.style.TextAppearance_Large);
        userNameText.setTypeface(userNameText.getTypeface(), Typeface.BOLD);

        //userNameTextField.setId(1);
        idTextField.setId(2);
        logInButton.setId(3);
        idText.setId(4);
        userNameText.setId(5);

        RelativeLayout.LayoutParams loginButtonDetails=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        loginButtonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        loginButtonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        RelativeLayout.LayoutParams idTextDetails=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        idTextDetails.addRule(RelativeLayout.ABOVE, logInButton.getId());
        idTextDetails.setMargins(0, 0, 0, 50);

        RelativeLayout.LayoutParams idTextFieldDetails=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        idTextFieldDetails.addRule(RelativeLayout.ABOVE, logInButton.getId());
        idTextFieldDetails.addRule(RelativeLayout.END_OF, idText.getId());
        idTextFieldDetails.setMargins(0, 0, 0, 50);

        RelativeLayout.LayoutParams userNameTextDetails=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        userNameTextDetails.addRule(RelativeLayout.ABOVE,idTextField.getId());
        userNameTextDetails.setMargins(0,0,0,50);

        RelativeLayout.LayoutParams userNameTextFieldDetails=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        userNameTextFieldDetails.addRule(RelativeLayout.ABOVE, idTextField.getId());
        userNameTextFieldDetails.addRule(RelativeLayout.END_OF, userNameText.getId());
        userNameTextFieldDetails.setMargins(0, 0, 0, 50);

        Resources r= getResources();
        int px=(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());
        idTextField.setWidth(px);
        userNameTextField.setWidth(px);

        relativeLayout.addView(userNameText,userNameTextDetails);
        relativeLayout.addView(userNameTextField,userNameTextFieldDetails);
        relativeLayout.addView(logInButton, loginButtonDetails);
        relativeLayout.addView(idTextField,idTextFieldDetails);
        relativeLayout.addView(idText,idTextDetails);
        setContentView(relativeLayout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
