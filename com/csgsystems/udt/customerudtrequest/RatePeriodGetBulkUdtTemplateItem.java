/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodGetBulkUdtTemplateItem.java
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
 * Class used to create a RatePeriodGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RatePeriodGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RPObjectKeyData RPGetIn;
/**
 *
 * Constructor to create a  RatePeriodGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatePeriodGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RPObjectKeyData RPGetInIn) {
    super(id, context, "RatePeriodGet");
    RPGetIn = RPGetInIn;
  }

  public void translateToMap() {
    if (RPGetIn != null) {
      RPGetIn.resetFlags(true, true);
      addInput("RatePeriod", RPObjectKeyHelper.toMap(RPGetIn, new HashMap(), "RPObjectKeyData").get("RPObjectKeyData"));
    }
  }


/**
 *
 * Sets the RatePeriod
 * @param RPGetInIn Value of the RPGetIn
 *
 */

  public void setRatePeriod(RPObjectKeyData RPGetInIn) {
    RPGetIn = RPGetInIn;
  }

  public void translateFromMap() {
    RPGetIn = RPObjectKeyHelper.fromMap(inputMap, "RatePeriod");
  }

/**
 *
 * Gets the RatePeriod
 * @return Value of the RatePeriod
 *
 */

  public RPObjectKeyData getRatePeriod( ) {
    return RPGetIn;
  }

}
