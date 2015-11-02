/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ItemFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemObjectFilter ItemFindIn;
/**
 *
 * Constructor to create a  ItemFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemObjectFilter ItemFindInIn) {
    super(id, context, "ItemFind");
    ItemFindIn = ItemFindInIn;
  }

  public void translateToMap() {
    if (ItemFindIn != null) {
      Integer index =  ItemFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Item", ItemObjectHelper.toMap(ItemFindIn, new HashMap(), "Item").get("Item"));
    }
  }


/**
 *
 * Sets the Item
 * @param ItemFindInIn Value of the ItemFindIn
 *
 */

  public void setItem(ItemObjectFilter ItemFindInIn) {
    ItemFindIn = ItemFindInIn;
  }

  public void translateFromMap() {
    ItemFindIn = ItemObjectHelper.fromMapFilter(inputMap, "Item");
  }

/**
 *
 * Gets the Item
 * @return Value of the Item
 *
 */

  public ItemObjectFilter getItem( ) {
    return ItemFindIn;
  }

}
