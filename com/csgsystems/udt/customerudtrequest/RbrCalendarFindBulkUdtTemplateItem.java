/*
 * Generated code DO NOT EDIT
 * Generated file: RbrCalendarFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a RbrCalendarFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrCalendarFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrCalendarObjectFilter RbrCalFndIn;
/**
 *
 * Constructor to create a  RbrCalendarFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrCalendarFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrCalendarObjectFilter RbrCalFndInIn) {
    super(id, context, "RbrCalendarFind");
    RbrCalFndIn = RbrCalFndInIn;
  }

  public void translateToMap() {
    if (RbrCalFndIn != null) {
      Integer index =  RbrCalFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrCalendar", RbrCalendarObjectHelper.toMap(RbrCalFndIn, new HashMap(), "RbrCalendar").get("RbrCalendar"));
    }
  }


/**
 *
 * Sets the RbrCalendar
 * @param RbrCalFndInIn Value of the RbrCalFndIn
 *
 */

  public void setRbrCalendar(RbrCalendarObjectFilter RbrCalFndInIn) {
    RbrCalFndIn = RbrCalFndInIn;
  }

  public void translateFromMap() {
    RbrCalFndIn = RbrCalendarObjectHelper.fromMapFilter(inputMap, "RbrCalendar");
  }

/**
 *
 * Gets the RbrCalendar
 * @return Value of the RbrCalendar
 *
 */

  public RbrCalendarObjectFilter getRbrCalendar( ) {
    return RbrCalFndIn;
  }

}
