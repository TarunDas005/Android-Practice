package com.example.jannat.unitconverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

public class MyCalculator extends AppCompatActivity {

    EditText calculatorTextField;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setVisibility(View.GONE);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setVisibility(View.GONE);
        calculatorTextField = (EditText) findViewById(R.id.calculatorTextField);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
        resultTextView.setVisibility(View.INVISIBLE);
    }

    public void DivideButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals("")) {
            textString = "";
        } else {
            StringBuilder inputString = new StringBuilder(textString);
            int length = textString.length();
            char lastCharacter = textString.charAt(length - 1);
            //Toast.makeText(getApplicationContext(),String.valueOf(lastCharacter),Toast.LENGTH_LONG).show();

            if (lastCharacter == '.') {
                textString = textString;
            } else if (lastCharacter == '-' || lastCharacter == '+' || lastCharacter == '*' || lastCharacter == '/') {
                inputString.deleteCharAt(length - 1);
                inputString.append('/');
                textString = inputString.toString();
            } else
                textString += "/";
        }

        calculatorTextField.setText(textString);
    }

    public void MultiplyButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals("")) {
            textString = "";
        } else {
            StringBuilder inputString = new StringBuilder(textString);
            int length = textString.length();
            char lastCharacter = textString.charAt(length - 1);
            //Toast.makeText(getApplicationContext(),String.valueOf(lastCharacter),Toast.LENGTH_LONG).show();
            if (lastCharacter == '.') {
                textString = textString;
            } else if (lastCharacter == '-' || lastCharacter == '+' || lastCharacter == '*' || lastCharacter == '/') {
                inputString.deleteCharAt(length - 1);
                inputString.append('*');
                textString = inputString.toString();
            } else
                textString += "*";
        }

        calculatorTextField.setText(textString);
    }

    public void MinusButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals("")) {
            textString = "";
        } else {
            StringBuilder inputString = new StringBuilder(textString);
            int length = textString.length();
            char lastCharacter = textString.charAt(length - 1);
            //Toast.makeText(getApplicationContext(),String.valueOf(lastCharacter),Toast.LENGTH_LONG).show();

            if (lastCharacter == '.') {
                textString = textString;
            } else if (lastCharacter == '-' || lastCharacter == '+' || lastCharacter == '*' || lastCharacter == '/') {
                inputString.deleteCharAt(length - 1);
                inputString.append('-');
                textString = inputString.toString();
            } else
                textString += "-";
        }

        calculatorTextField.setText(textString);
    }

    public void PlusButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals("")) {
            textString = "";
        } else {
            StringBuilder inputString = new StringBuilder(textString);
            int length = textString.length();
            char lastCharacter = textString.charAt(length - 1);
            //Toast.makeText(getApplicationContext(),String.valueOf(lastCharacter),Toast.LENGTH_LONG).show();

            if (lastCharacter == '.') {
                textString = textString;
            } else if (lastCharacter == '-' || lastCharacter == '+' || lastCharacter == '*' || lastCharacter == '/') {
                inputString.deleteCharAt(length - 1);
                inputString.append('+');
                textString = inputString.toString();
            } else
                textString += "+";
        }

        calculatorTextField.setText(textString);
    }

    public void SevenButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals(""))
            calculatorTextField.setText("7");
        else {
            textString += "7";
            calculatorTextField.setText(textString);
        }
    }

    public void EightButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals(""))
            calculatorTextField.setText("8");
        else {
            textString += "8";
            calculatorTextField.setText(textString);
        }
    }

    public void NineButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals(""))
            calculatorTextField.setText("9");
        else {
            textString += "9";
            calculatorTextField.setText(textString);
        }
    }

    public void FourButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals(""))
            calculatorTextField.setText("4");
        else {
            textString += "4";
            calculatorTextField.setText(textString);
        }
    }

    public void FiveButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals(""))
            calculatorTextField.setText("5");
        else {
            textString += "5";
            calculatorTextField.setText(textString);
        }
    }

    public void SixButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals(""))
            calculatorTextField.setText("6");
        else {
            textString += "6";
            calculatorTextField.setText(textString);
        }
    }

    public void OneButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals(""))
            calculatorTextField.setText("1");
        else {
            textString += "1";
            calculatorTextField.setText(textString);
        }
    }

    public void TwoButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals(""))
            calculatorTextField.setText("2");
        else {
            textString += "2";
            calculatorTextField.setText(textString);
        }
    }

    public void ThreeButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals(""))
            calculatorTextField.setText("3");
        else {
            textString += "3";
            calculatorTextField.setText(textString);
        }
    }

    public void ZeroButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals(""))
            calculatorTextField.setText("0");
        else {
            textString += "0";
            calculatorTextField.setText(textString);
        }
    }

    public void DotButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals("")) {
            textString += ".";
        } else {
            StringBuilder inputString = new StringBuilder(textString);
            int length = textString.length();
            char lastCharacter = textString.charAt(length - 1);
            if (lastCharacter == '.') {
                textString = textString;
            } else {
                StringBuilder chkString = new StringBuilder();
                int flag = 0, i;
                for (i = length - 1; i >= 0; i--) {
                    if (textString.charAt(i) == '+' || textString.charAt(i) == '-' || textString.charAt(i) == '*' || textString.charAt(i) == '/') {
                        flag = 1;
                        break;
                    } else {
                        chkString.append(textString.charAt(i));
                    }
                }
                // Toast.makeText(getApplicationContext(), String.valueOf(i), Toast.LENGTH_LONG).show();

                int newflag = 0;
                String s = chkString.toString();
                if (s.equals("")) {
                    textString += ".";
                } else {
                    for (int j = 0; j < s.length(); j++) {
                        if (s.charAt(j) == '.') {
                            newflag = 1;
                            break;
                        }
                    }
                    if (newflag == 1) {
                        textString = textString;
                    } else {
                        textString += ".";
                    }
                }


            }
        }
        calculatorTextField.setText(textString);
    }

    int checkPriority(char c) {
        if (c == '+')
            return 1;
        else if (c == '-') {
            return 1;
        } else if (c == '*')
            return 2;
        else
            return 2;
    }


    public void EqualButton(View view) {
        String result = "";
        String textString = calculatorTextField.getText().toString();
        if (textString.equals("")) {
            resultTextView.setVisibility(View.INVISIBLE);
        } else {
            int length = textString.length();
            char lastCharacter = textString.charAt(length - 1);
            if (lastCharacter == '-' || lastCharacter == '+' || lastCharacter == '*' || lastCharacter == '/') {
                resultTextView.setVisibility(View.INVISIBLE);
            } else {
                int divideFlag=0;
                String val = "";
                int flag = 0;
                Stack<Double> values = new Stack<Double>();
                Stack<Character> operations = new Stack<Character>();
                for (int i = 0; i < length; i++) {
                    char c = textString.charAt(i);
                    if ((c == '-' || c == '+' || c == '*' || c == '/')) {
                        int priority = checkPriority(c);
                        if (operations.size() == 0) {
                            operations.push(c);
                            Double number = Double.parseDouble(val);
                            values.push(number);
                            val = "";
                            flag = 1;
                        } else {
                            divideFlag=0;
                            int numberPriority = checkPriority(operations.peek());
                            if (priority > numberPriority) {
                                operations.push(c);
                                Double number = Double.parseDouble(val);
                                values.push(number);
                                val = "";
                                flag = 1;
                            } else {
                                Double res;
                                Double number2 = Double.parseDouble(val);
                                Double number1=values.pop();
                                char op=(char)operations.pop();
                                if(op=='+'){
                                    res=number1+number2;
                                }
                                else if(op=='-'){
                                    res=number1-number2;
                                }
                                else if(op=='*'){
                                    res=number1*number2;
                                }
                                else{
                                    if(number2==0){
                                        divideFlag=1;
                                        break;
                                    }
                                    res=number1/number2;
                                }
                                values.push(res);
                                operations.push(c);
                                val="";
                            }

                        }

                    } else {
                        val += String.valueOf(c);
                    }

                }
                if(divideFlag==1){
                    resultTextView.setVisibility(View.INVISIBLE);
                    resultTextView.setText("");
                    Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_LONG).show();
                }else{
                    Double number = Double.parseDouble(val);
                    values.push(number);
                    val = "";

                    if(operations.size()!=0){
                        while (!operations.empty()){
                            divideFlag=0;
                            Double res;
                            Double number2 = values.pop();
                            Double number1=values.pop();
                            char op=(char)operations.pop();
                            if(op=='+'){
                                res=number1+number2;
                            }
                            else if(op=='-'){
                                res=number1-number2;
                            }
                            else if(op=='*'){
                                res=number1*number2;
                            }
                            else{
                                if(number2==0){
                                    divideFlag=1;
                                    break;
                                }
                                res=number1/number2;
                            }
                            values.push(res);
                        }
                    }
                    if(divideFlag==1) {
                        resultTextView.setVisibility(View.INVISIBLE);
                        resultTextView.setText("");
                        Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Float finalResult=Float.parseFloat(String.valueOf(values.peek()));
                        resultTextView.setVisibility(View.VISIBLE);
                        resultTextView.setText("Result: "+String.valueOf(finalResult));
                    }

                }

            }
        }

    }

    public void BackButton(View view) {
        String textString = calculatorTextField.getText().toString();
        if (textString.equals("")) {
            textString = "";
        } else {
            StringBuilder inputString = new StringBuilder(textString);
            int length = textString.length();
            inputString.deleteCharAt(length - 1);
            textString = inputString.toString();
        }

        calculatorTextField.setText(textString);
    }

    public void CButton(View view) {
        resultTextView.setVisibility(View.INVISIBLE);
        resultTextView.setText("");
        calculatorTextField.setText("");
    }

    public void OkButton(View view){
        String result = "";
        String textString = calculatorTextField.getText().toString();
        if (textString.equals("")) {
            resultTextView.setVisibility(View.INVISIBLE);
        } else {
            int length = textString.length();
            char lastCharacter = textString.charAt(length - 1);
            if (lastCharacter == '-' || lastCharacter == '+' || lastCharacter == '*' || lastCharacter == '/') {
                resultTextView.setVisibility(View.INVISIBLE);
            } else {
                int divideFlag=0;
                String val = "";
                int flag = 0;
                Stack<Double> values = new Stack<Double>();
                Stack<Character> operations = new Stack<Character>();
                for (int i = 0; i < length; i++) {
                    char c = textString.charAt(i);
                    if ((c == '-' || c == '+' || c == '*' || c == '/')) {
                        int priority = checkPriority(c);
                        if (operations.size() == 0) {
                            operations.push(c);
                            Double number = Double.parseDouble(val);
                            values.push(number);
                            val = "";
                            flag = 1;
                        } else {
                            divideFlag=0;
                            int numberPriority = checkPriority(operations.peek());
                            if (priority > numberPriority) {
                                operations.push(c);
                                Double number = Double.parseDouble(val);
                                values.push(number);
                                val = "";
                                flag = 1;
                            } else {
                                Double res;
                                Double number2 = Double.parseDouble(val);
                                Double number1=values.pop();
                                char op=(char)operations.pop();
                                if(op=='+'){
                                    res=number1+number2;
                                }
                                else if(op=='-'){
                                    res=number1-number2;
                                }
                                else if(op=='*'){
                                    res=number1*number2;
                                }
                                else{
                                    if(number2==0){
                                        divideFlag=1;
                                        break;
                                    }
                                    res=number1/number2;
                                }
                                values.push(res);
                                operations.push(c);
                                val="";
                            }

                        }

                    } else {
                        val += String.valueOf(c);
                    }

                }
                if(divideFlag==1){
                    resultTextView.setVisibility(View.INVISIBLE);
                    resultTextView.setText("");
                    Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_LONG).show();
                }else{
                    Double number = Double.parseDouble(val);
                    values.push(number);
                    val = "";

                    if(operations.size()!=0){
                        while (!operations.empty()){
                            divideFlag=0;
                            Double res;
                            Double number2 = values.pop();
                            Double number1=values.pop();
                            char op=(char)operations.pop();
                            if(op=='+'){
                                res=number1+number2;
                            }
                            else if(op=='-'){
                                res=number1-number2;
                            }
                            else if(op=='*'){
                                res=number1*number2;
                            }
                            else{
                                if(number2==0){
                                    divideFlag=1;
                                    break;
                                }
                                res=number1/number2;
                            }
                            values.push(res);
                        }
                    }
                    if(divideFlag==1) {
                        resultTextView.setVisibility(View.INVISIBLE);
                        resultTextView.setText("");
                        Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Float finalResult=Float.parseFloat(String.valueOf(values.peek()));
                        String valueForCalculation=String.valueOf(finalResult);
                        Intent data=new Intent();
                        data.putExtra("number",valueForCalculation);
                        setResult(Activity.RESULT_OK,data);
                        finish();
                    }

                }

            }
        }
    }

    public void CancleButton(View view){
        finish();
    }

}
