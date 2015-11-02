/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRateLimitKeyUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrRateLimitKeyUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrRateLimitKeyUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrRateLimitKeysObjectData UnitCrRateLimitKeyUpdateIn;
/**
 *
 * Constructor to create a  UnitCrRateLimitKeyUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrRateLimitKeyUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRateLimitKeysObjectData UnitCrRateLimitKeyUpdateInIn) {
    super(id, context, "UnitCrRateLimitKeyUpdate");
    UnitCrRateLimitKeyUpdateIn = UnitCrRateLimitKeyUpdateInIn;
  }

  public void translateToMap() {
    if (UnitCrRateLimitKeyUpdateIn != null) {
      UnitCrRateLimitKeyUpdateIn.resetFlags(true, true);
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectHelper.toMap(UnitCrRateLimitKeyUpdateIn, new HashMap(), "UnitCrRateLimitKey").get("UnitCrRateLimitKey"));
    }
  }


/**
 *
 * Sets the UnitCrRateLimitKey
 * @param UnitCrRateLimitKeyUpdateInIn Value of the UnitCrRateLimitKeyUpdateIn
 *
 */

  public void setUnitCrRateLimitKey(UnitCrRateLimitKeysObjectData UnitCrRateLimitKeyUpdateInIn) {
    UnitCrRateLimitKeyUpdateIn = UnitCrRateLimitKeyUpdateInIn;
  }

  public void translateFromMap() {
    UnitCrRateLimitKeyUpdateIn = UnitCrRateLimitKeysObjectHelper.fromMap(inputMap, "UnitCrRateLimitKey");
  }

/**
 *
 * Gets the UnitCrRateLimitKey
 * @return Value of the UnitCrRateLimitKey
 *
 */

  public UnitCrRateLimitKeysObjectData getUnitCrRateLimitKey( ) {
    return UnitCrRateLimitKeyUpdateIn;
  }

}
