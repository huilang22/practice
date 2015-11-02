/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TimezoneGetBulkUdtTemplateItem.java
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
 * Class used to create a TimezoneGetBulkUdtTemplateItem Bulk Template
 *
 */

public class TimezoneGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TimezoneObjectKeyData TZGetIn;
/**
 *
 * Constructor to create a  TimezoneGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TimezoneGetBulkUdtTemplateItem(String id, BSDMSessionContext context, TimezoneObjectKeyData TZGetInIn) {
    super(id, context, "TimezoneGet");
    TZGetIn = TZGetInIn;
  }

  public void translateToMap() {
    if (TZGetIn != null) {
      TZGetIn.resetFlags(true, true);
      addInput("Timezone", TimezoneObjectKeyHelper.toMap(TZGetIn, new HashMap(), "TimezoneObjectKeyData").get("TimezoneObjectKeyData"));
    }
  }


/**
 *
 * Sets the Timezone
 * @param TZGetInIn Value of the TZGetIn
 *
 */

  public void setTimezone(TimezoneObjectKeyData TZGetInIn) {
    TZGetIn = TZGetInIn;
  }

  public void translateFromMap() {
    TZGetIn = TimezoneObjectKeyHelper.fromMap(inputMap, "Timezone");
  }

/**
 *
 * Gets the Timezone
 * @return Value of the Timezone
 *
 */

  public TimezoneObjectKeyData getTimezone( ) {
    return TZGetIn;
  }

}
