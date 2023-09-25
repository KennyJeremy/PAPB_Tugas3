package com.example.tugas3;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ImageView beardImageView;
    private ImageView alisImageView;
    private ImageView kumisImageView;
    private ImageView hairImageView;
    private CheckBox showBeardCheckBox;
    private CheckBox showAlisCheckBox;
    private CheckBox showKumisCheckBox;
    private CheckBox showHairCheckBox;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beardImageView = findViewById(R.id.Beard);
        alisImageView = findViewById(R.id.Alis);
        kumisImageView = findViewById(R.id.Kumis);
        hairImageView = findViewById(R.id.Hair);
        showBeardCheckBox = findViewById(R.id.showBeardCheckBox);
        showAlisCheckBox = findViewById(R.id.showAlisCheckBox);
        showKumisCheckBox = findViewById(R.id.showKumisCheckBox);
        showHairCheckBox = findViewById(R.id.showHairCheckBox);

        showBeardCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (showBeardCheckBox.isChecked()) {
                    beardImageView.setVisibility(View.VISIBLE);
                } else {
                    beardImageView.setVisibility(View.GONE);
                }
            }
        });

        // Mengatur listener CheckBox untuk menampilkan/menghilangkan ImageView Alis
        showAlisCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (showAlisCheckBox.isChecked()) {
                    alisImageView.setVisibility(View.VISIBLE);
                } else {
                    alisImageView.setVisibility(View.GONE);
                }
            }
        });

        // Mengatur listener CheckBox untuk menampilkan/menghilangkan ImageView Kumis
        showKumisCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (showKumisCheckBox.isChecked()) {
                    kumisImageView.setVisibility(View.VISIBLE);
                } else {
                    kumisImageView.setVisibility(View.GONE);
                }
            }
        });

        // Mengatur listener CheckBox untuk menampilkan/menghilangkan ImageView Hair
        showHairCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (showHairCheckBox.isChecked()) {
                    hairImageView.setVisibility(View.VISIBLE);
                } else {
                    hairImageView.setVisibility(View.GONE);
                }
            }
        });
    }
}