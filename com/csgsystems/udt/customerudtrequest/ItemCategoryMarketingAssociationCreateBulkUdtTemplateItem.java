/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryMarketingAssociationCreateBulkUdtTemplateItem.java
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
 * Class used to create a ItemCategoryMarketingAssociationCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemCategoryMarketingAssociationCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemCategoryMarketingObjectData ICMCreateIn;
/**
 *
 * Constructor to create a  ItemCategoryMarketingAssociationCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemCategoryMarketingAssociationCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryMarketingObjectData ICMCreateInIn) {
    super(id, context, "ItemCategoryMarketingAssociationCreate");
    ICMCreateIn = ICMCreateInIn;
  }

  public void translateToMap() {
    if (ICMCreateIn != null) {
      ICMCreateIn.resetFlags(true, true);
      addInput("ItemCategoryMarketingAssociation", ItemCategoryMarketingObjectHelper.toMap(ICMCreateIn, new HashMap(), "ItemCategoryMarketingAssociation").get("ItemCategoryMarketingAssociation"));
    }
  }


/**
 *
 * Sets the ItemCategoryMarketingAssociation
 * @param ICMCreateInIn Value of the ICMCreateIn
 *
 */

  public void setItemCategoryMarketingAssociation(ItemCategoryMarketingObjectData ICMCreateInIn) {
    ICMCreateIn = ICMCreateInIn;
  }

  public void translateFromMap() {
    ICMCreateIn = ItemCategoryMarketingObjectHelper.fromMap(inputMap, "ItemCategoryMarketingAssociation");
  }

/**
 *
 * Gets the ItemCategoryMarketingAssociation
 * @return Value of the ItemCategoryMarketingAssociation
 *
 */

  public ItemCategoryMarketingObjectData getItemCategoryMarketingAssociation( ) {
    return ICMCreateIn;
  }

}
