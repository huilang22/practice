/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountRestrictionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a DiscountRestrictionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountRestrictionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DRObjectKeyData DRDeleteIn;
/**
 *
 * Constructor to create a  DiscountRestrictionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountRestrictionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, DRObjectKeyData DRDeleteInIn) {
    super(id, context, "DiscountRestrictionDelete");
    DRDeleteIn = DRDeleteInIn;
  }

  public void translateToMap() {
    if (DRDeleteIn != null) {
      DRDeleteIn.resetFlags(true, true);
      addInput("DiscountRestriction", DRObjectKeyHelper.toMap(DRDeleteIn, new HashMap(), "DRObjectKeyData").get("DRObjectKeyData"));
    }
  }


/**
 *
 * Sets the DiscountRestriction
 * @param DRDeleteInIn Value of the DRDeleteIn
 *
 */

  public void setDiscountRestriction(DRObjectKeyData DRDeleteInIn) {
    DRDeleteIn = DRDeleteInIn;
  }

  public void translateFromMap() {
    DRDeleteIn = DRObjectKeyHelper.fromMap(inputMap, "DiscountRestriction");
  }

/**
 *
 * Gets the DiscountRestriction
 * @return Value of the DiscountRestriction
 *
 */

  public DRObjectKeyData getDiscountRestriction( ) {
    return DRDeleteIn;
  }

}
