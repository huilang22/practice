/*
 * Generated code DO NOT EDIT
 * Generated file: OrderLookupFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderLookupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderLookupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderLookupObjectDataList noOpIn;

/**
 *
 * Constructor to create a   OrderLookupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderLookupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderLookupObjectDataList noOpInIn) {
    super(id, context, "OrderLookupFind");
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
        mapArray[i] = OrderLookupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OrderLookup", noOpIn);
      }
      addInput("OrderLookup", mapList);
    }
  }
/**
 *
 * Sets the  OrderLookup
 * @param noOpInIn OrderLookupObjectDataList to set
 *
 */
  public void setOrderLookup(OrderLookupObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderLookup passed into the constructor
 * @return Simulated response
 *
 */
  public OrderLookupObjectDataList getOrderLookup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderLookupObjectHelper.fromMapList(inputMap, "OrderLookupList");
  }
}
