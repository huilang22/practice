/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ItemCategoryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemCategoryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemCategoryObjectData itemCategoryUpdateIn;
/**
 *
 * Constructor to create a  ItemCategoryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemCategoryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryObjectData itemCategoryUpdateInIn) {
    super(id, context, "ItemCategoryUpdate");
    itemCategoryUpdateIn = itemCategoryUpdateInIn;
  }

  public void translateToMap() {
    if (itemCategoryUpdateIn != null) {
      itemCategoryUpdateIn.resetFlags(true, true);
      addInput("ItemCategory", ItemCategoryObjectHelper.toMap(itemCategoryUpdateIn, new HashMap(), "ItemCategory").get("ItemCategory"));
    }
  }


/**
 *
 * Sets the ItemCategory
 * @param itemCategoryUpdateInIn Value of the itemCategoryUpdateIn
 *
 */

  public void setItemCategory(ItemCategoryObjectData itemCategoryUpdateInIn) {
    itemCategoryUpdateIn = itemCategoryUpdateInIn;
  }

  public void translateFromMap() {
    itemCategoryUpdateIn = ItemCategoryObjectHelper.fromMap(inputMap, "ItemCategory");
  }

/**
 *
 * Gets the ItemCategory
 * @return Value of the ItemCategory
 *
 */

  public ItemCategoryObjectData getItemCategory( ) {
    return itemCategoryUpdateIn;
  }

}
