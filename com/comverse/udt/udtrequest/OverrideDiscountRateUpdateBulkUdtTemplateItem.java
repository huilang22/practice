/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideDiscountRateUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a OverrideDiscountRateUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class OverrideDiscountRateUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RDOverrideObjectData RDOUpdateIn;
/**
 *
 * Constructor to create a  OverrideDiscountRateUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OverrideDiscountRateUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RDOverrideObjectData RDOUpdateInIn) {
    super(id, context, "OverrideDiscountRateUpdate");
    RDOUpdateIn = RDOUpdateInIn;
  }

  public void translateToMap() {
    if (RDOUpdateIn != null) {
      RDOUpdateIn.resetFlags(true, true);
      addInput("OverrideDiscountRate", RDOverrideObjectHelper.toMap(RDOUpdateIn, new HashMap(), "OverrideDiscountRate").get("OverrideDiscountRate"));
    }
  }


/**
 *
 * Sets the OverrideDiscountRate
 * @param RDOUpdateInIn Value of the RDOUpdateIn
 *
 */

  public void setOverrideDiscountRate(RDOverrideObjectData RDOUpdateInIn) {
    RDOUpdateIn = RDOUpdateInIn;
  }

  public void translateFromMap() {
    RDOUpdateIn = RDOverrideObjectHelper.fromMap(inputMap, "OverrideDiscountRate");
  }

/**
 *
 * Gets the OverrideDiscountRate
 * @return Value of the OverrideDiscountRate
 *
 */

  public RDOverrideObjectData getOverrideDiscountRate( ) {
    return RDOUpdateIn;
  }

}
