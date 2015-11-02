/*
 * Generated code DO NOT EDIT
 * Generated file: ItemMarketingDataLinkRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ItemMarketingDataLinkRequestMethod implements UdtMethod {
  private String method = null;
  private ItemMarketingDataLinkRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ItemMarketingDataLinkCreate method */
  public static final ItemMarketingDataLinkRequestMethod ITEM_MARKETING_DATA_LINK_CREATE = new ItemMarketingDataLinkRequestMethod("ItemMarketingDataLinkCreate");
  /** Variable representing the ItemMarketingDataLinkDelete method */
  public static final ItemMarketingDataLinkRequestMethod ITEM_MARKETING_DATA_LINK_DELETE = new ItemMarketingDataLinkRequestMethod("ItemMarketingDataLinkDelete");
  /** Variable representing the ItemMarketingDataLinkFind method */
  public static final ItemMarketingDataLinkRequestMethod ITEM_MARKETING_DATA_LINK_FIND = new ItemMarketingDataLinkRequestMethod("ItemMarketingDataLinkFind");
  /** Variable representing the ItemMarketingDataLinkGet method */
  public static final ItemMarketingDataLinkRequestMethod ITEM_MARKETING_DATA_LINK_GET = new ItemMarketingDataLinkRequestMethod("ItemMarketingDataLinkGet");
  /** Variable representing the ItemMarketingDataLinkSequenceGet method */
  public static final ItemMarketingDataLinkRequestMethod ITEM_MARKETING_DATA_LINK_SEQUENCE_GET = new ItemMarketingDataLinkRequestMethod("ItemMarketingDataLinkSequenceGet");
  /** Variable representing the ItemMarketingDataLinkUpdate method */
  public static final ItemMarketingDataLinkRequestMethod ITEM_MARKETING_DATA_LINK_UPDATE = new ItemMarketingDataLinkRequestMethod("ItemMarketingDataLinkUpdate");
}
