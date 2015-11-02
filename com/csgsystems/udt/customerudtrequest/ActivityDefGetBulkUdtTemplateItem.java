/*
 * Generated code DO NOT EDIT
 * Generated file: ActivityDefGetBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * Class used to create a ActivityDefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ActivityDefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ActivityDefObjectKeyData ActivityDefGetIn;
/**
 *
 * Constructor to create a  ActivityDefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ActivityDefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ActivityDefObjectKeyData ActivityDefGetInIn) {
    super(id, context, "ActivityDefGet");
    ActivityDefGetIn = ActivityDefGetInIn;
  }

  public void translateToMap() {
    if (ActivityDefGetIn != null) {
      ActivityDefGetIn.resetFlags(true, true);
      addInput("ActivityDef", ActivityDefObjectKeyHelper.toMap(ActivityDefGetIn, new HashMap(), "ActivityDefObjectKeyData").get("ActivityDefObjectKeyData"));
    }
  }


/**
 *
 * Sets the ActivityDef
 * @param ActivityDefGetInIn Value of the ActivityDefGetIn
 *
 */

  public void setActivityDef(ActivityDefObjectKeyData ActivityDefGetInIn) {
    ActivityDefGetIn = ActivityDefGetInIn;
  }

  public void translateFromMap() {
    ActivityDefGetIn = ActivityDefObjectKeyHelper.fromMap(inputMap, "ActivityDef");
  }

/**
 *
 * Gets the ActivityDef
 * @return Value of the ActivityDef
 *
 */

  public ActivityDefObjectKeyData getActivityDef( ) {
    return ActivityDefGetIn;
  }

}
