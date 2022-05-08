package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Optional;

public class TimeZoneChangeCheck {

 //   private static final String TIME_FORMAT = "EEE MMM dd HH:mm:ss zzzz yyyy"; // TARGETING
    private static final String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
    private static final String UTC_TIME_ZONE_ID = "UTC";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(TIME_FORMAT);

    public static void main(String[] args) throws ParseException {
        String targetTimeZone = "America/Phoenix";
        String dateInString =  "2018-11-01 08:21:00.000";   //yyyy-MM-dd HH:mm:ss.SSS
        System.out.println("===========================================");
        System.out.println("Input Date - " + dateInString);
        //System.out.println("===========================================");
      //  Date outputDate = convertTimeBasedOnTimeZoneAndTimePattern(dateInString,UTC_TIME_ZONE_ID,targetTimeZone,TIME_FORMAT,TIME_FORMAT);
        //System.out.println( "API 1 :- DATE -" + outputDate);
 //       String output = new TimeZoneChangeCheck().convertUTCToTimeZone(dateInString,targetTimeZone);
        System.out.println(new TimeZoneChangeCheck().convertDateAndTimeAsPerELTimeZone(dateInString,targetTimeZone));

        UTCCalendar calendar = new UTCCalendar();
        calendar.setFromDateString(dateInString);
        System.out.println(new TimeZoneChangeCheck().convertDateAndTimeAsPerELTimeZone(calendar.getDateAsString(),targetTimeZone));


//        System.out.println("===========================================");
//     //   System.out.println( "API 2 :- DATE -" +  new TimeZoneChangeCheck().convertDateAndTimeAsPerELTimeZone(dateInString,targetTimeZone));
//        System.out.println("===========================================");
    }

    private static Date getDateFromString(String dateAsString){
        try {
            return new SimpleDateFormat(TIME_FORMAT).parse(dateAsString);
        } catch (ParseException e) {
            System.out.println("Error");
            return null;
        }
    }


    public static Date convertTimeBasedOnTimeZoneAndTimePattern(
            String dateTime,String fromTimeZone, String toTimeZone, String originalTimePattern, String timePattern) {
        DateTimeFormatter formatterNew = DateTimeFormatter.ofPattern(timePattern);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(originalTimePattern);

        TemporalAccessor temporalAccessor = formatter.parse(dateTime);
        ZoneId z = ZoneId.of(fromTimeZone);
        LocalDateTime localDateTime = LocalDateTime.from(temporalAccessor);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, z);
        Instant instant = Instant.from(zonedDateTime);
        ZonedDateTime fromZonedDateTime = instant.atZone(ZoneId.of(toTimeZone));
        System.out.println("API 1 :- DATE STRING -" + fromZonedDateTime.format(formatterNew)); // correct time
        return  getDateFromString(String.valueOf(fromZonedDateTime.toInstant()));
    }

    public static Date getInputDate() throws ParseException {
        String dateInString =  "2018-11-01 08:21:00.000";   //yyyy-MM-dd HH:mm:ss.SSS
        SimpleDateFormat formatter = new SimpleDateFormat(TIME_FORMAT);
        return formatter.parse(dateInString);
    }

    private Date convertDateAndTimeAsPerELTimeZone(String dateAndTime, String timeZone) {
        Date convertedDateTime;
        String dateTimeString = convertUTCToTimeZone(dateAndTime.toString(),timeZone);
     //   System.out.println("API 2 :- DATE STRING -" + dateTimeString);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TIME_FORMAT);
        try{
            convertedDateTime = simpleDateFormat.parse(dateTimeString);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return convertedDateTime;
    }

    private String convertUTCToTimeZone(String utcTime,String timeZoneId){
        LocalDateTime localDateTime = getLocalDateTimeFromUTC(utcTime);
        String targetTimeZoneId = Optional.ofNullable(timeZoneId).orElse(ZoneId.systemDefault().getId());
        return Optional.ofNullable(localDateTime)
                .map(this::getUTCTimeZone)
                .map(zonedDateTime -> getFormatedDateAndTime(targetTimeZoneId, zonedDateTime))
                .orElse("Not Found");
    }

    private String getFormatedDateAndTime(String targetTimeZoneId, ZonedDateTime zonedDateTime) {
        return zonedDateTime.withZoneSameInstant(ZoneId.of(targetTimeZoneId)).format(formatter);
    }

    private  ZonedDateTime getUTCTimeZone(LocalDateTime ldt) {
        return ZonedDateTime.of(ldt, ZoneId.of(UTC_TIME_ZONE_ID));
    }

    private LocalDateTime getLocalDateTimeFromUTC(String utcTime) {
        try {
            return LocalDateTime.from(formatter.parse(utcTime));
        }catch (Exception e){
            return LocalDateTime.now();
        }
    }
}
