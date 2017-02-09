package com.homestation.repository;

import com.homestation.dto.Statistics;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by olesya.daderko on 2/9/17.
 */
public interface StatisticsRepository extends MongoRepository<Statistics, String> {

    Statistics findByDate(String date);

}
