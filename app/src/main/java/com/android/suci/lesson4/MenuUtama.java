package com.android.suci.lesson4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {
        private static final String TAG_ACTIVITY =
                MenuUtama.class.getSimpleName();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu_utama);
        }
        public void onRadioButtonClicked(View view) {
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();
            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.dineIn:
                    if (checked)
                    // Same day service
                    {
                        displayToast(getString(R.string.chosen) +
                                getString(R.string.Dine_In));
                    }
                    break;
                case R.id.takeAway:
                    if (checked)
                        // Next day delivery
                        displayToast(getString(R.string.chosen) +
                                getString(R.string.Take_Away));
                    break;
                default:
                    Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked));
                    break;
            }
        }
        public void displayToast(String message) {
            Toast.makeText(getApplicationContext(), message,
                    Toast.LENGTH_SHORT).show();
        }
        public void onClickOrder(View view) {
            // apabila memilih Dine In dan klik pesan sekarang akan menampilkan pesan Dine In
            if (((RadioButton)findViewById(R.id.dineIn)).isChecked()){
                Intent intent = new Intent(this, DineIn.class);
                Toast.makeText(this, "Dine In", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                // apabila memilih Take Away dan klik pesan sekarang akan menampilkan pesan Take Away
            }else if (((RadioButton)findViewById(R.id.takeAway)).isChecked()){
                Intent intent = new Intent(this, DineIn.class);
                Toast.makeText(this, "Dine In", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                // apabila memilih Take Away dan klik pesan sekarang akan menampilkan pesan Take Away
            }else if (((RadioButton)findViewById(R.id.takeAway)).isChecked()){
                Intent intent = new Intent(this, TakeAway.class);
                Toast.makeText(this, "Take Away", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }else{
                Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();
            }
        }

        public void onPesanSekarang(View view) {
            // apabila memilih Dine In dan klik pesan sekarang akan menampilkan pesan Dine In
            if (((RadioButton)findViewById(R.id.dineIn)).isChecked()){
                Intent intent = new Intent(this, DineIn.class);
                Toast.makeText(this, "Dine In", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                // apabila memilih Take Away dan klik pesan sekarang akan menampilkan pesan Take Away
            }else if (((RadioButton)findViewById(R.id.takeAway)).isChecked()){
                Intent intent = new Intent(this, TakeAway.class);
                Toast.makeText(this, "Take Away", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }else{
                Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();
            }
        }

}

