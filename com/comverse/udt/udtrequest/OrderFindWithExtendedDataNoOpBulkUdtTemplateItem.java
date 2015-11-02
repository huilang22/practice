/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderFindWithExtendedDataNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OrderFindWithExtendedDataNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderFindWithExtendedDataNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderObjectDataList noOpIn;

/**
 *
 * Constructor to create a   OrderFindWithExtendedDataNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderFindWithExtendedDataNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderObjectDataList noOpInIn) {
    super(id, context, "OrderFindWithExtendedData");
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
        mapArray[i] = OrderObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Order", noOpIn);
      }
      addInput("Order", mapList);
    }
  }
/**
 *
 * Sets the  Order
 * @param noOpInIn OrderObjectDataList to set
 *
 */
  public void setOrder(OrderObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Order passed into the constructor
 * @return Simulated response
 *
 */
  public OrderObjectDataList getOrder() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderObjectHelper.fromMapList(inputMap, "OrderList");
  }
}
