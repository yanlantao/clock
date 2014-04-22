package com.inkglobal.techtest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: lantao.yan
 * Date: 22/04/2014
 */
public class BottomTwoRowsBuilderTest {
  BottomTwoRowsBuilder sut = new BottomTwoRowsBuilder();

  @Test
  public void should_build_last_two_rows_correctly() {
    assertEquals("OOOOOOOOOOO OOOO", sut.build(0));
    assertEquals("YYROOOOOOOO YYOO", sut.build(17));
    assertEquals("YYRYYRYYRYY YYYY", sut.build(59));
  }
}
