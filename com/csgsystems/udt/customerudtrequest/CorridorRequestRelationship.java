/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class CorridorRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private CorridorRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Corridor_Account_Ref relationship */
  public static final CorridorRequestRelationship CORRIDOR__ACCOUNT__REF = new CorridorRequestRelationship("Corridor_Account_Ref");
  /** Variable representing the Corridor_Owning_Account_Ref relationship */
  public static final CorridorRequestRelationship CORRIDOR__OWNING__ACCOUNT__REF = new CorridorRequestRelationship("Corridor_Owning_Account_Ref");
  /** Variable representing the Corridor_OrderedAccount_Ref relationship */
  public static final CorridorRequestRelationship CORRIDOR__ORDERED_ACCOUNT__REF = new CorridorRequestRelationship("Corridor_OrderedAccount_Ref");
  /** Variable representing the Corridor_Owning_OrderedAccount_Ref relationship */
  public static final CorridorRequestRelationship CORRIDOR__OWNING__ORDERED_ACCOUNT__REF = new CorridorRequestRelationship("Corridor_Owning_OrderedAccount_Ref");
  /** Variable representing the Corridor_OrderedService_Ref relationship */
  public static final CorridorRequestRelationship CORRIDOR__ORDERED_SERVICE__REF = new CorridorRequestRelationship("Corridor_OrderedService_Ref");
  /** Variable representing the Corridor_Service_Ref relationship */
  public static final CorridorRequestRelationship CORRIDOR__SERVICE__REF = new CorridorRequestRelationship("Corridor_Service_Ref");
}
