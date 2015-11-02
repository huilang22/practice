/*
 * Generated code DO NOT EDIT
 * Generated file: JeopardyStatusUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * Class used to create a JeopardyStatusUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class JeopardyStatusUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected JeopardyStatusObjectData JeopardyStatusUpdateIn;
/**
 *
 * Constructor to create a  JeopardyStatusUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public JeopardyStatusUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, JeopardyStatusObjectData JeopardyStatusUpdateInIn) {
    super(id, context, "JeopardyStatusUpdate");
    JeopardyStatusUpdateIn = JeopardyStatusUpdateInIn;
  }

  public void translateToMap() {
    if (JeopardyStatusUpdateIn != null) {
      JeopardyStatusUpdateIn.resetFlags(true, true);
      addInput("JeopardyStatus", JeopardyStatusObjectHelper.toMap(JeopardyStatusUpdateIn, new HashMap(), "JeopardyStatus").get("JeopardyStatus"));
    }
  }


/**
 *
 * Sets the JeopardyStatus
 * @param JeopardyStatusUpdateInIn Value of the JeopardyStatusUpdateIn
 *
 */

  public void setJeopardyStatus(JeopardyStatusObjectData JeopardyStatusUpdateInIn) {
    JeopardyStatusUpdateIn = JeopardyStatusUpdateInIn;
  }

  public void translateFromMap() {
    JeopardyStatusUpdateIn = JeopardyStatusObjectHelper.fromMap(inputMap, "JeopardyStatus");
  }

/**
 *
 * Gets the JeopardyStatus
 * @return Value of the JeopardyStatus
 *
 */

  public JeopardyStatusObjectData getJeopardyStatus( ) {
    return JeopardyStatusUpdateIn;
  }

}
