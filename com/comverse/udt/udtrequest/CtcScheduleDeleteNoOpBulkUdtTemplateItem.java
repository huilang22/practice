/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleDeleteNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcScheduleDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcScheduleDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcScheduleObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcScheduleDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcScheduleDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcScheduleObjectData noOpInIn) {
    super(id, context, "CtcScheduleDelete");
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
