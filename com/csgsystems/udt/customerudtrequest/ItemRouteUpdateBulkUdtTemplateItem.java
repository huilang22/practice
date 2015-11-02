/*
 * Generated code DO NOT EDIT
 * Generated file: ItemRouteUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ItemRouteUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ItemRouteUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ItemRouteObjectData ItemRouteUpdateIn;
/**
 *
 * Constructor to create a  ItemRouteUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ItemRouteUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemRouteObjectData ItemRouteUpdateInIn) {
    super(id, context, "ItemRouteUpdate");
    ItemRouteUpdateIn = ItemRouteUpdateInIn;
  }

  public void translateToMap() {
    if (ItemRouteUpdateIn != null) {
      ItemRouteUpdateIn.resetFlags(true, true);
      addInput("ItemRoute", ItemRouteObjectHelper.toMap(ItemRouteUpdateIn, new HashMap(), "ItemRoute").get("ItemRoute"));
    }
  }


/**
 *
 * Sets the ItemRoute
 * @param ItemRouteUpdateInIn Value of the ItemRouteUpdateIn
 *
 */

  public void setItemRoute(ItemRouteObjectData ItemRouteUpdateInIn) {
    ItemRouteUpdateIn = ItemRouteUpdateInIn;
  }

  public void translateFromMap() {
    ItemRouteUpdateIn = ItemRouteObjectHelper.fromMap(inputMap, "ItemRoute");
  }

/**
 *
 * Gets the ItemRoute
 * @return Value of the ItemRoute
 *
 */

  public ItemRouteObjectData getItemRoute( ) {
    return ItemRouteUpdateIn;
  }

}
