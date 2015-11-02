/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjTransGroupDeleteNoOpRequest.java
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
 * NoOp class used to simulate a AdjTransGroupDeleteNoOpRequest Udt Request/Response
 *
 */
public class AdjTransGroupDeleteNoOpRequest extends AdjTransGroupSubRequestParent {
/**
 *
 * Constructor to create a   AdjTransGroupDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdjTransGroupDeleteNoOpRequest(String id, ATGObjectData noOpIn) {
    super(id, "AdjTransGroupDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("AdjTransGroup", ATGObjectHelper.toMap(noOpIn, new HashMap(), "AdjTransGroup").get("AdjTransGroup"));
    }
  }
/**
 *
 * Retrieves the ATGObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ATGObjectData getOutput() {
    return ATGObjectHelper.fromMap(outputMap, "AdjTransGroup");
  }
}
