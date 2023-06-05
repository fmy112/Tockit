package com.hjnu.bean;

public class SeatInfo {
    private String train_no;
    private String train_number;
    private String carriage_no;
    private String seat_type;
    private int seat_count;

    public SeatInfo(String train_no, String train_number, String carriage_no, String seat_type, int seat_count) {
        this.train_no = train_no;
        this.train_number = train_number;
        this.carriage_no = carriage_no;
        this.seat_type = seat_type;
        this.seat_count = seat_count;
    }

    public String getTrain_no() {
        return train_no;
    }

    public void setTrain_no(String train_no) {
        this.train_no = train_no;
    }

    public String getTrain_number() {
        return train_number;
    }

    public void setTrain_number(String train_number) {
        this.train_number = train_number;
    }

    public String getCarriage_no() {
        return carriage_no;
    }

    public void setCarriage_no(String carriage_no) {
        this.carriage_no = carriage_no;
    }

    public String getSeat_type() {
        return seat_type;
    }

    public void setSeat_type(String seat_type) {
        this.seat_type = seat_type;
    }

    public int getSeat_count() {
        return seat_count;
    }

    public void setSeat_count(int seat_count) {
        this.seat_count = seat_count;
    }
}