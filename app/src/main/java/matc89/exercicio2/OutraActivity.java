package matc89.exercicio2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class OutraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outra);

        String usuario = MainActivity.USUARIO;

        EditText editText = findViewById(R.id.editText);
        editText.setText(usuario);
    }

    public void changeUser(View view) {
        EditText editText = findViewById(R.id.editText);

        MainActivity.USUARIO = editText.getText().toString();

        finish();
    }

    public void onBackPressed(){
        finish();
    }

    public void cancel(View view) {

        finish();

    }
}
