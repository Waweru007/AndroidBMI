package pro.forecastanalytics.root.bmi1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText height, weight;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        display = findViewById(R.id.display);

    }


    public void calc1(View view) {
        ///Collect the data from the Inputs
        String a= height.getText().toString().trim();
        String b= weight.getText().toString().trim();
        if (a.isEmpty() || b.isEmpty()) {
            Toast.makeText(this, "Fill in all values", Toast.LENGTH_SHORT).show();
            return;   //return to stop the excecution

        }

        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        double results = x/(y*y);

        display.setText(String.valueOf(results));
        ///String.valueOf(BMI);

        if(results<=18.5){
            Toast.makeText(this, "Underweight", Toast.LENGTH_SHORT).show();
            return;

        } else if ( results>18.5 && results<=24.9) {
            Toast.makeText(this, "Normal Weight", Toast.LENGTH_SHORT).show();
            return;

        } else if ( results>25 && results<=29.9) {
            Toast.makeText(this, "Over weight", Toast.LENGTH_SHORT).show();
            return;

        } else if (results>=30) {
            Toast.makeText(this, "Obese", Toast.LENGTH_SHORT).show();
            return;
        } else  {
            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
            return;

        }




    }
}
