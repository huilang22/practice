/*
 * Generated code DO NOT EDIT
 * Generated file: TimezoneDeleteBulkUdtTemplateItem.java
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
 * Class used to create a TimezoneDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class TimezoneDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TimezoneObjectKeyData TZDeleteIn;
/**
 *
 * Constructor to create a  TimezoneDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TimezoneDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, TimezoneObjectKeyData TZDeleteInIn) {
    super(id, context, "TimezoneDelete");
    TZDeleteIn = TZDeleteInIn;
  }

  public void translateToMap() {
    if (TZDeleteIn != null) {
      TZDeleteIn.resetFlags(true, true);
      addInput("Timezone", TimezoneObjectKeyHelper.toMap(TZDeleteIn, new HashMap(), "TimezoneObjectKeyData").get("TimezoneObjectKeyData"));
    }
  }


/**
 *
 * Sets the Timezone
 * @param TZDeleteInIn Value of the TZDeleteIn
 *
 */

  public void setTimezone(TimezoneObjectKeyData TZDeleteInIn) {
    TZDeleteIn = TZDeleteInIn;
  }

  public void translateFromMap() {
    TZDeleteIn = TimezoneObjectKeyHelper.fromMap(inputMap, "Timezone");
  }

/**
 *
 * Gets the Timezone
 * @return Value of the Timezone
 *
 */

  public TimezoneObjectKeyData getTimezone( ) {
    return TZDeleteIn;
  }

}
