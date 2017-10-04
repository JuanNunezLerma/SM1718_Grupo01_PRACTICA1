package es.ujaen.git.sm1718_grupo01_practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ServiceActivity extends AppCompatActivity {

    public static final String PARAM_USER = "param_user";
    public static final String PARAM_PASS = "param_pass";
    public static final String PARAM_IP = "param_ip";
    public static final String PARAM_PORT = "param_port";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        String user=getIntent().getStringExtra(PARAM_USER);
        String pass=getIntent().getStringExtra(PARAM_PASS);
        String ip=getIntent().getStringExtra(PARAM_IP);
        String port=getIntent().getStringExtra(PARAM_PORT);

        Toast.makeText(this,"Hola "+user, Toast.LENGTH_SHORT).show();
    }
}
