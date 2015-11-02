/*
 * Generated code DO NOT EDIT
 * Generated file: RbrTimePeriodCreateBulkUdtTemplateItem.java
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
 * Class used to create a RbrTimePeriodCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrTimePeriodCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrTimePeriodObjectData RbrTmPrdCrIn;
/**
 *
 * Constructor to create a  RbrTimePeriodCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrTimePeriodCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrTimePeriodObjectData RbrTmPrdCrInIn) {
    super(id, context, "RbrTimePeriodCreate");
    RbrTmPrdCrIn = RbrTmPrdCrInIn;
  }

  public void translateToMap() {
    if (RbrTmPrdCrIn != null) {
      RbrTmPrdCrIn.resetFlags(true, true);
      addInput("RbrTimePeriod", RbrTimePeriodObjectHelper.toMap(RbrTmPrdCrIn, new HashMap(), "RbrTimePeriod").get("RbrTimePeriod"));
    }
  }


/**
 *
 * Sets the RbrTimePeriod
 * @param RbrTmPrdCrInIn Value of the RbrTmPrdCrIn
 *
 */

  public void setRbrTimePeriod(RbrTimePeriodObjectData RbrTmPrdCrInIn) {
    RbrTmPrdCrIn = RbrTmPrdCrInIn;
  }

  public void translateFromMap() {
    RbrTmPrdCrIn = RbrTimePeriodObjectHelper.fromMap(inputMap, "RbrTimePeriod");
  }

/**
 *
 * Gets the RbrTimePeriod
 * @return Value of the RbrTimePeriod
 *
 */

  public RbrTimePeriodObjectData getRbrTimePeriod( ) {
    return RbrTmPrdCrIn;
  }

}
