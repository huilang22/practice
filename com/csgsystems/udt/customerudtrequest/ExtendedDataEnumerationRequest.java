/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataEnumerationRequest.java
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
public final class ExtendedDataEnumerationRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ExtendedDataEnumerationRequest (String request, ExtendedDataEnumerationRequestMethod method) {
    initialize(request, "ExtendedDataEnumeration", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ExtendedDataEnumerationRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setExtendedDataEnumerationForExtendedDataEnumerationCreate(EDObjectData data) {
    if (data != null) {
      addInput("ExtendedDataEnumeration", EDObjectHelper.toMap(data, new HashMap(), "ExtendedDataEnumeration").get("ExtendedDataEnumeration"));
    }
  }
  public void setExtendedDataEnumerationForExtendedDataEnumerationDelete(EDObjectKeyData data) {
    if (data != null) {
      addInput("ExtendedDataEnumeration", EDObjectKeyHelper.toMap(data, new HashMap(), "ExtendedDataEnumeration").get("ExtendedDataEnumeration"));
    }
  }
  public void setExtendedDataEnumerationForExtendedDataEnumerationFind(EDObjectFilter data) {
    if (data != null) {
      addInput("ExtendedDataEnumeration", EDObjectHelper.toMap(data, new HashMap(), "ExtendedDataEnumeration").get("ExtendedDataEnumeration"));
    }
  }
  public void setExtendedDataEnumerationForExtendedDataEnumerationGet(EDObjectKeyData data) {
    if (data != null) {
      addInput("ExtendedDataEnumeration", EDObjectKeyHelper.toMap(data, new HashMap(), "ExtendedDataEnumeration").get("ExtendedDataEnumeration"));
    }
  }
  public void setExtendedDataEnumerationForExtendedDataEnumerationUpdate(EDObjectData data) {
    if (data != null) {
      addInput("ExtendedDataEnumeration", EDObjectHelper.toMap(data, new HashMap(), "ExtendedDataEnumeration").get("ExtendedDataEnumeration"));
    }
  }
  public EDObjectData getEDObjectDataExtendedDataEnumerationFromExtendedDataEnumerationCreate() {
    return EDObjectHelper.fromMap(outputMap, "ExtendedDataEnumeration");
  }
  public EDObjectDataList getEDObjectDataExtendedDataEnumerationFromExtendedDataEnumerationFind() {
    return EDObjectHelper.fromMapList(outputMap, "ExtendedDataEnumerationList");
  }
  public EDObjectData getEDObjectDataExtendedDataEnumerationFromExtendedDataEnumerationGet() {
    return EDObjectHelper.fromMap(outputMap, "ExtendedDataEnumeration");
  }
  public EDObjectData getEDObjectDataExtendedDataEnumerationFromExtendedDataEnumerationUpdate() {
    return EDObjectHelper.fromMap(outputMap, "ExtendedDataEnumeration");
  }
  /**
   @deprecated
   */
  public void setEDObjectFilter(EDObjectFilter data) {
    if (data != null) {
      addInput("ED", EDObjectHelper.toMap(data, new HashMap()).get("EDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEDObjectData(EDObjectData data) {
    if (data != null) {
      addInput("ExtendedDataEnumeration", EDObjectHelper.toMap(data, new HashMap()).get("EDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEDObjectKeyData(EDObjectKeyData data) {
    if (data != null) {
      addInput("ExtendedDataEnumeration", EDObjectKeyHelper.toMap(data, new HashMap()).get("EDObject"));
    }
  }
  /**
   @deprecated
   */
  public EDObjectDataList getEDObjectDataList() {
    return EDObjectHelper.fromMapList(outputMap, "EDList");
  }
  /**
   @deprecated
   */
  public EDObjectData getEDObjectData() {
    return EDObjectHelper.fromMap(outputMap, "ExtendedDataEnumeration");
  }
}
