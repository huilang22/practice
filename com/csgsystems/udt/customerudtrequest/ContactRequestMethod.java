/*
 * Generated code DO NOT EDIT
 * Generated file: ContactRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ContactRequestMethod implements UdtMethod {
  private String method = null;
  private ContactRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ContactCreate method */
  public static final ContactRequestMethod CONTACT_CREATE = new ContactRequestMethod("ContactCreate");
  /** Variable representing the ContactFind method */
  public static final ContactRequestMethod CONTACT_FIND = new ContactRequestMethod("ContactFind");
  /** Variable representing the ContactGet method */
  public static final ContactRequestMethod CONTACT_GET = new ContactRequestMethod("ContactGet");
  /** Variable representing the ContactUpdate method */
  public static final ContactRequestMethod CONTACT_UPDATE = new ContactRequestMethod("ContactUpdate");
}
