/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceMasterGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceMasterGroupRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceMasterGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceMasterGroupCreate method */
  public static final ServiceMasterGroupRequestMethod SERVICE_MASTER_GROUP_CREATE = new ServiceMasterGroupRequestMethod("ServiceMasterGroupCreate");
  /** Variable representing the ServiceMasterGroupFind method */
  public static final ServiceMasterGroupRequestMethod SERVICE_MASTER_GROUP_FIND = new ServiceMasterGroupRequestMethod("ServiceMasterGroupFind");
  /** Variable representing the ServiceMasterGroupGet method */
  public static final ServiceMasterGroupRequestMethod SERVICE_MASTER_GROUP_GET = new ServiceMasterGroupRequestMethod("ServiceMasterGroupGet");
  /** Variable representing the ServiceMasterGroupUpdate method */
  public static final ServiceMasterGroupRequestMethod SERVICE_MASTER_GROUP_UPDATE = new ServiceMasterGroupRequestMethod("ServiceMasterGroupUpdate");
}
