/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountRestrictionGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a DiscountRestrictionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountRestrictionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DRObjectKeyData DRGetIn;
/**
 *
 * Constructor to create a  DiscountRestrictionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountRestrictionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, DRObjectKeyData DRGetInIn) {
    super(id, context, "DiscountRestrictionGet");
    DRGetIn = DRGetInIn;
  }

  public void translateToMap() {
    if (DRGetIn != null) {
      DRGetIn.resetFlags(true, true);
      addInput("DiscountRestriction", DRObjectKeyHelper.toMap(DRGetIn, new HashMap(), "DRObjectKeyData").get("DRObjectKeyData"));
    }
  }


/**
 *
 * Sets the DiscountRestriction
 * @param DRGetInIn Value of the DRGetIn
 *
 */

  public void setDiscountRestriction(DRObjectKeyData DRGetInIn) {
    DRGetIn = DRGetInIn;
  }

  public void translateFromMap() {
    DRGetIn = DRObjectKeyHelper.fromMap(inputMap, "DiscountRestriction");
  }

/**
 *
 * Gets the DiscountRestriction
 * @return Value of the DiscountRestriction
 *
 */

  public DRObjectKeyData getDiscountRestriction( ) {
    return DRGetIn;
  }

}
