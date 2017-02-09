package com.homestation.dto;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Represents the house statistics.
 */
public class Statistics {
    @Id
    String date;

    List<Observation> observations;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Observation> getObservations() {
        return observations;
    }

    public void setObservations(List<Observation> observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "date='" + date + '\'' +
                ", observations=" + observations +
                '}';
    }
}
