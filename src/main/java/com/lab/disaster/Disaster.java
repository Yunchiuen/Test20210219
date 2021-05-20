package com.lab.disaster;

public class Disaster {

    private String Date;
    private String EventName;
    private String FileType;

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    public String getDate() {
        return Date;
    }

    public String getEventName() {
        return EventName;
    }

    public String getFileType() {
        return FileType;
    }

    @Override
    public String toString() {
        return "Disaster{" + "Date=" + Date + ", EventName=" + EventName + ", FileType=" + FileType + '}';
    }

}