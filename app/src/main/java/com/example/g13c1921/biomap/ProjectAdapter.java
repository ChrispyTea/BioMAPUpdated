package com.example.g13c1921.biomap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by g13c1921 on 2016-05-30.
 */
public class ProjectAdapter extends ArrayAdapter<Project>{

    public static class ViewHolder{
        TextView name;
        ImageView projicon;
    }

    public ProjectAdapter (Context context, ArrayList<Project> projects){
        super(context,0, projects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //get data item at given position
        Project project = getItem(position);

        ViewHolder viewHolder;

        if (convertView ==null) {

            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.select_project,
                    parent, false);

            viewHolder.name = (TextView) convertView.findViewById(R.id.project_name);
            viewHolder.projicon = (ImageView) convertView.findViewById(R.id.project_icon);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }



        viewHolder.name.setText(project.getProjname());
        viewHolder.projicon.setImageResource(project.getAssociatedDrawable());
        return convertView;
    }

}
