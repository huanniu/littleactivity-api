package com.beststudio.la.rest.resource;

import com.beststudio.la.model.Activities;
import com.beststudio.la.model.Activity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/activities")
public class ActivityResource {
    @GET
    public Response activities() {
        return Response.ok(generateActivities(), MediaType.APPLICATION_JSON).build();
    }

    private Activities generateActivities() {
        Activity activity1 = new Activity();
        activity1.setTitle("Tennis Club 1");
        activity1.setImg("http://besttennis.co.uk/wp-content/uploads/2018/03/BT99.jpg");

        Activity activity2 = new Activity();
        activity2.setTitle("Tennis Club 2");
        activity2.setImg("http://besttennis.co.uk/wp-content/uploads/2018/03/BT99.jpg");

        Activity activity3 = new Activity();
        activity3.setTitle("Tennis Club 3");
        activity3.setImg("http://besttennis.co.uk/wp-content/uploads/2018/03/BT99.jpg");

        List<Activity> activityList = new ArrayList<Activity>();
        activityList.add(activity1);
        activityList.add(activity2);
        activityList.add(activity3);

        Activities activities = new Activities();
        activities.setActivities(activityList);
        return activities;
    }

    private String listActivities() {
        String activities = "{\"activities\":[" +
                "{\"title\": \"Tennis Club 1\", \"img\": \"http://besttennis.co.uk/wp-content/uploads/2018/03/BT99.jpg\"}," +
                "{\"title\": \"Tennis Club 2\", \"img\": \"http://besttennis.co.uk/wp-content/uploads/2018/03/BT99.jpg\"}," +
                "{\"title\": \"Tennis Club 3\", \"img\": \"http://besttennis.co.uk/wp-content/uploads/2018/03/BT99.jpg\"}" +
                "]}";
        return activities;
    }
}
