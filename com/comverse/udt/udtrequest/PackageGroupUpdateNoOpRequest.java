/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageGroupUpdateNoOpRequest.java
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
 * NoOp class used to simulate a PackageGroupUpdateNoOpRequest Udt Request/Response
 *
 */
public class PackageGroupUpdateNoOpRequest extends PackageGroupSubRequestParent {
/**
 *
 * Constructor to create a   PackageGroupUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageGroupUpdateNoOpRequest(String id, PGObjectData noOpIn) {
    super(id, "PackageGroupUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("PackageGroup", PGObjectHelper.toMap(noOpIn, new HashMap(), "PackageGroup").get("PackageGroup"));
    }
  }
/**
 *
 * Retrieves the PGObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PGObjectData getOutput() {
    return PGObjectHelper.fromMap(outputMap, "PackageGroup");
  }
}
