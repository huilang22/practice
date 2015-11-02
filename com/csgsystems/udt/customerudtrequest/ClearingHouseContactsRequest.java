/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseContactsRequest.java
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
public final class ClearingHouseContactsRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ClearingHouseContactsRequest (String request, ClearingHouseContactsRequestMethod method) {
    initialize(request, "ClearingHouseContacts", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ClearingHouseContactsRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setClearingHouseContactsForClearingHouseContactsFind(ClearingHouseContactsObjectFilter data) {
    if (data != null) {
      addInput("ClearingHouseContacts", ClearingHouseContactsObjectHelper.toMap(data, new HashMap(), "ClearingHouseContacts").get("ClearingHouseContacts"));
    }
  }
  public void setClearingHouseContactsForClearingHouseContactsFindCount(ClearingHouseContactsObjectFilter data) {
    if (data != null) {
      addInput("ClearingHouseContacts", ClearingHouseContactsObjectHelper.toMap(data, new HashMap(), "ClearingHouseContacts").get("ClearingHouseContacts"));
    }
  }
  public ClearingHouseContactsObjectDataList getClearingHouseContactsObjectDataClearingHouseContactsFromClearingHouseContactsFind() {
    return ClearingHouseContactsObjectHelper.fromMapList(outputMap, "ClearingHouseContactsList");
  }
  public Integer getIntegerTotalCountFromClearingHouseContactsFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  /**
   @deprecated
   */
  public void setClearingHouseContactsObjectFilter(ClearingHouseContactsObjectFilter data) {
    if (data != null) {
      addInput("ClearingHouseContacts", ClearingHouseContactsObjectHelper.toMap(data, new HashMap()).get("ClearingHouseContactsObject"));
    }
  }
  /**
   @deprecated
   */
  public ClearingHouseContactsObjectDataList getClearingHouseContactsObjectDataList() {
    return ClearingHouseContactsObjectHelper.fromMapList(outputMap, "ClearingHouseContactsList");
  }
  /**
   @deprecated
   */
  public Integer getTotalCount() {
    return (Integer)outputMap.get("TotalCount");
  }
}
