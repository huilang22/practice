/*
 * Generated code DO NOT EDIT
 * Generated file: RatableUnitClassCreateBulkUdtTemplateItem.java
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
 * Class used to create a RatableUnitClassCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RatableUnitClassCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUCObjectData RUCCreateIn;
/**
 *
 * Constructor to create a  RatableUnitClassCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatableUnitClassCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCObjectData RUCCreateInIn) {
    super(id, context, "RatableUnitClassCreate");
    RUCCreateIn = RUCCreateInIn;
  }

  public void translateToMap() {
    if (RUCCreateIn != null) {
      RUCCreateIn.resetFlags(true, true);
      addInput("RatableUnitClass", RUCObjectHelper.toMap(RUCCreateIn, new HashMap(), "RatableUnitClass").get("RatableUnitClass"));
    }
  }


/**
 *
 * Sets the RatableUnitClass
 * @param RUCCreateInIn Value of the RUCCreateIn
 *
 */

  public void setRatableUnitClass(RUCObjectData RUCCreateInIn) {
    RUCCreateIn = RUCCreateInIn;
  }

  public void translateFromMap() {
    RUCCreateIn = RUCObjectHelper.fromMap(inputMap, "RatableUnitClass");
  }

/**
 *
 * Gets the RatableUnitClass
 * @return Value of the RatableUnitClass
 *
 */

  public RUCObjectData getRatableUnitClass( ) {
    return RUCCreateIn;
  }

}
