package com.example.class__3;

import static com.example.class__3.R.id.tabLayout;
import static com.example.class__3.R.id.viewPager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager2 viewPager2=findViewById(R.id.viewPager2);
        TabLayout tabLayout =findViewById(R.id.tabLayout);

        Viewpageradapter viewpageradapter= new Viewpageradapter(getSupportFragmentManager(),getLifecycle());
        viewpageradapter.addFragment(new Chat(),"Chat");
        viewpageradapter.addFragment(new Status(),"Status");
        viewpageradapter.addFragment(new Calls(),"Calls");
        viewPager2.setAdapter(viewpageradapter);

        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) ->{
            tab.setText(viewpageradapter.getPageTile(position));
        }).attach();

    }
}