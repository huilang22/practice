/*
 * Generated code DO NOT EDIT
 * Generated file: AddressTypeRequest.java
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
public final class AddressTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AddressTypeRequest (String request, AddressTypeRequestMethod method) {
    initialize(request, "AddressType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AddressTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressTypeForAddressTypeCreate(AddressTypeObjectData data) {
    if (data != null) {
      addInput("AddressType", AddressTypeObjectHelper.toMap(data, new HashMap(), "AddressType").get("AddressType"));
    }
  }
  public void setAddressTypeForAddressTypeFind(AddressTypeObjectFilter data) {
    if (data != null) {
      addInput("AddressType", AddressTypeObjectHelper.toMap(data, new HashMap(), "AddressType").get("AddressType"));
    }
  }
  public void setAddressTypeForAddressTypeGet(AddressTypeObjectKeyData data) {
    if (data != null) {
      addInput("AddressType", AddressTypeObjectKeyHelper.toMap(data, new HashMap(), "AddressType").get("AddressType"));
    }
  }
  public void setAddressTypeForAddressTypeUpdate(AddressTypeObjectData data) {
    if (data != null) {
      addInput("AddressType", AddressTypeObjectHelper.toMap(data, new HashMap(), "AddressType").get("AddressType"));
    }
  }
  public AddressTypeObjectData getAddressTypeObjectDataAddressTypeFromAddressTypeCreate() {
    return AddressTypeObjectHelper.fromMap(outputMap, "AddressType");
  }
  public AddressTypeObjectDataList getAddressTypeObjectDataAddressTypeFromAddressTypeFind() {
    return AddressTypeObjectHelper.fromMapList(outputMap, "AddressTypeList");
  }
  public AddressTypeObjectData getAddressTypeObjectDataAddressTypeFromAddressTypeGet() {
    return AddressTypeObjectHelper.fromMap(outputMap, "AddressType");
  }
  public AddressTypeObjectData getAddressTypeObjectDataAddressTypeFromAddressTypeUpdate() {
    return AddressTypeObjectHelper.fromMap(outputMap, "AddressType");
  }
  /**
   @deprecated
   */
  public void setAddressTypeObjectFilter(AddressTypeObjectFilter data) {
    if (data != null) {
      addInput("AddressType", AddressTypeObjectHelper.toMap(data, new HashMap()).get("AddressTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAddressTypeObjectData(AddressTypeObjectData data) {
    if (data != null) {
      addInput("AddressType", AddressTypeObjectHelper.toMap(data, new HashMap()).get("AddressTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAddressTypeObjectKeyData(AddressTypeObjectKeyData data) {
    if (data != null) {
      addInput("AddressType", AddressTypeObjectKeyHelper.toMap(data, new HashMap()).get("AddressTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public AddressTypeObjectDataList getAddressTypeObjectDataList() {
    return AddressTypeObjectHelper.fromMapList(outputMap, "AddressTypeList");
  }
  /**
   @deprecated
   */
  public AddressTypeObjectData getAddressTypeObjectData() {
    return AddressTypeObjectHelper.fromMap(outputMap, "AddressType");
  }
}
