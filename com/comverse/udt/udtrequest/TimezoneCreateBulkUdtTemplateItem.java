/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TimezoneCreateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a TimezoneCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class TimezoneCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TimezoneObjectData TZCreateIn;
/**
 *
 * Constructor to create a  TimezoneCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TimezoneCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, TimezoneObjectData TZCreateInIn) {
    super(id, context, "TimezoneCreate");
    TZCreateIn = TZCreateInIn;
  }

  public void translateToMap() {
    if (TZCreateIn != null) {
      TZCreateIn.resetFlags(true, true);
      addInput("Timezone", TimezoneObjectHelper.toMap(TZCreateIn, new HashMap(), "Timezone").get("Timezone"));
    }
  }


/**
 *
 * Sets the Timezone
 * @param TZCreateInIn Value of the TZCreateIn
 *
 */

  public void setTimezone(TimezoneObjectData TZCreateInIn) {
    TZCreateIn = TZCreateInIn;
  }

  public void translateFromMap() {
    TZCreateIn = TimezoneObjectHelper.fromMap(inputMap, "Timezone");
  }

/**
 *
 * Gets the Timezone
 * @return Value of the Timezone
 *
 */

  public TimezoneObjectData getTimezone( ) {
    return TZCreateIn;
  }

}
