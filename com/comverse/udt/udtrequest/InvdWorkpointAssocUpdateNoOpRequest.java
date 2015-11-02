/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdWorkpointAssocUpdateNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvdWorkpointAssocUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvdWorkpointAssocUpdateNoOpRequest extends InvdWorkpointAssocSubRequestParent {
/**
 *
 * Constructor to create a   InvdWorkpointAssocUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdWorkpointAssocUpdateNoOpRequest(String id, InvdWorkpointAssocObjectData noOpIn) {
    super(id, "InvdWorkpointAssocUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectHelper.toMap(noOpIn, new HashMap(), "InvdWorkpointAssoc").get("InvdWorkpointAssoc"));
    }
  }
/**
 *
 * Retrieves the InvdWorkpointAssocObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvdWorkpointAssocObjectData getOutput() {
    return InvdWorkpointAssocObjectHelper.fromMap(outputMap, "InvdWorkpointAssoc");
  }
}
