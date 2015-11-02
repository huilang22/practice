/*
 * Generated code DO NOT EDIT
 * Generated file: AddressStreetSuffixRequest.java
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
public final class AddressStreetSuffixRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AddressStreetSuffixRequest (String request, AddressStreetSuffixRequestMethod method) {
    initialize(request, "AddressStreetSuffix", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AddressStreetSuffixRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressStreetSuffixForAddressStreetSuffixCreate(AddressStreetSuffixObjectData data) {
    if (data != null) {
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(data, new HashMap(), "AddressStreetSuffix").get("AddressStreetSuffix"));
    }
  }
  public void setAddressStreetSuffixForAddressStreetSuffixDelete(AddressStreetSuffixObjectData data) {
    if (data != null) {
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(data, new HashMap(), "AddressStreetSuffix").get("AddressStreetSuffix"));
    }
  }
  public void setAddressStreetSuffixForAddressStreetSuffixFind(AddressStreetSuffixObjectFilter data) {
    if (data != null) {
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(data, new HashMap(), "AddressStreetSuffix").get("AddressStreetSuffix"));
    }
  }
  public void setAddressStreetSuffixForAddressStreetSuffixGet(AddressStreetSuffixObjectKeyData data) {
    if (data != null) {
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectKeyHelper.toMap(data, new HashMap(), "AddressStreetSuffix").get("AddressStreetSuffix"));
    }
  }
  public void setAddressStreetSuffixForAddressStreetSuffixUpdate(AddressStreetSuffixObjectData data) {
    if (data != null) {
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(data, new HashMap(), "AddressStreetSuffix").get("AddressStreetSuffix"));
    }
  }
  public AddressStreetSuffixObjectData getAddressStreetSuffixObjectDataAddressStreetSuffixFromAddressStreetSuffixCreate() {
    return AddressStreetSuffixObjectHelper.fromMap(outputMap, "AddressStreetSuffix");
  }
  public AddressStreetSuffixObjectDataList getAddressStreetSuffixObjectDataAddressStreetSuffixFromAddressStreetSuffixFind() {
    return AddressStreetSuffixObjectHelper.fromMapList(outputMap, "AddressStreetSuffixList");
  }
  public AddressStreetSuffixObjectData getAddressStreetSuffixObjectDataAddressStreetSuffixFromAddressStreetSuffixGet() {
    return AddressStreetSuffixObjectHelper.fromMap(outputMap, "AddressStreetSuffix");
  }
  public AddressStreetSuffixObjectData getAddressStreetSuffixObjectDataAddressStreetSuffixFromAddressStreetSuffixUpdate() {
    return AddressStreetSuffixObjectHelper.fromMap(outputMap, "AddressStreetSuffix");
  }
  /**
   @deprecated
   */
  public void setAddressStreetSuffixObjectFilter(AddressStreetSuffixObjectFilter data) {
    if (data != null) {
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(data, new HashMap()).get("AddressStreetSuffixObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAddressStreetSuffixObjectData(AddressStreetSuffixObjectData data) {
    if (data != null) {
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(data, new HashMap()).get("AddressStreetSuffixObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAddressStreetSuffixObjectKeyData(AddressStreetSuffixObjectKeyData data) {
    if (data != null) {
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectKeyHelper.toMap(data, new HashMap()).get("AddressStreetSuffixObject"));
    }
  }
  /**
   @deprecated
   */
  public AddressStreetSuffixObjectDataList getAddressStreetSuffixObjectDataList() {
    return AddressStreetSuffixObjectHelper.fromMapList(outputMap, "AddressStreetSuffixList");
  }
  /**
   @deprecated
   */
  public AddressStreetSuffixObjectData getAddressStreetSuffixObjectData() {
    return AddressStreetSuffixObjectHelper.fromMap(outputMap, "AddressStreetSuffix");
  }
}
