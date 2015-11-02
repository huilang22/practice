/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ParentCodeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ParentCodeUpdateNoOpRequest Udt Request/Response
 *
 */
public class ParentCodeUpdateNoOpRequest extends ParentCodeSubRequestParent {
/**
 *
 * Constructor to create a   ParentCodeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ParentCodeUpdateNoOpRequest(String id, ParentCodeObjectData noOpIn) {
    super(id, "ParentCodeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ParentCode", ParentCodeObjectHelper.toMap(noOpIn, new HashMap(), "ParentCode").get("ParentCode"));
    }
  }
/**
 *
 * Retrieves the ParentCodeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ParentCodeObjectData getOutput() {
    return ParentCodeObjectHelper.fromMap(outputMap, "ParentCode");
  }
}
