package com.homestation.controller;

import com.homestation.dto.Statistics;
import com.homestation.repository.StatisticsRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller that retrieves statistics.
 */
@Controller
@RequestMapping("/statistics")
@Api(value = "/", description = "Description of API")
public class StatisticsController {

    @Autowired
    StatisticsRepository repository;

    @ApiOperation(value = "Find statistics by date", httpMethod = "GET")
    @RequestMapping("/find")
    @ResponseBody
    public Statistics findByDate(@RequestParam String date) {
        return repository.findByDate(date);
    }

    @ApiOperation(value = "Load statistics", httpMethod = "POST")
    @RequestMapping(value = "/load", method = RequestMethod.POST)
    @ResponseBody
    public void loadStatistics(@RequestBody Statistics statistics) {
        System.out.println();
        System.out.println();
        System.out.println();
        // save a couple of statistics
        repository.save(statistics);

        // fetch all statistics
        System.out.println("statistics found with findAll():");
        System.out.println("-------------------------------");
        repository.findAll().forEach(System.out::println);
        System.out.println();

        // fetch an individual statistics
        System.out.println("statistics found with findByDate('20170101'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByDate("20170101"));

        System.out.println(statistics);
    }

    @ApiOperation(value = "Delete statistics", httpMethod = "DELETE")
    @RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteAll() {
        this.repository.deleteAll();
    }

}
