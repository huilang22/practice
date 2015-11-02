/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryMarketingAssociationFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ItemCategoryMarketingAssociationFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemCategoryMarketingAssociationFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemCategoryMarketingObjectFilter ICMFindIn;
/**
 *
 * Constructor to create a  ItemCategoryMarketingAssociationFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemCategoryMarketingAssociationFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryMarketingObjectFilter ICMFindInIn) {
    super(id, context, "ItemCategoryMarketingAssociationFind");
    ICMFindIn = ICMFindInIn;
  }

  public void translateToMap() {
    if (ICMFindIn != null) {
      Integer index =  ICMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemCategoryMarketingAssociation", ItemCategoryMarketingObjectHelper.toMap(ICMFindIn, new HashMap(), "ItemCategoryMarketingAssociation").get("ItemCategoryMarketingAssociation"));
    }
  }


/**
 *
 * Sets the ItemCategoryMarketingAssociation
 * @param ICMFindInIn Value of the ICMFindIn
 *
 */

  public void setItemCategoryMarketingAssociation(ItemCategoryMarketingObjectFilter ICMFindInIn) {
    ICMFindIn = ICMFindInIn;
  }

  public void translateFromMap() {
    ICMFindIn = ItemCategoryMarketingObjectHelper.fromMapFilter(inputMap, "ItemCategoryMarketingAssociation");
  }

/**
 *
 * Gets the ItemCategoryMarketingAssociation
 * @return Value of the ItemCategoryMarketingAssociation
 *
 */

  public ItemCategoryMarketingObjectFilter getItemCategoryMarketingAssociation( ) {
    return ICMFindIn;
  }

}
