/*
 * Generated code DO NOT EDIT
 * Generated file: BatchReportRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchReportRequestMethod implements UdtMethod {
  private String method = null;
  private BatchReportRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchReportCreate method */
  public static final BatchReportRequestMethod BATCH_REPORT_CREATE = new BatchReportRequestMethod("BatchReportCreate");
  /** Variable representing the BatchReportDelete method */
  public static final BatchReportRequestMethod BATCH_REPORT_DELETE = new BatchReportRequestMethod("BatchReportDelete");
  /** Variable representing the BatchReportFind method */
  public static final BatchReportRequestMethod BATCH_REPORT_FIND = new BatchReportRequestMethod("BatchReportFind");
  /** Variable representing the BatchReportGet method */
  public static final BatchReportRequestMethod BATCH_REPORT_GET = new BatchReportRequestMethod("BatchReportGet");
  /** Variable representing the BatchReportSequenceGet method */
  public static final BatchReportRequestMethod BATCH_REPORT_SEQUENCE_GET = new BatchReportRequestMethod("BatchReportSequenceGet");
  /** Variable representing the BatchReportUpdate method */
  public static final BatchReportRequestMethod BATCH_REPORT_UPDATE = new BatchReportRequestMethod("BatchReportUpdate");
}
