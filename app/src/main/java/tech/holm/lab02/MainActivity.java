package tech.holm.lab02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    ArrayList<Button> numberButtons = new ArrayList<Button>();
    HashMap<String,Button> normalButtons = new HashMap<String, Button>();
    private String displayString;
    TextView display;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    ArrayList<View.OnClickListener> buttonHandlers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this line is what instanciates the R, therefore findviewbyid( .. ), wont work before this.
        setContentView(R.layout.activity_main);

        displayString = "0";
        display = findViewById(R.id.myTextView);





        for(final ButtonNo buttonNo : ButtonNo.values()){
            buttonHandlers.add(new View.OnClickListener() {
                public void onClick(View v) {
                    setText(buttonNo);
                }
            });


        }
        button0 = findViewById(R.id.button0);
        button0.setOnClickListener(buttonHandlers.get(0));

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(buttonHandlers.get(1));

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(buttonHandlers.get(2));

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(buttonHandlers.get(3));

    }


/*
    View.OnClickListener buttonHandler1 = new View.OnClickListener() {
        public void onClick(View v) {
           setText(ButtonNo.BTN1);
        }
    };
*/


    private void setText(ButtonNo buttonNo){
        checkForZero();
        displayString += buttonNo.toString();
        display.setText(displayString);
    }

    private void checkForZero(){
        if(displayString.startsWith("0")){
            displayString = "";
        }
    }



}
