/*
 * Generated code DO NOT EDIT
 * Generated file: RbrTimePeriodFindBulkUdtTemplateItem.java
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
 * Class used to create a RbrTimePeriodFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrTimePeriodFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrTimePeriodObjectFilter RbrTmPrdFndIn;
/**
 *
 * Constructor to create a  RbrTimePeriodFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrTimePeriodFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrTimePeriodObjectFilter RbrTmPrdFndInIn) {
    super(id, context, "RbrTimePeriodFind");
    RbrTmPrdFndIn = RbrTmPrdFndInIn;
  }

  public void translateToMap() {
    if (RbrTmPrdFndIn != null) {
      Integer index =  RbrTmPrdFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrTimePeriod", RbrTimePeriodObjectHelper.toMap(RbrTmPrdFndIn, new HashMap(), "RbrTimePeriod").get("RbrTimePeriod"));
    }
  }


/**
 *
 * Sets the RbrTimePeriod
 * @param RbrTmPrdFndInIn Value of the RbrTmPrdFndIn
 *
 */

  public void setRbrTimePeriod(RbrTimePeriodObjectFilter RbrTmPrdFndInIn) {
    RbrTmPrdFndIn = RbrTmPrdFndInIn;
  }

  public void translateFromMap() {
    RbrTmPrdFndIn = RbrTimePeriodObjectHelper.fromMapFilter(inputMap, "RbrTimePeriod");
  }

/**
 *
 * Gets the RbrTimePeriod
 * @return Value of the RbrTimePeriod
 *
 */

  public RbrTimePeriodObjectFilter getRbrTimePeriod( ) {
    return RbrTmPrdFndIn;
  }

}
