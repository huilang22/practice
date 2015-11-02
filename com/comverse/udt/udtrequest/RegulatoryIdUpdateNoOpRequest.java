/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RegulatoryIdUpdateNoOpRequest.java
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
 * NoOp class used to simulate a RegulatoryIdUpdateNoOpRequest Udt Request/Response
 *
 */
public class RegulatoryIdUpdateNoOpRequest extends RegulatoryIdSubRequestParent {
/**
 *
 * Constructor to create a   RegulatoryIdUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RegulatoryIdUpdateNoOpRequest(String id, RegulatoryIdObjectData noOpIn) {
    super(id, "RegulatoryIdUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("RegulatoryId", RegulatoryIdObjectHelper.toMap(noOpIn, new HashMap(), "RegulatoryId").get("RegulatoryId"));
    }
  }
/**
 *
 * Retrieves the RegulatoryIdObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RegulatoryIdObjectData getOutput() {
    return RegulatoryIdObjectHelper.fromMap(outputMap, "RegulatoryId");
  }
}
