/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemRouteGetBulkUdtTemplateItem.java
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
 * Class used to create a ItemRouteGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemRouteGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemRouteObjectKeyData ItemRouteGetIn;
/**
 *
 * Constructor to create a  ItemRouteGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemRouteGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemRouteObjectKeyData ItemRouteGetInIn) {
    super(id, context, "ItemRouteGet");
    ItemRouteGetIn = ItemRouteGetInIn;
  }

  public void translateToMap() {
    if (ItemRouteGetIn != null) {
      ItemRouteGetIn.resetFlags(true, true);
      addInput("ItemRoute", ItemRouteObjectKeyHelper.toMap(ItemRouteGetIn, new HashMap(), "ItemRouteObjectKeyData").get("ItemRouteObjectKeyData"));
    }
  }


/**
 *
 * Sets the ItemRoute
 * @param ItemRouteGetInIn Value of the ItemRouteGetIn
 *
 */

  public void setItemRoute(ItemRouteObjectKeyData ItemRouteGetInIn) {
    ItemRouteGetIn = ItemRouteGetInIn;
  }

  public void translateFromMap() {
    ItemRouteGetIn = ItemRouteObjectKeyHelper.fromMap(inputMap, "ItemRoute");
  }

/**
 *
 * Gets the ItemRoute
 * @return Value of the ItemRoute
 *
 */

  public ItemRouteObjectKeyData getItemRoute( ) {
    return ItemRouteGetIn;
  }

}
