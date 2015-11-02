/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ArmStatusGetNoOpRequest.java
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
 * NoOp class used to simulate a ArmStatusGetNoOpRequest Udt Request/Response
 *
 */
public class ArmStatusGetNoOpRequest extends ArmStatusSubRequestParent {
/**
 *
 * Constructor to create a   ArmStatusGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ArmStatusGetNoOpRequest(String id, ASObjectData noOpIn) {
    super(id, "ArmStatusGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ArmStatus", ASObjectHelper.toMap(noOpIn, new HashMap(), "ArmStatus").get("ArmStatus"));
    }
  }
/**
 *
 * Retrieves the ASObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ASObjectData getOutput() {
    return ASObjectHelper.fromMap(outputMap, "ArmStatus");
  }
}
