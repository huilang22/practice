/*
 * Generated code DO NOT EDIT
 * Generated file: BatchCategoryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchCategoryRequestMethod implements UdtMethod {
  private String method = null;
  private BatchCategoryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchCategoryCreate method */
  public static final BatchCategoryRequestMethod BATCH_CATEGORY_CREATE = new BatchCategoryRequestMethod("BatchCategoryCreate");
  /** Variable representing the BatchCategoryDelete method */
  public static final BatchCategoryRequestMethod BATCH_CATEGORY_DELETE = new BatchCategoryRequestMethod("BatchCategoryDelete");
  /** Variable representing the BatchCategoryFind method */
  public static final BatchCategoryRequestMethod BATCH_CATEGORY_FIND = new BatchCategoryRequestMethod("BatchCategoryFind");
  /** Variable representing the BatchCategoryGet method */
  public static final BatchCategoryRequestMethod BATCH_CATEGORY_GET = new BatchCategoryRequestMethod("BatchCategoryGet");
  /** Variable representing the BatchCategorySequenceGet method */
  public static final BatchCategoryRequestMethod BATCH_CATEGORY_SEQUENCE_GET = new BatchCategoryRequestMethod("BatchCategorySequenceGet");
  /** Variable representing the BatchCategoryUpdate method */
  public static final BatchCategoryRequestMethod BATCH_CATEGORY_UPDATE = new BatchCategoryRequestMethod("BatchCategoryUpdate");
}
