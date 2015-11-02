/*
 * Generated code DO NOT EDIT
 * Generated file: SlaMeasurementDataRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SlaMeasurementDataRequestMethod implements UdtMethod {
  private String method = null;
  private SlaMeasurementDataRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SlaMeasurementDataFind method */
  public static final SlaMeasurementDataRequestMethod SLA_MEASUREMENT_DATA_FIND = new SlaMeasurementDataRequestMethod("SlaMeasurementDataFind");
  /** Variable representing the SlaMeasurementDataGet method */
  public static final SlaMeasurementDataRequestMethod SLA_MEASUREMENT_DATA_GET = new SlaMeasurementDataRequestMethod("SlaMeasurementDataGet");
}
