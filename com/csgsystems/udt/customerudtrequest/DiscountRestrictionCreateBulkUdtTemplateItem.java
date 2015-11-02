/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountRestrictionCreateBulkUdtTemplateItem.java
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
 * Class used to create a DiscountRestrictionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountRestrictionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DRObjectData DRCreateIn;
/**
 *
 * Constructor to create a  DiscountRestrictionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountRestrictionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, DRObjectData DRCreateInIn) {
    super(id, context, "DiscountRestrictionCreate");
    DRCreateIn = DRCreateInIn;
  }

  public void translateToMap() {
    if (DRCreateIn != null) {
      DRCreateIn.resetFlags(true, true);
      addInput("DiscountRestriction", DRObjectHelper.toMap(DRCreateIn, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
  }


/**
 *
 * Sets the DiscountRestriction
 * @param DRCreateInIn Value of the DRCreateIn
 *
 */

  public void setDiscountRestriction(DRObjectData DRCreateInIn) {
    DRCreateIn = DRCreateInIn;
  }

  public void translateFromMap() {
    DRCreateIn = DRObjectHelper.fromMap(inputMap, "DiscountRestriction");
  }

/**
 *
 * Gets the DiscountRestriction
 * @return Value of the DiscountRestriction
 *
 */

  public DRObjectData getDiscountRestriction( ) {
    return DRCreateIn;
  }

}
