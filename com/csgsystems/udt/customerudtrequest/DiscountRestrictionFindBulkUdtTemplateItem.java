/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountRestrictionFindBulkUdtTemplateItem.java
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
 * Class used to create a DiscountRestrictionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountRestrictionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DRObjectFilter DRFindIn;
/**
 *
 * Constructor to create a  DiscountRestrictionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountRestrictionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, DRObjectFilter DRFindInIn) {
    super(id, context, "DiscountRestrictionFind");
    DRFindIn = DRFindInIn;
  }

  public void translateToMap() {
    if (DRFindIn != null) {
      Integer index =  DRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DiscountRestriction", DRObjectHelper.toMap(DRFindIn, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
  }


/**
 *
 * Sets the DiscountRestriction
 * @param DRFindInIn Value of the DRFindIn
 *
 */

  public void setDiscountRestriction(DRObjectFilter DRFindInIn) {
    DRFindIn = DRFindInIn;
  }

  public void translateFromMap() {
    DRFindIn = DRObjectHelper.fromMapFilter(inputMap, "DiscountRestriction");
  }

/**
 *
 * Gets the DiscountRestriction
 * @return Value of the DiscountRestriction
 *
 */

  public DRObjectFilter getDiscountRestriction( ) {
    return DRFindIn;
  }

}
