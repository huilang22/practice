/*
 * Generated code DO NOT EDIT
 * Generated file: BulkOrderRequestRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BulkOrderRequestRequestMethod implements UdtMethod {
  private String method = null;
  private BulkOrderRequestRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BulkOrderRequestByAccountCreate method */
  public static final BulkOrderRequestRequestMethod BULK_ORDER_REQUEST_BY_ACCOUNT_CREATE = new BulkOrderRequestRequestMethod("BulkOrderRequestByAccountCreate");
  /** Variable representing the BulkOrderRequestByAccountGet method */
  public static final BulkOrderRequestRequestMethod BULK_ORDER_REQUEST_BY_ACCOUNT_GET = new BulkOrderRequestRequestMethod("BulkOrderRequestByAccountGet");
  /** Variable representing the BulkOrderRequestByAccountUpdate method */
  public static final BulkOrderRequestRequestMethod BULK_ORDER_REQUEST_BY_ACCOUNT_UPDATE = new BulkOrderRequestRequestMethod("BulkOrderRequestByAccountUpdate");
  /** Variable representing the BulkOrderRequestByServiceCreate method */
  public static final BulkOrderRequestRequestMethod BULK_ORDER_REQUEST_BY_SERVICE_CREATE = new BulkOrderRequestRequestMethod("BulkOrderRequestByServiceCreate");
  /** Variable representing the BulkOrderRequestByServiceGet method */
  public static final BulkOrderRequestRequestMethod BULK_ORDER_REQUEST_BY_SERVICE_GET = new BulkOrderRequestRequestMethod("BulkOrderRequestByServiceGet");
  /** Variable representing the BulkOrderRequestByServiceUpdate method */
  public static final BulkOrderRequestRequestMethod BULK_ORDER_REQUEST_BY_SERVICE_UPDATE = new BulkOrderRequestRequestMethod("BulkOrderRequestByServiceUpdate");
}
