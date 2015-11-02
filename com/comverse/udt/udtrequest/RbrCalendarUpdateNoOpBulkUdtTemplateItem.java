/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrCalendarUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a RbrCalendarUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrCalendarUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrCalendarObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrCalendarUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrCalendarUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrCalendarObjectData noOpInIn) {
    super(id, context, "RbrCalendarUpdate");
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
