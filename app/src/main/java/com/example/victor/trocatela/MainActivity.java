package com.example.victor.trocatela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Object intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irParaTela2 (View view) {
        intent intent1 = new intent(getApplicationContext(), tela2.class);
                startActivity(intent1);
    }

    public void irTela3 (View view) {
        intent intent2 = new intent (getApplicationContext(), tela3.class);
        startActivity (intent2);
    }

    private void startActivity(intent intent2) {
    }
}
