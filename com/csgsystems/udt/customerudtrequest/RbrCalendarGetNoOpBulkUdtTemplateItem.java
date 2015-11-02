/*
 * Generated code DO NOT EDIT
 * Generated file: RbrCalendarGetNoOpBulkUdtTemplateItem.java
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

/**
 *
 * NoOp class used to simulate a RbrCalendarGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrCalendarGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrCalendarObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrCalendarGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrCalendarGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrCalendarObjectData noOpInIn) {
    super(id, context, "RbrCalendarGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RbrCalendar", RbrCalendarObjectHelper.toMap(noOpIn, new HashMap(), "RbrCalendar").get("RbrCalendar"));
    }
  }
/**
 *
 * Sets the  RbrCalendar
 * @param noOpInIn RbrCalendarObjectData to set
 *
 */
  public void setRbrCalendar(RbrCalendarObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrCalendar passed into the constructor
 * @return Simulated response
 *
 */
  public RbrCalendarObjectData getRbrCalendar() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrCalendarObjectHelper.fromMap(inputMap, "RbrCalendar");
  }
}
