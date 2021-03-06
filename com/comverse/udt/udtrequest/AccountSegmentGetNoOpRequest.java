/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentGetNoOpRequest.java
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
 * NoOp class used to simulate a AccountSegmentGetNoOpRequest Udt Request/Response
 *
 */
public class AccountSegmentGetNoOpRequest extends AccountSegmentSubRequestParent {
/**
 *
 * Constructor to create a   AccountSegmentGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountSegmentGetNoOpRequest(String id, AccountSegmentObjectData noOpIn) {
    super(id, "AccountSegmentGetNoOpRequest");
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
