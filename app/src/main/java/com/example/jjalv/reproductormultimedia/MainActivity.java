package com.example.jjalv.reproductormultimedia;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity  {

    EditText edTusuario;
    EditText edTPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        ConexionSQliteHelper conn = new ConexionSQliteHelper(this, "bd_ContenidosMultiMedia", null, 1);

        cargarPreferencias();

    }
    public void crearUser(View view){

        SharedPreferences user = getSharedPreferences("user", MODE_PRIVATE);
        SharedPreferences.Editor editor = user.edit();
        String usuario = edTusuario.getText().toString();
        editor.putString("usuario", usuario);
        String pass = edTPass.getText().toString();
        editor.putString("pass", pass);
        editor.apply();


    }

    private void cargarPreferencias() {

        SharedPreferences user = getSharedPreferences("user", MODE_PRIVATE);
        String nombreUsuario = user.getString("usuario", "no existe usuario aún...");
        String password = user.getString("pass", "no existe password aún...");


    }

    public void comprobarUser(View v) {
/**
        SharedPreferences user = getSharedPreferences("user", MODE_PRIVATE);
        SharedPreferences.Editor editor = user.edit();
        String usuario = edTusuario.getText().toString();
        String pass = edTPass.getText().toString();
        String nombreUsuario = user.getString("usuario", "no existe usuario aún...");
        String password = user.getString("pass", "no existe password aún...");**/


           // Toast.makeText(this,"Usuario correcto",Toast.LENGTH_SHORT).show();

            startActivity(new Intent(this,Preferencias.class));





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
