/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTemplateTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchTemplateTypeRequestMethod implements UdtMethod {
  private String method = null;
  private BatchTemplateTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchTemplateTypeFind method */
  public static final BatchTemplateTypeRequestMethod BATCH_TEMPLATE_TYPE_FIND = new BatchTemplateTypeRequestMethod("BatchTemplateTypeFind");
  /** Variable representing the BatchTemplateTypeGet method */
  public static final BatchTemplateTypeRequestMethod BATCH_TEMPLATE_TYPE_GET = new BatchTemplateTypeRequestMethod("BatchTemplateTypeGet");
}
