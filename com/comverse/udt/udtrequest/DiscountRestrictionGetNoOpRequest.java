/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountRestrictionGetNoOpRequest.java
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
 * NoOp class used to simulate a DiscountRestrictionGetNoOpRequest Udt Request/Response
 *
 */
public class DiscountRestrictionGetNoOpRequest extends DiscountRestrictionSubRequestParent {
/**
 *
 * Constructor to create a   DiscountRestrictionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscountRestrictionGetNoOpRequest(String id, DRObjectData noOpIn) {
    super(id, "DiscountRestrictionGetNoOpRequest");
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
