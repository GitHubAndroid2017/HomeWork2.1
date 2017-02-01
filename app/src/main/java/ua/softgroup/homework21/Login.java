package ua.softgroup.homework21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void methodSignIn(View view) {
        Intent intent = getIntent();
        String valueUsernameL = intent.getStringExtra("valueUsername");
        String valuePasswordL = intent.getStringExtra("valuePassword");

        EditText UsernameL = (EditText) findViewById(R.id.UsernameL);
        String User = UsernameL.getText().toString();
        EditText PasswordL = (EditText) findViewById(R.id.PasswordL);
        String Pass = PasswordL.getText().toString();

        if (Objects.equals(valueUsernameL, User) && Objects.equals(valuePasswordL, Pass)){
            intent = new Intent(this, WelcomePage.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "invalid login or password", Toast.LENGTH_SHORT).show();
        }
    }
}
