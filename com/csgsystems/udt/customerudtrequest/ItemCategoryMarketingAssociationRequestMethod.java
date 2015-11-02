/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryMarketingAssociationRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ItemCategoryMarketingAssociationRequestMethod implements UdtMethod {
  private String method = null;
  private ItemCategoryMarketingAssociationRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ItemCategoryMarketingAssociationCreate method */
  public static final ItemCategoryMarketingAssociationRequestMethod ITEM_CATEGORY_MARKETING_ASSOCIATION_CREATE = new ItemCategoryMarketingAssociationRequestMethod("ItemCategoryMarketingAssociationCreate");
  /** Variable representing the ItemCategoryMarketingAssociationDelete method */
  public static final ItemCategoryMarketingAssociationRequestMethod ITEM_CATEGORY_MARKETING_ASSOCIATION_DELETE = new ItemCategoryMarketingAssociationRequestMethod("ItemCategoryMarketingAssociationDelete");
  /** Variable representing the ItemCategoryMarketingAssociationFind method */
  public static final ItemCategoryMarketingAssociationRequestMethod ITEM_CATEGORY_MARKETING_ASSOCIATION_FIND = new ItemCategoryMarketingAssociationRequestMethod("ItemCategoryMarketingAssociationFind");
}
