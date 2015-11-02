/*
 * Generated code DO NOT EDIT
 * Generated file: RatableUnitClassUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RatableUnitClassUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RatableUnitClassUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUCObjectData RUCUpdateIn;
/**
 *
 * Constructor to create a  RatableUnitClassUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatableUnitClassUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCObjectData RUCUpdateInIn) {
    super(id, context, "RatableUnitClassUpdate");
    RUCUpdateIn = RUCUpdateInIn;
  }

  public void translateToMap() {
    if (RUCUpdateIn != null) {
      RUCUpdateIn.resetFlags(true, true);
      addInput("RatableUnitClass", RUCObjectHelper.toMap(RUCUpdateIn, new HashMap(), "RatableUnitClass").get("RatableUnitClass"));
    }
  }


/**
 *
 * Sets the RatableUnitClass
 * @param RUCUpdateInIn Value of the RUCUpdateIn
 *
 */

  public void setRatableUnitClass(RUCObjectData RUCUpdateInIn) {
    RUCUpdateIn = RUCUpdateInIn;
  }

  public void translateFromMap() {
    RUCUpdateIn = RUCObjectHelper.fromMap(inputMap, "RatableUnitClass");
  }

/**
 *
 * Gets the RatableUnitClass
 * @return Value of the RatableUnitClass
 *
 */

  public RUCObjectData getRatableUnitClass( ) {
    return RUCUpdateIn;
  }

}
