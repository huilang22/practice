/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryCreateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a ItemCategoryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemCategoryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemCategoryObjectData itemCategoryCreateIn;
/**
 *
 * Constructor to create a  ItemCategoryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemCategoryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryObjectData itemCategoryCreateInIn) {
    super(id, context, "ItemCategoryCreate");
    itemCategoryCreateIn = itemCategoryCreateInIn;
  }

  public void translateToMap() {
    if (itemCategoryCreateIn != null) {
      itemCategoryCreateIn.resetFlags(true, true);
      addInput("ItemCategory", ItemCategoryObjectHelper.toMap(itemCategoryCreateIn, new HashMap(), "ItemCategory").get("ItemCategory"));
    }
  }


/**
 *
 * Sets the ItemCategory
 * @param itemCategoryCreateInIn Value of the itemCategoryCreateIn
 *
 */

  public void setItemCategory(ItemCategoryObjectData itemCategoryCreateInIn) {
    itemCategoryCreateIn = itemCategoryCreateInIn;
  }

  public void translateFromMap() {
    itemCategoryCreateIn = ItemCategoryObjectHelper.fromMap(inputMap, "ItemCategory");
  }

/**
 *
 * Gets the ItemCategory
 * @return Value of the ItemCategory
 *
 */

  public ItemCategoryObjectData getItemCategory( ) {
    return itemCategoryCreateIn;
  }

}
