package com.example.kirill.taskmanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Switch;
import android.widget.TextView;

import java.util.List;

public class TaskAdaptor extends BaseAdapter {
    private List<Task> list;
    private LayoutInflater layoutInflater;

    public TaskAdaptor(Context context,List<Task> list){
        this.list = list;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount(){
        return list.size();
    }
    @Override
    public Object getItem(int position){
        return list.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent){
        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item_layout, parent, false);
        }
        Task task=getTask(position);

        TextView txtTask = view.findViewById(R.id.txtTask);
        txtTask.setText(task.getTitle());

        return view;
    }
    private Task getTask(int position){
        return (Task)getItem(position);
    }
}
