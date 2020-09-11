package com.example.aula10092020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btCalcular, btMedia;
    EditText edNota1, edNotaProjeto, edPontuacaoListas, edMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btCalcular = (Button)findViewById(R.id.btnCalcular);


        btCalcular.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setContentView(R.layout.tela2);

            edNota1=(EditText)findViewById(R.id.edtNota1);
            edNotaProjeto=(EditText)findViewById(R.id.edtNotaProjeto);
            edPontuacaoListas=(EditText)findViewById(R.id.edtPontuacaoListas);

            btMedia=(Button)findViewById(R.id.btnMedia);
            edMedia=(EditText)findViewById(R.id.edtMedia);

            calcularMedia();
        }
    });

}

    public void calcularMedia(){
        btMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double n1, notaProjeto, pontuacaoListas, media;

                n1 = Double.valueOf(edNota1.getText().toString());
                notaProjeto = Double.valueOf(edNotaProjeto.getText().toString());
                pontuacaoListas = Double.valueOf(edPontuacaoListas.getText().toString());


                media = (n1 * 0.3) + (notaProjeto * 0.5) + pontuacaoListas;

                edMedia.setText(media.toString());
            }
        });
    }


}