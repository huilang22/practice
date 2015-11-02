/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerServiceCenterRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class CustomerServiceCenterRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private CustomerServiceCenterRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the CustomerServiceCenter_Account_Ref relationship */
  public static final CustomerServiceCenterRequestRelationship CUSTOMER_SERVICE_CENTER__ACCOUNT__REF = new CustomerServiceCenterRequestRelationship("CustomerServiceCenter_Account_Ref");
}
