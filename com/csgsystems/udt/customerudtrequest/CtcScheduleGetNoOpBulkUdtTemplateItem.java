/*
 * Generated code DO NOT EDIT
 * Generated file: CtcScheduleGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcScheduleGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcScheduleGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcScheduleObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcScheduleGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcScheduleGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcScheduleObjectData noOpInIn) {
    super(id, context, "CtcScheduleGet");
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
