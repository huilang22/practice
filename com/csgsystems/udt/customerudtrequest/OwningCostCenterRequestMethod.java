/*
 * Generated code DO NOT EDIT
 * Generated file: OwningCostCenterRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OwningCostCenterRequestMethod implements UdtMethod {
  private String method = null;
  private OwningCostCenterRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OwningCostCenterCreate method */
  public static final OwningCostCenterRequestMethod OWNING_COST_CENTER_CREATE = new OwningCostCenterRequestMethod("OwningCostCenterCreate");
  /** Variable representing the OwningCostCenterDelete method */
  public static final OwningCostCenterRequestMethod OWNING_COST_CENTER_DELETE = new OwningCostCenterRequestMethod("OwningCostCenterDelete");
  /** Variable representing the OwningCostCenterFind method */
  public static final OwningCostCenterRequestMethod OWNING_COST_CENTER_FIND = new OwningCostCenterRequestMethod("OwningCostCenterFind");
  /** Variable representing the OwningCostCenterGet method */
  public static final OwningCostCenterRequestMethod OWNING_COST_CENTER_GET = new OwningCostCenterRequestMethod("OwningCostCenterGet");
  /** Variable representing the OwningCostCenterUpdate method */
  public static final OwningCostCenterRequestMethod OWNING_COST_CENTER_UPDATE = new OwningCostCenterRequestMethod("OwningCostCenterUpdate");
}
