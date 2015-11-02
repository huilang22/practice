/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdWorkpointAssocGetNoOpRequest.java
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
 * NoOp class used to simulate a InvdWorkpointAssocGetNoOpRequest Udt Request/Response
 *
 */
public class InvdWorkpointAssocGetNoOpRequest extends InvdWorkpointAssocSubRequestParent {
/**
 *
 * Constructor to create a   InvdWorkpointAssocGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdWorkpointAssocGetNoOpRequest(String id, InvdWorkpointAssocObjectData noOpIn) {
    super(id, "InvdWorkpointAssocGetNoOpRequest");
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
