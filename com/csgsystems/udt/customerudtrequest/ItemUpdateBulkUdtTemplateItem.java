/*
 * Generated code DO NOT EDIT
 * Generated file: ItemUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ItemUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemObjectData ItemUpdateIn;
/**
 *
 * Constructor to create a  ItemUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemObjectData ItemUpdateInIn) {
    super(id, context, "ItemUpdate");
    ItemUpdateIn = ItemUpdateInIn;
  }

  public void translateToMap() {
    if (ItemUpdateIn != null) {
      ItemUpdateIn.resetFlags(true, true);
      addInput("Item", ItemObjectHelper.toMap(ItemUpdateIn, new HashMap(), "Item").get("Item"));
    }
  }


/**
 *
 * Sets the Item
 * @param ItemUpdateInIn Value of the ItemUpdateIn
 *
 */

  public void setItem(ItemObjectData ItemUpdateInIn) {
    ItemUpdateIn = ItemUpdateInIn;
  }

  public void translateFromMap() {
    ItemUpdateIn = ItemObjectHelper.fromMap(inputMap, "Item");
  }

/**
 *
 * Gets the Item
 * @return Value of the Item
 *
 */

  public ItemObjectData getItem( ) {
    return ItemUpdateIn;
  }

}
