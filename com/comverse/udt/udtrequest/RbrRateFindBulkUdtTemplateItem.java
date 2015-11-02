/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateFindBulkUdtTemplateItem.java
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
 * Class used to create a RbrRateFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrRateFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrRatesObjectFilter RbrRatesFindIn;
/**
 *
 * Constructor to create a  RbrRateFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrRateFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRatesObjectFilter RbrRatesFindInIn) {
    super(id, context, "RbrRateFind");
    RbrRatesFindIn = RbrRatesFindInIn;
  }

  public void translateToMap() {
    if (RbrRatesFindIn != null) {
      Integer index =  RbrRatesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrRate", RbrRatesObjectHelper.toMap(RbrRatesFindIn, new HashMap(), "RbrRate").get("RbrRate"));
    }
  }


/**
 *
 * Sets the RbrRate
 * @param RbrRatesFindInIn Value of the RbrRatesFindIn
 *
 */

  public void setRbrRate(RbrRatesObjectFilter RbrRatesFindInIn) {
    RbrRatesFindIn = RbrRatesFindInIn;
  }

  public void translateFromMap() {
    RbrRatesFindIn = RbrRatesObjectHelper.fromMapFilter(inputMap, "RbrRate");
  }

/**
 *
 * Gets the RbrRate
 * @return Value of the RbrRate
 *
 */

  public RbrRatesObjectFilter getRbrRate( ) {
    return RbrRatesFindIn;
  }

}
