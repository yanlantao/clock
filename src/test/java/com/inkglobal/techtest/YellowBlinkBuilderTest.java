package com.inkglobal.techtest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: lantao.yan
 * Date: 22/04/2014
 */
public class YellowBlinkBuilderTest {
  YellowBlinkBuilder sut = new YellowBlinkBuilder();

  @Test
  public void should_build_blink_correctly() {
    assertEquals("O", sut.build(1));
    assertEquals("Y", sut.build(0));
  }
}
