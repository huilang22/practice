/*
 * Generated code DO NOT EDIT
 * Generated file: JeopardyStatusCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a JeopardyStatusCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class JeopardyStatusCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected JeopardyStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   JeopardyStatusCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public JeopardyStatusCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, JeopardyStatusObjectData noOpInIn) {
    super(id, context, "JeopardyStatusCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("JeopardyStatus", JeopardyStatusObjectHelper.toMap(noOpIn, new HashMap(), "JeopardyStatus").get("JeopardyStatus"));
    }
  }
/**
 *
 * Sets the  JeopardyStatus
 * @param noOpInIn JeopardyStatusObjectData to set
 *
 */
  public void setJeopardyStatus(JeopardyStatusObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the JeopardyStatus passed into the constructor
 * @return Simulated response
 *
 */
  public JeopardyStatusObjectData getJeopardyStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = JeopardyStatusObjectHelper.fromMap(inputMap, "JeopardyStatus");
  }
}
