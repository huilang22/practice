/*
 * Generated code DO NOT EDIT
 * Generated file: CtcGeoAreaScheduleDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcGeoAreaScheduleDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcGeoAreaScheduleDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcGeoAreaScheduleObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcGeoAreaScheduleDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcGeoAreaScheduleDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGeoAreaScheduleObjectData noOpInIn) {
    super(id, context, "CtcGeoAreaScheduleDelete");
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
