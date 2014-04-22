package com.inkglobal.techtest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Input Result 00:00:00 Y OOOO OOOO OOOOOOOOOOO OOOO
 * 13:17:01 O RROO RRRO YYROOOOOOOO YYOO
 * 23:59:59 O RRRR RRRO YYRYYRYYRYY YYYY
 * 24:00:00 Y RRRR RRRR OOOOOOOOOOO OOOO
 */
public class BerlinClockTest {
  BerlinClock sut = new BerlinClock();

  @Test
  public void should_show_correct_berlin_time() {
    assertEquals("Y OOOO OOOO OOOOOOOOOOO OOOO", sut.show("00:00:00"));
    assertEquals("O RROO RRRO YYROOOOOOOO YYOO", sut.show("13:17:01"));
    assertEquals("O RRRR RRRO YYRYYRYYRYY YYYY", sut.show("23:59:59"));
    assertEquals("Y RRRR RRRR OOOOOOOOOOO OOOO", sut.show("24:00:00"));
  }
}
