/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodCreateBulkUdtTemplateItem.java
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
 * Class used to create a RatePeriodCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RatePeriodCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RPObjectData RPCreateIn;
/**
 *
 * Constructor to create a  RatePeriodCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatePeriodCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RPObjectData RPCreateInIn) {
    super(id, context, "RatePeriodCreate");
    RPCreateIn = RPCreateInIn;
  }

  public void translateToMap() {
    if (RPCreateIn != null) {
      RPCreateIn.resetFlags(true, true);
      addInput("RatePeriod", RPObjectHelper.toMap(RPCreateIn, new HashMap(), "RatePeriod").get("RatePeriod"));
    }
  }


/**
 *
 * Sets the RatePeriod
 * @param RPCreateInIn Value of the RPCreateIn
 *
 */

  public void setRatePeriod(RPObjectData RPCreateInIn) {
    RPCreateIn = RPCreateInIn;
  }

  public void translateFromMap() {
    RPCreateIn = RPObjectHelper.fromMap(inputMap, "RatePeriod");
  }

/**
 *
 * Gets the RatePeriod
 * @return Value of the RatePeriod
 *
 */

  public RPObjectData getRatePeriod( ) {
    return RPCreateIn;
  }

}
