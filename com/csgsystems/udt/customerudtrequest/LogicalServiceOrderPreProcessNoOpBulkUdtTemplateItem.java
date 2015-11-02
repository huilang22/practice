/*
 * Generated code DO NOT EDIT
 * Generated file: LogicalServiceOrderPreProcessNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LogicalServiceOrderPreProcessNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LogicalServiceOrderPreProcessNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LogicalServiceOrderPreProcessOutputData noOpIn;

/**
 *
 * Constructor to create a   LogicalServiceOrderPreProcessNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LogicalServiceOrderPreProcessNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LogicalServiceOrderPreProcessOutputData noOpInIn) {
    super(id, context, "LogicalServiceOrderPreProcess");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("LogicalServiceOrderPreProcessOutputData", LogicalServiceOrderPreProcessOutputHelper.toMap(noOpIn).get("LogicalServiceOrderPreProcessOutputData"));
    }
  }
/**
 *
 * Sets the  LogicalServiceOrderPreProcessOutputData
 * @param noOpInIn LogicalServiceOrderPreProcessOutputData to set
 *
 */
  public void setLogicalServiceOrderPreProcessOutputData(LogicalServiceOrderPreProcessOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LogicalServiceOrderPreProcessOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public LogicalServiceOrderPreProcessOutputData getLogicalServiceOrderPreProcessOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LogicalServiceOrderPreProcessOutputHelper.fromMap(inputMap);
  }
}
