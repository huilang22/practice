/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ActivityDefCreateBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * Class used to create a ActivityDefCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ActivityDefCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ActivityDefObjectData ActivityDefCreateIn;
/**
 *
 * Constructor to create a  ActivityDefCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ActivityDefCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ActivityDefObjectData ActivityDefCreateInIn) {
    super(id, context, "ActivityDefCreate");
    ActivityDefCreateIn = ActivityDefCreateInIn;
  }

  public void translateToMap() {
    if (ActivityDefCreateIn != null) {
      ActivityDefCreateIn.resetFlags(true, true);
      addInput("ActivityDef", ActivityDefObjectHelper.toMap(ActivityDefCreateIn, new HashMap(), "ActivityDef").get("ActivityDef"));
    }
  }


/**
 *
 * Sets the ActivityDef
 * @param ActivityDefCreateInIn Value of the ActivityDefCreateIn
 *
 */

  public void setActivityDef(ActivityDefObjectData ActivityDefCreateInIn) {
    ActivityDefCreateIn = ActivityDefCreateInIn;
  }

  public void translateFromMap() {
    ActivityDefCreateIn = ActivityDefObjectHelper.fromMap(inputMap, "ActivityDef");
  }

/**
 *
 * Gets the ActivityDef
 * @return Value of the ActivityDef
 *
 */

  public ActivityDefObjectData getActivityDef( ) {
    return ActivityDefCreateIn;
  }

}
