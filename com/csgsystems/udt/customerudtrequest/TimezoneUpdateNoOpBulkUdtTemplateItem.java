/*
 * Generated code DO NOT EDIT
 * Generated file: TimezoneUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TimezoneUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TimezoneUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TimezoneObjectData noOpIn;

/**
 *
 * Constructor to create a   TimezoneUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TimezoneUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TimezoneObjectData noOpInIn) {
    super(id, context, "TimezoneUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Timezone", TimezoneObjectHelper.toMap(noOpIn, new HashMap(), "Timezone").get("Timezone"));
    }
  }
/**
 *
 * Sets the  Timezone
 * @param noOpInIn TimezoneObjectData to set
 *
 */
  public void setTimezone(TimezoneObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Timezone passed into the constructor
 * @return Simulated response
 *
 */
  public TimezoneObjectData getTimezone() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TimezoneObjectHelper.fromMap(inputMap, "Timezone");
  }
}
