/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RegulatoryIdCreateNoOpRequest.java
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
 * NoOp class used to simulate a RegulatoryIdCreateNoOpRequest Udt Request/Response
 *
 */
public class RegulatoryIdCreateNoOpRequest extends RegulatoryIdSubRequestParent {
/**
 *
 * Constructor to create a   RegulatoryIdCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RegulatoryIdCreateNoOpRequest(String id, RegulatoryIdObjectData noOpIn) {
    super(id, "RegulatoryIdCreateNoOpRequest");
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
