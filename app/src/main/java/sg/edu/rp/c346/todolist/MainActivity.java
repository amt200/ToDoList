package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
ListView lvTodo;
CustomAdapter ca;
ArrayList<ToDo> todoAL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ca = new CustomAdapter(MainActivity.this, R.layout.row, todoAL);
        lvTodo = findViewById(R.id.listViewToDo);
        todoAL.add(new ToDo("MSA", Calendar.getInstance()));
        todoAL.add(new ToDo("Go for haircut",Calendar.getInstance()));
        lvTodo.setAdapter(ca);
        ca.notifyDataSetChanged();
    }
}
