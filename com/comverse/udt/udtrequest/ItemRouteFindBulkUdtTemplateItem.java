/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemRouteFindBulkUdtTemplateItem.java
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
 * Class used to create a ItemRouteFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemRouteFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemRouteObjectFilter ItemRouteFindIn;
/**
 *
 * Constructor to create a  ItemRouteFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemRouteFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemRouteObjectFilter ItemRouteFindInIn) {
    super(id, context, "ItemRouteFind");
    ItemRouteFindIn = ItemRouteFindInIn;
  }

  public void translateToMap() {
    if (ItemRouteFindIn != null) {
      Integer index =  ItemRouteFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemRoute", ItemRouteObjectHelper.toMap(ItemRouteFindIn, new HashMap(), "ItemRoute").get("ItemRoute"));
    }
  }


/**
 *
 * Sets the ItemRoute
 * @param ItemRouteFindInIn Value of the ItemRouteFindIn
 *
 */

  public void setItemRoute(ItemRouteObjectFilter ItemRouteFindInIn) {
    ItemRouteFindIn = ItemRouteFindInIn;
  }

  public void translateFromMap() {
    ItemRouteFindIn = ItemRouteObjectHelper.fromMapFilter(inputMap, "ItemRoute");
  }

/**
 *
 * Gets the ItemRoute
 * @return Value of the ItemRoute
 *
 */

  public ItemRouteObjectFilter getItemRoute( ) {
    return ItemRouteFindIn;
  }

}
