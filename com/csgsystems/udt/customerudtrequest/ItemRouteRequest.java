/*
 * Generated code DO NOT EDIT
 * Generated file: ItemRouteRequest.java
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
public final class ItemRouteRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ItemRouteRequest (String request, ItemRouteRequestMethod method) {
    initialize(request, "ItemRoute", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ItemRouteRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setItemRouteForItemRouteCreate(ItemRouteObjectData data) {
    if (data != null) {
      addInput("ItemRoute", ItemRouteObjectHelper.toMap(data, new HashMap(), "ItemRoute").get("ItemRoute"));
    }
  }
  public void setItemRouteForItemRouteFind(ItemRouteObjectFilter data) {
    if (data != null) {
      addInput("ItemRoute", ItemRouteObjectHelper.toMap(data, new HashMap(), "ItemRoute").get("ItemRoute"));
    }
  }
  public void setItemRouteForItemRouteGet(ItemRouteObjectKeyData data) {
    if (data != null) {
      addInput("ItemRoute", ItemRouteObjectKeyHelper.toMap(data, new HashMap(), "ItemRoute").get("ItemRoute"));
    }
  }
  public void setItemRouteForItemRouteUpdate(ItemRouteObjectData data) {
    if (data != null) {
      addInput("ItemRoute", ItemRouteObjectHelper.toMap(data, new HashMap(), "ItemRoute").get("ItemRoute"));
    }
  }
  public ItemRouteObjectData getItemRouteObjectDataItemRouteFromItemRouteCreate() {
    return ItemRouteObjectHelper.fromMap(outputMap, "ItemRoute");
  }
  public ItemRouteObjectDataList getItemRouteObjectDataItemRouteFromItemRouteFind() {
    return ItemRouteObjectHelper.fromMapList(outputMap, "ItemRouteList");
  }
  public ItemRouteObjectData getItemRouteObjectDataItemRouteFromItemRouteGet() {
    return ItemRouteObjectHelper.fromMap(outputMap, "ItemRoute");
  }
  public ItemRouteObjectData getItemRouteObjectDataItemRouteFromItemRouteUpdate() {
    return ItemRouteObjectHelper.fromMap(outputMap, "ItemRoute");
  }
  /**
   @deprecated
   */
  public void setItemRouteObjectFilter(ItemRouteObjectFilter data) {
    if (data != null) {
      addInput("ItemRoute", ItemRouteObjectHelper.toMap(data, new HashMap()).get("ItemRouteObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemRouteObjectData(ItemRouteObjectData data) {
    if (data != null) {
      addInput("ItemRoute", ItemRouteObjectHelper.toMap(data, new HashMap()).get("ItemRouteObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemRouteObjectKeyData(ItemRouteObjectKeyData data) {
    if (data != null) {
      addInput("ItemRoute", ItemRouteObjectKeyHelper.toMap(data, new HashMap()).get("ItemRouteObject"));
    }
  }
  /**
   @deprecated
   */
  public ItemRouteObjectDataList getItemRouteObjectDataList() {
    return ItemRouteObjectHelper.fromMapList(outputMap, "ItemRouteList");
  }
  /**
   @deprecated
   */
  public ItemRouteObjectData getItemRouteObjectData() {
    return ItemRouteObjectHelper.fromMap(outputMap, "ItemRoute");
  }
}
