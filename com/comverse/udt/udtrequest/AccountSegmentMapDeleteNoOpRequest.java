/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentMapDeleteNoOpRequest.java
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
 * NoOp class used to simulate a AccountSegmentMapDeleteNoOpRequest Udt Request/Response
 *
 */
public class AccountSegmentMapDeleteNoOpRequest extends AccountSegmentMapSubRequestParent {
/**
 *
 * Constructor to create a   AccountSegmentMapDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountSegmentMapDeleteNoOpRequest(String id, AccountSegmentMapObjectData noOpIn) {
    super(id, "AccountSegmentMapDeleteNoOpRequest");
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
