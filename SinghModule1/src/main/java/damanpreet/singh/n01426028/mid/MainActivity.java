package damanpreet.singh.n01426028.mid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textview;
    private ImageButton imageButton;
    private int counter = 0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textview = findViewById(R.id.damTview);
        imageButton = findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });





    }
    @Override
    protected void onPause() {


        super.onPause();
        counter++; // Increment the counter
        String counterText = "Counter: " + counter;
        Toast.makeText(this, counterText, Toast.LENGTH_SHORT).show();
    }

    }