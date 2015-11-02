/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRateOverrideGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a CorridorRateOverrideGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorRateOverrideGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CROObjectKeyData CROGetIn;
/**
 *
 * Constructor to create a  CorridorRateOverrideGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorRateOverrideGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CROObjectKeyData CROGetInIn) {
    super(id, context, "CorridorRateOverrideGet");
    CROGetIn = CROGetInIn;
  }

  public void translateToMap() {
    if (CROGetIn != null) {
      CROGetIn.resetFlags(true, true);
      addInput("CorridorRateOverride", CROObjectKeyHelper.toMap(CROGetIn, new HashMap(), "CROObjectKeyData").get("CROObjectKeyData"));
    }
  }


/**
 *
 * Sets the CorridorRateOverride
 * @param CROGetInIn Value of the CROGetIn
 *
 */

  public void setCorridorRateOverride(CROObjectKeyData CROGetInIn) {
    CROGetIn = CROGetInIn;
  }

  public void translateFromMap() {
    CROGetIn = CROObjectKeyHelper.fromMap(inputMap, "CorridorRateOverride");
  }

/**
 *
 * Gets the CorridorRateOverride
 * @return Value of the CorridorRateOverride
 *
 */

  public CROObjectKeyData getCorridorRateOverride( ) {
    return CROGetIn;
  }

}
