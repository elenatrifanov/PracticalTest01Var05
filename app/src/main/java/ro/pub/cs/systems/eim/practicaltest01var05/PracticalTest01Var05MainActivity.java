package ro.pub.cs.systems.eim.practicaltest01var05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var05MainActivity extends AppCompatActivity {

    private Button topLeft, topRight, center, bottomLeft, bottomRight;
    private EditText buttons_text;
    int countTopLeft = 0, countTopRight = 0, countCenter = 0,
            countBottomLeft = 0, countBottomRight = 0;

    private GenericButtonClickListener genericButtonClickListener = new GenericButtonClickListener();
    private class GenericButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            buttons_text.setText(buttons_text.getText().toString() + ((Button)view).getText().toString() + "-");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var05_main);
        topLeft = (Button)findViewById(R.id.top_left);
        topRight = (Button)findViewById(R.id.top_right);
        center = (Button)findViewById(R.id.center);
        bottomLeft = (Button)findViewById(R.id.bottom_left);
        bottomRight = (Button)findViewById(R.id.bottom_right);
        buttons_text = (EditText)findViewById(R.id.text_concat);
        topRight.setOnClickListener(genericButtonClickListener);
        topLeft.setOnClickListener(genericButtonClickListener);
        bottomRight.setOnClickListener(genericButtonClickListener);
        bottomLeft.setOnClickListener(genericButtonClickListener);
        center.setOnClickListener(genericButtonClickListener);
        topLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String toWrite = "Top Left";
                countTopLeft++;
                buttons_text.setText(String.format("%s%s - ", buttons_text.getText().toString(), toWrite));
            }
        });
        topRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String toWrite = "Top Right";
                countTopLeft++;
                buttons_text.setText(String.format("%s%s - ", buttons_text.getText().toString(), toWrite));
            }
        });
        center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String toWrite = "Center";
                countTopLeft++;
                buttons_text.setText(String.format("%s%s - ", buttons_text.getText().toString(), toWrite));
            }
        });
        bottomLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String toWrite = "Bottom Left";
                countTopLeft++;
                buttons_text.setText(String.format("%s%s - ", buttons_text.getText().toString(), toWrite));
            }
        });
        bottomRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String toWrite = "Bottom Right";
                countTopLeft++;
                buttons_text.setText(String.format("%s%s - ", buttons_text.getText().toString(), toWrite));
            }
        });

    }
}