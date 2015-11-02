/*
 * Generated code DO NOT EDIT
 * Generated file: LogicalServiceOrderFindBulkUdtTemplateItem.java
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
 * Class used to create a LogicalServiceOrderFindBulkUdtTemplateItem Bulk Template
 *
 */

public class LogicalServiceOrderFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LogicalServiceOrderObjectFilter LogicalServiceOrderFindIn;
/**
 *
 * Constructor to create a  LogicalServiceOrderFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LogicalServiceOrderFindBulkUdtTemplateItem(String id, BSDMSessionContext context, LogicalServiceOrderObjectFilter LogicalServiceOrderFindInIn) {
    super(id, context, "LogicalServiceOrderFind");
    LogicalServiceOrderFindIn = LogicalServiceOrderFindInIn;
  }

  public void translateToMap() {
    if (LogicalServiceOrderFindIn != null) {
      Integer index =  LogicalServiceOrderFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LogicalServiceOrder", LogicalServiceOrderObjectHelper.toMap(LogicalServiceOrderFindIn, new HashMap(), "LogicalServiceOrder").get("LogicalServiceOrder"));
    }
  }


/**
 *
 * Sets the LogicalServiceOrder
 * @param LogicalServiceOrderFindInIn Value of the LogicalServiceOrderFindIn
 *
 */

  public void setLogicalServiceOrder(LogicalServiceOrderObjectFilter LogicalServiceOrderFindInIn) {
    LogicalServiceOrderFindIn = LogicalServiceOrderFindInIn;
  }

  public void translateFromMap() {
    LogicalServiceOrderFindIn = LogicalServiceOrderObjectHelper.fromMapFilter(inputMap, "LogicalServiceOrder");
  }

/**
 *
 * Gets the LogicalServiceOrder
 * @return Value of the LogicalServiceOrder
 *
 */

  public LogicalServiceOrderObjectFilter getLogicalServiceOrder( ) {
    return LogicalServiceOrderFindIn;
  }

}
