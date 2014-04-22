package com.inkglobal.techtest;

import static com.inkglobal.techtest.Utils.buildLights;

/**
 * User: lantao.yan
 * Date: 22/04/2014
 */
public class TopTwoRowsBuilder {

  static final int ROW_DIGITS = 4;

  public String build(int hour) {
    int firstRowRedLightCounts = hour / 5;
    int secondRowRedLightCounts = hour % 5;
    return buildRow(firstRowRedLightCounts) + Constant.SEPARATOR + buildRow(secondRowRedLightCounts);
  }

  private String buildRow(int redLightCounts) {
    return buildRedLights(redLightCounts) + buildOff(ROW_DIGITS - redLightCounts);
  }

  private String buildRedLights(int redLightCounts) {
    return buildLights(redLightCounts, Constant.RED);
  }

  private String buildOff(int offCount) {
    return buildLights(offCount, Constant.OFF);
  }
}
