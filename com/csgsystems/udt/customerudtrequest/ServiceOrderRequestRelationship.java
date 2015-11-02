/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ServiceOrderRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ServiceOrderRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the ServiceOrder_Account_Ref relationship */
  public static final ServiceOrderRequestRelationship SERVICE_ORDER__ACCOUNT__REF = new ServiceOrderRequestRelationship("ServiceOrder_Account_Ref");
  /** Variable representing the ServiceOrder_Item_Ref relationship */
  public static final ServiceOrderRequestRelationship SERVICE_ORDER__ITEM__REF = new ServiceOrderRequestRelationship("ServiceOrder_Item_Ref");
  /** Variable representing the ServiceOrder_Order_Ref relationship */
  public static final ServiceOrderRequestRelationship SERVICE_ORDER__ORDER__REF = new ServiceOrderRequestRelationship("ServiceOrder_Order_Ref");
  /** Variable representing the ServiceOrder_OrderedAccount_Ref relationship */
  public static final ServiceOrderRequestRelationship SERVICE_ORDER__ORDERED_ACCOUNT__REF = new ServiceOrderRequestRelationship("ServiceOrder_OrderedAccount_Ref");
  /** Variable representing the ServiceOrder_OrderedService_Ref relationship */
  public static final ServiceOrderRequestRelationship SERVICE_ORDER__ORDERED_SERVICE__REF = new ServiceOrderRequestRelationship("ServiceOrder_OrderedService_Ref");
  /** Variable representing the ServiceOrder_Service_Ref relationship */
  public static final ServiceOrderRequestRelationship SERVICE_ORDER__SERVICE__REF = new ServiceOrderRequestRelationship("ServiceOrder_Service_Ref");
}
