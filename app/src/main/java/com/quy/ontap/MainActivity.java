package com.quy.ontap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

     private final double PRICE_BOOK = 141800;
     private double price_temp = 141800;
     private ImageView imageView2; // plus button
     private ImageView imageView3; // minus button
     private TextView textView5; // quantity
     private TextView textView14; // money temporary
     private TextView textView16; // total money
     private DecimalFormat df = new DecimalFormat( "#,###,###" );




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cal();

    }



    private void cal(){
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        textView5 = findViewById(R.id.textView5);
        textView14 = findViewById(R.id.textView14);
        textView16 = findViewById(R.id.textView16);

        imageView2.setOnClickListener(new View.OnClickListener() { // plus click
            @Override
            public void onClick(View view) {
                textView5.setText(String.valueOf(Integer.valueOf(textView5.getText().toString()) + 1));
                price_temp += 141800;
                textView16.setText(String.valueOf(df.format(price_temp)) + " đ");
                textView14.setText(String.valueOf(df.format(price_temp)) + " đ");

            }
        });


        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Integer.valueOf(textView5.getText().toString()) >= 1){
                    textView5.setText(String.valueOf(Integer.valueOf(textView5.getText().toString()) - 1));
                    price_temp -= 141800;
                    textView16.setText(String.valueOf(df.format(price_temp)) + " đ");
                    textView14.setText(String.valueOf(df.format(price_temp)) + " đ");

                }
            }
        });

    }
}