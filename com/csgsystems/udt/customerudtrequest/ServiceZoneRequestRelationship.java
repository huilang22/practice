/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceZoneRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ServiceZoneRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ServiceZoneRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the ServiceZone_OrderedService_Ref relationship */
  public static final ServiceZoneRequestRelationship SERVICE_ZONE__ORDERED_SERVICE__REF = new ServiceZoneRequestRelationship("ServiceZone_OrderedService_Ref");
  /** Variable representing the ServiceZone_Service_Ref relationship */
  public static final ServiceZoneRequestRelationship SERVICE_ZONE__SERVICE__REF = new ServiceZoneRequestRelationship("ServiceZone_Service_Ref");
}
