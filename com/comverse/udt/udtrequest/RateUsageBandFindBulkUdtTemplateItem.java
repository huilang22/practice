/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageBandFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a RateUsageBandFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUsageBandFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUsageBandObjectFilter RUFindIn;
/**
 *
 * Constructor to create a  RateUsageBandFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUsageBandFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageBandObjectFilter RUFindInIn) {
    super(id, context, "RateUsageBandFind");
    RUFindIn = RUFindInIn;
  }

  public void translateToMap() {
    if (RUFindIn != null) {
      Integer index =  RUFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateUsageBand", RateUsageBandObjectHelper.toMap(RUFindIn, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
  }


/**
 *
 * Sets the RateUsageBand
 * @param RUFindInIn Value of the RUFindIn
 *
 */

  public void setRateUsageBand(RateUsageBandObjectFilter RUFindInIn) {
    RUFindIn = RUFindInIn;
  }

  public void translateFromMap() {
    RUFindIn = RateUsageBandObjectHelper.fromMapFilter(inputMap, "RateUsageBand");
  }

/**
 *
 * Gets the RateUsageBand
 * @return Value of the RateUsageBand
 *
 */

  public RateUsageBandObjectFilter getRateUsageBand( ) {
    return RUFindIn;
  }

}
