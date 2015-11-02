/*
 * Generated code DO NOT EDIT
 * Generated file: GlobalContractRequest.java
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
public final class GlobalContractRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GlobalContractRequest (String request, GlobalContractRequestMethod method) {
    initialize(request, "GlobalContract", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GlobalContractRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGlobalContractForGlobalContractCreate(GlobalContractObjectData data) {
    if (data != null) {
      addInput("GlobalContract", GlobalContractObjectHelper.toMap(data, new HashMap(), "GlobalContract").get("GlobalContract"));
    }
  }
  public void setGlobalContractForGlobalContractFind(GlobalContractObjectFilter data) {
    if (data != null) {
      addInput("GlobalContract", GlobalContractObjectHelper.toMap(data, new HashMap(), "GlobalContract").get("GlobalContract"));
    }
  }
  public void setGlobalContractForGlobalContractGet(GlobalContractObjectKeyData data) {
    if (data != null) {
      addInput("GlobalContract", GlobalContractObjectKeyHelper.toMap(data, new HashMap(), "GlobalContract").get("GlobalContract"));
    }
  }
  public void setGlobalContractForGlobalContractUpdate(GlobalContractObjectData data) {
    if (data != null) {
      addInput("GlobalContract", GlobalContractObjectHelper.toMap(data, new HashMap(), "GlobalContract").get("GlobalContract"));
    }
  }
  public GlobalContractObjectData getGlobalContractObjectDataGlobalContractFromGlobalContractCreate() {
    return GlobalContractObjectHelper.fromMap(outputMap, "GlobalContract");
  }
  public GlobalContractObjectDataList getGlobalContractObjectDataGlobalContractFromGlobalContractFind() {
    return GlobalContractObjectHelper.fromMapList(outputMap, "GlobalContractList");
  }
  public GlobalContractObjectData getGlobalContractObjectDataGlobalContractFromGlobalContractGet() {
    return GlobalContractObjectHelper.fromMap(outputMap, "GlobalContract");
  }
  public GlobalContractObjectData getGlobalContractObjectDataGlobalContractFromGlobalContractUpdate() {
    return GlobalContractObjectHelper.fromMap(outputMap, "GlobalContract");
  }
  /**
   @deprecated
   */
  public void setGlobalContractObjectFilter(GlobalContractObjectFilter data) {
    if (data != null) {
      addInput("GlobalContract", GlobalContractObjectHelper.toMap(data, new HashMap()).get("GlobalContractObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGlobalContractObjectData(GlobalContractObjectData data) {
    if (data != null) {
      addInput("GlobalContract", GlobalContractObjectHelper.toMap(data, new HashMap()).get("GlobalContractObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGlobalContractObjectKeyData(GlobalContractObjectKeyData data) {
    if (data != null) {
      addInput("GlobalContract", GlobalContractObjectKeyHelper.toMap(data, new HashMap()).get("GlobalContractObject"));
    }
  }
  /**
   @deprecated
   */
  public GlobalContractObjectDataList getGlobalContractObjectDataList() {
    return GlobalContractObjectHelper.fromMapList(outputMap, "GlobalContractList");
  }
  /**
   @deprecated
   */
  public Map  getGlobalContractObjectExtendedData() {
    return GlobalContractObjectHelper.fromMap(outputMap, "GlobalContract").extendedData;
  }
  
  /**
   @deprecated
   */
  public GlobalContractObjectData getGlobalContractObjectData() {
    return GlobalContractObjectHelper.fromMap(outputMap, "GlobalContract");
  }
}
