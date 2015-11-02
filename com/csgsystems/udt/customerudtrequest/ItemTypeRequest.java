/*
 * Generated code DO NOT EDIT
 * Generated file: ItemTypeRequest.java
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
public final class ItemTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ItemTypeRequest (String request, ItemTypeRequestMethod method) {
    initialize(request, "ItemType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ItemTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setItemTypeForItemTypeCreate(ItemTypeObjectData data) {
    if (data != null) {
      addInput("ItemType", ItemTypeObjectHelper.toMap(data, new HashMap(), "ItemType").get("ItemType"));
    }
  }
  public void setItemTypeForItemTypeFind(ItemTypeObjectFilter data) {
    if (data != null) {
      addInput("ItemType", ItemTypeObjectHelper.toMap(data, new HashMap(), "ItemType").get("ItemType"));
    }
  }
  public void setItemTypeForItemTypeGet(ItemTypeObjectKeyData data) {
    if (data != null) {
      addInput("ItemType", ItemTypeObjectKeyHelper.toMap(data, new HashMap(), "ItemType").get("ItemType"));
    }
  }
  public void setItemTypeForItemTypeUpdate(ItemTypeObjectData data) {
    if (data != null) {
      addInput("ItemType", ItemTypeObjectHelper.toMap(data, new HashMap(), "ItemType").get("ItemType"));
    }
  }
  public ItemTypeObjectData getItemTypeObjectDataItemTypeFromItemTypeCreate() {
    return ItemTypeObjectHelper.fromMap(outputMap, "ItemType");
  }
  public ItemTypeObjectDataList getItemTypeObjectDataItemTypeFromItemTypeFind() {
    return ItemTypeObjectHelper.fromMapList(outputMap, "ItemTypeList");
  }
  public ItemTypeObjectData getItemTypeObjectDataItemTypeFromItemTypeGet() {
    return ItemTypeObjectHelper.fromMap(outputMap, "ItemType");
  }
  public ItemTypeObjectData getItemTypeObjectDataItemTypeFromItemTypeUpdate() {
    return ItemTypeObjectHelper.fromMap(outputMap, "ItemType");
  }
  /**
   @deprecated
   */
  public void setItemTypeObjectFilter(ItemTypeObjectFilter data) {
    if (data != null) {
      addInput("ItemType", ItemTypeObjectHelper.toMap(data, new HashMap()).get("ItemTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemTypeObjectData(ItemTypeObjectData data) {
    if (data != null) {
      addInput("ItemType", ItemTypeObjectHelper.toMap(data, new HashMap()).get("ItemTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemTypeObjectKeyData(ItemTypeObjectKeyData data) {
    if (data != null) {
      addInput("ItemType", ItemTypeObjectKeyHelper.toMap(data, new HashMap()).get("ItemTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public ItemTypeObjectDataList getItemTypeObjectDataList() {
    return ItemTypeObjectHelper.fromMapList(outputMap, "ItemTypeList");
  }
  /**
   @deprecated
   */
  public ItemTypeObjectData getItemTypeObjectData() {
    return ItemTypeObjectHelper.fromMap(outputMap, "ItemType");
  }
}
