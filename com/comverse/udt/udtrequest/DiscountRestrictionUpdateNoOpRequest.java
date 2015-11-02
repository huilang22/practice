/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountRestrictionUpdateNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a DiscountRestrictionUpdateNoOpRequest Udt Request/Response
 *
 */
public class DiscountRestrictionUpdateNoOpRequest extends DiscountRestrictionSubRequestParent {
/**
 *
 * Constructor to create a   DiscountRestrictionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscountRestrictionUpdateNoOpRequest(String id, DRObjectData noOpIn) {
    super(id, "DiscountRestrictionUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("DiscountRestriction", DRObjectHelper.toMap(noOpIn, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
  }
/**
 *
 * Retrieves the DRObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public DRObjectData getOutput() {
    return DRObjectHelper.fromMap(outputMap, "DiscountRestriction");
  }
}
