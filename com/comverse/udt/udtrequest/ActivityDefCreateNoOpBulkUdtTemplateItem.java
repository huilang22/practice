/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ActivityDefCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ActivityDefCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ActivityDefCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ActivityDefObjectData noOpIn;

/**
 *
 * Constructor to create a   ActivityDefCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ActivityDefCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ActivityDefObjectData noOpInIn) {
    super(id, context, "ActivityDefCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ActivityDef", ActivityDefObjectHelper.toMap(noOpIn, new HashMap(), "ActivityDef").get("ActivityDef"));
    }
  }
/**
 *
 * Sets the  ActivityDef
 * @param noOpInIn ActivityDefObjectData to set
 *
 */
  public void setActivityDef(ActivityDefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ActivityDef passed into the constructor
 * @return Simulated response
 *
 */
  public ActivityDefObjectData getActivityDef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ActivityDefObjectHelper.fromMap(inputMap, "ActivityDef");
  }
}
