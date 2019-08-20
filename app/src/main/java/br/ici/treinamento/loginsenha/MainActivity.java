package br.ici.treinamento.loginsenha;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void loginConect(View view){



        EditText usuario = (EditText) findViewById(R.id.editTextUsuario);
        EditText senha = (EditText) findViewById(R.id.editTextSenha);

        Log.i("Usuario",usuario.getText().toString());
        Log.i("Senha",senha.getText().toString());

        Toast.makeText(MainActivity.this, usuario.getText().toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
