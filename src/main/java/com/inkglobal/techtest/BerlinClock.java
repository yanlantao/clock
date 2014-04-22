package com.inkglobal.techtest;

/**
 * Create a representation of the Berlin Clock for a given time (hh::mm:ss).
 * <p/>
 * The Berlin Uhr (Clock) is a rather strange way to show the time. On the top of the clock
 * there is a yellow lamp that blinks on/off every two seconds. The time is calculated by adding rectangular lamps.
 * <p/>
 * The top two rows of lamps are red. These indicate the hours of a day. In the top row there are 4 red lamps.
 * Every lamp represents 5 hours. In the lower row of red lamps every lamp represents 1 hour.
 * So if two lamps of the first row and three of the second row are switched on that indicates 5+5+3=13h or 1 pm.
 * <p/>
 * The two rows of lamps at the bottom count the minutes. The first of these rows has 11 lamps, the second 4.
 * In the first row every lamp represents 5 minutes. In this first row the 3rd, 6th and 9th lamp are red and
 * indicate the first quarter, half and last quarter of an hour. The other lamps are yellow.
 * In the last row with 4 lamps every lamp represents 1 minute.
 * <p/>
 * The lamps are switched on from left to right.
 * <p/>
 * Test Cases (Y = Yellow, R = Red, O = Off)
 * Input Result 00:00:00 Y OOOO OOOO OOOOOOOOOOO OOOO
 * 13:17:01 O RROO RRRO YYROOOOOOOO YYOO
 * 23:59:59 O RRRR RRRO YYRYYRYYRYY YYYY
 * 24:00:00 Y RRRR RRRR OOOOOOOOOOO OOOO
 */
public class BerlinClock {
  private final TopTwoRowsBuilder    topTwoRowsBuilder    = new TopTwoRowsBuilder();
  private final YellowBlinkBuilder   yellowBlinkBuilder   = new YellowBlinkBuilder();
  private final BottomTwoRowsBuilder bottomTwoRowsBuilder = new BottomTwoRowsBuilder();

  public String show(String s) {
    Time time = new Time(s);
    return yellowBlinkBuilder.build(time.second) + Constant.SEPARATOR
      + topTwoRowsBuilder.build(time.hour) + Constant.SEPARATOR
      + bottomTwoRowsBuilder.build(time.minute);
  }

  static class Time {
    final int hour;
    final int minute;
    final int second;

    Time(String s) {
      String[] split = s.split(":");
      hour = Integer.parseInt(split[0]);
      minute = Integer.parseInt(split[1]);
      second = Integer.parseInt(split[2]);
    }
  }
}
