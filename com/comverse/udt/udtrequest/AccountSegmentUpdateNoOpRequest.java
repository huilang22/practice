/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentUpdateNoOpRequest.java
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
 * NoOp class used to simulate a AccountSegmentUpdateNoOpRequest Udt Request/Response
 *
 */
public class AccountSegmentUpdateNoOpRequest extends AccountSegmentSubRequestParent {
/**
 *
 * Constructor to create a   AccountSegmentUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountSegmentUpdateNoOpRequest(String id, AccountSegmentObjectData noOpIn) {
    super(id, "AccountSegmentUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountSegment", AccountSegmentObjectHelper.toMap(noOpIn, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
  }
/**
 *
 * Retrieves the AccountSegmentObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountSegmentObjectData getOutput() {
    return AccountSegmentObjectHelper.fromMap(outputMap, "AccountSegment");
  }
}
