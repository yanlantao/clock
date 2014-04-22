package com.inkglobal.techtest;

/**
 * User: lantao.yan
 * Date: 22/04/2014
 */
public class YellowBlinkBuilder {
  public String build(int second) {
      return second % 2 == 1 ? Constant.OFF : Constant.YELLOW;
  }
}
