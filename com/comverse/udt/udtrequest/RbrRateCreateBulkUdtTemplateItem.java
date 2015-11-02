/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateCreateBulkUdtTemplateItem.java
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
 * Class used to create a RbrRateCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrRateCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrRatesObjectData RbrRateCreateIn;
/**
 *
 * Constructor to create a  RbrRateCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrRateCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRatesObjectData RbrRateCreateInIn) {
    super(id, context, "RbrRateCreate");
    RbrRateCreateIn = RbrRateCreateInIn;
  }

  public void translateToMap() {
    if (RbrRateCreateIn != null) {
      RbrRateCreateIn.resetFlags(true, true);
      addInput("RbrRate", RbrRatesObjectHelper.toMap(RbrRateCreateIn, new HashMap(), "RbrRate").get("RbrRate"));
    }
  }


/**
 *
 * Sets the RbrRate
 * @param RbrRateCreateInIn Value of the RbrRateCreateIn
 *
 */

  public void setRbrRate(RbrRatesObjectData RbrRateCreateInIn) {
    RbrRateCreateIn = RbrRateCreateInIn;
  }

  public void translateFromMap() {
    RbrRateCreateIn = RbrRatesObjectHelper.fromMap(inputMap, "RbrRate");
  }

/**
 *
 * Gets the RbrRate
 * @return Value of the RbrRate
 *
 */

  public RbrRatesObjectData getRbrRate( ) {
    return RbrRateCreateIn;
  }

}
