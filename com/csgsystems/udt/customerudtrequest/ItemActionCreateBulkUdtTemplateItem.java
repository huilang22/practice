/*
 * Generated code DO NOT EDIT
 * Generated file: ItemActionCreateBulkUdtTemplateItem.java
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
 * Class used to create a ItemActionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemActionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemActionObjectData ItemActionCreateIn;
/**
 *
 * Constructor to create a  ItemActionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemActionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemActionObjectData ItemActionCreateInIn) {
    super(id, context, "ItemActionCreate");
    ItemActionCreateIn = ItemActionCreateInIn;
  }

  public void translateToMap() {
    if (ItemActionCreateIn != null) {
      ItemActionCreateIn.resetFlags(true, true);
      addInput("ItemAction", ItemActionObjectHelper.toMap(ItemActionCreateIn, new HashMap(), "ItemAction").get("ItemAction"));
    }
  }


/**
 *
 * Sets the ItemAction
 * @param ItemActionCreateInIn Value of the ItemActionCreateIn
 *
 */

  public void setItemAction(ItemActionObjectData ItemActionCreateInIn) {
    ItemActionCreateIn = ItemActionCreateInIn;
  }

  public void translateFromMap() {
    ItemActionCreateIn = ItemActionObjectHelper.fromMap(inputMap, "ItemAction");
  }

/**
 *
 * Gets the ItemAction
 * @return Value of the ItemAction
 *
 */

  public ItemActionObjectData getItemAction( ) {
    return ItemActionCreateIn;
  }

}
