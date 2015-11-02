/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationDetailAssocRequest.java
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

import com.csgsystems.iv.data.*;
public final class InvsLocationDetailAssocRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsLocationDetailAssocRequest (String request, InvsLocationDetailAssocRequestMethod method) {
    initialize(request, "InvsLocationDetailAssoc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsLocationDetailAssocRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsLocationDetailAssocForInvsLocationDetailAssocCreate(InvsLocationDetailAssocObjectData data) {
    if (data != null) {
      addInput("InvsLocationDetailAssoc", InvsLocationDetailAssocObjectHelper.toMap(data, new HashMap(), "InvsLocationDetailAssoc").get("InvsLocationDetailAssoc"));
    }
  }
  public void setInvsLocationDetailAssocForInvsLocationDetailAssocDelete(InvsLocationDetailAssocObjectData data) {
    if (data != null) {
      addInput("InvsLocationDetailAssoc", InvsLocationDetailAssocObjectHelper.toMap(data, new HashMap(), "InvsLocationDetailAssoc").get("InvsLocationDetailAssoc"));
    }
  }
  public void setInvsLocationDetailAssocForInvsLocationDetailAssocFind(InvsLocationTablesObjectFilter data) {
    if (data != null) {
      addInput("InvsLocationDetailAssoc", InvsLocationTablesObjectHelper.toMap(data, new HashMap(), "InvsLocationDetailAssoc").get("InvsLocationDetailAssoc"));
    }
  }
  public void setInvsLocationDetailAssocForInvsLocationDetailAssocGet(InvsLocationTablesObjectKeyData data) {
    if (data != null) {
      addInput("InvsLocationDetailAssoc", InvsLocationTablesObjectKeyHelper.toMap(data, new HashMap(), "InvsLocationDetailAssoc").get("InvsLocationDetailAssoc"));
    }
  }
  public InvsLocationDetailAssocObjectData getInvsLocationDetailAssocObjectDataInvsLocationDetailAssocFromInvsLocationDetailAssocCreate() {
    return InvsLocationDetailAssocObjectHelper.fromMap(outputMap, "InvsLocationDetailAssoc");
  }
  public InvsLocationTablesObjectDataList getInvsLocationTablesObjectDataInvsLocationDetailAssocFromInvsLocationDetailAssocFind() {
    return InvsLocationTablesObjectHelper.fromMapList(outputMap, "InvsLocationDetailAssocList");
  }
  public InvsLocationTablesObjectData getInvsLocationTablesObjectDataInvsLocationDetailAssocFromInvsLocationDetailAssocGet() {
    return InvsLocationTablesObjectHelper.fromMap(outputMap, "InvsLocationDetailAssoc");
  }
  /**
   @deprecated
   */
  public void setInvsLocationDetailAssocObjectData(InvsLocationDetailAssocObjectData data) {
    if (data != null) {
      addInput("InvsLocationDetailAssoc", InvsLocationDetailAssocObjectHelper.toMap(data, new HashMap()).get("InvsLocationDetailAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsLocationDetailAssocObjectData getInvsLocationDetailAssocObjectData() {
    return InvsLocationDetailAssocObjectHelper.fromMap(outputMap, "InvsLocationDetailAssoc");
  }
  /**
   @deprecated
   */
  public void setInvsLocationTablesObjectFilter(InvsLocationTablesObjectFilter data) {
    if (data != null) {
      addInput("InvsLocationTables", InvsLocationTablesObjectHelper.toMap(data, new HashMap()).get("InvsLocationTablesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLocationTablesObjectKeyData(InvsLocationTablesObjectKeyData data) {
    if (data != null) {
      addInput("InvsLocationDetailAssoc", InvsLocationTablesObjectKeyHelper.toMap(data, new HashMap()).get("InvsLocationTablesObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsLocationTablesObjectDataList getInvsLocationTablesObjectDataList() {
    return InvsLocationTablesObjectHelper.fromMapList(outputMap, "InvsLocationTablesList");
  }
  /**
   @deprecated
   */
  public InvsLocationTablesObjectData getInvsLocationTablesObjectData() {
    return InvsLocationTablesObjectHelper.fromMap(outputMap, "InvsLocationDetailAssoc");
  }
}
