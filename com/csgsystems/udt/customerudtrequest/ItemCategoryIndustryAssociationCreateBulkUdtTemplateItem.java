/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryIndustryAssociationCreateBulkUdtTemplateItem.java
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
 * Class used to create a ItemCategoryIndustryAssociationCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemCategoryIndustryAssociationCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemCategoryIndustryObjectData ICICreateIn;
/**
 *
 * Constructor to create a  ItemCategoryIndustryAssociationCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemCategoryIndustryAssociationCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryIndustryObjectData ICICreateInIn) {
    super(id, context, "ItemCategoryIndustryAssociationCreate");
    ICICreateIn = ICICreateInIn;
  }

  public void translateToMap() {
    if (ICICreateIn != null) {
      ICICreateIn.resetFlags(true, true);
      addInput("ItemCategoryIndustryAssociation", ItemCategoryIndustryObjectHelper.toMap(ICICreateIn, new HashMap(), "ItemCategoryIndustryAssociation").get("ItemCategoryIndustryAssociation"));
    }
  }


/**
 *
 * Sets the ItemCategoryIndustryAssociation
 * @param ICICreateInIn Value of the ICICreateIn
 *
 */

  public void setItemCategoryIndustryAssociation(ItemCategoryIndustryObjectData ICICreateInIn) {
    ICICreateIn = ICICreateInIn;
  }

  public void translateFromMap() {
    ICICreateIn = ItemCategoryIndustryObjectHelper.fromMap(inputMap, "ItemCategoryIndustryAssociation");
  }

/**
 *
 * Gets the ItemCategoryIndustryAssociation
 * @return Value of the ItemCategoryIndustryAssociation
 *
 */

  public ItemCategoryIndustryObjectData getItemCategoryIndustryAssociation( ) {
    return ICICreateIn;
  }

}
