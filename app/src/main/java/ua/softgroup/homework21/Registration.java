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

        String status = QueryPreferences.getStoredQuery(this, "status");
        String stValue = "true";
        if (stValue.compareToIgnoreCase(status)==0){
            Intent intent = new Intent(this, WelcomePage.class);
            startActivity(intent);
        }
    }

    public void savingData(View view) {
        EditText Username = (EditText) findViewById(R.id.Username);
        String valueUsername = Username.getText().toString();

        EditText Password = (EditText) findViewById(R.id.Password);
        String valuePassword = Password.getText().toString();



        if((valueUsername.length() != 0)&&(valuePassword.length() != 0)){
            QueryPreferences.setStoredQuery(this, "valueUsername", valueUsername);
            QueryPreferences.setStoredQuery(this, "valuePassword", valuePassword);

            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        }
    }

    public void methodSignIn(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}