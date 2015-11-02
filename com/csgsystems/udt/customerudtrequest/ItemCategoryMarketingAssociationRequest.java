/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryMarketingAssociationRequest.java
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
public final class ItemCategoryMarketingAssociationRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ItemCategoryMarketingAssociationRequest (String request, ItemCategoryMarketingAssociationRequestMethod method) {
    initialize(request, "ItemCategoryMarketingAssociation", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ItemCategoryMarketingAssociationRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setItemCategoryMarketingAssociationForItemCategoryMarketingAssociationCreate(ItemCategoryMarketingObjectData data) {
    if (data != null) {
      addInput("ItemCategoryMarketingAssociation", ItemCategoryMarketingObjectHelper.toMap(data, new HashMap(), "ItemCategoryMarketingAssociation").get("ItemCategoryMarketingAssociation"));
    }
  }
  public void setItemCategoryMarketingAssociationForItemCategoryMarketingAssociationDelete(ItemCategoryMarketingObjectKeyData data) {
    if (data != null) {
      addInput("ItemCategoryMarketingAssociation", ItemCategoryMarketingObjectKeyHelper.toMap(data, new HashMap(), "ItemCategoryMarketingAssociation").get("ItemCategoryMarketingAssociation"));
    }
  }
  public void setItemCategoryMarketingAssociationForItemCategoryMarketingAssociationFind(ItemCategoryMarketingObjectFilter data) {
    if (data != null) {
      addInput("ItemCategoryMarketingAssociation", ItemCategoryMarketingObjectHelper.toMap(data, new HashMap(), "ItemCategoryMarketingAssociation").get("ItemCategoryMarketingAssociation"));
    }
  }
  public ItemCategoryMarketingObjectData getItemCategoryMarketingObjectDataItemCategoryMarketingAssociationFromItemCategoryMarketingAssociationCreate() {
    return ItemCategoryMarketingObjectHelper.fromMap(outputMap, "ItemCategoryMarketingAssociation");
  }
  public ItemCategoryMarketingObjectData getItemCategoryMarketingObjectDataItemCategoryMarketingAssociationFromItemCategoryMarketingAssociationDelete() {
    return ItemCategoryMarketingObjectHelper.fromMap(outputMap, "ItemCategoryMarketingAssociation");
  }
  public ItemCategoryMarketingObjectDataList getItemCategoryMarketingObjectDataItemCategoryMarketingAssociationFromItemCategoryMarketingAssociationFind() {
    return ItemCategoryMarketingObjectHelper.fromMapList(outputMap, "ItemCategoryMarketingAssociationList");
  }
  /**
   @deprecated
   */
  public void setItemCategoryMarketingObjectFilter(ItemCategoryMarketingObjectFilter data) {
    if (data != null) {
      addInput("ItemCategoryMarketing", ItemCategoryMarketingObjectHelper.toMap(data, new HashMap()).get("ItemCategoryMarketingObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemCategoryMarketingObjectData(ItemCategoryMarketingObjectData data) {
    if (data != null) {
      addInput("ItemCategoryMarketingAssociation", ItemCategoryMarketingObjectHelper.toMap(data, new HashMap()).get("ItemCategoryMarketingObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemCategoryMarketingObjectKeyData(ItemCategoryMarketingObjectKeyData data) {
    if (data != null) {
      addInput("ItemCategoryMarketingAssociation", ItemCategoryMarketingObjectKeyHelper.toMap(data, new HashMap()).get("ItemCategoryMarketingObject"));
    }
  }
  /**
   @deprecated
   */
  public ItemCategoryMarketingObjectDataList getItemCategoryMarketingObjectDataList() {
    return ItemCategoryMarketingObjectHelper.fromMapList(outputMap, "ItemCategoryMarketingList");
  }
  /**
   @deprecated
   */
  public ItemCategoryMarketingObjectData getItemCategoryMarketingObjectData() {
    return ItemCategoryMarketingObjectHelper.fromMap(outputMap, "ItemCategoryMarketingAssociation");
  }
}
