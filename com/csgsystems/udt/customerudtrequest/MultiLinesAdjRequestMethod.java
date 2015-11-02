/*
 * Generated code DO NOT EDIT
 * Generated file: MultiLinesAdjRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class MultiLinesAdjRequestMethod implements UdtMethod {
  private String method = null;
  private MultiLinesAdjRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the MultiLinesAdjDelete method */
  public static final MultiLinesAdjRequestMethod MULTI_LINES_ADJ_DELETE = new MultiLinesAdjRequestMethod("MultiLinesAdjDelete");
  /** Variable representing the MultiLinesAdjFind method */
  public static final MultiLinesAdjRequestMethod MULTI_LINES_ADJ_FIND = new MultiLinesAdjRequestMethod("MultiLinesAdjFind");
  /** Variable representing the MultiLinesAdjFindCount method */
  public static final MultiLinesAdjRequestMethod MULTI_LINES_ADJ_FIND_COUNT = new MultiLinesAdjRequestMethod("MultiLinesAdjFindCount");
}
