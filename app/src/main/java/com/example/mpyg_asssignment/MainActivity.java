package com.example.mpyg_asssignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.badge.ExperimentalBadgeUtils;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

@ExperimentalBadgeUtils public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null){
            replaceFragment(new HomeScreenFragment());
        }
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home_icon:
                        replaceFragment(new HomeScreenFragment());
                        break;
                    case R.id.progress_icon:
                        replaceFragment(new ProgressScreenFragment());
                        break;
                    case R.id.settings_icon:
                        replaceFragment(new SettingsScreenFragment());
                        break;
                    case R.id.profile_icon:
                        replaceFragment(new ProfileScreenFragment());
                        break;
                }
                return true;
            }
        });
    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainerFrameLayout, fragment);
        fragmentTransaction.commit();
    }
}



