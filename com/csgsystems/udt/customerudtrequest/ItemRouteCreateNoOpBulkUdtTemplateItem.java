/*
 * Generated code DO NOT EDIT
 * Generated file: ItemRouteCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemRouteCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemRouteCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemRouteObjectData noOpIn;

/**
 *
 * Constructor to create a   ItemRouteCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemRouteCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemRouteObjectData noOpInIn) {
    super(id, context, "ItemRouteCreate");
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
