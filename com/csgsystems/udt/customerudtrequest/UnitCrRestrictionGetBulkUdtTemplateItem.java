/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRestrictionGetBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrRestrictionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrRestrictionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrRestrictionObjectKeyData ucrGetIn;
/**
 *
 * Constructor to create a  UnitCrRestrictionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrRestrictionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRestrictionObjectKeyData ucrGetInIn) {
    super(id, context, "UnitCrRestrictionGet");
    ucrGetIn = ucrGetInIn;
  }

  public void translateToMap() {
    if (ucrGetIn != null) {
      ucrGetIn.resetFlags(true, true);
      addInput("UnitCrRestriction", UnitCrRestrictionObjectKeyHelper.toMap(ucrGetIn, new HashMap(), "UnitCrRestrictionObjectKeyData").get("UnitCrRestrictionObjectKeyData"));
    }
  }


/**
 *
 * Sets the UnitCrRestriction
 * @param ucrGetInIn Value of the ucrGetIn
 *
 */

  public void setUnitCrRestriction(UnitCrRestrictionObjectKeyData ucrGetInIn) {
    ucrGetIn = ucrGetInIn;
  }

  public void translateFromMap() {
    ucrGetIn = UnitCrRestrictionObjectKeyHelper.fromMap(inputMap, "UnitCrRestriction");
  }

/**
 *
 * Gets the UnitCrRestriction
 * @return Value of the UnitCrRestriction
 *
 */

  public UnitCrRestrictionObjectKeyData getUnitCrRestriction( ) {
    return ucrGetIn;
  }

}
