/*
 * Generated code DO NOT EDIT
 * Generated file: JobResourcesRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class JobResourcesRequestMethod implements UdtMethod {
  private String method = null;
  private JobResourcesRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the JobResourcesCreate method */
  public static final JobResourcesRequestMethod JOB_RESOURCES_CREATE = new JobResourcesRequestMethod("JobResourcesCreate");
  /** Variable representing the JobResourcesFind method */
  public static final JobResourcesRequestMethod JOB_RESOURCES_FIND = new JobResourcesRequestMethod("JobResourcesFind");
  /** Variable representing the JobResourcesGet method */
  public static final JobResourcesRequestMethod JOB_RESOURCES_GET = new JobResourcesRequestMethod("JobResourcesGet");
  /** Variable representing the JobResourcesUpdate method */
  public static final JobResourcesRequestMethod JOB_RESOURCES_UPDATE = new JobResourcesRequestMethod("JobResourcesUpdate");
}
