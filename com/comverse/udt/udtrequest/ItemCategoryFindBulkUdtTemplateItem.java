/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryFindBulkUdtTemplateItem.java
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
 * Class used to create a ItemCategoryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemCategoryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemCategoryObjectFilter itemCategoryFindIn;
/**
 *
 * Constructor to create a  ItemCategoryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemCategoryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemCategoryObjectFilter itemCategoryFindInIn) {
    super(id, context, "ItemCategoryFind");
    itemCategoryFindIn = itemCategoryFindInIn;
  }

  public void translateToMap() {
    if (itemCategoryFindIn != null) {
      Integer index =  itemCategoryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemCategory", ItemCategoryObjectHelper.toMap(itemCategoryFindIn, new HashMap(), "ItemCategory").get("ItemCategory"));
    }
  }


/**
 *
 * Sets the ItemCategory
 * @param itemCategoryFindInIn Value of the itemCategoryFindIn
 *
 */

  public void setItemCategory(ItemCategoryObjectFilter itemCategoryFindInIn) {
    itemCategoryFindIn = itemCategoryFindInIn;
  }

  public void translateFromMap() {
    itemCategoryFindIn = ItemCategoryObjectHelper.fromMapFilter(inputMap, "ItemCategory");
  }

/**
 *
 * Gets the ItemCategory
 * @return Value of the ItemCategory
 *
 */

  public ItemCategoryObjectFilter getItemCategory( ) {
    return itemCategoryFindIn;
  }

}
