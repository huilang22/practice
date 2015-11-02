/*
 * Generated code DO NOT EDIT
 * Generated file: AddressStreetDirectionalRequest.java
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

import com.csgsystems.cf.data.*;
public final class AddressStreetDirectionalRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AddressStreetDirectionalRequest (String request, AddressStreetDirectionalRequestMethod method) {
    initialize(request, "AddressStreetDirectional", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AddressStreetDirectionalRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressStreetDirectionalForAddressStreetDirectionalCreate(AddressStreetDirectionalObjectData data) {
    if (data != null) {
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(data, new HashMap(), "AddressStreetDirectional").get("AddressStreetDirectional"));
    }
  }
  public void setAddressStreetDirectionalForAddressStreetDirectionalDelete(AddressStreetDirectionalObjectData data) {
    if (data != null) {
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(data, new HashMap(), "AddressStreetDirectional").get("AddressStreetDirectional"));
    }
  }
  public void setAddressStreetDirectionalForAddressStreetDirectionalFind(AddressStreetDirectionalObjectFilter data) {
    if (data != null) {
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(data, new HashMap(), "AddressStreetDirectional").get("AddressStreetDirectional"));
    }
  }
  public void setAddressStreetDirectionalForAddressStreetDirectionalGet(AddressStreetDirectionalObjectKeyData data) {
    if (data != null) {
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectKeyHelper.toMap(data, new HashMap(), "AddressStreetDirectional").get("AddressStreetDirectional"));
    }
  }
  public void setAddressStreetDirectionalForAddressStreetDirectionalUpdate(AddressStreetDirectionalObjectData data) {
    if (data != null) {
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(data, new HashMap(), "AddressStreetDirectional").get("AddressStreetDirectional"));
    }
  }
  public AddressStreetDirectionalObjectData getAddressStreetDirectionalObjectDataAddressStreetDirectionalFromAddressStreetDirectionalCreate() {
    return AddressStreetDirectionalObjectHelper.fromMap(outputMap, "AddressStreetDirectional");
  }
  public AddressStreetDirectionalObjectDataList getAddressStreetDirectionalObjectDataAddressStreetDirectionalFromAddressStreetDirectionalFind() {
    return AddressStreetDirectionalObjectHelper.fromMapList(outputMap, "AddressStreetDirectionalList");
  }
  public AddressStreetDirectionalObjectData getAddressStreetDirectionalObjectDataAddressStreetDirectionalFromAddressStreetDirectionalGet() {
    return AddressStreetDirectionalObjectHelper.fromMap(outputMap, "AddressStreetDirectional");
  }
  public AddressStreetDirectionalObjectData getAddressStreetDirectionalObjectDataAddressStreetDirectionalFromAddressStreetDirectionalUpdate() {
    return AddressStreetDirectionalObjectHelper.fromMap(outputMap, "AddressStreetDirectional");
  }
  /**
   @deprecated
   */
  public void setAddressStreetDirectionalObjectFilter(AddressStreetDirectionalObjectFilter data) {
    if (data != null) {
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(data, new HashMap()).get("AddressStreetDirectionalObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAddressStreetDirectionalObjectData(AddressStreetDirectionalObjectData data) {
    if (data != null) {
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(data, new HashMap()).get("AddressStreetDirectionalObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAddressStreetDirectionalObjectKeyData(AddressStreetDirectionalObjectKeyData data) {
    if (data != null) {
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectKeyHelper.toMap(data, new HashMap()).get("AddressStreetDirectionalObject"));
    }
  }
  /**
   @deprecated
   */
  public AddressStreetDirectionalObjectDataList getAddressStreetDirectionalObjectDataList() {
    return AddressStreetDirectionalObjectHelper.fromMapList(outputMap, "AddressStreetDirectionalList");
  }
  /**
   @deprecated
   */
  public AddressStreetDirectionalObjectData getAddressStreetDirectionalObjectData() {
    return AddressStreetDirectionalObjectHelper.fromMap(outputMap, "AddressStreetDirectional");
  }
}
