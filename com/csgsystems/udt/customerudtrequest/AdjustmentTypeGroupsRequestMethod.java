/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentTypeGroupsRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AdjustmentTypeGroupsRequestMethod implements UdtMethod {
  private String method = null;
  private AdjustmentTypeGroupsRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AdjustmentTypeGroupsCreate method */
  public static final AdjustmentTypeGroupsRequestMethod ADJUSTMENT_TYPE_GROUPS_CREATE = new AdjustmentTypeGroupsRequestMethod("AdjustmentTypeGroupsCreate");
  /** Variable representing the AdjustmentTypeGroupsDelete method */
  public static final AdjustmentTypeGroupsRequestMethod ADJUSTMENT_TYPE_GROUPS_DELETE = new AdjustmentTypeGroupsRequestMethod("AdjustmentTypeGroupsDelete");
  /** Variable representing the AdjustmentTypeGroupsFind method */
  public static final AdjustmentTypeGroupsRequestMethod ADJUSTMENT_TYPE_GROUPS_FIND = new AdjustmentTypeGroupsRequestMethod("AdjustmentTypeGroupsFind");
  /** Variable representing the AdjustmentTypeGroupsGet method */
  public static final AdjustmentTypeGroupsRequestMethod ADJUSTMENT_TYPE_GROUPS_GET = new AdjustmentTypeGroupsRequestMethod("AdjustmentTypeGroupsGet");
}
