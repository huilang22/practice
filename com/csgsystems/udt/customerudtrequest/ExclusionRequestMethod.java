/*
 * Generated code DO NOT EDIT
 * Generated file: ExclusionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ExclusionRequestMethod implements UdtMethod {
  private String method = null;
  private ExclusionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ExclusionCheck method */
  public static final ExclusionRequestMethod EXCLUSION_CHECK = new ExclusionRequestMethod("ExclusionCheck");
  /** Variable representing the ExclusionCreate method */
  public static final ExclusionRequestMethod EXCLUSION_CREATE = new ExclusionRequestMethod("ExclusionCreate");
  /** Variable representing the ExclusionFind method */
  public static final ExclusionRequestMethod EXCLUSION_FIND = new ExclusionRequestMethod("ExclusionFind");
  /** Variable representing the ExclusionGet method */
  public static final ExclusionRequestMethod EXCLUSION_GET = new ExclusionRequestMethod("ExclusionGet");
  /** Variable representing the ExclusionRetrieve method */
  public static final ExclusionRequestMethod EXCLUSION_RETRIEVE = new ExclusionRequestMethod("ExclusionRetrieve");
  /** Variable representing the ExclusionUpdate method */
  public static final ExclusionRequestMethod EXCLUSION_UPDATE = new ExclusionRequestMethod("ExclusionUpdate");
}
