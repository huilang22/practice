/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryIndustryAssociationRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ItemCategoryIndustryAssociationRequestMethod implements UdtMethod {
  private String method = null;
  private ItemCategoryIndustryAssociationRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ItemCategoryIndustryAssociationCreate method */
  public static final ItemCategoryIndustryAssociationRequestMethod ITEM_CATEGORY_INDUSTRY_ASSOCIATION_CREATE = new ItemCategoryIndustryAssociationRequestMethod("ItemCategoryIndustryAssociationCreate");
  /** Variable representing the ItemCategoryIndustryAssociationDelete method */
  public static final ItemCategoryIndustryAssociationRequestMethod ITEM_CATEGORY_INDUSTRY_ASSOCIATION_DELETE = new ItemCategoryIndustryAssociationRequestMethod("ItemCategoryIndustryAssociationDelete");
  /** Variable representing the ItemCategoryIndustryAssociationFind method */
  public static final ItemCategoryIndustryAssociationRequestMethod ITEM_CATEGORY_INDUSTRY_ASSOCIATION_FIND = new ItemCategoryIndustryAssociationRequestMethod("ItemCategoryIndustryAssociationFind");
}
