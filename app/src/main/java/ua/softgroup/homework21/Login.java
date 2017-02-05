package ua.softgroup.homework21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void methodSignIn(View view) {

        EditText UsernameL = (EditText) findViewById(R.id.UsernameL);
        String User = UsernameL.getText().toString();

        EditText PasswordL = (EditText) findViewById(R.id.PasswordL);
        String Pass = PasswordL.getText().toString();


        String queryU = QueryPreferences.getStoredQuery(this, "valueUsername");
        String queryP = QueryPreferences.getStoredQuery(this, "valuePassword");

        if (queryU.compareToIgnoreCase(User)==0){
            if (queryP.compareToIgnoreCase(Pass)==0){
                Intent intent = new Intent(this, WelcomePage.class);
                startActivity(intent);
            }else {
                Toast.makeText(this, "invalid password", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "invalid login", Toast.LENGTH_SHORT).show();
        }
    }

    public void savingData(View view) {
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }
}
