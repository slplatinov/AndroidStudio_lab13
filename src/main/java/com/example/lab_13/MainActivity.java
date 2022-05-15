package com.example.lab_13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvOut;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = (TextView) findViewById(R.id.myText);
        tvOut.setText("Текст поменяется после нажатия кнопки");

        btnOk=(Button) findViewById(R.id.myBtn);
        btnOk.setText("Нажми и увидишь, наскослько ты крут");
        //btnOk.setEnabled(false);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Поздравляю! \n ты теперь \n КРУТОЙ ОРЕШЕК!!!");
                btnOk.setEnabled(false);
            }
        };
        btnOk.setOnClickListener(oclBtnOk);
        //btnOk.setEnabled(false);
    }

}
