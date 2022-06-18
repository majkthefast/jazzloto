package pl.pjatk.jazs22982nbp.service;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.jazs22982nbp.data.Rate;
import pl.pjatk.jazs22982nbp.data.RateQueryResult;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class NBPService {

    private static final String RATES = "http://api.nbp.pl/api/cenyzlota";

    private final RestTemplate restTemplate;

    public NBPService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public RateQueryResult getGoldRateByDate(String date){
        return this.restTemplate.exchange(RATES + "/" + date + "/", HttpMethod.GET, null, RateQueryResult.class).getBody();
    }

}
