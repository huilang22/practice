/*
 * Generated code DO NOT EDIT
 * Generated file: ItemMarketingDataRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ItemMarketingDataRequestMethod implements UdtMethod {
  private String method = null;
  private ItemMarketingDataRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ItemMarketingDataCreate method */
  public static final ItemMarketingDataRequestMethod ITEM_MARKETING_DATA_CREATE = new ItemMarketingDataRequestMethod("ItemMarketingDataCreate");
  /** Variable representing the ItemMarketingDataDelete method */
  public static final ItemMarketingDataRequestMethod ITEM_MARKETING_DATA_DELETE = new ItemMarketingDataRequestMethod("ItemMarketingDataDelete");
  /** Variable representing the ItemMarketingDataDeleteAll method */
  public static final ItemMarketingDataRequestMethod ITEM_MARKETING_DATA_DELETE_ALL = new ItemMarketingDataRequestMethod("ItemMarketingDataDeleteAll");
  /** Variable representing the ItemMarketingDataFind method */
  public static final ItemMarketingDataRequestMethod ITEM_MARKETING_DATA_FIND = new ItemMarketingDataRequestMethod("ItemMarketingDataFind");
  /** Variable representing the ItemMarketingDataFindWithPrice method */
  public static final ItemMarketingDataRequestMethod ITEM_MARKETING_DATA_FIND_WITH_PRICE = new ItemMarketingDataRequestMethod("ItemMarketingDataFindWithPrice");
  /** Variable representing the ItemMarketingDataGet method */
  public static final ItemMarketingDataRequestMethod ITEM_MARKETING_DATA_GET = new ItemMarketingDataRequestMethod("ItemMarketingDataGet");
  /** Variable representing the ItemMarketingDataGetWithPrice method */
  public static final ItemMarketingDataRequestMethod ITEM_MARKETING_DATA_GET_WITH_PRICE = new ItemMarketingDataRequestMethod("ItemMarketingDataGetWithPrice");
  /** Variable representing the ItemMarketingDataPrice method */
  public static final ItemMarketingDataRequestMethod ITEM_MARKETING_DATA_PRICE = new ItemMarketingDataRequestMethod("ItemMarketingDataPrice");
  /** Variable representing the ItemMarketingDataUpdate method */
  public static final ItemMarketingDataRequestMethod ITEM_MARKETING_DATA_UPDATE = new ItemMarketingDataRequestMethod("ItemMarketingDataUpdate");
}
