/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryIndustryAssociationRequest.java
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
public final class ItemCategoryIndustryAssociationRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ItemCategoryIndustryAssociationRequest (String request, ItemCategoryIndustryAssociationRequestMethod method) {
    initialize(request, "ItemCategoryIndustryAssociation", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ItemCategoryIndustryAssociationRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setItemCategoryIndustryAssociationForItemCategoryIndustryAssociationCreate(ItemCategoryIndustryObjectData data) {
    if (data != null) {
      addInput("ItemCategoryIndustryAssociation", ItemCategoryIndustryObjectHelper.toMap(data, new HashMap(), "ItemCategoryIndustryAssociation").get("ItemCategoryIndustryAssociation"));
    }
  }
  public void setItemCategoryIndustryAssociationForItemCategoryIndustryAssociationDelete(ItemCategoryIndustryObjectKeyData data) {
    if (data != null) {
      addInput("ItemCategoryIndustryAssociation", ItemCategoryIndustryObjectKeyHelper.toMap(data, new HashMap(), "ItemCategoryIndustryAssociation").get("ItemCategoryIndustryAssociation"));
    }
  }
  public void setItemCategoryIndustryAssociationForItemCategoryIndustryAssociationFind(ItemCategoryIndustryObjectFilter data) {
    if (data != null) {
      addInput("ItemCategoryIndustryAssociation", ItemCategoryIndustryObjectHelper.toMap(data, new HashMap(), "ItemCategoryIndustryAssociation").get("ItemCategoryIndustryAssociation"));
    }
  }
  public ItemCategoryIndustryObjectData getItemCategoryIndustryObjectDataItemCategoryIndustryAssociationFromItemCategoryIndustryAssociationCreate() {
    return ItemCategoryIndustryObjectHelper.fromMap(outputMap, "ItemCategoryIndustryAssociation");
  }
  public ItemCategoryIndustryObjectData getItemCategoryIndustryObjectDataItemCategoryIndustryAssociationFromItemCategoryIndustryAssociationDelete() {
    return ItemCategoryIndustryObjectHelper.fromMap(outputMap, "ItemCategoryIndustryAssociation");
  }
  public ItemCategoryIndustryObjectDataList getItemCategoryIndustryObjectDataItemCategoryIndustryAssociationFromItemCategoryIndustryAssociationFind() {
    return ItemCategoryIndustryObjectHelper.fromMapList(outputMap, "ItemCategoryIndustryAssociationList");
  }
  /**
   @deprecated
   */
  public void setItemCategoryIndustryObjectFilter(ItemCategoryIndustryObjectFilter data) {
    if (data != null) {
      addInput("ItemCategoryIndustry", ItemCategoryIndustryObjectHelper.toMap(data, new HashMap()).get("ItemCategoryIndustryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemCategoryIndustryObjectData(ItemCategoryIndustryObjectData data) {
    if (data != null) {
      addInput("ItemCategoryIndustryAssociation", ItemCategoryIndustryObjectHelper.toMap(data, new HashMap()).get("ItemCategoryIndustryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemCategoryIndustryObjectKeyData(ItemCategoryIndustryObjectKeyData data) {
    if (data != null) {
      addInput("ItemCategoryIndustryAssociation", ItemCategoryIndustryObjectKeyHelper.toMap(data, new HashMap()).get("ItemCategoryIndustryObject"));
    }
  }
  /**
   @deprecated
   */
  public ItemCategoryIndustryObjectDataList getItemCategoryIndustryObjectDataList() {
    return ItemCategoryIndustryObjectHelper.fromMapList(outputMap, "ItemCategoryIndustryList");
  }
  /**
   @deprecated
   */
  public ItemCategoryIndustryObjectData getItemCategoryIndustryObjectData() {
    return ItemCategoryIndustryObjectHelper.fromMap(outputMap, "ItemCategoryIndustryAssociation");
  }
}
