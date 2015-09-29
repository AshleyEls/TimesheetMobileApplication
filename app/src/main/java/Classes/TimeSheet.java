package Classes;

import java.lang.reflect.Array;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
/**
 * Created by Elana on 2015/09/29.
 */

public class TimeSheet
{
    public Time StartTime;
    public Time EndTime;
    public Date Day;
    public double LunchTaken;
    public double HoursWorked;
    public double HoursLogged;
    public double HoursRemaining;
    public ArrayList<WorkItem> WorkItems = new ArrayList<WorkItem>();

    public TimeSheet()
    {

    }

    public Time getStartTime() {
        return StartTime;
    }

    public void setStartTime(Time startTime) {
        StartTime = startTime;
    }

    public Time getEndTime() {
        return EndTime;
    }

    public void setEndTime(Time endTime) {
        EndTime = endTime;
    }

    public Date getDay() {
        return Day;
    }

    public void setDay(Date day) {
        Day = day;
    }

    public double getLunchTaken() {
        return LunchTaken;
    }

    public void setLunchTaken(double lunchTaken) {
        LunchTaken = lunchTaken;
    }

    public double getHoursWorked() {
        return HoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        HoursWorked = hoursWorked;
    }

    public double getHoursLogged() {
        return HoursLogged;
    }

    public void setHoursLogged(double hoursLogged) {
        HoursLogged = hoursLogged;
    }

    public double getHoursRemaining() {
        return HoursRemaining;
    }

    public void setHoursRemaining(double hoursRemaining) {
        HoursRemaining = hoursRemaining;
    }

    public ArrayList<WorkItem> getWorkItems() {
        return WorkItems;
    }

    public void setWorkItems(ArrayList<WorkItem> workItems) {
        WorkItems = workItems;
    }
}
