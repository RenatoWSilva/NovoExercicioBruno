package com.exemplo.exercicio.exercicion2.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.exemplo.exercicion2.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void fazPost1(View view) {

        Intent intent = new Intent(this, PostActivity.class);
        startActivity(intent);

    }

    public void fazAlbum1(View view) {

        Intent intent = new Intent(this, AlbumActivity.class);
        startActivity(intent);

    }

    public void fazTodo1(View view) {

        Intent intent = new Intent(this, TodoActivity.class);
        startActivity(intent);

    }

}
