/*
 * Generated code DO NOT EDIT
 * Generated file: StatisticTypeRefRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class StatisticTypeRefRequestMethod implements UdtMethod {
  private String method = null;
  private StatisticTypeRefRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the StatisticTypeRefFind method */
  public static final StatisticTypeRefRequestMethod STATISTIC_TYPE_REF_FIND = new StatisticTypeRefRequestMethod("StatisticTypeRefFind");
  /** Variable representing the StatisticTypeRefGet method */
  public static final StatisticTypeRefRequestMethod STATISTIC_TYPE_REF_GET = new StatisticTypeRefRequestMethod("StatisticTypeRefGet");
}
