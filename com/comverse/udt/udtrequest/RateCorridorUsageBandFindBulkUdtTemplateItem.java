/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageBandFindBulkUdtTemplateItem.java
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
 * Class used to create a RateCorridorUsageBandFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCorridorUsageBandFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUBOverrideObjectFilter RUBOFindIn;
/**
 *
 * Constructor to create a  RateCorridorUsageBandFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCorridorUsageBandFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RUBOverrideObjectFilter RUBOFindInIn) {
    super(id, context, "RateCorridorUsageBandFind");
    RUBOFindIn = RUBOFindInIn;
  }

  public void translateToMap() {
    if (RUBOFindIn != null) {
      Integer index =  RUBOFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateCorridorUsageBand", RUBOverrideObjectHelper.toMap(RUBOFindIn, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
  }


/**
 *
 * Sets the RateCorridorUsageBand
 * @param RUBOFindInIn Value of the RUBOFindIn
 *
 */

  public void setRateCorridorUsageBand(RUBOverrideObjectFilter RUBOFindInIn) {
    RUBOFindIn = RUBOFindInIn;
  }

  public void translateFromMap() {
    RUBOFindIn = RUBOverrideObjectHelper.fromMapFilter(inputMap, "RateCorridorUsageBand");
  }

/**
 *
 * Gets the RateCorridorUsageBand
 * @return Value of the RateCorridorUsageBand
 *
 */

  public RUBOverrideObjectFilter getRateCorridorUsageBand( ) {
    return RUBOFindIn;
  }

}
