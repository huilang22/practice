/*
 * Generated code DO NOT EDIT
 * Generated file: TimezoneFindBulkUdtTemplateItem.java
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
 * Class used to create a TimezoneFindBulkUdtTemplateItem Bulk Template
 *
 */

public class TimezoneFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TimezoneObjectFilter TZFindIn;
/**
 *
 * Constructor to create a  TimezoneFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TimezoneFindBulkUdtTemplateItem(String id, BSDMSessionContext context, TimezoneObjectFilter TZFindInIn) {
    super(id, context, "TimezoneFind");
    TZFindIn = TZFindInIn;
  }

  public void translateToMap() {
    if (TZFindIn != null) {
      Integer index =  TZFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Timezone", TimezoneObjectHelper.toMap(TZFindIn, new HashMap(), "Timezone").get("Timezone"));
    }
  }


/**
 *
 * Sets the Timezone
 * @param TZFindInIn Value of the TZFindIn
 *
 */

  public void setTimezone(TimezoneObjectFilter TZFindInIn) {
    TZFindIn = TZFindInIn;
  }

  public void translateFromMap() {
    TZFindIn = TimezoneObjectHelper.fromMapFilter(inputMap, "Timezone");
  }

/**
 *
 * Gets the Timezone
 * @return Value of the Timezone
 *
 */

  public TimezoneObjectFilter getTimezone( ) {
    return TZFindIn;
  }

}
