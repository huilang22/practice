/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ActivityDefFindBulkUdtTemplateItem.java
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
 * Class used to create a ActivityDefFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ActivityDefFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ActivityDefObjectFilter ActivityDefFindIn;
/**
 *
 * Constructor to create a  ActivityDefFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ActivityDefFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ActivityDefObjectFilter ActivityDefFindInIn) {
    super(id, context, "ActivityDefFind");
    ActivityDefFindIn = ActivityDefFindInIn;
  }

  public void translateToMap() {
    if (ActivityDefFindIn != null) {
      Integer index =  ActivityDefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ActivityDef", ActivityDefObjectHelper.toMap(ActivityDefFindIn, new HashMap(), "ActivityDef").get("ActivityDef"));
    }
  }


/**
 *
 * Sets the ActivityDef
 * @param ActivityDefFindInIn Value of the ActivityDefFindIn
 *
 */

  public void setActivityDef(ActivityDefObjectFilter ActivityDefFindInIn) {
    ActivityDefFindIn = ActivityDefFindInIn;
  }

  public void translateFromMap() {
    ActivityDefFindIn = ActivityDefObjectHelper.fromMapFilter(inputMap, "ActivityDef");
  }

/**
 *
 * Gets the ActivityDef
 * @return Value of the ActivityDef
 *
 */

  public ActivityDefObjectFilter getActivityDef( ) {
    return ActivityDefFindIn;
  }

}
