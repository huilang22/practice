/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGeoAreaScheduleFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcGeoAreaScheduleFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcGeoAreaScheduleFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcGeoAreaScheduleObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcGeoAreaScheduleFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcGeoAreaScheduleFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGeoAreaScheduleObjectFilter FindInIn) {
    super(id, context, "CtcGeoAreaScheduleFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectHelper.toMap(FindIn, new HashMap(), "CtcGeoAreaSchedule").get("CtcGeoAreaSchedule"));
    }
  }


/**
 *
 * Sets the CtcGeoAreaSchedule
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcGeoAreaSchedule(CtcGeoAreaScheduleObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcGeoAreaScheduleObjectHelper.fromMapFilter(inputMap, "CtcGeoAreaSchedule");
  }

/**
 *
 * Gets the CtcGeoAreaSchedule
 * @return Value of the CtcGeoAreaSchedule
 *
 */

  public CtcGeoAreaScheduleObjectFilter getCtcGeoAreaSchedule( ) {
    return FindIn;
  }

}
