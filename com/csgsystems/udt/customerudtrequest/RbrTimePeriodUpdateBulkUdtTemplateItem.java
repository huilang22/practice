/*
 * Generated code DO NOT EDIT
 * Generated file: RbrTimePeriodUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RbrTimePeriodUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrTimePeriodUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrTimePeriodObjectData RbrTmPrdUpdIn;
/**
 *
 * Constructor to create a  RbrTimePeriodUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrTimePeriodUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrTimePeriodObjectData RbrTmPrdUpdInIn) {
    super(id, context, "RbrTimePeriodUpdate");
    RbrTmPrdUpdIn = RbrTmPrdUpdInIn;
  }

  public void translateToMap() {
    if (RbrTmPrdUpdIn != null) {
      RbrTmPrdUpdIn.resetFlags(true, true);
      addInput("RbrTimePeriod", RbrTimePeriodObjectHelper.toMap(RbrTmPrdUpdIn, new HashMap(), "RbrTimePeriod").get("RbrTimePeriod"));
    }
  }


/**
 *
 * Sets the RbrTimePeriod
 * @param RbrTmPrdUpdInIn Value of the RbrTmPrdUpdIn
 *
 */

  public void setRbrTimePeriod(RbrTimePeriodObjectData RbrTmPrdUpdInIn) {
    RbrTmPrdUpdIn = RbrTmPrdUpdInIn;
  }

  public void translateFromMap() {
    RbrTmPrdUpdIn = RbrTimePeriodObjectHelper.fromMap(inputMap, "RbrTimePeriod");
  }

/**
 *
 * Gets the RbrTimePeriod
 * @return Value of the RbrTimePeriod
 *
 */

  public RbrTimePeriodObjectData getRbrTimePeriod( ) {
    return RbrTmPrdUpdIn;
  }

}
