/*
 * Generated code DO NOT EDIT
 * Generated file: OpenItemRequest.java
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
public final class OpenItemRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OpenItemRequest (String request, OpenItemRequestMethod method) {
    initialize(request, "OpenItem", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OpenItemRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setOpenItemForOpenItemCreate(OpenItemObjectData data) {
    if (data != null) {
      addInput("OpenItem", OpenItemObjectHelper.toMap(data, new HashMap(), "OpenItem").get("OpenItem"));
    }
  }
  public void setOpenItemForOpenItemDelete(OpenItemObjectKeyData data) {
    if (data != null) {
      addInput("OpenItem", OpenItemObjectKeyHelper.toMap(data, new HashMap(), "OpenItem").get("OpenItem"));
    }
  }
  public void setOpenItemForOpenItemFind(OpenItemObjectFilter data) {
    if (data != null) {
      addInput("OpenItem", OpenItemObjectHelper.toMap(data, new HashMap(), "OpenItem").get("OpenItem"));
    }
  }
  public void setOpenItemForOpenItemGet(OpenItemObjectKeyData data) {
    if (data != null) {
      addInput("OpenItem", OpenItemObjectKeyHelper.toMap(data, new HashMap(), "OpenItem").get("OpenItem"));
    }
  }
  public void setOpenItemForOpenItemUpdate(OpenItemObjectData data) {
    if (data != null) {
      addInput("OpenItem", OpenItemObjectHelper.toMap(data, new HashMap(), "OpenItem").get("OpenItem"));
    }
  }
  public OpenItemObjectData getOpenItemObjectDataOpenItemFromOpenItemCreate() {
    return OpenItemObjectHelper.fromMap(outputMap, "OpenItem");
  }
  public OpenItemObjectData getOpenItemObjectDataOpenItemFromOpenItemDelete() {
    return OpenItemObjectHelper.fromMap(outputMap, "OpenItem");
  }
  public OpenItemObjectDataList getOpenItemObjectDataOpenItemFromOpenItemFind() {
    return OpenItemObjectHelper.fromMapList(outputMap, "OpenItemList");
  }
  public OpenItemObjectData getOpenItemObjectDataOpenItemFromOpenItemGet() {
    return OpenItemObjectHelper.fromMap(outputMap, "OpenItem");
  }
  public OpenItemObjectData getOpenItemObjectDataOpenItemFromOpenItemUpdate() {
    return OpenItemObjectHelper.fromMap(outputMap, "OpenItem");
  }
  /**
   @deprecated
   */
  public void setOpenItemObjectFilter(OpenItemObjectFilter data) {
    if (data != null) {
      addInput("OpenItem", OpenItemObjectHelper.toMap(data, new HashMap()).get("OpenItemObject"));
    }
  }
  /**
   @deprecated
   */
  public void setOpenItemObjectData(OpenItemObjectData data) {
    if (data != null) {
      addInput("OpenItem", OpenItemObjectHelper.toMap(data, new HashMap()).get("OpenItemObject"));
    }
  }
  /**
   @deprecated
   */
  public void setOpenItemObjectKeyData(OpenItemObjectKeyData data) {
    if (data != null) {
      addInput("OpenItem", OpenItemObjectKeyHelper.toMap(data, new HashMap()).get("OpenItemObject"));
    }
  }
  /**
   @deprecated
   */
  public OpenItemObjectDataList getOpenItemObjectDataList() {
    return OpenItemObjectHelper.fromMapList(outputMap, "OpenItemList");
  }
  /**
   @deprecated
   */
  public OpenItemObjectData getOpenItemObjectData() {
    return OpenItemObjectHelper.fromMap(outputMap, "OpenItem");
  }
}
