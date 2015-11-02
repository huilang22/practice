/*
 * Generated code DO NOT EDIT
 * Generated file: AdrAddressRequest.java
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

import com.csgsystems.om.data.*;
public final class AdrAddressRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AdrAddressRequest (String request, AdrAddressRequestMethod method) {
    initialize(request, "AdrAddress", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AdrAddressRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAdrAddressForAdrAddressCreate(LocalAddressObjectData data) {
    if (data != null) {
      addInput("AdrAddress", LocalAddressObjectHelper.toMap(data, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }
  public void setAdrAddressForAdrAddressCreateInternal(LocalAddressObjectData data) {
    if (data != null) {
      addInput("AdrAddress", LocalAddressObjectHelper.toMap(data, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }
  public void setAdrAddressForAdrAddressExtendedDataFind(AdrAddressObjectKeyData data) {
    if (data != null) {
      addInput("AdrAddress", AdrAddressObjectKeyHelper.toMap(data, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }
  public void setAdrAddressForAdrAddressFind(AdrAddressObjectFilter data) {
    if (data != null) {
      addInput("AdrAddress", AdrAddressObjectHelper.toMap(data, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }
  public void setAccountInternalIdForAdrAddressFindByAccount(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setAdrAddressForAdrAddressFindWithExtendedData(AdrAddressObjectFilter data) {
    if (data != null) {
      addInput("AdrAddress", AdrAddressObjectHelper.toMap(data, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }
  public void setAdrAddressForAdrAddressGet(AdrAddressObjectKeyData data) {
    if (data != null) {
      addInput("AdrAddress", AdrAddressObjectKeyHelper.toMap(data, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }
  public void setAdrAddressForAdrAddressUpdate(LocalAddressObjectData data) {
    if (data != null) {
      addInput("AdrAddress", LocalAddressObjectHelper.toMap(data, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }
  public void setAdrAddressForAdrAddressUpdateInternal(LocalAddressObjectData data) {
    if (data != null) {
      addInput("AdrAddress", LocalAddressObjectHelper.toMap(data, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }
  public LocalAddressObjectData getLocalAddressObjectDataAdrAddressFromAdrAddressCreate() {
    return LocalAddressObjectHelper.fromMap(outputMap, "AdrAddress");
  }
  public LocalAddressObjectData getLocalAddressObjectDataAdrAddressFromAdrAddressCreateInternal() {
    return LocalAddressObjectHelper.fromMap(outputMap, "AdrAddress");
  }
  public AdrAddressEDObjectDataList getAdrAddressEDObjectDataAdrAddressExtendedDataFromAdrAddressExtendedDataFind() {
    return AdrAddressEDObjectHelper.fromMapList(outputMap, "AdrAddressExtendedDataList");
  }
  public AdrAddressObjectDataList getAdrAddressObjectDataAdrAddressFromAdrAddressFind() {
    return AdrAddressObjectHelper.fromMapList(outputMap, "AdrAddressList");
  }
  public AdrAddressObjectDataList getAdrAddressObjectDataAdrAddressFromAdrAddressFindByAccount() {
    return AdrAddressObjectHelper.fromMapList(outputMap, "AdrAddressList");
  }
  public AdrAddressObjectDataList getAdrAddressObjectDataAdrAddressFromAdrAddressFindWithExtendedData() {
    return AdrAddressObjectHelper.fromMapList(outputMap, "AdrAddressList");
  }
  public AdrAddressObjectData getAdrAddressObjectDataAdrAddressFromAdrAddressGet() {
    return AdrAddressObjectHelper.fromMap(outputMap, "AdrAddress");
  }
  public LocalAddressObjectData getLocalAddressObjectDataAdrAddressFromAdrAddressUpdate() {
    return LocalAddressObjectHelper.fromMap(outputMap, "AdrAddress");
  }
  public LocalAddressObjectData getLocalAddressObjectDataAdrAddressFromAdrAddressUpdateInternal() {
    return LocalAddressObjectHelper.fromMap(outputMap, "AdrAddress");
  }
  /**
   @deprecated
   */
  public void setAccountInternalId(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public AdrAddressEDObjectDataList getAdrAddressEDObjectDataList() {
    return AdrAddressEDObjectHelper.fromMapList(outputMap, "AdrAddressList");
  }
  /**
   @deprecated
   */
  public void setAdrAddressObjectFilter(AdrAddressObjectFilter data) {
    if (data != null) {
      addInput("AdrAddress", AdrAddressObjectHelper.toMap(data, new HashMap()).get("AdrAddressObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAdrAddressObjectKeyData(AdrAddressObjectKeyData data) {
    if (data != null) {
      addInput("AdrAddress", AdrAddressObjectKeyHelper.toMap(data, new HashMap()).get("AdrAddressObject"));
    }
  }
  /**
   @deprecated
   */
  public AdrAddressObjectDataList getAdrAddressObjectDataList() {
    return AdrAddressObjectHelper.fromMapList(outputMap, "AdrAddressList");
  }
  /**
   @deprecated
   */
  public Map  getAdrAddressObjectExtendedData() {
    return AdrAddressObjectHelper.fromMap(outputMap, "AdrAddress").extendedData;
  }
  
  /**
   @deprecated
   */
  public AdrAddressObjectData getAdrAddressObjectData() {
    return AdrAddressObjectHelper.fromMap(outputMap, "AdrAddress");
  }
  /**
   @deprecated
   */
  public void setLocalAddressObjectData(LocalAddressObjectData data) {
    if (data != null) {
      addInput("AdrAddress", LocalAddressObjectHelper.toMap(data, new HashMap()).get("LocalAddressObject"));
    }
  }
  /**
   @deprecated
   */
  public LocalAddressObjectData getLocalAddressObjectData() {
    return LocalAddressObjectHelper.fromMap(outputMap, "AdrAddress");
  }
  /**
   @deprecated
   */
  public Map  getLocalAddressObjectExtendedData() {
    return LocalAddressObjectHelper.fromMap(outputMap, "AdrAddress").extendedData;
  }
  
}
