/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrCalendarUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RbrCalendarUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrCalendarUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrCalendarObjectData RbrCalUpdIn;
/**
 *
 * Constructor to create a  RbrCalendarUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrCalendarUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrCalendarObjectData RbrCalUpdInIn) {
    super(id, context, "RbrCalendarUpdate");
    RbrCalUpdIn = RbrCalUpdInIn;
  }

  public void translateToMap() {
    if (RbrCalUpdIn != null) {
      RbrCalUpdIn.resetFlags(true, true);
      addInput("RbrCalendar", RbrCalendarObjectHelper.toMap(RbrCalUpdIn, new HashMap(), "RbrCalendar").get("RbrCalendar"));
    }
  }


/**
 *
 * Sets the RbrCalendar
 * @param RbrCalUpdInIn Value of the RbrCalUpdIn
 *
 */

  public void setRbrCalendar(RbrCalendarObjectData RbrCalUpdInIn) {
    RbrCalUpdIn = RbrCalUpdInIn;
  }

  public void translateFromMap() {
    RbrCalUpdIn = RbrCalendarObjectHelper.fromMap(inputMap, "RbrCalendar");
  }

/**
 *
 * Gets the RbrCalendar
 * @return Value of the RbrCalendar
 *
 */

  public RbrCalendarObjectData getRbrCalendar( ) {
    return RbrCalUpdIn;
  }

}
