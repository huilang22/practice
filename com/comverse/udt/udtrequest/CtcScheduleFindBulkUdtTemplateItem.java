/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleFindBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcScheduleFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcScheduleFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcScheduleObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcScheduleFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcScheduleFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcScheduleObjectFilter FindInIn) {
    super(id, context, "CtcScheduleFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(FindIn, new HashMap(), "CtcSchedule").get("CtcSchedule"));
    }
  }


/**
 *
 * Sets the CtcSchedule
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcSchedule(CtcScheduleObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcScheduleObjectHelper.fromMapFilter(inputMap, "CtcSchedule");
  }

/**
 *
 * Gets the CtcSchedule
 * @return Value of the CtcSchedule
 *
 */

  public CtcScheduleObjectFilter getCtcSchedule( ) {
    return FindIn;
  }

}
