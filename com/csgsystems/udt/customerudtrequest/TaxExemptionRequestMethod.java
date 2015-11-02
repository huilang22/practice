/*
 * Generated code DO NOT EDIT
 * Generated file: TaxExemptionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class TaxExemptionRequestMethod implements UdtMethod {
  private String method = null;
  private TaxExemptionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the TaxExemptionCreate method */
  public static final TaxExemptionRequestMethod TAX_EXEMPTION_CREATE = new TaxExemptionRequestMethod("TaxExemptionCreate");
  /** Variable representing the TaxExemptionDelete method */
  public static final TaxExemptionRequestMethod TAX_EXEMPTION_DELETE = new TaxExemptionRequestMethod("TaxExemptionDelete");
  /** Variable representing the TaxExemptionDeleteList method */
  public static final TaxExemptionRequestMethod TAX_EXEMPTION_DELETE_LIST = new TaxExemptionRequestMethod("TaxExemptionDeleteList");
  /** Variable representing the TaxExemptionFind method */
  public static final TaxExemptionRequestMethod TAX_EXEMPTION_FIND = new TaxExemptionRequestMethod("TaxExemptionFind");
  /** Variable representing the TaxExemptionGet method */
  public static final TaxExemptionRequestMethod TAX_EXEMPTION_GET = new TaxExemptionRequestMethod("TaxExemptionGet");
  /** Variable representing the TaxExemptionUpdate method */
  public static final TaxExemptionRequestMethod TAX_EXEMPTION_UPDATE = new TaxExemptionRequestMethod("TaxExemptionUpdate");
}
