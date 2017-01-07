package ua.alexandroid1.alex.domainModel;

import java.util.Calendar;

/**
 * Created by Oleksandr on 07.01.2017.
 */
public class MyDataObject {
   // private final long id;

    private Calendar time;
    private String message;
    public MyDataObject(/*long id, */Calendar time, String message) {
        //this.id = id;
        this.time = time;
        this.message = message;
    }

/*    public long getId() {
        return id;
    }*/

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
