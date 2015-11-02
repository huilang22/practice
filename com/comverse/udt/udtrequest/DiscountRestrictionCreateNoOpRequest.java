/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountRestrictionCreateNoOpRequest.java
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
 * NoOp class used to simulate a DiscountRestrictionCreateNoOpRequest Udt Request/Response
 *
 */
public class DiscountRestrictionCreateNoOpRequest extends DiscountRestrictionSubRequestParent {
/**
 *
 * Constructor to create a   DiscountRestrictionCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscountRestrictionCreateNoOpRequest(String id, DRObjectData noOpIn) {
    super(id, "DiscountRestrictionCreateNoOpRequest");
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
