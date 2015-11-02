/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerDocumentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CustomerDocumentRequestMethod implements UdtMethod {
  private String method = null;
  private CustomerDocumentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CustomerDocumentCreate method */
  public static final CustomerDocumentRequestMethod CUSTOMER_DOCUMENT_CREATE = new CustomerDocumentRequestMethod("CustomerDocumentCreate");
  /** Variable representing the CustomerDocumentDelete method */
  public static final CustomerDocumentRequestMethod CUSTOMER_DOCUMENT_DELETE = new CustomerDocumentRequestMethod("CustomerDocumentDelete");
  /** Variable representing the CustomerDocumentFind method */
  public static final CustomerDocumentRequestMethod CUSTOMER_DOCUMENT_FIND = new CustomerDocumentRequestMethod("CustomerDocumentFind");
  /** Variable representing the CustomerDocumentGet method */
  public static final CustomerDocumentRequestMethod CUSTOMER_DOCUMENT_GET = new CustomerDocumentRequestMethod("CustomerDocumentGet");
  /** Variable representing the CustomerDocumentUpdate method */
  public static final CustomerDocumentRequestMethod CUSTOMER_DOCUMENT_UPDATE = new CustomerDocumentRequestMethod("CustomerDocumentUpdate");
}
