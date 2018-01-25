package com.example.gery.randomcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//Change background
public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
    }
    public void rubah(View v){
        int number=1+(int) (Math.random()*100);
        tv.setText("nomor"+number);

        final int[] colors={Color.CYAN,Color.GRAY,Color.GREEN,Color.RED
                ,Color.WHITE,Color.YELLOW,Color.BLACK,Color.BLUE,Color.MAGENTA
        };
        int color=colors[number % colors.length];
        View view=MainActivity.this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
}
