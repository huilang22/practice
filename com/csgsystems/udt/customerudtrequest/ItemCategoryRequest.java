/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryRequest.java
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
public final class ItemCategoryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ItemCategoryRequest (String request, ItemCategoryRequestMethod method) {
    initialize(request, "ItemCategory", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ItemCategoryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setItemCategoryForItemCategoryCreate(ItemCategoryObjectData data) {
    if (data != null) {
      addInput("ItemCategory", ItemCategoryObjectHelper.toMap(data, new HashMap(), "ItemCategory").get("ItemCategory"));
    }
  }
  public void setItemCategoryForItemCategoryDelete(ItemCategoryObjectKeyData data) {
    if (data != null) {
      addInput("ItemCategory", ItemCategoryObjectKeyHelper.toMap(data, new HashMap(), "ItemCategory").get("ItemCategory"));
    }
  }
  public void setItemCategoryForItemCategoryFind(ItemCategoryObjectFilter data) {
    if (data != null) {
      addInput("ItemCategory", ItemCategoryObjectHelper.toMap(data, new HashMap(), "ItemCategory").get("ItemCategory"));
    }
  }
  public void setItemCategoryForItemCategoryGet(ItemCategoryObjectKeyData data) {
    if (data != null) {
      addInput("ItemCategory", ItemCategoryObjectKeyHelper.toMap(data, new HashMap(), "ItemCategory").get("ItemCategory"));
    }
  }
  public void setItemCategoryForItemCategoryUpdate(ItemCategoryObjectData data) {
    if (data != null) {
      addInput("ItemCategory", ItemCategoryObjectHelper.toMap(data, new HashMap(), "ItemCategory").get("ItemCategory"));
    }
  }
  public ItemCategoryObjectData getItemCategoryObjectDataItemCategoryFromItemCategoryCreate() {
    return ItemCategoryObjectHelper.fromMap(outputMap, "ItemCategory");
  }
  public ItemCategoryObjectData getItemCategoryObjectDataItemCategoryFromItemCategoryDelete() {
    return ItemCategoryObjectHelper.fromMap(outputMap, "ItemCategory");
  }
  public ItemCategoryObjectDataList getItemCategoryObjectDataItemCategoryFromItemCategoryFind() {
    return ItemCategoryObjectHelper.fromMapList(outputMap, "ItemCategoryList");
  }
  public ItemCategoryObjectData getItemCategoryObjectDataItemCategoryFromItemCategoryGet() {
    return ItemCategoryObjectHelper.fromMap(outputMap, "ItemCategory");
  }
  public ItemCategoryObjectData getItemCategoryObjectDataItemCategoryFromItemCategoryUpdate() {
    return ItemCategoryObjectHelper.fromMap(outputMap, "ItemCategory");
  }
  /**
   @deprecated
   */
  public void setItemCategoryObjectFilter(ItemCategoryObjectFilter data) {
    if (data != null) {
      addInput("ItemCategory", ItemCategoryObjectHelper.toMap(data, new HashMap()).get("ItemCategoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemCategoryObjectData(ItemCategoryObjectData data) {
    if (data != null) {
      addInput("ItemCategory", ItemCategoryObjectHelper.toMap(data, new HashMap()).get("ItemCategoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemCategoryObjectKeyData(ItemCategoryObjectKeyData data) {
    if (data != null) {
      addInput("ItemCategory", ItemCategoryObjectKeyHelper.toMap(data, new HashMap()).get("ItemCategoryObject"));
    }
  }
  /**
   @deprecated
   */
  public ItemCategoryObjectDataList getItemCategoryObjectDataList() {
    return ItemCategoryObjectHelper.fromMapList(outputMap, "ItemCategoryList");
  }
  /**
   @deprecated
   */
  public ItemCategoryObjectData getItemCategoryObjectData() {
    return ItemCategoryObjectHelper.fromMap(outputMap, "ItemCategory");
  }
}
