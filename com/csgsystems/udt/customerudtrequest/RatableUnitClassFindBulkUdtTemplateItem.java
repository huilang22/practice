/*
 * Generated code DO NOT EDIT
 * Generated file: RatableUnitClassFindBulkUdtTemplateItem.java
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
 * Class used to create a RatableUnitClassFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RatableUnitClassFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUCObjectFilter RUCFindIn;
/**
 *
 * Constructor to create a  RatableUnitClassFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatableUnitClassFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCObjectFilter RUCFindInIn) {
    super(id, context, "RatableUnitClassFind");
    RUCFindIn = RUCFindInIn;
  }

  public void translateToMap() {
    if (RUCFindIn != null) {
      Integer index =  RUCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RatableUnitClass", RUCObjectHelper.toMap(RUCFindIn, new HashMap(), "RatableUnitClass").get("RatableUnitClass"));
    }
  }


/**
 *
 * Sets the RatableUnitClass
 * @param RUCFindInIn Value of the RUCFindIn
 *
 */

  public void setRatableUnitClass(RUCObjectFilter RUCFindInIn) {
    RUCFindIn = RUCFindInIn;
  }

  public void translateFromMap() {
    RUCFindIn = RUCObjectHelper.fromMapFilter(inputMap, "RatableUnitClass");
  }

/**
 *
 * Gets the RatableUnitClass
 * @return Value of the RatableUnitClass
 *
 */

  public RUCObjectFilter getRatableUnitClass( ) {
    return RUCFindIn;
  }

}
