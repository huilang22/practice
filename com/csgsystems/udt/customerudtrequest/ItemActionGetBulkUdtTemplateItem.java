/*
 * Generated code DO NOT EDIT
 * Generated file: ItemActionGetBulkUdtTemplateItem.java
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
 * Class used to create a ItemActionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemActionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemActionObjectKeyData ItemActionGetIn;
/**
 *
 * Constructor to create a  ItemActionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemActionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemActionObjectKeyData ItemActionGetInIn) {
    super(id, context, "ItemActionGet");
    ItemActionGetIn = ItemActionGetInIn;
  }

  public void translateToMap() {
    if (ItemActionGetIn != null) {
      ItemActionGetIn.resetFlags(true, true);
      addInput("ItemAction", ItemActionObjectKeyHelper.toMap(ItemActionGetIn, new HashMap(), "ItemActionObjectKeyData").get("ItemActionObjectKeyData"));
    }
  }


/**
 *
 * Sets the ItemAction
 * @param ItemActionGetInIn Value of the ItemActionGetIn
 *
 */

  public void setItemAction(ItemActionObjectKeyData ItemActionGetInIn) {
    ItemActionGetIn = ItemActionGetInIn;
  }

  public void translateFromMap() {
    ItemActionGetIn = ItemActionObjectKeyHelper.fromMap(inputMap, "ItemAction");
  }

/**
 *
 * Gets the ItemAction
 * @return Value of the ItemAction
 *
 */

  public ItemActionObjectKeyData getItemAction( ) {
    return ItemActionGetIn;
  }

}
