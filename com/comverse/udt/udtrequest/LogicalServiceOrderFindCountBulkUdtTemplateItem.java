/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogicalServiceOrderFindCountBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a LogicalServiceOrderFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class LogicalServiceOrderFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LogicalServiceOrderObjectFilter LogicalServiceOrderFindCountIn;
/**
 *
 * Constructor to create a  LogicalServiceOrderFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LogicalServiceOrderFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, LogicalServiceOrderObjectFilter LogicalServiceOrderFindCountInIn) {
    super(id, context, "LogicalServiceOrderFindCount");
    LogicalServiceOrderFindCountIn = LogicalServiceOrderFindCountInIn;
  }

  public void translateToMap() {
    if (LogicalServiceOrderFindCountIn != null) {
      Integer index =  LogicalServiceOrderFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LogicalServiceOrder", LogicalServiceOrderObjectHelper.toMap(LogicalServiceOrderFindCountIn, new HashMap(), "LogicalServiceOrderCount").get("LogicalServiceOrderCount"));
    }
  }


/**
 *
 * Sets the LogicalServiceOrder
 * @param LogicalServiceOrderFindCountInIn Value of the LogicalServiceOrderFindCountIn
 *
 */

  public void setLogicalServiceOrder(LogicalServiceOrderObjectFilter LogicalServiceOrderFindCountInIn) {
    LogicalServiceOrderFindCountIn = LogicalServiceOrderFindCountInIn;
  }

  public void translateFromMap() {
    LogicalServiceOrderFindCountIn = LogicalServiceOrderObjectHelper.fromMapFilter(inputMap, "LogicalServiceOrder");
  }

/**
 *
 * Gets the LogicalServiceOrder
 * @return Value of the LogicalServiceOrder
 *
 */

  public LogicalServiceOrderObjectFilter getLogicalServiceOrder( ) {
    return LogicalServiceOrderFindCountIn;
  }

}
