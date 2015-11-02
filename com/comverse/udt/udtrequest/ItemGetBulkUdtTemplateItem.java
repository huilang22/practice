/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemGetBulkUdtTemplateItem.java
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
 * Class used to create a ItemGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemObjectKeyData ItemGetIn;
/**
 *
 * Constructor to create a  ItemGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemObjectKeyData ItemGetInIn) {
    super(id, context, "ItemGet");
    ItemGetIn = ItemGetInIn;
  }

  public void translateToMap() {
    if (ItemGetIn != null) {
      ItemGetIn.resetFlags(true, true);
      addInput("Item", ItemObjectKeyHelper.toMap(ItemGetIn, new HashMap(), "ItemObjectKeyData").get("ItemObjectKeyData"));
    }
  }


/**
 *
 * Sets the Item
 * @param ItemGetInIn Value of the ItemGetIn
 *
 */

  public void setItem(ItemObjectKeyData ItemGetInIn) {
    ItemGetIn = ItemGetInIn;
  }

  public void translateFromMap() {
    ItemGetIn = ItemObjectKeyHelper.fromMap(inputMap, "Item");
  }

/**
 *
 * Gets the Item
 * @return Value of the Item
 *
 */

  public ItemObjectKeyData getItem( ) {
    return ItemGetIn;
  }

}
