package com.example.chrisantus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    public EditText edit_name;

    public Button btn_print;
    public Button btn_clear;
    public TextView view_print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    //If i click button2 (print) call the printClicked method
    //else i click button1 (clear) call the clearClicked method
    public void init() {
        btn_print = (Button) findViewById(R.id.button1);

        btn_print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//find xml's id and input the value to edit_name,view_print (widget object)
                edit_name = (EditText) findViewById(R.id.editText);
                view_print = (TextView) findViewById(R.id.Textview);
                switch (v.getId()) {
                    case R.id.button2:
                        printClicked(v);
                        break;

                    case R.id.button1:
                        clearClicked(v);
                        break;
                    default:
                        break;
                }
            }
        });
        btn_clear = (Button) findViewById(R.id.button2);
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit_name = (EditText) findViewById(R.id.editText);
                view_print = (TextView) findViewById(R.id.Textview);
                switch (v.getId()) {
                    case R.id.button2:
                        printClicked(v);
                        break;

                    case R.id.button1:
                        clearClicked(v);
                        break;
                    default:
                        break;
                }
            }
        });


    }

    //If we click clear button, empty textView is showed
    public void clearClicked(View v) {
        edit_name.setText("");
        view_print.setText("");

    }

    //If we click print button, User can type the text and
    //exchange to String variable, and then text show the TextView
    public void printClicked(View v) {
        String text = "";
        text = edit_name.getText().toString();
        view_print.setText(text);
    }


}
