package com.example.nh.lab07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private EditText texto_a_editar;
 private TextView texto_a_mostrar;
 private TextView DATOS_A_MOSTRAR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto_a_editar= findViewById(R.id.editText);
        texto_a_mostrar=findViewById(R.id.textView);
        DATOS_A_MOSTRAR=findViewById(R.id.textView2);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

}
