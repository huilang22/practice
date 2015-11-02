/*
 * Generated code DO NOT EDIT
 * Generated file: LogFindBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * Class used to create a LogFindBulkUdtTemplateItem Bulk Template
 *
 */

public class LogFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LogfileObjectData log;
/**
 *
 * Constructor to create a  LogFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LogFindBulkUdtTemplateItem(String id, BSDMSessionContext context, LogfileObjectData logIn) {
    super(id, context, "LogFind");
    log = logIn;
  }

  public void translateToMap() {
    if (log != null) {
      log.resetFlags(true, true);
      addInput("Log", LogfileObjectHelper.toMap(log, new HashMap(), "Log").get("Log"));
    }
  }


/**
 *
 * Sets the Log
 * @param logIn Value of the log
 *
 */

  public void setLog(LogfileObjectData logIn) {
    log = logIn;
  }

  public void translateFromMap() {
    log = LogfileObjectHelper.fromMap(inputMap, "Log");
  }

/**
 *
 * Gets the Log
 * @return Value of the Log
 *
 */

  public LogfileObjectData getLog( ) {
    return log;
  }

}
