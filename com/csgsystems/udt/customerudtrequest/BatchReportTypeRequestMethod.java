/*
 * Generated code DO NOT EDIT
 * Generated file: BatchReportTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchReportTypeRequestMethod implements UdtMethod {
  private String method = null;
  private BatchReportTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchReportTypeFind method */
  public static final BatchReportTypeRequestMethod BATCH_REPORT_TYPE_FIND = new BatchReportTypeRequestMethod("BatchReportTypeFind");
  /** Variable representing the BatchReportTypeGet method */
  public static final BatchReportTypeRequestMethod BATCH_REPORT_TYPE_GET = new BatchReportTypeRequestMethod("BatchReportTypeGet");
}
