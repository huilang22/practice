/*
 * Generated code DO NOT EDIT
 * Generated file: ItemMarketingDataRequest.java
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
public final class ItemMarketingDataRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ItemMarketingDataRequest (String request, ItemMarketingDataRequestMethod method) {
    initialize(request, "ItemMarketingData", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ItemMarketingDataRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setItemMarketingDataForItemMarketingDataCreate(ItemMarketingDataObjectData data) {
    if (data != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(data, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }
  public void setItemMarketingDataForItemMarketingDataDelete(ItemMarketingDataObjectKeyData data) {
    if (data != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectKeyHelper.toMap(data, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }
  public void setItemMarketingDataForItemMarketingDataFind(ItemMarketingDataObjectFilter data) {
    if (data != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(data, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }
  public void setItemMarketingDataForItemMarketingDataFindWithPrice(ItemMarketingDataObjectFilter data) {
    if (data != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(data, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }
  public void setRatingKeyForItemMarketingDataFindWithPrice(RatingKeyObjectData data) {
    if (data != null) {
      addInput("RatingKey", RatingKeyObjectHelper.toMap(data, new HashMap(), "RatingKey").get("RatingKey"));
    }
  }
  public void setItemMarketingDataForItemMarketingDataGet(ItemMarketingDataObjectKeyData data) {
    if (data != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectKeyHelper.toMap(data, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }
  public void setItemMarketingDataForItemMarketingDataGetWithPrice(ItemMarketingDataObjectKeyData data) {
    if (data != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectKeyHelper.toMap(data, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }
  public void setRatingKeyForItemMarketingDataGetWithPrice(RatingKeyObjectData data) {
    if (data != null) {
      addInput("RatingKey", RatingKeyObjectHelper.toMap(data, new HashMap(), "RatingKey").get("RatingKey"));
    }
  }
  public void setItemMarketingDataForItemMarketingDataPrice(ItemMarketingDataObjectKeyData data) {
    if (data != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectKeyHelper.toMap(data, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }
  public void setRatingKeyForItemMarketingDataPrice(RatingKeyObjectData data) {
    if (data != null) {
      addInput("RatingKey", RatingKeyObjectHelper.toMap(data, new HashMap(), "RatingKey").get("RatingKey"));
    }
  }
  public void setItemMarketingDataForItemMarketingDataUpdate(ItemMarketingDataObjectData data) {
    if (data != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(data, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }
  public ItemMarketingDataObjectData getItemMarketingDataObjectDataItemMarketingDataFromItemMarketingDataCreate() {
    return ItemMarketingDataObjectHelper.fromMap(outputMap, "ItemMarketingData");
  }
  public ItemMarketingDataObjectData getItemMarketingDataObjectDataItemMarketingDataFromItemMarketingDataDelete() {
    return ItemMarketingDataObjectHelper.fromMap(outputMap, "ItemMarketingData");
  }
  public ItemMarketingDataObjectDataList getItemMarketingDataObjectDataItemMarketingDataFromItemMarketingDataFind() {
    return ItemMarketingDataObjectHelper.fromMapList(outputMap, "ItemMarketingDataList");
  }
  public ItemMarketingDataWithPriceObjectDataList getItemMarketingDataWithPriceObjectDataItemMarketingDataFromItemMarketingDataFindWithPrice() {
    return ItemMarketingDataWithPriceObjectHelper.fromMapList(outputMap, "ItemMarketingDataList");
  }
  public ItemMarketingDataObjectData getItemMarketingDataObjectDataItemMarketingDataFromItemMarketingDataGet() {
    return ItemMarketingDataObjectHelper.fromMap(outputMap, "ItemMarketingData");
  }
  public ItemMarketingDataWithPriceObjectData getItemMarketingDataWithPriceObjectDataItemMarketingDataFromItemMarketingDataGetWithPrice() {
    return ItemMarketingDataWithPriceObjectHelper.fromMap(outputMap, "ItemMarketingData");
  }
  public BigInteger getBigIntegerImdPriceFromItemMarketingDataPrice() {
    return (BigInteger)outputMap.get("ImdPrice");
  }
  public ItemMarketingDataObjectData getItemMarketingDataObjectDataItemMarketingDataFromItemMarketingDataUpdate() {
    return ItemMarketingDataObjectHelper.fromMap(outputMap, "ItemMarketingData");
  }
  /**
   @deprecated
   */
  public void setItemMarketingDataObjectFilter(ItemMarketingDataObjectFilter data) {
    if (data != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(data, new HashMap()).get("ItemMarketingDataObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemMarketingDataObjectData(ItemMarketingDataObjectData data) {
    if (data != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(data, new HashMap()).get("ItemMarketingDataObject"));
    }
  }
  /**
   @deprecated
   */
  public void setItemMarketingDataObjectKeyData(ItemMarketingDataObjectKeyData data) {
    if (data != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectKeyHelper.toMap(data, new HashMap()).get("ItemMarketingDataObject"));
    }
  }
  /**
   @deprecated
   */
  public ItemMarketingDataObjectDataList getItemMarketingDataObjectDataList() {
    return ItemMarketingDataObjectHelper.fromMapList(outputMap, "ItemMarketingDataList");
  }
  /**
   @deprecated
   */
  public ItemMarketingDataObjectData getItemMarketingDataObjectData() {
    return ItemMarketingDataObjectHelper.fromMap(outputMap, "ItemMarketingData");
  }
  /**
   @deprecated
   */
  public ItemMarketingDataWithPriceObjectDataList getItemMarketingDataWithPriceObjectDataList() {
    return ItemMarketingDataWithPriceObjectHelper.fromMapList(outputMap, "ItemMarketingDataList");
  }
  /**
   @deprecated
   */
  public ItemMarketingDataWithPriceObjectData getItemMarketingDataWithPriceObjectData() {
    return ItemMarketingDataWithPriceObjectHelper.fromMap(outputMap, "ItemMarketingData");
  }
  /**
   @deprecated
   */
  public void setRatingKeyObjectData(RatingKeyObjectData data) {
    if (data != null) {
      addInput("RatingKey", RatingKeyObjectHelper.toMap(data, new HashMap()).get("RatingKeyObject"));
    }
  }
  /**
   @deprecated
   */
  public BigInteger getImdPrice() {
    return (BigInteger)outputMap.get("ImdPrice");
  }
}
