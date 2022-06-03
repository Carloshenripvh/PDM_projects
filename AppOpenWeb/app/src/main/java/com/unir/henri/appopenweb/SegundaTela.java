package com.unir.henri.appopenweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaTela extends AppCompatActivity {
    private Button bt_principal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
        getSupportActionBar().hide();

        bt_principal = (Button) findViewById(R.id.bt_voltar);

        bt_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(SegundaTela.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
    public void abrirNavegador(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.br"));
        startActivity(intent);
    }
}