/*
 * Generated code DO NOT EDIT
 * Generated file: OrderLevelDeriveBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a OrderLevelDeriveBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderLevelDeriveBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OpenItemIdMapObjectData OrderLevelDeriveIn;
/**
 *
 * Constructor to create a  OrderLevelDeriveBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderLevelDeriveBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemIdMapObjectData OrderLevelDeriveInIn) {
    super(id, context, "OrderLevelDerive");
    OrderLevelDeriveIn = OrderLevelDeriveInIn;
  }

  public void translateToMap() {
    if (OrderLevelDeriveIn != null) {
      OrderLevelDeriveIn.resetFlags(true, true);
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(OrderLevelDeriveIn, new HashMap(), "OrderLevel").get("OrderLevel"));
    }
  }


/**
 *
 * Sets the OpenItemIdMap
 * @param OrderLevelDeriveInIn Value of the OrderLevelDeriveIn
 *
 */

  public void setOpenItemIdMap(OpenItemIdMapObjectData OrderLevelDeriveInIn) {
    OrderLevelDeriveIn = OrderLevelDeriveInIn;
  }

  public void translateFromMap() {
    OrderLevelDeriveIn = OpenItemIdMapObjectHelper.fromMap(inputMap, "OpenItemIdMap");
  }

/**
 *
 * Gets the OpenItemIdMap
 * @return Value of the OpenItemIdMap
 *
 */

  public OpenItemIdMapObjectData getOpenItemIdMap( ) {
    return OrderLevelDeriveIn;
  }

}
