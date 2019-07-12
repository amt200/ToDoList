package sg.edu.rp.c346.todolist;

import java.util.Calendar;

public class ToDo {
    private String title;
    private Calendar datetime;

    public ToDo(String title, Calendar datetime) {
        this.title = title;
        this.datetime = datetime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDatetime() {
        return datetime;
    }

    public void setDatetime(Calendar datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Title: " + title + '\'' +
                ", Date time: " + datetime;
    }
}
