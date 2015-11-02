/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalThresholdsRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class HistoricalThresholdsRequestMethod implements UdtMethod {
  private String method = null;
  private HistoricalThresholdsRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the HistoricalThresholdsCreate method */
  public static final HistoricalThresholdsRequestMethod HISTORICAL_THRESHOLDS_CREATE = new HistoricalThresholdsRequestMethod("HistoricalThresholdsCreate");
  /** Variable representing the HistoricalThresholdsDelete method */
  public static final HistoricalThresholdsRequestMethod HISTORICAL_THRESHOLDS_DELETE = new HistoricalThresholdsRequestMethod("HistoricalThresholdsDelete");
  /** Variable representing the HistoricalThresholdsDeleteList method */
  public static final HistoricalThresholdsRequestMethod HISTORICAL_THRESHOLDS_DELETE_LIST = new HistoricalThresholdsRequestMethod("HistoricalThresholdsDeleteList");
  /** Variable representing the HistoricalThresholdsFind method */
  public static final HistoricalThresholdsRequestMethod HISTORICAL_THRESHOLDS_FIND = new HistoricalThresholdsRequestMethod("HistoricalThresholdsFind");
  /** Variable representing the HistoricalThresholdsGet method */
  public static final HistoricalThresholdsRequestMethod HISTORICAL_THRESHOLDS_GET = new HistoricalThresholdsRequestMethod("HistoricalThresholdsGet");
  /** Variable representing the HistoricalThresholdsUpdate method */
  public static final HistoricalThresholdsRequestMethod HISTORICAL_THRESHOLDS_UPDATE = new HistoricalThresholdsRequestMethod("HistoricalThresholdsUpdate");
}
