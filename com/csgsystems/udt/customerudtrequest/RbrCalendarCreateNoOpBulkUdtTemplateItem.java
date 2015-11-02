/*
 * Generated code DO NOT EDIT
 * Generated file: RbrCalendarCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrCalendarCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrCalendarCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrCalendarObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrCalendarCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrCalendarCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrCalendarObjectData noOpInIn) {
    super(id, context, "RbrCalendarCreate");
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
