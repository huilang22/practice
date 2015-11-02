/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeTypesGetNoOpRequest.java
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
 * NoOp class used to simulate a LateFeeTypesGetNoOpRequest Udt Request/Response
 *
 */
public class LateFeeTypesGetNoOpRequest extends LateFeeTypesSubRequestParent {
/**
 *
 * Constructor to create a   LateFeeTypesGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LateFeeTypesGetNoOpRequest(String id, LFTObjectData noOpIn) {
    super(id, "LateFeeTypesGetNoOpRequest");
    if (noOpIn != null) {
      addInput("LateFeeTypes", LFTObjectHelper.toMap(noOpIn, new HashMap(), "LateFeeTypes").get("LateFeeTypes"));
    }
  }
/**
 *
 * Retrieves the LFTObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public LFTObjectData getOutput() {
    return LFTObjectHelper.fromMap(outputMap, "LateFeeTypes");
  }
}
