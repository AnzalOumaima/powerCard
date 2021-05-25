package com.elastic.powercard.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Document(indexName = "powercard-index")

public class PowerCard {
    @Id
    private String id;
    private String authorizationID;
    private Date timestamp;
    private Double consumedTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorizationID() {
        return authorizationID;
    }

    public void setAuthorizationID(String authorizationID) {
        this.authorizationID = authorizationID;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Double getConsumedTime() {
        return consumedTime;
    }

    public void setConsumedTime(Double consumedTime) {
        this.consumedTime = consumedTime;
    }
}
