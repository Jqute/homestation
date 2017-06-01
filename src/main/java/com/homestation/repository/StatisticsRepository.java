package com.homestation.repository;

import com.homestation.dto.Statistics;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author olesya.daderko
 */
public interface StatisticsRepository extends MongoRepository<Statistics, String> {

    Statistics findByDate(String date);

}
