/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGeoAreaScheduleCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcGeoAreaScheduleCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcGeoAreaScheduleCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcGeoAreaScheduleObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcGeoAreaScheduleCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcGeoAreaScheduleCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGeoAreaScheduleObjectData CreateInIn) {
    super(id, context, "CtcGeoAreaScheduleCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectHelper.toMap(CreateIn, new HashMap(), "CtcGeoAreaSchedule").get("CtcGeoAreaSchedule"));
    }
  }


/**
 *
 * Sets the CtcGeoAreaSchedule
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcGeoAreaSchedule(CtcGeoAreaScheduleObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcGeoAreaScheduleObjectHelper.fromMap(inputMap, "CtcGeoAreaSchedule");
  }

/**
 *
 * Gets the CtcGeoAreaSchedule
 * @return Value of the CtcGeoAreaSchedule
 *
 */

  public CtcGeoAreaScheduleObjectData getCtcGeoAreaSchedule( ) {
    return CreateIn;
  }

}
