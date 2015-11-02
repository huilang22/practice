/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGeoAreaScheduleGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcGeoAreaScheduleGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcGeoAreaScheduleGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcGeoAreaScheduleObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcGeoAreaScheduleGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcGeoAreaScheduleGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGeoAreaScheduleObjectData noOpInIn) {
    super(id, context, "CtcGeoAreaScheduleGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectHelper.toMap(noOpIn, new HashMap(), "CtcGeoAreaSchedule").get("CtcGeoAreaSchedule"));
    }
  }
/**
 *
 * Sets the  CtcGeoAreaSchedule
 * @param noOpInIn CtcGeoAreaScheduleObjectData to set
 *
 */
  public void setCtcGeoAreaSchedule(CtcGeoAreaScheduleObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcGeoAreaSchedule passed into the constructor
 * @return Simulated response
 *
 */
  public CtcGeoAreaScheduleObjectData getCtcGeoAreaSchedule() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcGeoAreaScheduleObjectHelper.fromMap(inputMap, "CtcGeoAreaSchedule");
  }
}
