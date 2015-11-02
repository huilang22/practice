/*
 * Generated code DO NOT EDIT
 * Generated file: LogicalServiceOrderFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a LogicalServiceOrderFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LogicalServiceOrderFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LogicalServiceOrderObjectDataList noOpIn;

/**
 *
 * Constructor to create a   LogicalServiceOrderFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LogicalServiceOrderFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LogicalServiceOrderObjectDataList noOpInIn) {
    super(id, context, "LogicalServiceOrderFind");
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
        mapArray[i] = LogicalServiceOrderObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LogicalServiceOrder", noOpIn);
      }
      addInput("LogicalServiceOrder", mapList);
    }
  }
/**
 *
 * Sets the  LogicalServiceOrder
 * @param noOpInIn LogicalServiceOrderObjectDataList to set
 *
 */
  public void setLogicalServiceOrder(LogicalServiceOrderObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LogicalServiceOrder passed into the constructor
 * @return Simulated response
 *
 */
  public LogicalServiceOrderObjectDataList getLogicalServiceOrder() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LogicalServiceOrderObjectHelper.fromMapList(inputMap, "LogicalServiceOrderList");
  }
}
