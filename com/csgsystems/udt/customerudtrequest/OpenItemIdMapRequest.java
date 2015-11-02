/*
 * Generated code DO NOT EDIT
 * Generated file: OpenItemIdMapRequest.java
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
public final class OpenItemIdMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OpenItemIdMapRequest (String request, OpenItemIdMapRequestMethod method) {
    initialize(request, "OpenItemIdMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OpenItemIdMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, OpenItemIdMapRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, OpenItemIdMapRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountBalancesRequest request, OpenItemIdMapRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountBalancesRequest request, OpenItemIdMapRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OpenItemIdMapRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OpenItemIdMapRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountBalanceRequest request, OpenItemIdMapRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountBalanceRequest request, OpenItemIdMapRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, OpenItemIdMapRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, OpenItemIdMapRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, OpenItemIdMapRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, OpenItemIdMapRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setOpenItemIdMapForOpenItemIdMapBestMatch(OpenItemIdMapObjectData data) {
    if (data != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(data, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }
  public void setOpenItemIdMapForOpenItemIdMapCancel(OpenItemIdMapObjectData data) {
    if (data != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(data, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }
  public void setOpenItemIdMapForOpenItemIdMapCreate(OpenItemIdMapObjectData data) {
    if (data != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(data, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }
  public void setInactiveDateForOpenItemIdMapDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setInactiveDateForOpenItemIdMapDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setOpenItemIdMapFilterForOpenItemIdMapDeleteList(OpenItemIdMapObjectFilter data) {
    if (data != null) {
      addInput("OpenItemIdMapFilter", OpenItemIdMapObjectHelper.toMap(data, new HashMap(), "OpenItemIdMapFilter").get("OpenItemIdMapFilter"));
    }
  }
  public void setOpenItemIdMapForOpenItemIdMapDelete(OpenItemIdMapObjectKeyData data) {
    if (data != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectKeyHelper.toMap(data, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }
  public void setOpenItemIdMapForOpenItemIdMapFind(OpenItemIdMapObjectFilter data) {
    if (data != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(data, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }
  public void setOpenItemIdMapForOpenItemIdMapGet(OpenItemIdMapObjectKeyData data) {
    if (data != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectKeyHelper.toMap(data, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }
  public void setOpenItemIdMapForOpenItemIdMapPriorityUpdate(OpenItemIdMapObjectData data) {
    if (data != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(data, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }
  public void setOpenItemIdMapForOpenItemIdMapUpdate(OpenItemIdMapObjectData data) {
    if (data != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(data, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }
  public void setOpenItemIdMapForOrderLevelDerive(OpenItemIdMapObjectData data) {
    if (data != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(data, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }
  public OpenItemIdMapObjectData getOpenItemIdMapObjectDataOpenItemIdMapFromOpenItemIdMapBestMatch() {
    return OpenItemIdMapObjectHelper.fromMap(outputMap, "OpenItemIdMap");
  }
  public OpenItemIdMapObjectData getOpenItemIdMapObjectDataOpenItemIdMapFromOpenItemIdMapCreate() {
    return OpenItemIdMapObjectHelper.fromMap(outputMap, "OpenItemIdMap");
  }
  public OpenItemIdMapObjectData getOpenItemIdMapObjectDataOpenItemIdMapFromOpenItemIdMapDelete() {
    return OpenItemIdMapObjectHelper.fromMap(outputMap, "OpenItemIdMap");
  }
  public OpenItemIdMapObjectDataList getOpenItemIdMapObjectDataOpenItemIdMapFromOpenItemIdMapFind() {
    return OpenItemIdMapObjectHelper.fromMapList(outputMap, "OpenItemIdMapList");
  }
  public OpenItemIdMapObjectData getOpenItemIdMapObjectDataOpenItemIdMapFromOpenItemIdMapGet() {
    return OpenItemIdMapObjectHelper.fromMap(outputMap, "OpenItemIdMap");
  }
  public OpenItemIdMapObjectData getOpenItemIdMapObjectDataOpenItemIdMapFromOpenItemIdMapPriorityUpdate() {
    return OpenItemIdMapObjectHelper.fromMap(outputMap, "OpenItemIdMap");
  }
  public OpenItemIdMapObjectData getOpenItemIdMapObjectDataOpenItemIdMapFromOpenItemIdMapUpdate() {
    return OpenItemIdMapObjectHelper.fromMap(outputMap, "OpenItemIdMap");
  }
  public Integer getIntegerOrderLevelFromOrderLevelDerive() {
    return (Integer)outputMap.get("OrderLevel");
  }
  /**
   @deprecated
   */
  public void setInactiveDate(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setOpenItemIdMapObjectFilter(OpenItemIdMapObjectFilter data) {
    if (data != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(data, new HashMap()).get("OpenItemIdMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setOpenItemIdMapObjectData(OpenItemIdMapObjectData data) {
    if (data != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(data, new HashMap()).get("OpenItemIdMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setOpenItemIdMapObjectKeyData(OpenItemIdMapObjectKeyData data) {
    if (data != null) {
      addInput("OpenItemIdMap", OpenItemIdMapObjectKeyHelper.toMap(data, new HashMap()).get("OpenItemIdMapObject"));
    }
  }
  /**
   @deprecated
   */
  public OpenItemIdMapObjectDataList getOpenItemIdMapObjectDataList() {
    return OpenItemIdMapObjectHelper.fromMapList(outputMap, "OpenItemIdMapList");
  }
  /**
   @deprecated
   */
  public OpenItemIdMapObjectData getOpenItemIdMapObjectData() {
    return OpenItemIdMapObjectHelper.fromMap(outputMap, "OpenItemIdMap");
  }
  /**
   @deprecated
   */
  public Integer getOrderLevel() {
    return (Integer)outputMap.get("OrderLevel");
  }
}
