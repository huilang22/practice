/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateNrcCreateBulkUdtTemplateItem.java
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
 * Class used to create a RateNrcCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateNrcCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateNrcObjectData rnrcCrIn;
/**
 *
 * Constructor to create a  RateNrcCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateNrcCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateNrcObjectData rnrcCrInIn) {
    super(id, context, "RateNrcCreate");
    rnrcCrIn = rnrcCrInIn;
  }

  public void translateToMap() {
    if (rnrcCrIn != null) {
      rnrcCrIn.resetFlags(true, true);
      addInput("RateNrc", RateNrcObjectHelper.toMap(rnrcCrIn, new HashMap(), "RateNrc").get("RateNrc"));
    }
  }


/**
 *
 * Sets the RateNrc
 * @param rnrcCrInIn Value of the rnrcCrIn
 *
 */

  public void setRateNrc(RateNrcObjectData rnrcCrInIn) {
    rnrcCrIn = rnrcCrInIn;
  }

  public void translateFromMap() {
    rnrcCrIn = RateNrcObjectHelper.fromMap(inputMap, "RateNrc");
  }

/**
 *
 * Gets the RateNrc
 * @return Value of the RateNrc
 *
 */

  public RateNrcObjectData getRateNrc( ) {
    return rnrcCrIn;
  }

}
