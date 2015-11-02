/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemRouteGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemRouteGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemRouteGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemRouteObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemRouteGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemRouteGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemRouteObjectData noOpInIn) {
    super(id, context, "ItemRouteGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ItemRoute", ItemRouteObjectHelper.toMap(noOpIn, new HashMap(), "ItemRoute").get("ItemRoute"));
    }
  }
/**
 *
 * Sets the  ItemRoute
 * @param noOpInIn ItemRouteObjectData to set
 *
 */
  public void setItemRoute(ItemRouteObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemRoute passed into the constructor
 * @return Simulated response
 *
 */
  public ItemRouteObjectData getItemRoute() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemRouteObjectHelper.fromMap(inputMap, "ItemRoute");
  }
}
