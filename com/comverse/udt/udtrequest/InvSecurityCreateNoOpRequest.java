/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSecurityCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvSecurityCreateNoOpRequest Udt Request/Response
 *
 */
public class InvSecurityCreateNoOpRequest extends InvSecuritySubRequestParent {
/**
 *
 * Constructor to create a   InvSecurityCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvSecurityCreateNoOpRequest(String id, InvSecurityObjectData noOpIn) {
    super(id, "InvSecurityCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvSecurity", InvSecurityObjectHelper.toMap(noOpIn, new HashMap(), "InvSecurity").get("InvSecurity"));
    }
  }
/**
 *
 * Retrieves the InvSecurityObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvSecurityObjectData getOutput() {
    return InvSecurityObjectHelper.fromMap(outputMap, "InvSecurity");
  }
}
