/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupProductGetNoOpRequest.java
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
 * NoOp class used to simulate a HqGroupProductGetNoOpRequest Udt Request/Response
 *
 */
public class HqGroupProductGetNoOpRequest extends HqGroupProductSubRequestParent {
/**
 *
 * Constructor to create a   HqGroupProductGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupProductGetNoOpRequest(String id, HqGroupProductObjectData noOpIn) {
    super(id, "HqGroupProductGetNoOpRequest");
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
