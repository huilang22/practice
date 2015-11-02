/*
 * Generated code DO NOT EDIT
 * Generated file: LogicalServiceOrderDependencyCheckNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LogicalServiceOrderDependencyCheckNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LogicalServiceOrderDependencyCheckNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LogicalServiceOrderDependencyCheckOutputData noOpIn;

/**
 *
 * Constructor to create a   LogicalServiceOrderDependencyCheckNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LogicalServiceOrderDependencyCheckNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LogicalServiceOrderDependencyCheckOutputData noOpInIn) {
    super(id, context, "LogicalServiceOrderDependencyCheck");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("LogicalServiceOrderDependencyCheckOutputData", LogicalServiceOrderDependencyCheckOutputHelper.toMap(noOpIn).get("LogicalServiceOrderDependencyCheckOutputData"));
    }
  }
/**
 *
 * Sets the  LogicalServiceOrderDependencyCheckOutputData
 * @param noOpInIn LogicalServiceOrderDependencyCheckOutputData to set
 *
 */
  public void setLogicalServiceOrderDependencyCheckOutputData(LogicalServiceOrderDependencyCheckOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LogicalServiceOrderDependencyCheckOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public LogicalServiceOrderDependencyCheckOutputData getLogicalServiceOrderDependencyCheckOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LogicalServiceOrderDependencyCheckOutputHelper.fromMap(inputMap);
  }
}
