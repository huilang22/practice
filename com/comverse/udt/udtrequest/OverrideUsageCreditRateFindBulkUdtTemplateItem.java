/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideUsageCreditRateFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a OverrideUsageCreditRateFindBulkUdtTemplateItem Bulk Template
 *
 */

public class OverrideUsageCreditRateFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUCOverrideObjectFilter iRUCOFindIn;
/**
 *
 * Constructor to create a  OverrideUsageCreditRateFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OverrideUsageCreditRateFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCOverrideObjectFilter iRUCOFindInIn) {
    super(id, context, "OverrideUsageCreditRateFind");
    iRUCOFindIn = iRUCOFindInIn;
  }

  public void translateToMap() {
    if (iRUCOFindIn != null) {
      Integer index =  iRUCOFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OverrideUsageCreditRate", RUCOverrideObjectHelper.toMap(iRUCOFindIn, new HashMap(), "OverrideUsageCreditRate").get("OverrideUsageCreditRate"));
    }
  }


/**
 *
 * Sets the OverrideUsageCreditRate
 * @param iRUCOFindInIn Value of the iRUCOFindIn
 *
 */

  public void setOverrideUsageCreditRate(RUCOverrideObjectFilter iRUCOFindInIn) {
    iRUCOFindIn = iRUCOFindInIn;
  }

  public void translateFromMap() {
    iRUCOFindIn = RUCOverrideObjectHelper.fromMapFilter(inputMap, "OverrideUsageCreditRate");
  }

/**
 *
 * Gets the OverrideUsageCreditRate
 * @return Value of the OverrideUsageCreditRate
 *
 */

  public RUCOverrideObjectFilter getOverrideUsageCreditRate( ) {
    return iRUCOFindIn;
  }

}
