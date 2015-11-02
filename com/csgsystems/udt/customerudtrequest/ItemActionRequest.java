/*
 * Generated code DO NOT EDIT
 * Generated file: ItemActionRequest.java
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
public final class ItemActionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ItemActionRequest (String request, ItemActionRequestMethod method) {
    initialize(request, "ItemAction", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ItemActionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setItemActionForItemActionCreate(ItemActionObjectData data) {
    if (data != null) {
      addInput("ItemAction", ItemActionObjectHelper.toMap(data, new HashMap(), "ItemAction").get("ItemAction"));
    }
  }
  public void setItemActionForItemActionFind(ItemActionObjectFilter data) {
    if (data != null) {
      addInput("ItemAction", ItemActionObjectHelper.toMap(data, new HashMap(), "ItemAction").get("ItemAction"));
    }
  }
  public void setItemActionForItemActionGet(ItemActionObjectKeyData data) {
    if (data != null) {
      addInput("ItemAction", ItemActionObjectKeyHelper.toMap(data, new HashMap(), "ItemAction").get("ItemAction"));
    }
  }
  public void setItemActionForItemActionUpdate(ItemActionObjectData data) {
    if (data != null) {
      addInput("ItemAction", ItemActionObjectHelper.toMap(data, new HashMap(), "ItemAction").get("ItemAction"));
    }
  }
  public ItemActionObjectData getItemActionObjectDataItemActionFromItemActionCreate() {
    return ItemActionObjectHelper.fromMap(outputMap, "ItemAction");
  }
  public ItemActionObjectDataList getItemActionObjectDataItemActionFromItemActionFind() {
    return ItemActionObjectHelper.fromMapList(outputMap, "ItemActionList");
  }
  public ItemActionObjectData getItemActionObjectDataItemActionFromItemActionGet() {
    return ItemActionObjectHelper.fromMap(outputMap, "ItemAction");
  }
  public ItemActionObjectData getItemActionObjectDataItemActionFromItemActionUpdate() {
    return ItemActionObjectHelper.fromMap(outputMap, "ItemAction");
  }
  /**
   @deprecated
   */
  public void setItemActionObjectFilter(ItemActionObjectFilter data) {
    if (data != null) {
      addInput("ItemAction", ItemActionObjectHelper.toMap(data, new HashMap()).get("ItemActionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemActionObjectData(ItemActionObjectData data) {
    if (data != null) {
      addInput("ItemAction", ItemActionObjectHelper.toMap(data, new HashMap()).get("ItemActionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemActionObjectKeyData(ItemActionObjectKeyData data) {
    if (data != null) {
      addInput("ItemAction", ItemActionObjectKeyHelper.toMap(data, new HashMap()).get("ItemActionObject"));
    }
  }
  /**
   @deprecated
   */
  public ItemActionObjectDataList getItemActionObjectDataList() {
    return ItemActionObjectHelper.fromMapList(outputMap, "ItemActionList");
  }
  /**
   @deprecated
   */
  public ItemActionObjectData getItemActionObjectData() {
    return ItemActionObjectHelper.fromMap(outputMap, "ItemAction");
  }
}
