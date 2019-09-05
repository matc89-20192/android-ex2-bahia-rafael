package matc89.exercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String USUARIO;
    public static int STATUS = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();

        TextView textView = (TextView) findViewById(R.id.textView);

        if (MainActivity.USUARIO == null || MainActivity.USUARIO.isEmpty()) {
            textView.setText("Oi!");
        } else {
            textView.setText("Oi, " + MainActivity.USUARIO + "!");
        }

    }

    public void changeUser(View view) {

        Intent intent = new Intent(this, OutraActivity.class);
        TextView textView = (TextView) findViewById(R.id.textView);

        String usuario = textView.getText().toString().replace("Oi", "").replace("!", "").replace(", ", "");

        MainActivity.USUARIO = usuario;

        startActivity(intent);

    }

    public void onBackPressed() {
        MainActivity.USUARIO = "";
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        MainActivity.USUARIO = "";
    }
}
