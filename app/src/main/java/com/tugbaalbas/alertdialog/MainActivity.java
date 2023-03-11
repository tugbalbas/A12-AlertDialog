package com.tugbaalbas.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Context
        //Activity Context -> this veya MainActivity.this kullanılabilir

        //App Context -> getApplicationContext() kullanılır.

        Toast.makeText(MainActivity.this,"Toast Message",Toast.LENGTH_LONG).show(); // burada sadece this de kullanılabilir. getAppl. da kullanılabilir.

    }

    public void save(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("Save"); //başlığımızı belirliyoruz
        alert.setMessage("Are you sure?"); // mesajımız

        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            //listener, bir tıklamada/olayda ne olacağını yazdığımız dinleyici methodlar
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //save işlemi
                Toast.makeText(MainActivity.this,"Saved",Toast.LENGTH_LONG).show(); //buradaki this bir üst methoda referans oluyor
                // burada mainAct.this yerine getApplicationContext() de kullanılabilir
                //Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_LONG).show();

            }
        });

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Not Saved",Toast.LENGTH_LONG).show();

            }
        });
        alert.show();
    }
}