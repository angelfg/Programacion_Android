package es.cifprodofloucha.angel.depuracion.exemplogit;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity_Usuario_1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2__usuario_1);

        Toast.makeText(getApplicationContext(),"Ola",Toast.LENGTH_LONG).show();
    }
}
