package com.asashka.instagrama;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FragmentContainerView fragmentContainerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.main_botton_nav);
        fragmentContainerView = findViewById(R.id.main_conteiner);
        bottomNavigationView.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {

            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.main_conteiner, new HomeFragment())
                                .commit();
                        break;
                    case R.id.menu_search:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.main_conteiner, new SearchFragment())
                                .commit();
                        break;
                    case R.id.menu_like:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.main_conteiner, new LakeFragment())
                                .commit();
                        break;
                    case R.id.menu_gallery:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.main_conteiner, new GalleryFragment())
                                .commit();
                        break;
                    case R.id.menu_profile:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.main_conteiner, new ProfileFragment())
                                .commit();
                        break;
                }
                return;
            }
        });
    }
}

