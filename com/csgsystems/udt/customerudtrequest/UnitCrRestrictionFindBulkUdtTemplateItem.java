/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRestrictionFindBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrRestrictionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrRestrictionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrRestrictionObjectFilter ucrFindIn;
/**
 *
 * Constructor to create a  UnitCrRestrictionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrRestrictionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRestrictionObjectFilter ucrFindInIn) {
    super(id, context, "UnitCrRestrictionFind");
    ucrFindIn = ucrFindInIn;
  }

  public void translateToMap() {
    if (ucrFindIn != null) {
      Integer index =  ucrFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitCrRestriction", UnitCrRestrictionObjectHelper.toMap(ucrFindIn, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
  }


/**
 *
 * Sets the UnitCrRestriction
 * @param ucrFindInIn Value of the ucrFindIn
 *
 */

  public void setUnitCrRestriction(UnitCrRestrictionObjectFilter ucrFindInIn) {
    ucrFindIn = ucrFindInIn;
  }

  public void translateFromMap() {
    ucrFindIn = UnitCrRestrictionObjectHelper.fromMapFilter(inputMap, "UnitCrRestriction");
  }

/**
 *
 * Gets the UnitCrRestriction
 * @return Value of the UnitCrRestriction
 *
 */

  public UnitCrRestrictionObjectFilter getUnitCrRestriction( ) {
    return ucrFindIn;
  }

}
