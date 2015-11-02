/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrCalendarGetBulkUdtTemplateItem.java
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
 * Class used to create a RbrCalendarGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrCalendarGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrCalendarObjectKeyData RbrCalGetIn;
/**
 *
 * Constructor to create a  RbrCalendarGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrCalendarGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrCalendarObjectKeyData RbrCalGetInIn) {
    super(id, context, "RbrCalendarGet");
    RbrCalGetIn = RbrCalGetInIn;
  }

  public void translateToMap() {
    if (RbrCalGetIn != null) {
      RbrCalGetIn.resetFlags(true, true);
      addInput("RbrCalendar", RbrCalendarObjectKeyHelper.toMap(RbrCalGetIn, new HashMap(), "RbrCalendarObjectKeyData").get("RbrCalendarObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrCalendar
 * @param RbrCalGetInIn Value of the RbrCalGetIn
 *
 */

  public void setRbrCalendar(RbrCalendarObjectKeyData RbrCalGetInIn) {
    RbrCalGetIn = RbrCalGetInIn;
  }

  public void translateFromMap() {
    RbrCalGetIn = RbrCalendarObjectKeyHelper.fromMap(inputMap, "RbrCalendar");
  }

/**
 *
 * Gets the RbrCalendar
 * @return Value of the RbrCalendar
 *
 */

  public RbrCalendarObjectKeyData getRbrCalendar( ) {
    return RbrCalGetIn;
  }

}
