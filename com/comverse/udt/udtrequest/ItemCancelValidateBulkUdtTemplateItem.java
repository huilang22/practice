/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCancelValidateBulkUdtTemplateItem.java
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
 * Class used to create a ItemCancelValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemCancelValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemObjectData ItemCancelValidateIn;
/**
 *
 * Constructor to create a  ItemCancelValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemCancelValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemObjectData ItemCancelValidateInIn) {
    super(id, context, "ItemCancelValidate");
    ItemCancelValidateIn = ItemCancelValidateInIn;
  }

  public void translateToMap() {
    if (ItemCancelValidateIn != null) {
      ItemCancelValidateIn.resetFlags(true, true);
      addInput("Item", ItemObjectHelper.toMap(ItemCancelValidateIn, new HashMap(), "Item").get("Item"));
    }
  }


/**
 *
 * Sets the Item
 * @param ItemCancelValidateInIn Value of the ItemCancelValidateIn
 *
 */

  public void setItem(ItemObjectData ItemCancelValidateInIn) {
    ItemCancelValidateIn = ItemCancelValidateInIn;
  }

  public void translateFromMap() {
    ItemCancelValidateIn = ItemObjectHelper.fromMap(inputMap, "Item");
  }

/**
 *
 * Gets the Item
 * @return Value of the Item
 *
 */

  public ItemObjectData getItem( ) {
    return ItemCancelValidateIn;
  }

}
