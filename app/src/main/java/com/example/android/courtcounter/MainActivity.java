package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Variável global para os pontos do Time A
    int pontosTimeA = 0;
    // Variável global para os pontos do Time A
    int pontosTimeB = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exibePlacarTimeA(0);
    }
    // Exibe os pontos para o Time A
    public void exibePlacarTimeA(int placar) {
        TextView placarView = (TextView) findViewById(R.id.pontos_time_a);
        placarView.setText(String.valueOf(placar));
    }
    // Marca 1 ponto para o time A
    public void marcaUmTimeA(View view) {
        pontosTimeA = pontosTimeA + 1;
        displayA(pontosTimeA);
    }
    // Marca 3 ponto para o time A
    public void marcaDoisTimeA(View view) {
        pontosTimeA = pontosTimeA + 2;
        displayA(pontosTimeA);
    }
    // Marca 3 ponto para o time A
    public void marcaTresTimeA(View view) {
        pontosTimeA = pontosTimeA + 3;
        displayA(pontosTimeA);
    }
    // TIME B
    // Exibe os pontos para o Time B
    public void exibePlacarTimeB(int placar) {
        TextView placarView = (TextView) findViewById(R.id.pontos_time_b);
        placarView.setText(String.valueOf(placar));
    }
    // Marca 1 ponto para o time B
    public void marcaUmTimeB(View view) {
        pontosTimeB = pontosTimeB + 1;
        displayB(pontosTimeB);
    }
    // Marca 3 ponto para o time B
    public void marcaDoisTimeB(View view) {
        pontosTimeB = pontosTimeB + 2;
        displayB(pontosTimeB);
    }
    // Marca 3 ponto para o time B
    public void marcaTresTimeB(View view) {
        pontosTimeB = pontosTimeB + 3;
        displayB(pontosTimeB);
    }
    //Exibe o placar do Time A
    public void displayA(int number) {
        TextView countViewer = (TextView) findViewById(R.id.pontos_time_a);
        countViewer.setText("" + number);
    }
    //Exibe o placar do Time B
    public void displayB(int number) {
        TextView countViewer = (TextView) findViewById(R.id.pontos_time_b);
        countViewer.setText("" + number);
    }
    // Reset o placar, variáveis globais
    public void resetaTudo (View view){
        pontosTimeA = 0 ;
        pontosTimeB = 0 ;
        displayA(pontosTimeA);
        displayB(pontosTimeB);

    }

}