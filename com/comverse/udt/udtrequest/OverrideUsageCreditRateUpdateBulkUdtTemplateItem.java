/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideUsageCreditRateUpdateBulkUdtTemplateItem.java
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
 * Class used to create a OverrideUsageCreditRateUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class OverrideUsageCreditRateUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUCOverrideObjectData iRUCOUpdateIn;
/**
 *
 * Constructor to create a  OverrideUsageCreditRateUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OverrideUsageCreditRateUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCOverrideObjectData iRUCOUpdateInIn) {
    super(id, context, "OverrideUsageCreditRateUpdate");
    iRUCOUpdateIn = iRUCOUpdateInIn;
  }

  public void translateToMap() {
    if (iRUCOUpdateIn != null) {
      iRUCOUpdateIn.resetFlags(true, true);
      addInput("OverrideUsageCreditRate", RUCOverrideObjectHelper.toMap(iRUCOUpdateIn, new HashMap(), "OverrideUsageCreditRate").get("OverrideUsageCreditRate"));
    }
  }


/**
 *
 * Sets the OverrideUsageCreditRate
 * @param iRUCOUpdateInIn Value of the iRUCOUpdateIn
 *
 */

  public void setOverrideUsageCreditRate(RUCOverrideObjectData iRUCOUpdateInIn) {
    iRUCOUpdateIn = iRUCOUpdateInIn;
  }

  public void translateFromMap() {
    iRUCOUpdateIn = RUCOverrideObjectHelper.fromMap(inputMap, "OverrideUsageCreditRate");
  }

/**
 *
 * Gets the OverrideUsageCreditRate
 * @return Value of the OverrideUsageCreditRate
 *
 */

  public RUCOverrideObjectData getOverrideUsageCreditRate( ) {
    return iRUCOUpdateIn;
  }

}
