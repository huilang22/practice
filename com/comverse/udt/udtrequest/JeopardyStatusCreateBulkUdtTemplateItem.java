/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JeopardyStatusCreateBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * Class used to create a JeopardyStatusCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class JeopardyStatusCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected JeopardyStatusObjectData JeopardyStatusCreateIn;
/**
 *
 * Constructor to create a  JeopardyStatusCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public JeopardyStatusCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, JeopardyStatusObjectData JeopardyStatusCreateInIn) {
    super(id, context, "JeopardyStatusCreate");
    JeopardyStatusCreateIn = JeopardyStatusCreateInIn;
  }

  public void translateToMap() {
    if (JeopardyStatusCreateIn != null) {
      JeopardyStatusCreateIn.resetFlags(true, true);
      addInput("JeopardyStatus", JeopardyStatusObjectHelper.toMap(JeopardyStatusCreateIn, new HashMap(), "JeopardyStatus").get("JeopardyStatus"));
    }
  }


/**
 *
 * Sets the JeopardyStatus
 * @param JeopardyStatusCreateInIn Value of the JeopardyStatusCreateIn
 *
 */

  public void setJeopardyStatus(JeopardyStatusObjectData JeopardyStatusCreateInIn) {
    JeopardyStatusCreateIn = JeopardyStatusCreateInIn;
  }

  public void translateFromMap() {
    JeopardyStatusCreateIn = JeopardyStatusObjectHelper.fromMap(inputMap, "JeopardyStatus");
  }

/**
 *
 * Gets the JeopardyStatus
 * @return Value of the JeopardyStatus
 *
 */

  public JeopardyStatusObjectData getJeopardyStatus( ) {
    return JeopardyStatusCreateIn;
  }

}
