package com.example.homework3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.TaskViewHolder>{

    LayoutInflater layoutInflater;
    List<TaskModel> moviesList ;

    public Adapter (Context context, List<TaskModel> moviesList){
        this.moviesList = moviesList;
        this.layoutInflater = LayoutInflater.from(context);
    }



    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_task, parent,false);
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        holder.bind(moviesList.get(position));
//          TaskModel taskModel = TaskModel.
//          holder.image_item_task.setImageResource(position);
//          holder.txt_title_item_task.setText(moviesList.get(position));
//          holder.txt_item_task.setText(moviesList.get(position));
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class TaskViewHolder extends RecyclerView.ViewHolder {

        ImageView image_item_task;
        TextView txt_title_item_task, txt_item_task;


        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            image_item_task = itemView.findViewById(R.id.image_item_task);
            txt_title_item_task = itemView.findViewById(R.id.txt_title_item_task);
            txt_item_task = itemView.findViewById(R.id.txt_item_task);
        }

        public void bind(TaskModel taskModel) {
            txt_title_item_task.setText(taskModel.getTitle());
            txt_item_task.setText(taskModel.getDescription());
            image_item_task.setImageResource(taskModel.getImage());
        }
    }
}
