/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillPollHotNoOpRequest.java
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
 * NoOp class used to simulate a InterimBillPollHotNoOpRequest Udt Request/Response
 *
 */
public class InterimBillPollHotNoOpRequest extends InterimBillSubRequestParent {
/**
 *
 * Constructor to create a   InterimBillPollHotNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InterimBillPollHotNoOpRequest(String id, InterimBillPollHotOutputData noOpIn) {
    super(id, "InterimBillPollHotNoOpRequest");
    if (noOpIn != null) {
      addInput("InterimBillPollHotOutputData", InterimBillPollHotOutputHelper.toMap(noOpIn).get("InterimBillPollHotOutputData"));
    }
  }
/**
 *
 * Retrieves the InterimBillPollHotOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InterimBillPollHotOutputData getOutput() {
    return InterimBillPollHotOutputHelper.fromMap(outputMap);
  }
}
