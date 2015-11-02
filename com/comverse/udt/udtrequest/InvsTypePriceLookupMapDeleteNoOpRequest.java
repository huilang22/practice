/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypePriceLookupMapDeleteNoOpRequest.java
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
 * NoOp class used to simulate a InvsTypePriceLookupMapDeleteNoOpRequest Udt Request/Response
 *
 */
public class InvsTypePriceLookupMapDeleteNoOpRequest extends InvsTypePriceLookupMapSubRequestParent {
/**
 *
 * Constructor to create a   InvsTypePriceLookupMapDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsTypePriceLookupMapDeleteNoOpRequest(String id, InvsTypePriceLookupMapObjectData noOpIn) {
    super(id, "InvsTypePriceLookupMapDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectHelper.toMap(noOpIn, new HashMap(), "InvsTypePriceLookupMap").get("InvsTypePriceLookupMap"));
    }
  }
/**
 *
 * Retrieves the InvsTypePriceLookupMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypePriceLookupMapObjectData getOutput() {
    return InvsTypePriceLookupMapObjectHelper.fromMap(outputMap, "InvsTypePriceLookupMap");
  }
}
