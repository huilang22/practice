/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogGenerateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LogGenerateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LogGenerateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LogGenerateOutputData noOpIn;

/**
 *
 * Constructor to create a   LogGenerateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LogGenerateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LogGenerateOutputData noOpInIn) {
    super(id, context, "LogGenerate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("LogGenerateOutputData", LogGenerateOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  LogGenerateOutputData
 * @param noOpInIn LogGenerateOutputData to set
 *
 */
  public void setLogGenerateOutputData(LogGenerateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LogGenerateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public LogGenerateOutputData getLogGenerateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LogGenerateOutputHelper.fromMap(inputMap);
  }
}
