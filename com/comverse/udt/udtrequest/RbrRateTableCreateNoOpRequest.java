/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTableCreateNoOpRequest.java
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
 * NoOp class used to simulate a RbrRateTableCreateNoOpRequest Udt Request/Response
 *
 */
public class RbrRateTableCreateNoOpRequest extends RbrRateTableSubRequestParent {
/**
 *
 * Constructor to create a   RbrRateTableCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrRateTableCreateNoOpRequest(String id, RbrRateTableObjectData noOpIn) {
    super(id, "RbrRateTableCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("RbrRateTable", RbrRateTableObjectHelper.toMap(noOpIn, new HashMap(), "RbrRateTable").get("RbrRateTable"));
    }
  }
/**
 *
 * Retrieves the RbrRateTableObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RbrRateTableObjectData getOutput() {
    return RbrRateTableObjectHelper.fromMap(outputMap, "RbrRateTable");
  }
}
