/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVanityCreateNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsVanityCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsVanityCreateNoOpRequest extends InvsVanitySubRequestParent {
/**
 *
 * Constructor to create a   InvsVanityCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsVanityCreateNoOpRequest(String id, InvsVanityObjectData noOpIn) {
    super(id, "InvsVanityCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsVanity", InvsVanityObjectHelper.toMap(noOpIn, new HashMap(), "InvsVanity").get("InvsVanity"));
    }
  }
/**
 *
 * Retrieves the InvsVanityObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsVanityObjectData getOutput() {
    return InvsVanityObjectHelper.fromMap(outputMap, "InvsVanity");
  }
}
