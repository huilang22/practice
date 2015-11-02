/*
 * Generated code DO NOT EDIT
 * Generated file: LogicalServiceOrderGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LogicalServiceOrderGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LogicalServiceOrderGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LogicalServiceOrderObjectData noOpIn;

/**
 *
 * Constructor to create a   LogicalServiceOrderGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LogicalServiceOrderGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LogicalServiceOrderObjectData noOpInIn) {
    super(id, context, "LogicalServiceOrderGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("LogicalServiceOrder", LogicalServiceOrderObjectHelper.toMap(noOpIn, new HashMap(), "LogicalServiceOrder").get("LogicalServiceOrder"));
    }
  }
/**
 *
 * Sets the  LogicalServiceOrder
 * @param noOpInIn LogicalServiceOrderObjectData to set
 *
 */
  public void setLogicalServiceOrder(LogicalServiceOrderObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LogicalServiceOrder passed into the constructor
 * @return Simulated response
 *
 */
  public LogicalServiceOrderObjectData getLogicalServiceOrder() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LogicalServiceOrderObjectHelper.fromMap(inputMap, "LogicalServiceOrder");
  }
}
