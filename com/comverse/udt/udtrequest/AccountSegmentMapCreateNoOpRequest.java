/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentMapCreateNoOpRequest.java
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
 * NoOp class used to simulate a AccountSegmentMapCreateNoOpRequest Udt Request/Response
 *
 */
public class AccountSegmentMapCreateNoOpRequest extends AccountSegmentMapSubRequestParent {
/**
 *
 * Constructor to create a   AccountSegmentMapCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountSegmentMapCreateNoOpRequest(String id, AccountSegmentMapObjectData noOpIn) {
    super(id, "AccountSegmentMapCreateNoOpRequest");
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
