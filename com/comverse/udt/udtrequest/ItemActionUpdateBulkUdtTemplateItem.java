/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemActionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ItemActionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemActionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemActionObjectData ItemActionUpdateIn;
/**
 *
 * Constructor to create a  ItemActionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemActionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemActionObjectData ItemActionUpdateInIn) {
    super(id, context, "ItemActionUpdate");
    ItemActionUpdateIn = ItemActionUpdateInIn;
  }

  public void translateToMap() {
    if (ItemActionUpdateIn != null) {
      ItemActionUpdateIn.resetFlags(true, true);
      addInput("ItemAction", ItemActionObjectHelper.toMap(ItemActionUpdateIn, new HashMap(), "ItemAction").get("ItemAction"));
    }
  }


/**
 *
 * Sets the ItemAction
 * @param ItemActionUpdateInIn Value of the ItemActionUpdateIn
 *
 */

  public void setItemAction(ItemActionObjectData ItemActionUpdateInIn) {
    ItemActionUpdateIn = ItemActionUpdateInIn;
  }

  public void translateFromMap() {
    ItemActionUpdateIn = ItemActionObjectHelper.fromMap(inputMap, "ItemAction");
  }

/**
 *
 * Gets the ItemAction
 * @return Value of the ItemAction
 *
 */

  public ItemActionObjectData getItemAction( ) {
    return ItemActionUpdateIn;
  }

}
