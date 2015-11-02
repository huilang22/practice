/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ActivityDefUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ActivityDefUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ActivityDefUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ActivityDefObjectData ActivityDefUpdateIn;
/**
 *
 * Constructor to create a  ActivityDefUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ActivityDefUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ActivityDefObjectData ActivityDefUpdateInIn) {
    super(id, context, "ActivityDefUpdate");
    ActivityDefUpdateIn = ActivityDefUpdateInIn;
  }

  public void translateToMap() {
    if (ActivityDefUpdateIn != null) {
      ActivityDefUpdateIn.resetFlags(true, true);
      addInput("ActivityDef", ActivityDefObjectHelper.toMap(ActivityDefUpdateIn, new HashMap(), "ActivityDef").get("ActivityDef"));
    }
  }


/**
 *
 * Sets the ActivityDef
 * @param ActivityDefUpdateInIn Value of the ActivityDefUpdateIn
 *
 */

  public void setActivityDef(ActivityDefObjectData ActivityDefUpdateInIn) {
    ActivityDefUpdateIn = ActivityDefUpdateInIn;
  }

  public void translateFromMap() {
    ActivityDefUpdateIn = ActivityDefObjectHelper.fromMap(inputMap, "ActivityDef");
  }

/**
 *
 * Gets the ActivityDef
 * @return Value of the ActivityDef
 *
 */

  public ActivityDefObjectData getActivityDef( ) {
    return ActivityDefUpdateIn;
  }

}
