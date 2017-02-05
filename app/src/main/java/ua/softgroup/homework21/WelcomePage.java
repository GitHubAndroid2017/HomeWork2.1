package ua.softgroup.homework21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        QueryPreferences.setStoredQuery(this, "status", "true");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void backspace(View view) {
        QueryPreferences.setStoredQuery(this, "status", "false");
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
