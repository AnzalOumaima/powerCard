package com.elastic.powercard.dao;

import com.elastic.powercard.beans.PowerCard;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PowerCardDao extends ElasticsearchRepository<PowerCard,String> {
    public PowerCard findByAuthorizationID(String authorizationID);
}
