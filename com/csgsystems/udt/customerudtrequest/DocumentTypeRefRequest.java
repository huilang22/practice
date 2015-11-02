/*
 * Generated code DO NOT EDIT
 * Generated file: DocumentTypeRefRequest.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;
import java.util.Map;
import java.util.Date;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.math.BigInteger;

import com.csgsystems.bp.data.*;
public final class DocumentTypeRefRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DocumentTypeRefRequest (String request, DocumentTypeRefRequestMethod method) {
    initialize(request, "DocumentTypeRef", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DocumentTypeRefRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setDocumentTypeRefForDtTypeRefGet(DocumentTypeRefObjectKeyData data) {
    if (data != null) {
      addInput("DocumentTypeRef", DocumentTypeRefObjectKeyHelper.toMap(data, new HashMap(), "DocumentTypeRef").get("DocumentTypeRef"));
    }
  }
  public DocumentTypeRefObjectData getDocumentTypeRefObjectDataDocumentTypeRefFromDtTypeRefGet() {
    return DocumentTypeRefObjectHelper.fromMap(outputMap, "DocumentTypeRef");
  }
  /**
   @deprecated
   */
  public void setDocumentTypeRefObjectKeyData(DocumentTypeRefObjectKeyData data) {
    if (data != null) {
      addInput("DocumentTypeRef", DocumentTypeRefObjectKeyHelper.toMap(data, new HashMap()).get("DocumentTypeRefObject"));
    }
  }
  /**
   @deprecated
   */
  public DocumentTypeRefObjectData getDocumentTypeRefObjectData() {
    return DocumentTypeRefObjectHelper.fromMap(outputMap, "DocumentTypeRef");
  }
}
