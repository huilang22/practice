/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatableUnitClassGetBulkUdtTemplateItem.java
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
 * Class used to create a RatableUnitClassGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RatableUnitClassGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUCObjectKeyData RUCGetIn;
/**
 *
 * Constructor to create a  RatableUnitClassGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatableUnitClassGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCObjectKeyData RUCGetInIn) {
    super(id, context, "RatableUnitClassGet");
    RUCGetIn = RUCGetInIn;
  }

  public void translateToMap() {
    if (RUCGetIn != null) {
      RUCGetIn.resetFlags(true, true);
      addInput("RatableUnitClass", RUCObjectKeyHelper.toMap(RUCGetIn, new HashMap(), "RUCObjectKeyData").get("RUCObjectKeyData"));
    }
  }


/**
 *
 * Sets the RatableUnitClass
 * @param RUCGetInIn Value of the RUCGetIn
 *
 */

  public void setRatableUnitClass(RUCObjectKeyData RUCGetInIn) {
    RUCGetIn = RUCGetInIn;
  }

  public void translateFromMap() {
    RUCGetIn = RUCObjectKeyHelper.fromMap(inputMap, "RatableUnitClass");
  }

/**
 *
 * Gets the RatableUnitClass
 * @return Value of the RatableUnitClass
 *
 */

  public RUCObjectKeyData getRatableUnitClass( ) {
    return RUCGetIn;
  }

}
