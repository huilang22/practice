/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentMapGetNoOpRequest.java
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
 * NoOp class used to simulate a AccountSegmentMapGetNoOpRequest Udt Request/Response
 *
 */
public class AccountSegmentMapGetNoOpRequest extends AccountSegmentMapSubRequestParent {
/**
 *
 * Constructor to create a   AccountSegmentMapGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountSegmentMapGetNoOpRequest(String id, AccountSegmentMapObjectData noOpIn) {
    super(id, "AccountSegmentMapGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountSegmentMap", AccountSegmentMapObjectHelper.toMap(noOpIn, new HashMap(), "AccountSegmentMap").get("AccountSegmentMap"));
    }
  }
/**
 *
 * Retrieves the AccountSegmentMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountSegmentMapObjectData getOutput() {
    return AccountSegmentMapObjectHelper.fromMap(outputMap, "AccountSegmentMap");
  }
}
