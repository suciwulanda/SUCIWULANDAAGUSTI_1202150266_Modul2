package com.android.suci.lesson4;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.*;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void onPilihPemesanan(View view) {
        Intent intent = new Intent(this, MenuAdapter.class);
        startActivity(intent);
    }
}