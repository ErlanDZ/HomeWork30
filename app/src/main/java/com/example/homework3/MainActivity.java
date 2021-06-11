package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
      RecyclerView recyclerView;
      Adapter adapter;
      List<TaskModel> moviesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moviesList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new Adapter(this,moviesList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        moviesList.add(new TaskModel("Первая заповедь МАНАСА","Национальная честь и патриотизм",R.drawable.flag));
        moviesList.add(new TaskModel("Вторая заповедь МАНАСА","Единство и сплоченность нации",R.drawable.edinstvo));
        moviesList.add(new TaskModel("Третья заповедь МАНАСА", "Межнациональное согласие, дружба и сотрудничество", R.drawable.mir));
        moviesList.add(new TaskModel("Четвертая заповедь МАНАСА", "Укрепление и защита кыргызской государственности",R.drawable.kgz));
        moviesList.add(new TaskModel("Пятая заповедь МАНАСА", "Гуманизм, великодушие, терпимость",R.drawable.imaje));
        moviesList.add(new TaskModel("Шестая заповедь МАНАСА", "Гармония с природой", R.drawable.priroda));
        moviesList.add(new TaskModel("Седьмая заповедь МАНАСА", "Неутомимый труд, стремление достичь всех благ за счет умения и знаний",R.drawable.mozg));




    }
}