package com.example.jhonatan.main;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    private EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        editName = (EditText)findViewById(R.id.editText);
    }

    protected void voltarMain(View view){
        Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent1);
    }

    protected void irMenuPrincipal(View view) throws InterruptedException {

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Usuário " + editName.getText().toString() +  " Cadastrado!");
        builder1.setTitle("Feito!");
        builder1.setCancelable(false);

        builder1.setCancelable(false)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent2 = new Intent(getApplicationContext(), MenuPrincipalActivity.class);
                        startActivity(intent2);
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();


        /*CRIAR UM OBJETO PESSOA AQUI COM OS DADOS DOS CAMPOS DE TEXTO (menos data de nascimento) */

    }

}
