package com.byethost12.kitm.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // vykdomas tėvo metodo kodas
        setContentView(R.layout.activity_login);

        setTitle(R.string.login_label);

        // pridėta nauja eilutė
    }
    public void toastMsg(String msg) {

        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();

    }
    public void displayToastMsg(View v) {

        toastMsg("Kon saka? A mon saka? Jei mon saka? Tai kon saka?");

    }

}
