/*
 * Generated code DO NOT EDIT
 * Generated file: ItemMarketingDataLinkRequest.java
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
public final class ItemMarketingDataLinkRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ItemMarketingDataLinkRequest (String request, ItemMarketingDataLinkRequestMethod method) {
    initialize(request, "ItemMarketingDataLink", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ItemMarketingDataLinkRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setItemMarketingDataLinkForItemMarketingDataLinkCreate(ItemMarketingDataLinkObjectData data) {
    if (data != null) {
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectHelper.toMap(data, new HashMap(), "ItemMarketingDataLink").get("ItemMarketingDataLink"));
    }
  }
  public void setItemMarketingDataLinkForItemMarketingDataLinkDelete(ItemMarketingDataLinkObjectKeyData data) {
    if (data != null) {
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectKeyHelper.toMap(data, new HashMap(), "ItemMarketingDataLink").get("ItemMarketingDataLink"));
    }
  }
  public void setItemMarketingDataLinkForItemMarketingDataLinkFind(ItemMarketingDataLinkObjectFilter data) {
    if (data != null) {
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectHelper.toMap(data, new HashMap(), "ItemMarketingDataLink").get("ItemMarketingDataLink"));
    }
  }
  public void setItemMarketingDataLinkForItemMarketingDataLinkGet(ItemMarketingDataLinkObjectKeyData data) {
    if (data != null) {
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectKeyHelper.toMap(data, new HashMap(), "ItemMarketingDataLink").get("ItemMarketingDataLink"));
    }
  }
  public void setItemMarketingDataLinkForItemMarketingDataLinkUpdate(ItemMarketingDataLinkObjectData data) {
    if (data != null) {
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectHelper.toMap(data, new HashMap(), "ItemMarketingDataLink").get("ItemMarketingDataLink"));
    }
  }
  public ItemMarketingDataLinkObjectData getItemMarketingDataLinkObjectDataItemMarketingDataLinkFromItemMarketingDataLinkCreate() {
    return ItemMarketingDataLinkObjectHelper.fromMap(outputMap, "ItemMarketingDataLink");
  }
  public ItemMarketingDataLinkObjectData getItemMarketingDataLinkObjectDataItemMarketingDataLinkFromItemMarketingDataLinkDelete() {
    return ItemMarketingDataLinkObjectHelper.fromMap(outputMap, "ItemMarketingDataLink");
  }
  public ItemMarketingDataLinkObjectDataList getItemMarketingDataLinkObjectDataItemMarketingDataLinkFromItemMarketingDataLinkFind() {
    return ItemMarketingDataLinkObjectHelper.fromMapList(outputMap, "ItemMarketingDataLinkList");
  }
  public ItemMarketingDataLinkObjectData getItemMarketingDataLinkObjectDataItemMarketingDataLinkFromItemMarketingDataLinkGet() {
    return ItemMarketingDataLinkObjectHelper.fromMap(outputMap, "ItemMarketingDataLink");
  }
  public ItemMarketingDataLinkObjectKeyData getItemMarketingDataLinkObjectKeyDataItemMarketingDataLinkFromItemMarketingDataLinkSequenceGet() {
    return ItemMarketingDataLinkObjectKeyHelper.fromMap(outputMap, "ItemMarketingDataLink");
  }
  public ItemMarketingDataLinkObjectData getItemMarketingDataLinkObjectDataItemMarketingDataLinkFromItemMarketingDataLinkUpdate() {
    return ItemMarketingDataLinkObjectHelper.fromMap(outputMap, "ItemMarketingDataLink");
  }
  /**
   @deprecated
   */
  public void setItemMarketingDataLinkObjectFilter(ItemMarketingDataLinkObjectFilter data) {
    if (data != null) {
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectHelper.toMap(data, new HashMap()).get("ItemMarketingDataLinkObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemMarketingDataLinkObjectData(ItemMarketingDataLinkObjectData data) {
    if (data != null) {
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectHelper.toMap(data, new HashMap()).get("ItemMarketingDataLinkObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemMarketingDataLinkObjectKeyData(ItemMarketingDataLinkObjectKeyData data) {
    if (data != null) {
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectKeyHelper.toMap(data, new HashMap()).get("ItemMarketingDataLinkObject"));
    }
  }
  /**
   @deprecated
   */
  public ItemMarketingDataLinkObjectDataList getItemMarketingDataLinkObjectDataList() {
    return ItemMarketingDataLinkObjectHelper.fromMapList(outputMap, "ItemMarketingDataLinkList");
  }
  /**
   @deprecated
   */
  public ItemMarketingDataLinkObjectKeyData getItemMarketingDataLinkObjectKeyData() {
    return ItemMarketingDataLinkObjectKeyHelper.fromMap(outputMap, "ItemMarketingDataLink");
  }
  /**
   @deprecated
   */
  public ItemMarketingDataLinkObjectData getItemMarketingDataLinkObjectData() {
    return ItemMarketingDataLinkObjectHelper.fromMap(outputMap, "ItemMarketingDataLink");
  }
}
