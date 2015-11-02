/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideDiscountRateCreateBulkUdtTemplateItem.java
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
 * Class used to create a OverrideDiscountRateCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OverrideDiscountRateCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RDOverrideObjectData RDOCreateIn;
/**
 *
 * Constructor to create a  OverrideDiscountRateCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OverrideDiscountRateCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RDOverrideObjectData RDOCreateInIn) {
    super(id, context, "OverrideDiscountRateCreate");
    RDOCreateIn = RDOCreateInIn;
  }

  public void translateToMap() {
    if (RDOCreateIn != null) {
      RDOCreateIn.resetFlags(true, true);
      addInput("OverrideDiscountRate", RDOverrideObjectHelper.toMap(RDOCreateIn, new HashMap(), "OverrideDiscountRate").get("OverrideDiscountRate"));
    }
  }


/**
 *
 * Sets the OverrideDiscountRate
 * @param RDOCreateInIn Value of the RDOCreateIn
 *
 */

  public void setOverrideDiscountRate(RDOverrideObjectData RDOCreateInIn) {
    RDOCreateIn = RDOCreateInIn;
  }

  public void translateFromMap() {
    RDOCreateIn = RDOverrideObjectHelper.fromMap(inputMap, "OverrideDiscountRate");
  }

/**
 *
 * Gets the OverrideDiscountRate
 * @return Value of the OverrideDiscountRate
 *
 */

  public RDOverrideObjectData getOverrideDiscountRate( ) {
    return RDOCreateIn;
  }

}
