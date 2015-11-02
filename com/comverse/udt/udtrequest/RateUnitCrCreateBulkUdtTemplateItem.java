/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUnitCrCreateBulkUdtTemplateItem.java
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
 * Class used to create a RateUnitCrCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUnitCrCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUnitCrObjectData rucCrIn;
/**
 *
 * Constructor to create a  RateUnitCrCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUnitCrCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUnitCrObjectData rucCrInIn) {
    super(id, context, "RateUnitCrCreate");
    rucCrIn = rucCrInIn;
  }

  public void translateToMap() {
    if (rucCrIn != null) {
      rucCrIn.resetFlags(true, true);
      addInput("RateUnitCr", RateUnitCrObjectHelper.toMap(rucCrIn, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
  }


/**
 *
 * Sets the RateUnitCr
 * @param rucCrInIn Value of the rucCrIn
 *
 */

  public void setRateUnitCr(RateUnitCrObjectData rucCrInIn) {
    rucCrIn = rucCrInIn;
  }

  public void translateFromMap() {
    rucCrIn = RateUnitCrObjectHelper.fromMap(inputMap, "RateUnitCr");
  }

/**
 *
 * Gets the RateUnitCr
 * @return Value of the RateUnitCr
 *
 */

  public RateUnitCrObjectData getRateUnitCr( ) {
    return rucCrIn;
  }

}
