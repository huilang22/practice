/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogFileFindBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * Class used to create a LogFileFindBulkUdtTemplateItem Bulk Template
 *
 */

public class LogFileFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LogfileObjectKeyData __log;
/**
 *
 * Constructor to create a  LogFileFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LogFileFindBulkUdtTemplateItem(String id, BSDMSessionContext context, LogfileObjectKeyData __logIn) {
    super(id, context, "LogFileFind");
    __log = __logIn;
  }

  public void translateToMap() {
    if (__log != null) {
      __log.resetFlags(true, true);
      addInput("Log", LogfileObjectKeyHelper.toMap(__log, new HashMap(), "LogfileObjectKeyData").get("LogfileObjectKeyData"));
    }
  }


/**
 *
 * Sets the Log
 * @param __logIn Value of the __log
 *
 */

  public void setLog(LogfileObjectKeyData __logIn) {
    __log = __logIn;
  }

  public void translateFromMap() {
    __log = LogfileObjectKeyHelper.fromMap(inputMap, "Log");
  }

/**
 *
 * Gets the Log
 * @return Value of the Log
 *
 */

  public LogfileObjectKeyData getLog( ) {
    return __log;
  }

}
