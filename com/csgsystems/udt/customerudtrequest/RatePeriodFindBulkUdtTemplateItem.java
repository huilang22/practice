/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodFindBulkUdtTemplateItem.java
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
 * Class used to create a RatePeriodFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RatePeriodFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RPObjectFilter RPFindIn;
/**
 *
 * Constructor to create a  RatePeriodFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatePeriodFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RPObjectFilter RPFindInIn) {
    super(id, context, "RatePeriodFind");
    RPFindIn = RPFindInIn;
  }

  public void translateToMap() {
    if (RPFindIn != null) {
      Integer index =  RPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RatePeriod", RPObjectHelper.toMap(RPFindIn, new HashMap(), "RatePeriod").get("RatePeriod"));
    }
  }


/**
 *
 * Sets the RatePeriod
 * @param RPFindInIn Value of the RPFindIn
 *
 */

  public void setRatePeriod(RPObjectFilter RPFindInIn) {
    RPFindIn = RPFindInIn;
  }

  public void translateFromMap() {
    RPFindIn = RPObjectHelper.fromMapFilter(inputMap, "RatePeriod");
  }

/**
 *
 * Gets the RatePeriod
 * @return Value of the RatePeriod
 *
 */

  public RPObjectFilter getRatePeriod( ) {
    return RPFindIn;
  }

}
