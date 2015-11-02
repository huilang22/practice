/*
 * Generated code DO NOT EDIT
 * Generated file: SlaMeasurementTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SlaMeasurementTypeRequestMethod implements UdtMethod {
  private String method = null;
  private SlaMeasurementTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SlaMeasurementTypeCreate method */
  public static final SlaMeasurementTypeRequestMethod SLA_MEASUREMENT_TYPE_CREATE = new SlaMeasurementTypeRequestMethod("SlaMeasurementTypeCreate");
  /** Variable representing the SlaMeasurementTypeDelete method */
  public static final SlaMeasurementTypeRequestMethod SLA_MEASUREMENT_TYPE_DELETE = new SlaMeasurementTypeRequestMethod("SlaMeasurementTypeDelete");
  /** Variable representing the SlaMeasurementTypeFind method */
  public static final SlaMeasurementTypeRequestMethod SLA_MEASUREMENT_TYPE_FIND = new SlaMeasurementTypeRequestMethod("SlaMeasurementTypeFind");
  /** Variable representing the SlaMeasurementTypeGet method */
  public static final SlaMeasurementTypeRequestMethod SLA_MEASUREMENT_TYPE_GET = new SlaMeasurementTypeRequestMethod("SlaMeasurementTypeGet");
  /** Variable representing the SlaMeasurementTypeUpdate method */
  public static final SlaMeasurementTypeRequestMethod SLA_MEASUREMENT_TYPE_UPDATE = new SlaMeasurementTypeRequestMethod("SlaMeasurementTypeUpdate");
}
