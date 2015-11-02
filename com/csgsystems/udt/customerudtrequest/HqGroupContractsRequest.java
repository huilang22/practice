/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupContractsRequest.java
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
public final class HqGroupContractsRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public HqGroupContractsRequest (String request, HqGroupContractsRequestMethod method) {
    initialize(request, "HqGroupContracts", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (HqGroupContractsRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setHqGroupContractsForHqGroupContractsCreate(HqGroupContractsObjectData data) {
    if (data != null) {
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(data, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }
  public void setContractViewIdForHqGroupContractsDelete(Integer data) {
    if (data != null) {
      addInput("ContractViewId", data);
    }
  }
  public void setHqGroupContractsForHqGroupContractsDelete(HqGroupContractsObjectData data) {
    if (data != null) {
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(data, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }
  public void setHqGroupContractsForHqGroupContractsFind(HqGroupContractsObjectFilter data) {
    if (data != null) {
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(data, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }
  public void setHqGroupContractsForHqGroupContractsGet(HqGroupContractsObjectData data) {
    if (data != null) {
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(data, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }
  public void setHqGroupContractsForHqGroupContractsUpdate(HqGroupContractsObjectData data) {
    if (data != null) {
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(data, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }
  public HqGroupContractsObjectData getHqGroupContractsObjectDataHqGroupContractsFromHqGroupContractsCreate() {
    return HqGroupContractsObjectHelper.fromMap(outputMap, "HqGroupContracts");
  }
  public HqGroupContractsObjectData getHqGroupContractsObjectDataHqGroupContractsFromHqGroupContractsDelete() {
    return HqGroupContractsObjectHelper.fromMap(outputMap, "HqGroupContracts");
  }
  public HqGroupContractsObjectDataList getHqGroupContractsObjectDataHqGroupContractsFromHqGroupContractsFind() {
    return HqGroupContractsObjectHelper.fromMapList(outputMap, "HqGroupContractsList");
  }
  public HqGroupContractsObjectData getHqGroupContractsObjectDataHqGroupContractsFromHqGroupContractsGet() {
    return HqGroupContractsObjectHelper.fromMap(outputMap, "HqGroupContracts");
  }
  public HqGroupContractsObjectData getHqGroupContractsObjectDataHqGroupContractsFromHqGroupContractsUpdate() {
    return HqGroupContractsObjectHelper.fromMap(outputMap, "HqGroupContracts");
  }
  /**
   @deprecated
   */
  public void setContractViewId(Integer data) {
    if (data != null) {
      addInput("ContractViewId", data);
    }
  }
  /**
   @deprecated
   */
  public void setHqGroupContractsObjectFilter(HqGroupContractsObjectFilter data) {
    if (data != null) {
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(data, new HashMap()).get("HqGroupContractsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHqGroupContractsObjectData(HqGroupContractsObjectData data) {
    if (data != null) {
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(data, new HashMap()).get("HqGroupContractsObject"));
    }
  }
  /**
   @deprecated
   */
  public HqGroupContractsObjectDataList getHqGroupContractsObjectDataList() {
    return HqGroupContractsObjectHelper.fromMapList(outputMap, "HqGroupContractsList");
  }
  /**
   @deprecated
   */
  public HqGroupContractsObjectData getHqGroupContractsObjectData() {
    return HqGroupContractsObjectHelper.fromMap(outputMap, "HqGroupContracts");
  }
}
