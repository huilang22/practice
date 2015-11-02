/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceZoneRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceZoneRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceZoneRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceZoneCancel method */
  public static final ServiceZoneRequestMethod SERVICE_ZONE_CANCEL = new ServiceZoneRequestMethod("ServiceZoneCancel");
  /** Variable representing the ServiceZoneCreate method */
  public static final ServiceZoneRequestMethod SERVICE_ZONE_CREATE = new ServiceZoneRequestMethod("ServiceZoneCreate");
  /** Variable representing the ServiceZoneDelete method */
  public static final ServiceZoneRequestMethod SERVICE_ZONE_DELETE = new ServiceZoneRequestMethod("ServiceZoneDelete");
  /** Variable representing the ServiceZoneDeleteList method */
  public static final ServiceZoneRequestMethod SERVICE_ZONE_DELETE_LIST = new ServiceZoneRequestMethod("ServiceZoneDeleteList");
  /** Variable representing the ServiceZoneFind method */
  public static final ServiceZoneRequestMethod SERVICE_ZONE_FIND = new ServiceZoneRequestMethod("ServiceZoneFind");
  /** Variable representing the ServiceZoneGet method */
  public static final ServiceZoneRequestMethod SERVICE_ZONE_GET = new ServiceZoneRequestMethod("ServiceZoneGet");
  /** Variable representing the ServiceZoneUpdate method */
  public static final ServiceZoneRequestMethod SERVICE_ZONE_UPDATE = new ServiceZoneRequestMethod("ServiceZoneUpdate");
}
