/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryGetBulkUdtTemplateItem.java
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
 * Class used to create a ItemCategoryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemCategoryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemCategoryObjectKeyData itemCategoryGetIn;
/**
 *
 * Constructor to create a  ItemCategoryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemCategoryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryObjectKeyData itemCategoryGetInIn) {
    super(id, context, "ItemCategoryGet");
    itemCategoryGetIn = itemCategoryGetInIn;
  }

  public void translateToMap() {
    if (itemCategoryGetIn != null) {
      itemCategoryGetIn.resetFlags(true, true);
      addInput("ItemCategory", ItemCategoryObjectKeyHelper.toMap(itemCategoryGetIn, new HashMap(), "ItemCategoryObjectKeyData").get("ItemCategoryObjectKeyData"));
    }
  }


/**
 *
 * Sets the ItemCategory
 * @param itemCategoryGetInIn Value of the itemCategoryGetIn
 *
 */

  public void setItemCategory(ItemCategoryObjectKeyData itemCategoryGetInIn) {
    itemCategoryGetIn = itemCategoryGetInIn;
  }

  public void translateFromMap() {
    itemCategoryGetIn = ItemCategoryObjectKeyHelper.fromMap(inputMap, "ItemCategory");
  }

/**
 *
 * Gets the ItemCategory
 * @return Value of the ItemCategory
 *
 */

  public ItemCategoryObjectKeyData getItemCategory( ) {
    return itemCategoryGetIn;
  }

}
