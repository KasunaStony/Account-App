package com.example.maruiling.roughcopy01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class statisticsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics_page);
        hideSystemUI();
    }

    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    public void changeToMainPage(View view){
        Intent intent = new Intent(this, MainPage.class);
        startActivity(intent);
    }

    public void changeToBudgetPage(View view){
        Intent intent = new Intent(this, budgetPage.class);
        startActivity(intent);
    }

    public void changeToAddPage(View view){
        Intent intent = new Intent(this, addPage.class);
        startActivity(intent);
    }

    public void changeToStatisticsPage(View view){
        Intent intent = new Intent(this, statisticsPage.class);
        startActivity(intent);
    }

    public void changeToSettingPage(View view){
        Intent intent = new Intent(this, settingPage.class);
        startActivity(intent);
    }

}
