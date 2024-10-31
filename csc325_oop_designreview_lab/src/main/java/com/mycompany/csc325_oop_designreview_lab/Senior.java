package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    private int credits;

    public Senior(String name, short age, int credits) {
        super(name, age);
        if (credits < 85) {
            throw new IllegalArgumentException("A Senior must have at least 85 credits.");
        }
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        if (credits >= 85) {
            this.credits = credits;
        } else {
            throw new IllegalArgumentException("A Senior must have at least 85 credits.");
        }
    }

    @Override
    public String toString() {
        return "Senior [Name=" + getName() + ", Age=" + getAge() + ", Credits=" + credits + "]";
    }
}
