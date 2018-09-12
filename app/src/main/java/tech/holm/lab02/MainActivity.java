package tech.holm.lab02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this line is what instanciates the R, therefore findviewbyid( .. ), wont work before this.
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        //made this class an onclick listener, therefore the "this" keyword.
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView textView = findViewById(R.id.hello);
        EditText editText = findViewById(R.id.editText);

        int meters = Integer.parseInt(editText.getText().toString());
        float inches = meters * 100 / 2.5f;

        textView.setText(meters+" meters is "+inches+" Inches");
    }
}
