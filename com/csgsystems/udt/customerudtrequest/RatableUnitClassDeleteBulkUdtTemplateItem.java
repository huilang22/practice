/*
 * Generated code DO NOT EDIT
 * Generated file: RatableUnitClassDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RatableUnitClassDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RatableUnitClassDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUCObjectKeyData RUCDeleteIn;
/**
 *
 * Constructor to create a  RatableUnitClassDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatableUnitClassDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCObjectKeyData RUCDeleteInIn) {
    super(id, context, "RatableUnitClassDelete");
    RUCDeleteIn = RUCDeleteInIn;
  }

  public void translateToMap() {
    if (RUCDeleteIn != null) {
      RUCDeleteIn.resetFlags(true, true);
      addInput("RatableUnitClass", RUCObjectKeyHelper.toMap(RUCDeleteIn, new HashMap(), "RUCObjectKeyData").get("RUCObjectKeyData"));
    }
  }


/**
 *
 * Sets the RatableUnitClass
 * @param RUCDeleteInIn Value of the RUCDeleteIn
 *
 */

  public void setRatableUnitClass(RUCObjectKeyData RUCDeleteInIn) {
    RUCDeleteIn = RUCDeleteInIn;
  }

  public void translateFromMap() {
    RUCDeleteIn = RUCObjectKeyHelper.fromMap(inputMap, "RatableUnitClass");
  }

/**
 *
 * Gets the RatableUnitClass
 * @return Value of the RatableUnitClass
 *
 */

  public RUCObjectKeyData getRatableUnitClass( ) {
    return RUCDeleteIn;
  }

}
