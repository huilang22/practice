/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRequest.java
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
public final class CorridorRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CorridorRequest (String request, CorridorRequestMethod method) {
    initialize(request, "Corridor", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CorridorRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, CorridorRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, CorridorRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, CorridorRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, CorridorRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, CorridorRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, CorridorRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, CorridorRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, CorridorRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setCorridorForCorridorConvert(CorridorObjectData data) {
    if (data != null) {
      addInput("Corridor", CorridorObjectHelper.toMap(data, new HashMap(), "Corridor").get("Corridor"));
    }
  }
  public void setCorridorForCorridorCreate(CorridorObjectData data) {
    if (data != null) {
      addInput("Corridor", CorridorObjectHelper.toMap(data, new HashMap(), "Corridor").get("Corridor"));
    }
  }
  public void setCDCeaseDateForCorridorDelete(Date data) {
    if (data != null) {
      addInput("CDCeaseDate", data);
    }
  }
  public void setCorridorForCorridorDelete(CorridorObjectKeyData data) {
    if (data != null) {
      addInput("Corridor", CorridorObjectKeyHelper.toMap(data, new HashMap(), "Corridor").get("Corridor"));
    }
  }
  public void setCorridorForCorridorDeleteList(CorridorObjectFilter data) {
    if (data != null) {
      addInput("Corridor", CorridorObjectHelper.toMap(data, new HashMap(), "Corridor").get("Corridor"));
    }
  }
  public void setInactiveDateForCorridorDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setCorridorForCorridorFind(CorridorObjectFilter data) {
    if (data != null) {
      addInput("Corridor", CorridorObjectHelper.toMap(data, new HashMap(), "Corridor").get("Corridor"));
    }
  }
  public void setCorridorForCorridorGet(CorridorObjectKeyData data) {
    if (data != null) {
      addInput("Corridor", CorridorObjectKeyHelper.toMap(data, new HashMap(), "Corridor").get("Corridor"));
    }
  }
  public void setCorridorForCorridorUpdate(CorridorObjectData data) {
    if (data != null) {
      addInput("Corridor", CorridorObjectHelper.toMap(data, new HashMap(), "Corridor").get("Corridor"));
    }
  }
  public CorridorObjectData getCorridorObjectDataCorridorFromCorridorConvert() {
    return CorridorObjectHelper.fromMap(outputMap, "Corridor");
  }
  public CorridorObjectData getCorridorObjectDataCorridorFromCorridorCreate() {
    return CorridorObjectHelper.fromMap(outputMap, "Corridor");
  }
  public CorridorObjectData getCorridorObjectDataCorridorFromCorridorDelete() {
    return CorridorObjectHelper.fromMap(outputMap, "Corridor");
  }
  public CorridorObjectDataList getCorridorObjectDataCorridorFromCorridorDeleteList() {
    return CorridorObjectHelper.fromMapList(outputMap, "CorridorList");
  }
  public CorridorObjectDataList getCorridorObjectDataCorridorFromCorridorFind() {
    return CorridorObjectHelper.fromMapList(outputMap, "CorridorList");
  }
  public CorridorObjectData getCorridorObjectDataCorridorFromCorridorGet() {
    return CorridorObjectHelper.fromMap(outputMap, "Corridor");
  }
  public CorridorObjectData getCorridorObjectDataCorridorFromCorridorUpdate() {
    return CorridorObjectHelper.fromMap(outputMap, "Corridor");
  }
  /**
   @deprecated
   */
  public void setCDCeaseDate(Date data) {
    if (data != null) {
      addInput("CDCeaseDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setCorridorObjectFilter(CorridorObjectFilter data) {
    if (data != null) {
      addInput("Corridor", CorridorObjectHelper.toMap(data, new HashMap()).get("CorridorObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCorridorObjectData(CorridorObjectData data) {
    if (data != null) {
      addInput("Corridor", CorridorObjectHelper.toMap(data, new HashMap()).get("CorridorObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCorridorObjectKeyData(CorridorObjectKeyData data) {
    if (data != null) {
      addInput("Corridor", CorridorObjectKeyHelper.toMap(data, new HashMap()).get("CorridorObject"));
    }
  }
  /**
   @deprecated
   */
  public CorridorObjectDataList getCorridorObjectDataList() {
    return CorridorObjectHelper.fromMapList(outputMap, "CorridorList");
  }
  /**
   @deprecated
   */
  public CorridorObjectData getCorridorObjectData() {
    return CorridorObjectHelper.fromMap(outputMap, "Corridor");
  }
  /**
   @deprecated
   */
  public void setInactiveDate(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
}
