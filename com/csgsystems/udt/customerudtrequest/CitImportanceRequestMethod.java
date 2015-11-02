/*
 * Generated code DO NOT EDIT
 * Generated file: CitImportanceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CitImportanceRequestMethod implements UdtMethod {
  private String method = null;
  private CitImportanceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CitImportanceCreate method */
  public static final CitImportanceRequestMethod CIT_IMPORTANCE_CREATE = new CitImportanceRequestMethod("CitImportanceCreate");
  /** Variable representing the CitImportanceDelete method */
  public static final CitImportanceRequestMethod CIT_IMPORTANCE_DELETE = new CitImportanceRequestMethod("CitImportanceDelete");
  /** Variable representing the CitImportanceFind method */
  public static final CitImportanceRequestMethod CIT_IMPORTANCE_FIND = new CitImportanceRequestMethod("CitImportanceFind");
  /** Variable representing the CitImportanceGet method */
  public static final CitImportanceRequestMethod CIT_IMPORTANCE_GET = new CitImportanceRequestMethod("CitImportanceGet");
  /** Variable representing the CitImportanceSequenceGet method */
  public static final CitImportanceRequestMethod CIT_IMPORTANCE_SEQUENCE_GET = new CitImportanceRequestMethod("CitImportanceSequenceGet");
  /** Variable representing the CitImportanceUpdate method */
  public static final CitImportanceRequestMethod CIT_IMPORTANCE_UPDATE = new CitImportanceRequestMethod("CitImportanceUpdate");
}
