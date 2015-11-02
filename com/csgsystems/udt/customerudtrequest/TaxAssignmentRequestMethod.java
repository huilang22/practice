/*
 * Generated code DO NOT EDIT
 * Generated file: TaxAssignmentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class TaxAssignmentRequestMethod implements UdtMethod {
  private String method = null;
  private TaxAssignmentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the TaxAssignmentFind method */
  public static final TaxAssignmentRequestMethod TAX_ASSIGNMENT_FIND = new TaxAssignmentRequestMethod("TaxAssignmentFind");
  /** Variable representing the TaxAssignmentGet method */
  public static final TaxAssignmentRequestMethod TAX_ASSIGNMENT_GET = new TaxAssignmentRequestMethod("TaxAssignmentGet");
}
