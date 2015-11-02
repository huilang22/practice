/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountRestrictionDeleteNoOpRequest.java
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
 * NoOp class used to simulate a DiscountRestrictionDeleteNoOpRequest Udt Request/Response
 *
 */
public class DiscountRestrictionDeleteNoOpRequest extends DiscountRestrictionSubRequestParent {
/**
 *
 * Constructor to create a   DiscountRestrictionDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscountRestrictionDeleteNoOpRequest(String id, DRObjectData noOpIn) {
    super(id, "DiscountRestrictionDeleteNoOpRequest");
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
