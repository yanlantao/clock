package com.inkglobal.techtest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: lantao.yan
 * Date: 22/04/2014
 */
public class TopTwoRowsBuilderTest {
  TopTwoRowsBuilder sut = new TopTwoRowsBuilder();

  @Test
  public void should_build_top_two_rows_correctly() {
    assertEquals("RROO RRRO", sut.build(13));
    assertEquals("RRRR RRRO", sut.build(23));
    assertEquals("RRRR RRRR", sut.build(24));
    assertEquals("OOOO OOOO", sut.build(0));
  }
}
