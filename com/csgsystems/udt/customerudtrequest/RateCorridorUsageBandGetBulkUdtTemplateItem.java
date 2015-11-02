/*
 * Generated code DO NOT EDIT
 * Generated file: RateCorridorUsageBandGetBulkUdtTemplateItem.java
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
 * Class used to create a RateCorridorUsageBandGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCorridorUsageBandGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUBOverrideObjectKeyData RUBOGetIn;
/**
 *
 * Constructor to create a  RateCorridorUsageBandGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCorridorUsageBandGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RUBOverrideObjectKeyData RUBOGetInIn) {
    super(id, context, "RateCorridorUsageBandGet");
    RUBOGetIn = RUBOGetInIn;
  }

  public void translateToMap() {
    if (RUBOGetIn != null) {
      RUBOGetIn.resetFlags(true, true);
      addInput("RateCorridorUsageBand", RUBOverrideObjectKeyHelper.toMap(RUBOGetIn, new HashMap(), "RUBOverrideObjectKeyData").get("RUBOverrideObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateCorridorUsageBand
 * @param RUBOGetInIn Value of the RUBOGetIn
 *
 */

  public void setRateCorridorUsageBand(RUBOverrideObjectKeyData RUBOGetInIn) {
    RUBOGetIn = RUBOGetInIn;
  }

  public void translateFromMap() {
    RUBOGetIn = RUBOverrideObjectKeyHelper.fromMap(inputMap, "RateCorridorUsageBand");
  }

/**
 *
 * Gets the RateCorridorUsageBand
 * @return Value of the RateCorridorUsageBand
 *
 */

  public RUBOverrideObjectKeyData getRateCorridorUsageBand( ) {
    return RUBOGetIn;
  }

}
