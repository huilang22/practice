/*
 * Generated code DO NOT EDIT
 * Generated file: TimezoneUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a TimezoneUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class TimezoneUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TimezoneObjectData TZUpdateIn;
/**
 *
 * Constructor to create a  TimezoneUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TimezoneUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, TimezoneObjectData TZUpdateInIn) {
    super(id, context, "TimezoneUpdate");
    TZUpdateIn = TZUpdateInIn;
  }

  public void translateToMap() {
    if (TZUpdateIn != null) {
      TZUpdateIn.resetFlags(true, true);
      addInput("Timezone", TimezoneObjectHelper.toMap(TZUpdateIn, new HashMap(), "Timezone").get("Timezone"));
    }
  }


/**
 *
 * Sets the Timezone
 * @param TZUpdateInIn Value of the TZUpdateIn
 *
 */

  public void setTimezone(TimezoneObjectData TZUpdateInIn) {
    TZUpdateIn = TZUpdateInIn;
  }

  public void translateFromMap() {
    TZUpdateIn = TimezoneObjectHelper.fromMap(inputMap, "Timezone");
  }

/**
 *
 * Gets the Timezone
 * @return Value of the Timezone
 *
 */

  public TimezoneObjectData getTimezone( ) {
    return TZUpdateIn;
  }

}
