import java.util.ArrayList;
import java.util.List;

class Activity {
    int start;
    int finish;

    public Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class ActivitySelection {

    // Method to select the maximum number of activities
    public static List<Activity> selectActivities(List<Activity> activities) {
        List<Activity> selectedActivities = new ArrayList<>();

        // The first activity always gets selected
        selectedActivities.add(activities.get(0));
        int lastFinishTime = activities.get(0).finish;

        // Iterate over the remaining activities
        for (int i = 1; i < activities.size(); i++) {
            // If the start time of the current activity is greater than or equal
            // to the finish time of the last selected activity, select it
            if (activities.get(i).start >= lastFinishTime) {
                selectedActivities.add(activities.get(i));
                lastFinishTime = activities.get(i).finish;
            }
        }

        return selectedActivities;
    }

    public static void main(String[] args) {
        // Example activities already sorted by finish time
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity(1, 2));
        activities.add(new Activity(3, 4));
        activities.add(new Activity(0, 6));
        activities.add(new Activity(5, 7));
        activities.add(new Activity(8, 9));
        activities.add(new Activity(5, 9));

        // Get the selected activities
        List<Activity> selectedActivities = selectActivities(activities);

        // Print the selected activities
        System.out.println("Selected Activities:");
        for (Activity activity : selectedActivities) {
            System.out.println("Activity [start=" + activity.start + ", finish=" + activity.finish + "]");
        }
    }
}
