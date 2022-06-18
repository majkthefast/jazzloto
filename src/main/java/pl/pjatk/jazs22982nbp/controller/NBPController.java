package pl.pjatk.jazs22982nbp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.jazs22982nbp.data.RateQueryResult;
import pl.pjatk.jazs22982nbp.service.NBPService;


@RestController
@RequestMapping("/nbp")
public class NBPController {

    public NBPService ratesService;

    NBPController(NBPService ratesService) {
        this.ratesService = ratesService;
    }


    /*@GetMapping("/last/{number}/")
    public ResponseEntity<RateQueryResult> getRatesByLastDays(@PathVariable int numberOfDays) {
        return ResponseEntity.ok(this.ratesService.getRatesByLastDays(numberOfDays));
    }*/

    @GetMapping("/{effectiveDate}")
    public ResponseEntity<RateQueryResult> getGoldRateByDate(@PathVariable String date){
        return ResponseEntity.ok(this.ratesService.getGoldRateByDate(date));
    }
}
