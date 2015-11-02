/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdWorkpointAssocCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvdWorkpointAssocCreateNoOpRequest Udt Request/Response
 *
 */
public class InvdWorkpointAssocCreateNoOpRequest extends InvdWorkpointAssocSubRequestParent {
/**
 *
 * Constructor to create a   InvdWorkpointAssocCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdWorkpointAssocCreateNoOpRequest(String id, InvdWorkpointAssocObjectData noOpIn) {
    super(id, "InvdWorkpointAssocCreateNoOpRequest");
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
