package ua.softgroup.homework21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void savingData(View view) {
        EditText Username = (EditText) findViewById(R.id.Username);
        String valueUsername = Username.getText().toString();

        EditText Password = (EditText) findViewById(R.id.Password);
        String valuePassword = Password.getText().toString();

        Intent intent = new Intent(this, Login.class);
        intent.putExtra("valueUsername", valueUsername);
        intent.putExtra("valuePassword", valuePassword);
        startActivity(intent);
    }
}