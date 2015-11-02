/*
 * Generated code DO NOT EDIT
 * Generated file: OrderExtendedDataFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OrderExtendedDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderExtendedDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderEDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   OrderExtendedDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderExtendedDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderEDObjectDataList noOpInIn) {
    super(id, context, "OrderExtendedDataFind");
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
        mapArray[i] = OrderEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OrderExtendedData", noOpIn);
      }
      addInput("OrderExtendedData", mapList);
    }
  }
/**
 *
 * Sets the  OrderExtendedData
 * @param noOpInIn OrderEDObjectDataList to set
 *
 */
  public void setOrderExtendedData(OrderEDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderEDObjectDataList getOrderExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderEDObjectHelper.fromMapList(inputMap, "OrderExtendedDataList");
  }
}
