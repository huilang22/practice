/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemClearReviseFlagBulkUdtTemplateItem.java
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
 * Class used to create a ItemClearReviseFlagBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemClearReviseFlagBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemObjectData ItemClearRevisionsIn;
/**
 *
 * Constructor to create a  ItemClearReviseFlagBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemClearReviseFlagBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemObjectData ItemClearRevisionsInIn) {
    super(id, context, "ItemClearReviseFlag");
    ItemClearRevisionsIn = ItemClearRevisionsInIn;
  }

  public void translateToMap() {
    if (ItemClearRevisionsIn != null) {
      ItemClearRevisionsIn.resetFlags(true, true);
      addInput("Item", ItemObjectHelper.toMap(ItemClearRevisionsIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the Item
 * @param ItemClearRevisionsInIn Value of the ItemClearRevisionsIn
 *
 */

  public void setItem(ItemObjectData ItemClearRevisionsInIn) {
    ItemClearRevisionsIn = ItemClearRevisionsInIn;
  }

  public void translateFromMap() {
    ItemClearRevisionsIn = ItemObjectHelper.fromMap(inputMap, "Item");
  }

/**
 *
 * Gets the Item
 * @return Value of the Item
 *
 */

  public ItemObjectData getItem( ) {
    return ItemClearRevisionsIn;
  }

}
