/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftResponseCodeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a EftResponseCodeUpdateNoOpRequest Udt Request/Response
 *
 */
public class EftResponseCodeUpdateNoOpRequest extends EftResponseCodeSubRequestParent {
/**
 *
 * Constructor to create a   EftResponseCodeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EftResponseCodeUpdateNoOpRequest(String id, EftResponseCodeObjectData noOpIn) {
    super(id, "EftResponseCodeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("EftResponseCode", EftResponseCodeObjectHelper.toMap(noOpIn, new HashMap(), "EftResponseCode").get("EftResponseCode"));
    }
  }
/**
 *
 * Retrieves the EftResponseCodeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public EftResponseCodeObjectData getOutput() {
    return EftResponseCodeObjectHelper.fromMap(outputMap, "EftResponseCode");
  }
}
