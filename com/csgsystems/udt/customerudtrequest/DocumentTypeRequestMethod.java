/*
 * Generated code DO NOT EDIT
 * Generated file: DocumentTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DocumentTypeRequestMethod implements UdtMethod {
  private String method = null;
  private DocumentTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DocumentTypeCreate method */
  public static final DocumentTypeRequestMethod DOCUMENT_TYPE_CREATE = new DocumentTypeRequestMethod("DocumentTypeCreate");
  /** Variable representing the DocumentTypeDelete method */
  public static final DocumentTypeRequestMethod DOCUMENT_TYPE_DELETE = new DocumentTypeRequestMethod("DocumentTypeDelete");
  /** Variable representing the DocumentTypeFind method */
  public static final DocumentTypeRequestMethod DOCUMENT_TYPE_FIND = new DocumentTypeRequestMethod("DocumentTypeFind");
  /** Variable representing the DocumentTypeGet method */
  public static final DocumentTypeRequestMethod DOCUMENT_TYPE_GET = new DocumentTypeRequestMethod("DocumentTypeGet");
  /** Variable representing the DocumentTypeUpdate method */
  public static final DocumentTypeRequestMethod DOCUMENT_TYPE_UPDATE = new DocumentTypeRequestMethod("DocumentTypeUpdate");
}
