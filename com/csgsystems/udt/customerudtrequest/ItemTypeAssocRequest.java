/*
 * Generated code DO NOT EDIT
 * Generated file: ItemTypeAssocRequest.java
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
public final class ItemTypeAssocRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ItemTypeAssocRequest (String request, ItemTypeAssocRequestMethod method) {
    initialize(request, "ItemTypeAssoc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ItemTypeAssocRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setItemTypeAssocForItemTypeAssocCreate(ItemTypeAssocObjData data) {
    if (data != null) {
      addInput("ItemTypeAssoc", ItemTypeAssocObjHelper.toMap(data, new HashMap(), "ItemTypeAssoc").get("ItemTypeAssoc"));
    }
  }
  public void setItemTypeAssocForItemTypeAssocFind(ItemTypeAssocObjFilter data) {
    if (data != null) {
      addInput("ItemTypeAssoc", ItemTypeAssocObjHelper.toMap(data, new HashMap(), "ItemTypeAssoc").get("ItemTypeAssoc"));
    }
  }
  public void setItemTypeAssocForItemTypeAssocGet(ItemTypeAssocObjKeyData data) {
    if (data != null) {
      addInput("ItemTypeAssoc", ItemTypeAssocObjKeyHelper.toMap(data, new HashMap(), "ItemTypeAssoc").get("ItemTypeAssoc"));
    }
  }
  public void setItemTypeAssocForItemTypeAssocUpdate(ItemTypeAssocObjData data) {
    if (data != null) {
      addInput("ItemTypeAssoc", ItemTypeAssocObjHelper.toMap(data, new HashMap(), "ItemTypeAssoc").get("ItemTypeAssoc"));
    }
  }
  public ItemTypeAssocObjData getItemTypeAssocObjDataItemTypeAssocFromItemTypeAssocCreate() {
    return ItemTypeAssocObjHelper.fromMap(outputMap, "ItemTypeAssoc");
  }
  public ItemTypeAssocObjDataList getItemTypeAssocObjDataItemTypeAssocFromItemTypeAssocFind() {
    return ItemTypeAssocObjHelper.fromMapList(outputMap, "ItemTypeAssocList");
  }
  public ItemTypeAssocObjData getItemTypeAssocObjDataItemTypeAssocFromItemTypeAssocGet() {
    return ItemTypeAssocObjHelper.fromMap(outputMap, "ItemTypeAssoc");
  }
  public ItemTypeAssocObjData getItemTypeAssocObjDataItemTypeAssocFromItemTypeAssocUpdate() {
    return ItemTypeAssocObjHelper.fromMap(outputMap, "ItemTypeAssoc");
  }
  /**
   @deprecated
   */
  public void setItemTypeAssocObjFilter(ItemTypeAssocObjFilter data) {
    if (data != null) {
      addInput("ItemTypeAssoc", ItemTypeAssocObjHelper.toMap(data, new HashMap()).get("ItemTypeAssocObj"));
    }
  }
  /**
   @deprecated
   */
  public void setItemTypeAssocObjData(ItemTypeAssocObjData data) {
    if (data != null) {
      addInput("ItemTypeAssoc", ItemTypeAssocObjHelper.toMap(data, new HashMap()).get("ItemTypeAssocObj"));
    }
  }
  /**
   @deprecated
   */
  public void setItemTypeAssocObjKeyData(ItemTypeAssocObjKeyData data) {
    if (data != null) {
      addInput("ItemTypeAssoc", ItemTypeAssocObjKeyHelper.toMap(data, new HashMap()).get("ItemTypeAssocObj"));
    }
  }
  /**
   @deprecated
   */
  public ItemTypeAssocObjDataList getItemTypeAssocObjDataList() {
    return ItemTypeAssocObjHelper.fromMapList(outputMap, "ItemTypeAssocList");
  }
  /**
   @deprecated
   */
  public ItemTypeAssocObjData getItemTypeAssocObjData() {
    return ItemTypeAssocObjHelper.fromMap(outputMap, "ItemTypeAssoc");
  }
}
