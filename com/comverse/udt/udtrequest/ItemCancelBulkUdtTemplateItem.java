/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCancelBulkUdtTemplateItem.java
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
 * Class used to create a ItemCancelBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemCancelBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemObjectData ItemCancelIn;
/**
 *
 * Constructor to create a  ItemCancelBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemCancelBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemObjectData ItemCancelInIn) {
    super(id, context, "ItemCancel");
    ItemCancelIn = ItemCancelInIn;
  }

  public void translateToMap() {
    if (ItemCancelIn != null) {
      ItemCancelIn.resetFlags(true, true);
      addInput("Item", ItemObjectHelper.toMap(ItemCancelIn, new HashMap(), "Item").get("Item"));
    }
  }


/**
 *
 * Sets the Item
 * @param ItemCancelInIn Value of the ItemCancelIn
 *
 */

  public void setItem(ItemObjectData ItemCancelInIn) {
    ItemCancelIn = ItemCancelInIn;
  }

  public void translateFromMap() {
    ItemCancelIn = ItemObjectHelper.fromMap(inputMap, "Item");
  }

/**
 *
 * Gets the Item
 * @return Value of the Item
 *
 */

  public ItemObjectData getItem( ) {
    return ItemCancelIn;
  }

}
