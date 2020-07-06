package com.madadevmobile.trabalhandocomselect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox checkBox_sql, checkBox_html, checkBox_java, checkBox_kotlin;
    private Button button_enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox_html = findViewById(R.id.checkbox_html);
        checkBox_java = findViewById(R.id.checkbox_java);
        checkBox_sql = findViewById(R.id.checkbox_sql);
        checkBox_kotlin = findViewById(R.id.checkbox_kotlin);

        button_enviar = findViewById(R.id.bt_enviar);

        button_enviar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.bt_enviar:
                    validaDados();
                break;

        }

    }

    private void validaDados(){

        String res = "";

        if(checkBox_kotlin.isChecked()) {

            res += "\n" + checkBox_kotlin.getText().toString() + "\n";

        }

        if(checkBox_sql.isChecked()){

            res += checkBox_sql.getText().toString() +  "\n";

        }

        if(checkBox_html.isChecked()){

            res += checkBox_html.getText().toString() +  "\n";

        }

        if(checkBox_java.isChecked()){

            res += checkBox_java.getText().toString() +  "\n";
        }

        if(res.isEmpty()){

            res = "Nenhuma resposta";

        }


        Toast.makeText(getApplicationContext(), " Respostas : "+res, Toast.LENGTH_LONG).show();

    }
}