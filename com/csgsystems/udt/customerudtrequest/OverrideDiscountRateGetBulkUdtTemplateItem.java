/*
 * Generated code DO NOT EDIT
 * Generated file: OverrideDiscountRateGetBulkUdtTemplateItem.java
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
 * Class used to create a OverrideDiscountRateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class OverrideDiscountRateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RDOverrideObjectKeyData RDOGetIn;
/**
 *
 * Constructor to create a  OverrideDiscountRateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OverrideDiscountRateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RDOverrideObjectKeyData RDOGetInIn) {
    super(id, context, "OverrideDiscountRateGet");
    RDOGetIn = RDOGetInIn;
  }

  public void translateToMap() {
    if (RDOGetIn != null) {
      RDOGetIn.resetFlags(true, true);
      addInput("OverrideDiscountRate", RDOverrideObjectKeyHelper.toMap(RDOGetIn, new HashMap(), "RDOverrideObjectKeyData").get("RDOverrideObjectKeyData"));
    }
  }


/**
 *
 * Sets the OverrideDiscountRate
 * @param RDOGetInIn Value of the RDOGetIn
 *
 */

  public void setOverrideDiscountRate(RDOverrideObjectKeyData RDOGetInIn) {
    RDOGetIn = RDOGetInIn;
  }

  public void translateFromMap() {
    RDOGetIn = RDOverrideObjectKeyHelper.fromMap(inputMap, "OverrideDiscountRate");
  }

/**
 *
 * Gets the OverrideDiscountRate
 * @return Value of the OverrideDiscountRate
 *
 */

  public RDOverrideObjectKeyData getOverrideDiscountRate( ) {
    return RDOGetIn;
  }

}
