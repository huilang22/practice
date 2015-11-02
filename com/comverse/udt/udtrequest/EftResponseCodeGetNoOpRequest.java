/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftResponseCodeGetNoOpRequest.java
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
 * NoOp class used to simulate a EftResponseCodeGetNoOpRequest Udt Request/Response
 *
 */
public class EftResponseCodeGetNoOpRequest extends EftResponseCodeSubRequestParent {
/**
 *
 * Constructor to create a   EftResponseCodeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EftResponseCodeGetNoOpRequest(String id, EftResponseCodeObjectData noOpIn) {
    super(id, "EftResponseCodeGetNoOpRequest");
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
