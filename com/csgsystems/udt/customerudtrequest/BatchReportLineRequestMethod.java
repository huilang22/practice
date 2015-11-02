/*
 * Generated code DO NOT EDIT
 * Generated file: BatchReportLineRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchReportLineRequestMethod implements UdtMethod {
  private String method = null;
  private BatchReportLineRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchReportLineCreate method */
  public static final BatchReportLineRequestMethod BATCH_REPORT_LINE_CREATE = new BatchReportLineRequestMethod("BatchReportLineCreate");
  /** Variable representing the BatchReportLineDelete method */
  public static final BatchReportLineRequestMethod BATCH_REPORT_LINE_DELETE = new BatchReportLineRequestMethod("BatchReportLineDelete");
  /** Variable representing the BatchReportLineFind method */
  public static final BatchReportLineRequestMethod BATCH_REPORT_LINE_FIND = new BatchReportLineRequestMethod("BatchReportLineFind");
  /** Variable representing the BatchReportLineGet method */
  public static final BatchReportLineRequestMethod BATCH_REPORT_LINE_GET = new BatchReportLineRequestMethod("BatchReportLineGet");
  /** Variable representing the BatchReportLineUpdate method */
  public static final BatchReportLineRequestMethod BATCH_REPORT_LINE_UPDATE = new BatchReportLineRequestMethod("BatchReportLineUpdate");
}
