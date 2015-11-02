/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTableGetNoOpRequest.java
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
 * NoOp class used to simulate a RbrRateTableGetNoOpRequest Udt Request/Response
 *
 */
public class RbrRateTableGetNoOpRequest extends RbrRateTableSubRequestParent {
/**
 *
 * Constructor to create a   RbrRateTableGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrRateTableGetNoOpRequest(String id, RbrRateTableObjectData noOpIn) {
    super(id, "RbrRateTableGetNoOpRequest");
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
