/*
 * Generated code DO NOT EDIT
 * Generated file: RbrTimePeriodGetBulkUdtTemplateItem.java
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
 * Class used to create a RbrTimePeriodGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrTimePeriodGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrTimePeriodObjectKeyData RbrTmPrdGetIn;
/**
 *
 * Constructor to create a  RbrTimePeriodGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrTimePeriodGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrTimePeriodObjectKeyData RbrTmPrdGetInIn) {
    super(id, context, "RbrTimePeriodGet");
    RbrTmPrdGetIn = RbrTmPrdGetInIn;
  }

  public void translateToMap() {
    if (RbrTmPrdGetIn != null) {
      RbrTmPrdGetIn.resetFlags(true, true);
      addInput("RbrTimePeriod", RbrTimePeriodObjectKeyHelper.toMap(RbrTmPrdGetIn, new HashMap(), "RbrTimePeriodObjectKeyData").get("RbrTimePeriodObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrTimePeriod
 * @param RbrTmPrdGetInIn Value of the RbrTmPrdGetIn
 *
 */

  public void setRbrTimePeriod(RbrTimePeriodObjectKeyData RbrTmPrdGetInIn) {
    RbrTmPrdGetIn = RbrTmPrdGetInIn;
  }

  public void translateFromMap() {
    RbrTmPrdGetIn = RbrTimePeriodObjectKeyHelper.fromMap(inputMap, "RbrTimePeriod");
  }

/**
 *
 * Gets the RbrTimePeriod
 * @return Value of the RbrTimePeriod
 *
 */

  public RbrTimePeriodObjectKeyData getRbrTimePeriod( ) {
    return RbrTmPrdGetIn;
  }

}
