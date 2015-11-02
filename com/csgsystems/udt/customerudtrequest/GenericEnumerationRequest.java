/*
 * Generated code DO NOT EDIT
 * Generated file: GenericEnumerationRequest.java
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
public final class GenericEnumerationRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GenericEnumerationRequest (String request, GenericEnumerationRequestMethod method) {
    initialize(request, "GenericEnumeration", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GenericEnumerationRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGenericEnumerationForGenericEnumerationCreate(GEObjectData data) {
    if (data != null) {
      addInput("GenericEnumeration", GEObjectHelper.toMap(data, new HashMap(), "GenericEnumeration").get("GenericEnumeration"));
    }
  }
  public void setGenericEnumerationForGenericEnumerationDelete(GEObjectKeyData data) {
    if (data != null) {
      addInput("GenericEnumeration", GEObjectKeyHelper.toMap(data, new HashMap(), "GenericEnumeration").get("GenericEnumeration"));
    }
  }
  public void setGenericEnumerationForGenericEnumerationFind(GEObjectFilter data) {
    if (data != null) {
      addInput("GenericEnumeration", GEObjectHelper.toMap(data, new HashMap(), "GenericEnumeration").get("GenericEnumeration"));
    }
  }
  public void setGenericEnumerationForGenericEnumerationGet(GEObjectKeyData data) {
    if (data != null) {
      addInput("GenericEnumeration", GEObjectKeyHelper.toMap(data, new HashMap(), "GenericEnumeration").get("GenericEnumeration"));
    }
  }
  public void setGenericEnumerationForGenericEnumerationUpdate(GEObjectData data) {
    if (data != null) {
      addInput("GenericEnumeration", GEObjectHelper.toMap(data, new HashMap(), "GenericEnumeration").get("GenericEnumeration"));
    }
  }
  public GEObjectData getGEObjectDataGenericEnumerationFromGenericEnumerationCreate() {
    return GEObjectHelper.fromMap(outputMap, "GenericEnumeration");
  }
  public GEObjectData getGEObjectDataGenericEnumerationFromGenericEnumerationDelete() {
    return GEObjectHelper.fromMap(outputMap, "GenericEnumeration");
  }
  public GEObjectDataList getGEObjectDataGenericEnumerationFromGenericEnumerationFind() {
    return GEObjectHelper.fromMapList(outputMap, "GenericEnumerationList");
  }
  public GEObjectData getGEObjectDataGenericEnumerationFromGenericEnumerationGet() {
    return GEObjectHelper.fromMap(outputMap, "GenericEnumeration");
  }
  public GEObjectData getGEObjectDataGenericEnumerationFromGenericEnumerationUpdate() {
    return GEObjectHelper.fromMap(outputMap, "GenericEnumeration");
  }
  /**
   @deprecated
   */
  public void setGEObjectFilter(GEObjectFilter data) {
    if (data != null) {
      addInput("GE", GEObjectHelper.toMap(data, new HashMap()).get("GEObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGEObjectData(GEObjectData data) {
    if (data != null) {
      addInput("GenericEnumeration", GEObjectHelper.toMap(data, new HashMap()).get("GEObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGEObjectKeyData(GEObjectKeyData data) {
    if (data != null) {
      addInput("GenericEnumeration", GEObjectKeyHelper.toMap(data, new HashMap()).get("GEObject"));
    }
  }
  /**
   @deprecated
   */
  public GEObjectDataList getGEObjectDataList() {
    return GEObjectHelper.fromMapList(outputMap, "GEList");
  }
  /**
   @deprecated
   */
  public GEObjectData getGEObjectData() {
    return GEObjectHelper.fromMap(outputMap, "GenericEnumeration");
  }
}
