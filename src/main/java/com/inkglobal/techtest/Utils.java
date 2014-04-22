package com.inkglobal.techtest;

/**
 * User: lantao.yan
 * Date: 22/04/2014
 */
public class Utils {
  public static String buildLights(int count, String light) {
    StringBuilder result = new StringBuilder(count);
    for (int i=0; i<count; i++) {
      result.append(light);
    }
    return result.toString();
  }
}
