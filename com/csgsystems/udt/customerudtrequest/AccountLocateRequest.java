/*
 * Generated code DO NOT EDIT
 * Generated file: AccountLocateRequest.java
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
public final class AccountLocateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountLocateRequest (String request, AccountLocateRequestMethod method) {
    initialize(request, "AccountLocate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountLocateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountLocateForAccountLocateFind(AccountLocateXIDObjectFilter data) {
    if (data != null) {
      addInput("AccountLocate", AccountLocateXIDObjectHelper.toMap(data, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }
  public void setAccountLocateForAccountLocateFindByAccountExtendeddata(AccountExtendedDataLocateXIDObjectFilter data) {
    if (data != null) {
      addInput("AccountLocate", AccountExtendedDataLocateXIDObjectHelper.toMap(data, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }
  public void setAlafInForAccountLocateFindByAddressId(AddressLocateXIDObjectFilter data) {
    if (data != null) {
      addInput("AlafIn", AddressLocateXIDObjectHelper.toMap(data, new HashMap(), "AlafIn").get("AlafIn"));
    }
  }
  public void setAccountLocateForAccountLocateFindByOrderNumber(OrderLocateXIDObjectFilter data) {
    if (data != null) {
      addInput("AccountLocate", OrderLocateXIDObjectHelper.toMap(data, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }
  public void setAlsedfInForAccountLocateFindByServiceExtendeddata(ServiceExtendedDataLocateXIDObjectFilter data) {
    if (data != null) {
      addInput("AlsedfIn", ServiceExtendedDataLocateXIDObjectHelper.toMap(data, new HashMap(), "AlsedfIn").get("AlsedfIn"));
    }
  }
  public void setExternalIdEquipMapForAccountLocateFindByServiceId(ServiceLocateXIDObjectFilter data) {
    if (data != null) {
      addInput("ExternalIdEquipMap", ServiceLocateXIDObjectHelper.toMap(data, new HashMap(), "ExternalIdEquipMap").get("ExternalIdEquipMap"));
    }
  }
  public void setAccountLocateForAccountLocateGet(AccountLocateObjectKeyData data) {
    if (data != null) {
      addInput("AccountLocate", AccountLocateObjectKeyHelper.toMap(data, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }
  public void setExternalIdEquipMapForAccountLocateListByServiceId(ServiceLocateXIDObjectFilter data) {
    if (data != null) {
      addInput("ExternalIdEquipMap", ServiceLocateXIDObjectHelper.toMap(data, new HashMap(), "ExternalIdEquipMap").get("ExternalIdEquipMap"));
    }
  }
  public AccountLocateXIDObjectDataList getAccountLocateXIDObjectDataAccountLocateFromAccountLocateFind() {
    return AccountLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
  public AccountLocateXIDObjectDataList getAccountLocateXIDObjectDataAccountLocateFromAccountLocateFindByAccountExtendeddata() {
    return AccountLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
  public AddressLocateXIDObjectDataList getAddressLocateXIDObjectDataAccountLocateFromAccountLocateFindByAddressId() {
    return AddressLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
  public AccountLocateXIDObjectDataList getAccountLocateXIDObjectDataAccountLocateFromAccountLocateFindByOrderNumber() {
    return AccountLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
  public AccountLocateXIDObjectDataList getAccountLocateXIDObjectDataAccountLocateFromAccountLocateFindByServiceExtendeddata() {
    return AccountLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
  public ServiceLocateXIDObjectDataList getServiceLocateXIDObjectDataAccountLocateFromAccountLocateFindByServiceId() {
    return ServiceLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
  public AccountLocateObjectData getAccountLocateObjectDataAccountLocateFromAccountLocateGet() {
    return AccountLocateObjectHelper.fromMap(outputMap, "AccountLocate");
  }
  public AccountLocateXIDObjectDataList getAccountLocateXIDObjectDataAccountLocateFromAccountLocateListByServiceId() {
    return AccountLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
  /**
   @deprecated
   */
  public void setAccountExtendedDataLocateXIDObjectFilter(AccountExtendedDataLocateXIDObjectFilter data) {
    if (data != null) {
      addInput("AccountExtendedDataLocateXID", AccountExtendedDataLocateXIDObjectHelper.toMap(data, new HashMap()).get("AccountExtendedDataLocateXIDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountLocateObjectKeyData(AccountLocateObjectKeyData data) {
    if (data != null) {
      addInput("AccountLocate", AccountLocateObjectKeyHelper.toMap(data, new HashMap()).get("AccountLocateObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountLocateObjectData getAccountLocateObjectData() {
    return AccountLocateObjectHelper.fromMap(outputMap, "AccountLocate");
  }
  /**
   @deprecated
   */
  public void setAccountLocateXIDObjectFilter(AccountLocateXIDObjectFilter data) {
    if (data != null) {
      addInput("AccountLocate", AccountLocateXIDObjectHelper.toMap(data, new HashMap()).get("AccountLocateXIDObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountLocateXIDObjectDataList getAccountLocateXIDObjectDataList() {
    return AccountLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
  /**
   @deprecated
   */
  public void setAddressLocateXIDObjectFilter(AddressLocateXIDObjectFilter data) {
    if (data != null) {
      addInput("AddressLocateXID", AddressLocateXIDObjectHelper.toMap(data, new HashMap()).get("AddressLocateXIDObject"));
    }
  }
  /**
   @deprecated
   */
  public AddressLocateXIDObjectDataList getAddressLocateXIDObjectDataList() {
    return AddressLocateXIDObjectHelper.fromMapList(outputMap, "AddressLocateXIDList");
  }
  /**
   @deprecated
   */
  public void setOrderLocateXIDObjectFilter(OrderLocateXIDObjectFilter data) {
    if (data != null) {
      addInput("OrderLocateXID", OrderLocateXIDObjectHelper.toMap(data, new HashMap()).get("OrderLocateXIDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceExtendedDataLocateXIDObjectFilter(ServiceExtendedDataLocateXIDObjectFilter data) {
    if (data != null) {
      addInput("ServiceExtendedDataLocateXID", ServiceExtendedDataLocateXIDObjectHelper.toMap(data, new HashMap()).get("ServiceExtendedDataLocateXIDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceLocateXIDObjectFilter(ServiceLocateXIDObjectFilter data) {
    if (data != null) {
      addInput("ServiceLocateXID", ServiceLocateXIDObjectHelper.toMap(data, new HashMap()).get("ServiceLocateXIDObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceLocateXIDObjectDataList getServiceLocateXIDObjectDataList() {
    return ServiceLocateXIDObjectHelper.fromMapList(outputMap, "ServiceLocateXIDList");
  }
}
