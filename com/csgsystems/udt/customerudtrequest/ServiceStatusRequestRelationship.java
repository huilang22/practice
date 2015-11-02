/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceStatusRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ServiceStatusRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ServiceStatusRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the ServiceStatus_OrderedService_Ref relationship */
  public static final ServiceStatusRequestRelationship SERVICE_STATUS__ORDERED_SERVICE__REF = new ServiceStatusRequestRelationship("ServiceStatus_OrderedService_Ref");
  /** Variable representing the ServiceStatus_Service_Ref relationship */
  public static final ServiceStatusRequestRelationship SERVICE_STATUS__SERVICE__REF = new ServiceStatusRequestRelationship("ServiceStatus_Service_Ref");
}
