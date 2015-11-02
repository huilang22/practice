/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideUsageCreditRateGetBulkUdtTemplateItem.java
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
 * Class used to create a OverrideUsageCreditRateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class OverrideUsageCreditRateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUCBaseOverrideObjectKeyData fRUCOGetIn;
/**
 *
 * Constructor to create a  OverrideUsageCreditRateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OverrideUsageCreditRateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCBaseOverrideObjectKeyData fRUCOGetInIn) {
    super(id, context, "OverrideUsageCreditRateGet");
    fRUCOGetIn = fRUCOGetInIn;
  }

  public void translateToMap() {
    if (fRUCOGetIn != null) {
      fRUCOGetIn.resetFlags(true, true);
      addInput("OverrideUsageCreditRate", RUCBaseOverrideObjectKeyHelper.toMap(fRUCOGetIn, new HashMap(), "RUCBaseOverrideObjectKeyData").get("RUCBaseOverrideObjectKeyData"));
    }
  }


/**
 *
 * Sets the OverrideUsageCreditRate
 * @param fRUCOGetInIn Value of the fRUCOGetIn
 *
 */

  public void setOverrideUsageCreditRate(RUCBaseOverrideObjectKeyData fRUCOGetInIn) {
    fRUCOGetIn = fRUCOGetInIn;
  }

  public void translateFromMap() {
    fRUCOGetIn = RUCBaseOverrideObjectKeyHelper.fromMap(inputMap, "OverrideUsageCreditRate");
  }

/**
 *
 * Gets the OverrideUsageCreditRate
 * @return Value of the OverrideUsageCreditRate
 *
 */

  public RUCBaseOverrideObjectKeyData getOverrideUsageCreditRate( ) {
    return fRUCOGetIn;
  }

}
