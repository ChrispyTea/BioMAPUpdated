package com.example.g13c1921.biomap;


import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProjectSelectionActivityListFragment extends ListFragment {

    private ArrayList<Project> projects;
    private ProjectAdapter projectAdapter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        projects = new ArrayList<Project>();
        projects.add(new Project("BOP",Project.Theproject.BOP));
        projects.add(new Project("EchinoMAP",Project.Theproject.ECHINO));
        projects.add(new Project("FishMAP",Project.Theproject.FISH));
        projects.add(new Project("LacewingMAP",Project.Theproject.LACEWING));
        projects.add(new Project("LepiMap",Project.Theproject.LEPI));
        projects.add(new Project("MammalMAP",Project.Theproject.MAMMAL));
        projects.add(new Project("MushroomMAP",Project.Theproject.MUSHROOM));
        projects.add(new Project("OdonataMAP",Project.Theproject.ODONATA));
        projects.add(new Project("OrchidMAP",Project.Theproject.ORCHID));
        projects.add(new Project("ScorpionMAP",Project.Theproject.SCORPION));
        projects.add(new Project("SpiderMAP",Project.Theproject.SPIDER));

        projectAdapter = new ProjectAdapter(getActivity(), projects);

        setListAdapter(projectAdapter);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        launchProjectActivity(position);
    }

    private void launchProjectActivity(int position){

        Project project = (Project) getListAdapter().getItem(position);
        Intent intent = new Intent(getActivity(), GeoDetailsActivity.class);
        intent.putExtra(ProjectSelectionActivity.PROJECT_NAME_EXTRA, project.getProjname());
        intent.putExtra(ProjectSelectionActivity.PROJECT_ID_EXTRA, project.getProjID());
        intent.putExtra(ProjectSelectionActivity.PROJECT_THEPROJECT_EXTRA, project.getTheproject());
        startActivity(intent);
    }

}
