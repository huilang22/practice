/*
 * Generated code DO NOT EDIT
 * Generated file: DocumentTypeRequest.java
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

import com.csgsystems.cf.data.*;
public final class DocumentTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DocumentTypeRequest (String request, DocumentTypeRequestMethod method) {
    initialize(request, "DocumentType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DocumentTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setDocumentTypeForDocumentTypeCreate(DocumentTypeObjectData data) {
    if (data != null) {
      addInput("DocumentType", DocumentTypeObjectHelper.toMap(data, new HashMap(), "DocumentType").get("DocumentType"));
    }
  }
  public void setDocumentTypeForDocumentTypeDelete(DocumentTypeObjectKeyData data) {
    if (data != null) {
      addInput("DocumentType", DocumentTypeObjectKeyHelper.toMap(data, new HashMap(), "DocumentType").get("DocumentType"));
    }
  }
  public void setDocumentTypeForDocumentTypeFind(DocumentTypeObjectFilter data) {
    if (data != null) {
      addInput("DocumentType", DocumentTypeObjectHelper.toMap(data, new HashMap(), "DocumentType").get("DocumentType"));
    }
  }
  public void setDocumentTypeForDocumentTypeGet(DocumentTypeObjectKeyData data) {
    if (data != null) {
      addInput("DocumentType", DocumentTypeObjectKeyHelper.toMap(data, new HashMap(), "DocumentType").get("DocumentType"));
    }
  }
  public void setDocumentTypeForDocumentTypeUpdate(DocumentTypeObjectData data) {
    if (data != null) {
      addInput("DocumentType", DocumentTypeObjectHelper.toMap(data, new HashMap(), "DocumentType").get("DocumentType"));
    }
  }
  public DocumentTypeObjectData getDocumentTypeObjectDataDocumentTypeFromDocumentTypeCreate() {
    return DocumentTypeObjectHelper.fromMap(outputMap, "DocumentType");
  }
  public DocumentTypeObjectData getDocumentTypeObjectDataDocumentTypeFromDocumentTypeDelete() {
    return DocumentTypeObjectHelper.fromMap(outputMap, "DocumentType");
  }
  public DocumentTypeObjectDataList getDocumentTypeObjectDataDocumentTypeFromDocumentTypeFind() {
    return DocumentTypeObjectHelper.fromMapList(outputMap, "DocumentTypeList");
  }
  public DocumentTypeObjectData getDocumentTypeObjectDataDocumentTypeFromDocumentTypeGet() {
    return DocumentTypeObjectHelper.fromMap(outputMap, "DocumentType");
  }
  public DocumentTypeObjectData getDocumentTypeObjectDataDocumentTypeFromDocumentTypeUpdate() {
    return DocumentTypeObjectHelper.fromMap(outputMap, "DocumentType");
  }
  /**
   @deprecated
   */
  public void setDocumentTypeObjectFilter(DocumentTypeObjectFilter data) {
    if (data != null) {
      addInput("DocumentType", DocumentTypeObjectHelper.toMap(data, new HashMap()).get("DocumentTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDocumentTypeObjectData(DocumentTypeObjectData data) {
    if (data != null) {
      addInput("DocumentType", DocumentTypeObjectHelper.toMap(data, new HashMap()).get("DocumentTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDocumentTypeObjectKeyData(DocumentTypeObjectKeyData data) {
    if (data != null) {
      addInput("DocumentType", DocumentTypeObjectKeyHelper.toMap(data, new HashMap()).get("DocumentTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public DocumentTypeObjectDataList getDocumentTypeObjectDataList() {
    return DocumentTypeObjectHelper.fromMapList(outputMap, "DocumentTypeList");
  }
  /**
   @deprecated
   */
  public DocumentTypeObjectData getDocumentTypeObjectData() {
    return DocumentTypeObjectHelper.fromMap(outputMap, "DocumentType");
  }
}
