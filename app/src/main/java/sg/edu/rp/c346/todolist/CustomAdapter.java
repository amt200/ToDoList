package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDo> versionList;

    public CustomAdapter(Context context, int id, ArrayList<ToDo> objects) {
        super(context, id, objects);
        parent_context = context;
        layout_id = id;
        versionList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvtitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvdatetime = rowView.findViewById(R.id.textViewDateTime);

        // Obtain the Android Version information based on the position
        ToDo todo = versionList.get(position);

        // Set values to the TextView to display the corresponding information
        tvtitle.setText(todo.getTitle());
        tvdatetime.setText(todo.getDatetime().toString());

        return rowView;
    }
}
