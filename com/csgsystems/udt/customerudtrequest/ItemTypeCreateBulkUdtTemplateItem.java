/*
 * Generated code DO NOT EDIT
 * Generated file: ItemTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a ItemTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemTypeObjectData ItemTypeCreateIn;
/**
 *
 * Constructor to create a  ItemTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemTypeObjectData ItemTypeCreateInIn) {
    super(id, context, "ItemTypeCreate");
    ItemTypeCreateIn = ItemTypeCreateInIn;
  }

  public void translateToMap() {
    if (ItemTypeCreateIn != null) {
      ItemTypeCreateIn.resetFlags(true, true);
      addInput("ItemType", ItemTypeObjectHelper.toMap(ItemTypeCreateIn, new HashMap(), "ItemType").get("ItemType"));
    }
  }


/**
 *
 * Sets the ItemType
 * @param ItemTypeCreateInIn Value of the ItemTypeCreateIn
 *
 */

  public void setItemType(ItemTypeObjectData ItemTypeCreateInIn) {
    ItemTypeCreateIn = ItemTypeCreateInIn;
  }

  public void translateFromMap() {
    ItemTypeCreateIn = ItemTypeObjectHelper.fromMap(inputMap, "ItemType");
  }

/**
 *
 * Gets the ItemType
 * @return Value of the ItemType
 *
 */

  public ItemTypeObjectData getItemType( ) {
    return ItemTypeCreateIn;
  }

}
