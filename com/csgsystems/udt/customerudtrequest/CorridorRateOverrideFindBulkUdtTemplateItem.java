/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRateOverrideFindBulkUdtTemplateItem.java
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
 * Class used to create a CorridorRateOverrideFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorRateOverrideFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CROObjectFilter CROFindIn;
/**
 *
 * Constructor to create a  CorridorRateOverrideFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorRateOverrideFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CROObjectFilter CROFindInIn) {
    super(id, context, "CorridorRateOverrideFind");
    CROFindIn = CROFindInIn;
  }

  public void translateToMap() {
    if (CROFindIn != null) {
      Integer index =  CROFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CorridorRateOverride", CROObjectHelper.toMap(CROFindIn, new HashMap(), "CorridorRateOverride").get("CorridorRateOverride"));
    }
  }


/**
 *
 * Sets the CorridorRateOverride
 * @param CROFindInIn Value of the CROFindIn
 *
 */

  public void setCorridorRateOverride(CROObjectFilter CROFindInIn) {
    CROFindIn = CROFindInIn;
  }

  public void translateFromMap() {
    CROFindIn = CROObjectHelper.fromMapFilter(inputMap, "CorridorRateOverride");
  }

/**
 *
 * Gets the CorridorRateOverride
 * @return Value of the CorridorRateOverride
 *
 */

  public CROObjectFilter getCorridorRateOverride( ) {
    return CROFindIn;
  }

}
