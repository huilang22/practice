/*
 * Generated code DO NOT EDIT
 * Generated file: DocumentTypeRefRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DocumentTypeRefRequestMethod implements UdtMethod {
  private String method = null;
  private DocumentTypeRefRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DtTypeRefGet method */
  public static final DocumentTypeRefRequestMethod DT_TYPE_REF_GET = new DocumentTypeRefRequestMethod("DtTypeRefGet");
}
