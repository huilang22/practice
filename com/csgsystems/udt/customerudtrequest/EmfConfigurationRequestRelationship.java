/*
 * Generated code DO NOT EDIT
 * Generated file: EmfConfigurationRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class EmfConfigurationRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private EmfConfigurationRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the EmfConfiguration_OrderedService_Ref relationship */
  public static final EmfConfigurationRequestRelationship EMF_CONFIGURATION__ORDERED_SERVICE__REF = new EmfConfigurationRequestRelationship("EmfConfiguration_OrderedService_Ref");
  /** Variable representing the EmfConfiguration_Service_Ref relationship */
  public static final EmfConfigurationRequestRelationship EMF_CONFIGURATION__SERVICE__REF = new EmfConfigurationRequestRelationship("EmfConfiguration_Service_Ref");
}
