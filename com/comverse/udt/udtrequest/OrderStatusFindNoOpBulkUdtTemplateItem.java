/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderStatusFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderStatusFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderStatusFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderStatusObjectDataList noOpIn;

/**
 *
 * Constructor to create a   OrderStatusFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderStatusFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderStatusObjectDataList noOpInIn) {
    super(id, context, "OrderStatusFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = OrderStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OrderStatus", noOpIn);
      }
      addInput("OrderStatus", mapList);
    }
  }
/**
 *
 * Sets the  OrderStatus
 * @param noOpInIn OrderStatusObjectDataList to set
 *
 */
  public void setOrderStatus(OrderStatusObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderStatus passed into the constructor
 * @return Simulated response
 *
 */
  public OrderStatusObjectDataList getOrderStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderStatusObjectHelper.fromMapList(inputMap, "OrderStatusList");
  }
}
