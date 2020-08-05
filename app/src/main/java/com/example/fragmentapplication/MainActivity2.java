package com.example.fragmentapplication;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity2 extends AppCompatActivity {
Button button_first,button_second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button_first=findViewById(R.id.firstFragment);
        button_second=findViewById(R.id.secondFragment);
        button_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new FirstFragment());
            }
        });
        button_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFragment(new SecondFragment());
            }
        });
    }
        private void loadFragment(Fragment fragment) {
            FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container_fragments,fragment);
            fragmentTransaction.commit();
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_webView:
                startActivity(new Intent(MainActivity2.this,MainActivity3.class));

                Toast.makeText(this, "Web View", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}