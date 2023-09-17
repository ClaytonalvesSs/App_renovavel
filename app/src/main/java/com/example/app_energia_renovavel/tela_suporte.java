package com.example.app_energia_renovavel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class tela_suporte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_suporte);
    }
    public void sitesolar(View view){
        Uri uri = Uri.parse("https://www.todamateria.com.br/energia-solar/");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
    public void siteeolica(View view){
        Uri uri = Uri.parse("https://m.brasilescola.uol.com.br/amp/fisica/energia-eolica.htm");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
    public void sitehidro(View view){
        Uri uri = Uri.parse("https://www.todamateria.com.br/energia-hidreletrica/");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
    public void siteocea(View view){
        Uri uri = Uri.parse("https://goldenergy.pt/glossario/energia-dos-oceanos/");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
    public void sitereno(View view){
        Uri uri = Uri.parse("https://www.portaldaindustria.com.br/industria-de-a-z/energia-renovavel/");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
}