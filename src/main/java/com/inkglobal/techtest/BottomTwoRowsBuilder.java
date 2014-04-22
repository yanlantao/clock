package com.inkglobal.techtest;

import static com.inkglobal.techtest.Utils.buildLights;

/**
 * User: lantao.yan
 * Date: 22/04/2014
 */
public class BottomTwoRowsBuilder {
  static final int FIRST_ROW_DIGITS  = 11;
  static final int SECOND_ROW_DIGITS = 4;

  public String build(int minutes) {
    return buildFirstRow(minutes) + Constant.SEPARATOR + buildSecondRow(minutes % 5);
  }

  private String buildSecondRow(int lightCount) {
    return buildLights(lightCount, Constant.YELLOW) + buildOff(SECOND_ROW_DIGITS - lightCount);
  }

  private String buildFirstRow(int minutes) {
    StringBuilder result = new StringBuilder(FIRST_ROW_DIGITS);
    int countOfQuarter = minutes / 15;
    result.append(buildQuarter(countOfQuarter));
    result.append(buildFiveMinutes((minutes - countOfQuarter * 15) / 5));
    result.append(buildOff(result.capacity() - result.length()));
    return result.toString();
  }

  private String buildOff(int count) {
    return Utils.buildLights(count, Constant.OFF);
  }

  private String buildFiveMinutes(int count) {
    return buildLights(count, Constant.YELLOW);
  }

  private String buildQuarter(int countOfQuarter) {
    StringBuilder result = new StringBuilder(countOfQuarter * 3);
    for (int i = 0; i < countOfQuarter; i++) {
      result.append(Constant.YELLOW).append(Constant.YELLOW).append(Constant.RED);
    }
    return result.toString();
  }
}
