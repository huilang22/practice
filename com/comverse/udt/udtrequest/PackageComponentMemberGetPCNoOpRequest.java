/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentMemberGetPCNoOpRequest.java
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
 * NoOp class used to simulate a PackageComponentMemberGetPCNoOpRequest Udt Request/Response
 *
 */
public class PackageComponentMemberGetPCNoOpRequest extends PackageComponentMemberSubRequestParent {
/**
 *
 * Constructor to create a   PackageComponentMemberGetPCNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageComponentMemberGetPCNoOpRequest(String id, PCPCMObjectData noOpIn) {
    super(id, "PackageComponentMemberGetPCNoOpRequest");
    if (noOpIn != null) {
      addInput("PackageComponentMember", PCPCMObjectHelper.toMap(noOpIn, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }
/**
 *
 * Retrieves the PCPCMObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PCPCMObjectData getOutput() {
    return PCPCMObjectHelper.fromMap(outputMap, "PackageComponentMember");
  }
}
