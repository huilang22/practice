/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRestrictionCreateBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrRestrictionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrRestrictionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrRestrictionObjectData ucrCrIn;
/**
 *
 * Constructor to create a  UnitCrRestrictionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrRestrictionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRestrictionObjectData ucrCrInIn) {
    super(id, context, "UnitCrRestrictionCreate");
    ucrCrIn = ucrCrInIn;
  }

  public void translateToMap() {
    if (ucrCrIn != null) {
      ucrCrIn.resetFlags(true, true);
      addInput("UnitCrRestriction", UnitCrRestrictionObjectHelper.toMap(ucrCrIn, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
  }


/**
 *
 * Sets the UnitCrRestriction
 * @param ucrCrInIn Value of the ucrCrIn
 *
 */

  public void setUnitCrRestriction(UnitCrRestrictionObjectData ucrCrInIn) {
    ucrCrIn = ucrCrInIn;
  }

  public void translateFromMap() {
    ucrCrIn = UnitCrRestrictionObjectHelper.fromMap(inputMap, "UnitCrRestriction");
  }

/**
 *
 * Gets the UnitCrRestriction
 * @return Value of the UnitCrRestriction
 *
 */

  public UnitCrRestrictionObjectData getUnitCrRestriction( ) {
    return ucrCrIn;
  }

}
