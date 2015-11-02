/*
 * Generated code DO NOT EDIT
 * Generated file: LogicalServiceOrderGetBulkUdtTemplateItem.java
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
 * Class used to create a LogicalServiceOrderGetBulkUdtTemplateItem Bulk Template
 *
 */

public class LogicalServiceOrderGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LogicalServiceOrderObjectKeyData LogicalServiceOrderGetIn;
/**
 *
 * Constructor to create a  LogicalServiceOrderGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LogicalServiceOrderGetBulkUdtTemplateItem(String id, BSDMSessionContext context, LogicalServiceOrderObjectKeyData LogicalServiceOrderGetInIn) {
    super(id, context, "LogicalServiceOrderGet");
    LogicalServiceOrderGetIn = LogicalServiceOrderGetInIn;
  }

  public void translateToMap() {
    if (LogicalServiceOrderGetIn != null) {
      LogicalServiceOrderGetIn.resetFlags(true, true);
      addInput("LogicalServiceOrder", LogicalServiceOrderObjectKeyHelper.toMap(LogicalServiceOrderGetIn, new HashMap(), "LogicalServiceOrderObjectKeyData").get("LogicalServiceOrderObjectKeyData"));
    }
  }


/**
 *
 * Sets the LogicalServiceOrder
 * @param LogicalServiceOrderGetInIn Value of the LogicalServiceOrderGetIn
 *
 */

  public void setLogicalServiceOrder(LogicalServiceOrderObjectKeyData LogicalServiceOrderGetInIn) {
    LogicalServiceOrderGetIn = LogicalServiceOrderGetInIn;
  }

  public void translateFromMap() {
    LogicalServiceOrderGetIn = LogicalServiceOrderObjectKeyHelper.fromMap(inputMap, "LogicalServiceOrder");
  }

/**
 *
 * Gets the LogicalServiceOrder
 * @return Value of the LogicalServiceOrder
 *
 */

  public LogicalServiceOrderObjectKeyData getLogicalServiceOrder( ) {
    return LogicalServiceOrderGetIn;
  }

}
