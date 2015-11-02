/*
 * Generated code DO NOT EDIT
 * Generated file: RevRcvCostCenterRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RevRcvCostCenterRequestMethod implements UdtMethod {
  private String method = null;
  private RevRcvCostCenterRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RevRcvCostCenterCreate method */
  public static final RevRcvCostCenterRequestMethod REV_RCV_COST_CENTER_CREATE = new RevRcvCostCenterRequestMethod("RevRcvCostCenterCreate");
  /** Variable representing the RevRcvCostCenterDelete method */
  public static final RevRcvCostCenterRequestMethod REV_RCV_COST_CENTER_DELETE = new RevRcvCostCenterRequestMethod("RevRcvCostCenterDelete");
  /** Variable representing the RevRcvCostCenterFind method */
  public static final RevRcvCostCenterRequestMethod REV_RCV_COST_CENTER_FIND = new RevRcvCostCenterRequestMethod("RevRcvCostCenterFind");
  /** Variable representing the RevRcvCostCenterGet method */
  public static final RevRcvCostCenterRequestMethod REV_RCV_COST_CENTER_GET = new RevRcvCostCenterRequestMethod("RevRcvCostCenterGet");
  /** Variable representing the RevRcvCostCenterUpdate method */
  public static final RevRcvCostCenterRequestMethod REV_RCV_COST_CENTER_UPDATE = new RevRcvCostCenterRequestMethod("RevRcvCostCenterUpdate");
}
