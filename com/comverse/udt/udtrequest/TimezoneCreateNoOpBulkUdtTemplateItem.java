/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TimezoneCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TimezoneCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TimezoneCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TimezoneObjectData noOpIn;

/**
 *
 * Constructor to create a   TimezoneCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TimezoneCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TimezoneObjectData noOpInIn) {
    super(id, context, "TimezoneCreate");
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
