/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentMemberGetNoOpRequest.java
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
 * NoOp class used to simulate a PackageComponentMemberGetNoOpRequest Udt Request/Response
 *
 */
public class PackageComponentMemberGetNoOpRequest extends PackageComponentMemberSubRequestParent {
/**
 *
 * Constructor to create a   PackageComponentMemberGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageComponentMemberGetNoOpRequest(String id, PCMObjectData noOpIn) {
    super(id, "PackageComponentMemberGetNoOpRequest");
    if (noOpIn != null) {
      addInput("PackageComponentMember", PCMObjectHelper.toMap(noOpIn, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }
/**
 *
 * Retrieves the PCMObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PCMObjectData getOutput() {
    return PCMObjectHelper.fromMap(outputMap, "PackageComponentMember");
  }
}
