/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ItemCategoryDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemCategoryDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemCategoryObjectKeyData itemCategoryDeleteIn;
/**
 *
 * Constructor to create a  ItemCategoryDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemCategoryDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryObjectKeyData itemCategoryDeleteInIn) {
    super(id, context, "ItemCategoryDelete");
    itemCategoryDeleteIn = itemCategoryDeleteInIn;
  }

  public void translateToMap() {
    if (itemCategoryDeleteIn != null) {
      itemCategoryDeleteIn.resetFlags(true, true);
      addInput("ItemCategory", ItemCategoryObjectKeyHelper.toMap(itemCategoryDeleteIn, new HashMap(), "ItemCategoryObjectKeyData").get("ItemCategoryObjectKeyData"));
    }
  }


/**
 *
 * Sets the ItemCategory
 * @param itemCategoryDeleteInIn Value of the itemCategoryDeleteIn
 *
 */

  public void setItemCategory(ItemCategoryObjectKeyData itemCategoryDeleteInIn) {
    itemCategoryDeleteIn = itemCategoryDeleteInIn;
  }

  public void translateFromMap() {
    itemCategoryDeleteIn = ItemCategoryObjectKeyHelper.fromMap(inputMap, "ItemCategory");
  }

/**
 *
 * Gets the ItemCategory
 * @return Value of the ItemCategory
 *
 */

  public ItemCategoryObjectKeyData getItemCategory( ) {
    return itemCategoryDeleteIn;
  }

}
