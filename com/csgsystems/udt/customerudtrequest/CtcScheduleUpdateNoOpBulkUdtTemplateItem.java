/*
 * Generated code DO NOT EDIT
 * Generated file: CtcScheduleUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcScheduleUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcScheduleUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcScheduleObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcScheduleUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcScheduleUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcScheduleObjectData noOpInIn) {
    super(id, context, "CtcScheduleUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(noOpIn, new HashMap(), "CtcSchedule").get("CtcSchedule"));
    }
  }
/**
 *
 * Sets the  CtcSchedule
 * @param noOpInIn CtcScheduleObjectData to set
 *
 */
  public void setCtcSchedule(CtcScheduleObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcSchedule passed into the constructor
 * @return Simulated response
 *
 */
  public CtcScheduleObjectData getCtcSchedule() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcScheduleObjectHelper.fromMap(inputMap, "CtcSchedule");
  }
}
