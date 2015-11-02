/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a ItemTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemTypeObjectKeyData ItemTypeGetIn;
/**
 *
 * Constructor to create a  ItemTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemTypeObjectKeyData ItemTypeGetInIn) {
    super(id, context, "ItemTypeGet");
    ItemTypeGetIn = ItemTypeGetInIn;
  }

  public void translateToMap() {
    if (ItemTypeGetIn != null) {
      ItemTypeGetIn.resetFlags(true, true);
      addInput("ItemType", ItemTypeObjectKeyHelper.toMap(ItemTypeGetIn, new HashMap(), "ItemTypeObjectKeyData").get("ItemTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the ItemType
 * @param ItemTypeGetInIn Value of the ItemTypeGetIn
 *
 */

  public void setItemType(ItemTypeObjectKeyData ItemTypeGetInIn) {
    ItemTypeGetIn = ItemTypeGetInIn;
  }

  public void translateFromMap() {
    ItemTypeGetIn = ItemTypeObjectKeyHelper.fromMap(inputMap, "ItemType");
  }

/**
 *
 * Gets the ItemType
 * @return Value of the ItemType
 *
 */

  public ItemTypeObjectKeyData getItemType( ) {
    return ItemTypeGetIn;
  }

}
