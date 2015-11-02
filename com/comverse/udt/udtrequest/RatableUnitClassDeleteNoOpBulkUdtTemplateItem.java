/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatableUnitClassDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RatableUnitClassDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RatableUnitClassDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RUCObjectData noOpIn;

/**
 *
 * Constructor to create a   RatableUnitClassDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RatableUnitClassDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCObjectData noOpInIn) {
    super(id, context, "RatableUnitClassDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RatableUnitClass", RUCObjectHelper.toMap(noOpIn, new HashMap(), "RatableUnitClass").get("RatableUnitClass"));
    }
  }
/**
 *
 * Sets the  RatableUnitClass
 * @param noOpInIn RUCObjectData to set
 *
 */
  public void setRatableUnitClass(RUCObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RatableUnitClass passed into the constructor
 * @return Simulated response
 *
 */
  public RUCObjectData getRatableUnitClass() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RUCObjectHelper.fromMap(inputMap, "RatableUnitClass");
  }
}
