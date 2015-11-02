/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemRouteCreateBulkUdtTemplateItem.java
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
 * Class used to create a ItemRouteCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemRouteCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemRouteObjectData ItemRouteCreateIn;
/**
 *
 * Constructor to create a  ItemRouteCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemRouteCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemRouteObjectData ItemRouteCreateInIn) {
    super(id, context, "ItemRouteCreate");
    ItemRouteCreateIn = ItemRouteCreateInIn;
  }

  public void translateToMap() {
    if (ItemRouteCreateIn != null) {
      ItemRouteCreateIn.resetFlags(true, true);
      addInput("ItemRoute", ItemRouteObjectHelper.toMap(ItemRouteCreateIn, new HashMap(), "ItemRoute").get("ItemRoute"));
    }
  }


/**
 *
 * Sets the ItemRoute
 * @param ItemRouteCreateInIn Value of the ItemRouteCreateIn
 *
 */

  public void setItemRoute(ItemRouteObjectData ItemRouteCreateInIn) {
    ItemRouteCreateIn = ItemRouteCreateInIn;
  }

  public void translateFromMap() {
    ItemRouteCreateIn = ItemRouteObjectHelper.fromMap(inputMap, "ItemRoute");
  }

/**
 *
 * Gets the ItemRoute
 * @return Value of the ItemRoute
 *
 */

  public ItemRouteObjectData getItemRoute( ) {
    return ItemRouteCreateIn;
  }

}
