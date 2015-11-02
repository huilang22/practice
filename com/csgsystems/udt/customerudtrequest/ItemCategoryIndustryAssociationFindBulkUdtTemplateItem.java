/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryIndustryAssociationFindBulkUdtTemplateItem.java
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
 * Class used to create a ItemCategoryIndustryAssociationFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemCategoryIndustryAssociationFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemCategoryIndustryObjectFilter ICIFindIn;
/**
 *
 * Constructor to create a  ItemCategoryIndustryAssociationFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemCategoryIndustryAssociationFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryIndustryObjectFilter ICIFindInIn) {
    super(id, context, "ItemCategoryIndustryAssociationFind");
    ICIFindIn = ICIFindInIn;
  }

  public void translateToMap() {
    if (ICIFindIn != null) {
      Integer index =  ICIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemCategoryIndustryAssociation", ItemCategoryIndustryObjectHelper.toMap(ICIFindIn, new HashMap(), "ItemCategoryIndustryAssociation").get("ItemCategoryIndustryAssociation"));
    }
  }


/**
 *
 * Sets the ItemCategoryIndustryAssociation
 * @param ICIFindInIn Value of the ICIFindIn
 *
 */

  public void setItemCategoryIndustryAssociation(ItemCategoryIndustryObjectFilter ICIFindInIn) {
    ICIFindIn = ICIFindInIn;
  }

  public void translateFromMap() {
    ICIFindIn = ItemCategoryIndustryObjectHelper.fromMapFilter(inputMap, "ItemCategoryIndustryAssociation");
  }

/**
 *
 * Gets the ItemCategoryIndustryAssociation
 * @return Value of the ItemCategoryIndustryAssociation
 *
 */

  public ItemCategoryIndustryObjectFilter getItemCategoryIndustryAssociation( ) {
    return ICIFindIn;
  }

}
