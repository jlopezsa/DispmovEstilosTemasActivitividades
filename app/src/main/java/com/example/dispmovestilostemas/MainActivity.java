package com.example.dispmovestilostemas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button boton_ayuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_ayuda = (Button) findViewById(R.id.btn_ayuda);

        boton_ayuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarAyuda(null);
            }
        });
    }

    public void lanzarAyuda(View view){
        Intent i = new Intent(this,AyudaActivity.class);
        startActivity(i);
    }
}