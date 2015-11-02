/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerIdEquipMapRequest.java
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
public final class CustomerIdEquipMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CustomerIdEquipMapRequest (String request, CustomerIdEquipMapRequestMethod method) {
    initialize(request, "CustomerIdEquipMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CustomerIdEquipMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvElementRequest request, CustomerIdEquipMapRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvElementRequest request, CustomerIdEquipMapRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, CustomerIdEquipMapRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, CustomerIdEquipMapRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, CustomerIdEquipMapRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, CustomerIdEquipMapRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, CustomerIdEquipMapRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, CustomerIdEquipMapRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, CustomerIdEquipMapRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, CustomerIdEquipMapRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setCustomerIdEquipMapForCustomerIdEquipMapCreate(CustomerIdEquipMapObjectData data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(data, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
  public void setCustomerIdEquipMapForCustomerIdEquipMapDefaultCreate(CustomerIdEquipMapObjectData data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(data, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
  public void setCustomerIdEquipMapForCustomerIdEquipMapDelete(CustomerIdEquipMapObjectKeyData data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectKeyHelper.toMap(data, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
  public void setInactiveDateForCustomerIdEquipMapDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setCustomerIdEquipMapForCustomerIdEquipMapDeleteList(CustomerIdEquipMapObjectFilter data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(data, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
  public void setInactiveDateForCustomerIdEquipMapDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setCustomerIdEquipMapForCustomerIdEquipMapDisconnectValidate(CustomerIdEquipMapObjectData data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(data, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
  public void setCustomerIdEquipMapForCustomerIdEquipMapFind(CustomerIdEquipMapObjectFilter data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(data, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
  public void setCustomerIdEquipMapForCustomerIdEquipMapFindPending(CustomerIdEquipMapObjectFilter data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(data, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
  public void setServiceOrderIdForCustomerIdEquipMapFindPending(String data) {
    if (data != null) {
      addInput("ServiceOrderId", data);
    }
  }
  public void setCustomerIdEquipMapForCustomerIdEquipMapGet(CustomerIdEquipMapObjectKeyData data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectKeyHelper.toMap(data, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
  public void setCustomerIdEquipMapForCustomerIdEquipMapIsUnique(CustomerIdEquipMapObjectData data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(data, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
  public void setCustomerIdEquipMapForCustomerIdEquipMapUpdate(CustomerIdEquipMapObjectData data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(data, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
  public void setCustomerIdEquipMapForCustomerIdEquipMapUpdateValidate(CustomerIdEquipMapObjectData data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(data, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
  public CustomerIdEquipMapObjectData getCustomerIdEquipMapObjectDataCustomerIdEquipMapFromCustomerIdEquipMapCreate() {
    return CustomerIdEquipMapObjectHelper.fromMap(outputMap, "CustomerIdEquipMap");
  }
  public CustomerIdEquipMapObjectData getCustomerIdEquipMapObjectDataCustomerIdEquipMapFromCustomerIdEquipMapDefaultCreate() {
    return CustomerIdEquipMapObjectHelper.fromMap(outputMap, "CustomerIdEquipMap");
  }
  public CustomerIdEquipMapObjectData getCustomerIdEquipMapObjectDataCustomerIdEquipMapFromCustomerIdEquipMapDelete() {
    return CustomerIdEquipMapObjectHelper.fromMap(outputMap, "CustomerIdEquipMap");
  }
  public CustomerIdEquipMapObjectDataList getCustomerIdEquipMapObjectDataCustomerIdEquipMapFromCustomerIdEquipMapDeleteList() {
    return CustomerIdEquipMapObjectHelper.fromMapList(outputMap, "CustomerIdEquipMapList");
  }
  public CustomerIdEquipMapObjectDataList getCustomerIdEquipMapObjectDataCustomerIdEquipMapFromCustomerIdEquipMapFind() {
    return CustomerIdEquipMapObjectHelper.fromMapList(outputMap, "CustomerIdEquipMapList");
  }
  public CustomerIdEquipMapObjectDataList getCustomerIdEquipMapObjectDataCustomerIdEquipMapFromCustomerIdEquipMapFindPending() {
    return CustomerIdEquipMapObjectHelper.fromMapList(outputMap, "CustomerIdEquipMapList");
  }
  public CustomerIdEquipMapObjectData getCustomerIdEquipMapObjectDataCustomerIdEquipMapFromCustomerIdEquipMapGet() {
    return CustomerIdEquipMapObjectHelper.fromMap(outputMap, "CustomerIdEquipMap");
  }
  public Integer getIntegerIsUniqueFromCustomerIdEquipMapIsUnique() {
    return (Integer)outputMap.get("IsUnique");
  }
  public CustomerIdEquipMapObjectData getCustomerIdEquipMapObjectDataCustomerIdEquipMapFromCustomerIdEquipMapUpdate() {
    return CustomerIdEquipMapObjectHelper.fromMap(outputMap, "CustomerIdEquipMap");
  }
  /**
   @deprecated
   */
  public void setCustomerIdEquipMapObjectFilter(CustomerIdEquipMapObjectFilter data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(data, new HashMap()).get("CustomerIdEquipMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCustomerIdEquipMapObjectData(CustomerIdEquipMapObjectData data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(data, new HashMap()).get("CustomerIdEquipMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCustomerIdEquipMapObjectKeyData(CustomerIdEquipMapObjectKeyData data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectKeyHelper.toMap(data, new HashMap()).get("CustomerIdEquipMapObject"));
    }
  }
  /**
   @deprecated
   */
  public CustomerIdEquipMapObjectDataList getCustomerIdEquipMapObjectDataList() {
    return CustomerIdEquipMapObjectHelper.fromMapList(outputMap, "CustomerIdEquipMapList");
  }
  /**
   @deprecated
   */
  public CustomerIdEquipMapObjectData getCustomerIdEquipMapObjectData() {
    return CustomerIdEquipMapObjectHelper.fromMap(outputMap, "CustomerIdEquipMap");
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
  public Integer getIsUnique() {
    return (Integer)outputMap.get("IsUnique");
  }
  /**
   @deprecated
   */
  public void setServiceOrderId(String data) {
    if (data != null) {
      addInput("ServiceOrderId", data);
    }
  }
}
