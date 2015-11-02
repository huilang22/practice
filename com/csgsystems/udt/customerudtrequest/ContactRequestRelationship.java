/*
 * Generated code DO NOT EDIT
 * Generated file: ContactRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ContactRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ContactRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Contact_Refund_Ref relationship */
  public static final ContactRequestRelationship CONTACT__REFUND__REF = new ContactRequestRelationship("Contact_Refund_Ref");
}
