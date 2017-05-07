package br.com.ahsr.tortuga;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class CollectActivity extends AppCompatActivity {

    Button bLogout;
//    Switch swPlastic, swMetal, swGlass, swPaper, swRubble, swBattery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect);
//
//        swPlastic = (Switch) findViewById(R.id.switch_plastic);
//        swMetal = (Switch) findViewById(R.id.switch_metal);
//        swGlass = (Switch) findViewById(R.id.switch_glass);
//        swPaper = (Switch) findViewById(R.id.switch_paper);
//        swRubble = (Switch) findViewById(R.id.switch_rubble);
//        swBattery = (Switch) findViewById(R.id.switch_battery);

        bLogout = (Button) findViewById(R.id.button_logout);
    }
}
