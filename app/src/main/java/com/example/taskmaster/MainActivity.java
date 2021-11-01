package com.example.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.addTask);
        button1.setOnClickListener(new View.OnClickListener() {

    @Override
            public void onClick(View view){
        Intent intent1 = new Intent(MainActivity.this, Page2.class);
        startActivity(intent1);
    }

        });

        Button button2Page1 = findViewById(R.id.button3);
        button2Page1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent2 = new Intent(MainActivity.this, Page3.class);
                startActivity(intent2);
            }

        });


        Button buttonSettings = findViewById(R.id.SettingsButton);
        buttonSettings.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                Intent intent3 = new Intent(MainActivity.this, SettingsPage.class);
                startActivity(intent3);
            }

        });
///////////////////////////////////////////////////////////////////////////////////

        Button task1Button = findViewById(R.id.Task1Button);
        task1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent4 = new Intent(MainActivity.this, TaskDetailPage.class);
                String task1 = task1Button.getText().toString();


                intent4.putExtra("title", task1);

                startActivity(intent4);



            }



        });

        Button task2Button = findViewById(R.id.Task2Button);
        task2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent5 = new Intent(MainActivity.this, TaskDetailPage.class);
                String task2 = task2Button.getText().toString();


                intent5.putExtra("title", task2);

                startActivity(intent5);



            }

        });


        Button task3Button = findViewById(R.id.Task3Button);
        task3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent6 = new Intent(MainActivity.this, TaskDetailPage.class);
                String task3 = task3Button.getText().toString();


                intent6.putExtra("title", task3);

                startActivity(intent6);



            }





        });

   /////////////////////////////////////////////////////////






    }



    public void getTask1(View view) {
        Intent taskDetail = new Intent(this,TaskDetailPage.class);
        taskDetail.putExtra("title", "Task1");
        startActivity(taskDetail);
    }


    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String enteredName = sharedPreferences.getString("EnteredText","Write the name");

        TextView tasks = findViewById(R.id.Message);
        tasks.setText(enteredName + "'s Tasks");
    }


    }




