/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogFileFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LogFileFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LogFileFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected String[] noOpIn;

/**
 *
 * Constructor to create a   LogFileFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LogFileFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, String[] noOpInIn) {
    super(id, context, "LogFileFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("Line", noOpIn);
    }
  }
/**
 *
 * Sets the  Line
 * @param noOpInIn String[] to set
 *
 */
  public void setLine(String[] noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Line passed into the constructor
 * @return Simulated response
 *
 */
  public String[] getLine() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (String[])inputMap.get("Line");
  }
}
