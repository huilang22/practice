/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrCalendarCreateBulkUdtTemplateItem.java
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
 * Class used to create a RbrCalendarCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrCalendarCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrCalendarObjectData RbrCalCrIn;
/**
 *
 * Constructor to create a  RbrCalendarCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrCalendarCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrCalendarObjectData RbrCalCrInIn) {
    super(id, context, "RbrCalendarCreate");
    RbrCalCrIn = RbrCalCrInIn;
  }

  public void translateToMap() {
    if (RbrCalCrIn != null) {
      RbrCalCrIn.resetFlags(true, true);
      addInput("RbrCalendar", RbrCalendarObjectHelper.toMap(RbrCalCrIn, new HashMap(), "RbrCalendar").get("RbrCalendar"));
    }
  }


/**
 *
 * Sets the RbrCalendar
 * @param RbrCalCrInIn Value of the RbrCalCrIn
 *
 */

  public void setRbrCalendar(RbrCalendarObjectData RbrCalCrInIn) {
    RbrCalCrIn = RbrCalCrInIn;
  }

  public void translateFromMap() {
    RbrCalCrIn = RbrCalendarObjectHelper.fromMap(inputMap, "RbrCalendar");
  }

/**
 *
 * Gets the RbrCalendar
 * @return Value of the RbrCalendar
 *
 */

  public RbrCalendarObjectData getRbrCalendar( ) {
    return RbrCalCrIn;
  }

}
