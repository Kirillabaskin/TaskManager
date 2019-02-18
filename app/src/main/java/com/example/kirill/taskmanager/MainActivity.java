package com.example.kirill.taskmanager;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private Context context;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        List<Task> item = new ArrayList<Task>();
        item.add(new Task(getString(R.string.first_task)));
        item.add(new Task(getString(R.string.second_task)));
        item.add(new Task(getString(R.string.third_task)));
        context = getApplicationContext();
        TaskAdaptor adaptor = new TaskAdaptor(context,item);
        listView.setAdapter(adaptor);
    }

}
