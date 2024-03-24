package com.techacademy;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

        @GetMapping("/")
        public String index() {
            return "Hello SpringBoot!";
        }

        @GetMapping("/dayofweek/{val1}")
        public String DayOfWeek(@PathVariable String val1) {

            String year_string = val1.substring(0,4);
            String month_string = val1.substring(4,6);
            String day_string = val1.substring(6,8);

            int year = Integer.parseInt(year_string);
            int month = Integer.parseInt(month_string);
            int day = Integer.parseInt(day_string);

            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month - 1, day);
            System.out.println(year_string + "年" + month_string+ "月" + day_string + "日" );

            int week = calendar.get(Calendar.DAY_OF_WEEK);

            switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY: return "実行結果 : " + "SUNDAY";
            case Calendar.MONDAY: return "実行結果 : " + "MONDAY";
            case Calendar.TUESDAY: return "実行結果 : " + "TUESDAY";
            case Calendar.WEDNESDAY: return "実行結果 : " + "WEDNESDAY";
            case Calendar.THURSDAY: return "実行結果 : " + "THURSDAY";
            case Calendar.FRIDAY: return "実行結果 : " + "FRIDAY";
            case Calendar.SATURDAY: return "実行結果 : " + "SATURDAY";
            }
            return "実行結果: " + week;
        }

        @GetMapping("/plus/{val1}/{val2}")
        public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
            int tasu = 0;
            tasu = val1 + val2;
            return "実行結果: " + tasu;
        }

        @GetMapping("/minus/{val1}/{val2}")
        public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
            int hiku = 0;
            hiku = val1 - val2;
            return "実行結果: " + hiku;
        }

        @GetMapping("/times/{val1}/{val2}")
        public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
            int kake = 0;
            kake = val1 * val2;
            return "実行結果: " + kake;
        }

        @GetMapping("/divide/{val1}/{val2}")
        public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
            int waru = 0;
            waru = val1 / val2;
            return "実行結果: " + waru;
        }

}