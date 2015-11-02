/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRateOverrideUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CorridorRateOverrideUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorRateOverrideUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CROObjectData CROUpdateIn;
/**
 *
 * Constructor to create a  CorridorRateOverrideUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorRateOverrideUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CROObjectData CROUpdateInIn) {
    super(id, context, "CorridorRateOverrideUpdate");
    CROUpdateIn = CROUpdateInIn;
  }

  public void translateToMap() {
    if (CROUpdateIn != null) {
      CROUpdateIn.resetFlags(true, true);
      addInput("CorridorRateOverride", CROObjectHelper.toMap(CROUpdateIn, new HashMap(), "CorridorRateOverride").get("CorridorRateOverride"));
    }
  }


/**
 *
 * Sets the CorridorRateOverride
 * @param CROUpdateInIn Value of the CROUpdateIn
 *
 */

  public void setCorridorRateOverride(CROObjectData CROUpdateInIn) {
    CROUpdateIn = CROUpdateInIn;
  }

  public void translateFromMap() {
    CROUpdateIn = CROObjectHelper.fromMap(inputMap, "CorridorRateOverride");
  }

/**
 *
 * Gets the CorridorRateOverride
 * @return Value of the CorridorRateOverride
 *
 */

  public CROObjectData getCorridorRateOverride( ) {
    return CROUpdateIn;
  }

}
