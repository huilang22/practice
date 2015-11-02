/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateTableRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RbrRateTableRequestMethod implements UdtMethod {
  private String method = null;
  private RbrRateTableRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RbrRateTableCreate method */
  public static final RbrRateTableRequestMethod RBR_RATE_TABLE_CREATE = new RbrRateTableRequestMethod("RbrRateTableCreate");
  /** Variable representing the RbrRateTableDelete method */
  public static final RbrRateTableRequestMethod RBR_RATE_TABLE_DELETE = new RbrRateTableRequestMethod("RbrRateTableDelete");
  /** Variable representing the RbrRateTableFind method */
  public static final RbrRateTableRequestMethod RBR_RATE_TABLE_FIND = new RbrRateTableRequestMethod("RbrRateTableFind");
  /** Variable representing the RbrRateTableGet method */
  public static final RbrRateTableRequestMethod RBR_RATE_TABLE_GET = new RbrRateTableRequestMethod("RbrRateTableGet");
  /** Variable representing the RbrRateTableUpdate method */
  public static final RbrRateTableRequestMethod RBR_RATE_TABLE_UPDATE = new RbrRateTableRequestMethod("RbrRateTableUpdate");
}
