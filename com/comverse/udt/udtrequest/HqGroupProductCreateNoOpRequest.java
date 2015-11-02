/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupProductCreateNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a HqGroupProductCreateNoOpRequest Udt Request/Response
 *
 */
public class HqGroupProductCreateNoOpRequest extends HqGroupProductSubRequestParent {
/**
 *
 * Constructor to create a   HqGroupProductCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupProductCreateNoOpRequest(String id, HqGroupProductObjectData noOpIn) {
    super(id, "HqGroupProductCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(noOpIn, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }
/**
 *
 * Retrieves the HqGroupProductObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupProductObjectData getOutput() {
    return HqGroupProductObjectHelper.fromMap(outputMap, "HqGroupProduct");
  }
}
