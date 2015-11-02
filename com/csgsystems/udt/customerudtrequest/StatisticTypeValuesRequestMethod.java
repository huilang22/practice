/*
 * Generated code DO NOT EDIT
 * Generated file: StatisticTypeValuesRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class StatisticTypeValuesRequestMethod implements UdtMethod {
  private String method = null;
  private StatisticTypeValuesRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the StatisticTypeValuesFind method */
  public static final StatisticTypeValuesRequestMethod STATISTIC_TYPE_VALUES_FIND = new StatisticTypeValuesRequestMethod("StatisticTypeValuesFind");
  /** Variable representing the StatisticTypeValuesGet method */
  public static final StatisticTypeValuesRequestMethod STATISTIC_TYPE_VALUES_GET = new StatisticTypeValuesRequestMethod("StatisticTypeValuesGet");
}
