/*
 * Generated code DO NOT EDIT
 * Generated file: ItemTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ItemTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemTypeObjectData ItemTypeUpdateIn;
/**
 *
 * Constructor to create a  ItemTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemTypeObjectData ItemTypeUpdateInIn) {
    super(id, context, "ItemTypeUpdate");
    ItemTypeUpdateIn = ItemTypeUpdateInIn;
  }

  public void translateToMap() {
    if (ItemTypeUpdateIn != null) {
      ItemTypeUpdateIn.resetFlags(true, true);
      addInput("ItemType", ItemTypeObjectHelper.toMap(ItemTypeUpdateIn, new HashMap(), "ItemType").get("ItemType"));
    }
  }


/**
 *
 * Sets the ItemType
 * @param ItemTypeUpdateInIn Value of the ItemTypeUpdateIn
 *
 */

  public void setItemType(ItemTypeObjectData ItemTypeUpdateInIn) {
    ItemTypeUpdateIn = ItemTypeUpdateInIn;
  }

  public void translateFromMap() {
    ItemTypeUpdateIn = ItemTypeObjectHelper.fromMap(inputMap, "ItemType");
  }

/**
 *
 * Gets the ItemType
 * @return Value of the ItemType
 *
 */

  public ItemTypeObjectData getItemType( ) {
    return ItemTypeUpdateIn;
  }

}
