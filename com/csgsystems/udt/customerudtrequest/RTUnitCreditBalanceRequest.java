/*
 * Generated code DO NOT EDIT
 * Generated file: RTUnitCreditBalanceRequest.java
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
public final class RTUnitCreditBalanceRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RTUnitCreditBalanceRequest (String request, RTUnitCreditBalanceRequestMethod method) {
    initialize(request, "RTUnitCreditBalance", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RTUnitCreditBalanceRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountInternalIdForHierarchyRTUnitCreditBalanceQuery(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setGranularityForHierarchyRTUnitCreditBalanceQuery(Integer data) {
    if (data != null) {
      addInput("Granularity", data);
    }
  }
  public void setGranularityForRTUnitCreditBalanceQuery(Integer data) {
    if (data != null) {
      addInput("Granularity", data);
    }
  }
  public void setIsPrepaidForRTUnitCreditBalanceQuery(Integer data) {
    if (data != null) {
      addInput("IsPrepaid", data);
    }
  }
  public void setServiceInternalIdForRTUnitCreditBalanceQuery(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForRTUnitCreditBalanceQuery(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public HierarchyRTUnitCreditBalanceQueryOutputData getHierarchyRTUnitCreditBalanceQueryOutputDataHierarchyRTUnitCreditBalanceQueryOutputDataFromHierarchyRTUnitCreditBalanceQuery() {
    return HierarchyRTUnitCreditBalanceQueryOutputHelper.fromMap(outputMap);
  }
  public RTUnitCreditBalanceQueryOutputData getRTUnitCreditBalanceQueryOutputDataRTUnitCreditBalanceQueryOutputDataFromRTUnitCreditBalanceQuery() {
    return RTUnitCreditBalanceQueryOutputHelper.fromMap(outputMap);
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
  public void setGranularity(Integer data) {
    if (data != null) {
      addInput("Granularity", data);
    }
  }
  /**
   @deprecated
   */
  public HierarchyRTUnitCreditBalanceQueryOutputData getHierarchyRTUnitCreditBalanceQueryOutputData() {
    return HierarchyRTUnitCreditBalanceQueryOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setIsPrepaid(Integer data) {
    if (data != null) {
      addInput("IsPrepaid", data);
    }
  }
  /**
   @deprecated
   */
  public RTUnitCreditBalanceQueryOutputData getRTUnitCreditBalanceQueryOutputData() {
    return RTUnitCreditBalanceQueryOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setServiceInternalId(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceInternalIdResets(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
}
