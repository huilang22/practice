/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCreateBulkUdtTemplateItem.java
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
 * Class used to create a ItemCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemObjectData ItemCreateIn;
/**
 *
 * Constructor to create a  ItemCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemObjectData ItemCreateInIn) {
    super(id, context, "ItemCreate");
    ItemCreateIn = ItemCreateInIn;
  }

  public void translateToMap() {
    if (ItemCreateIn != null) {
      ItemCreateIn.resetFlags(true, true);
      addInput("Item", ItemObjectHelper.toMap(ItemCreateIn, new HashMap(), "Item").get("Item"));
    }
  }


/**
 *
 * Sets the Item
 * @param ItemCreateInIn Value of the ItemCreateIn
 *
 */

  public void setItem(ItemObjectData ItemCreateInIn) {
    ItemCreateIn = ItemCreateInIn;
  }

  public void translateFromMap() {
    ItemCreateIn = ItemObjectHelper.fromMap(inputMap, "Item");
  }

/**
 *
 * Gets the Item
 * @return Value of the Item
 *
 */

  public ItemObjectData getItem( ) {
    return ItemCreateIn;
  }

}
