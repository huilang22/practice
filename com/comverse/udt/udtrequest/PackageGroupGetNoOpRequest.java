/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageGroupGetNoOpRequest.java
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
 * NoOp class used to simulate a PackageGroupGetNoOpRequest Udt Request/Response
 *
 */
public class PackageGroupGetNoOpRequest extends PackageGroupSubRequestParent {
/**
 *
 * Constructor to create a   PackageGroupGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageGroupGetNoOpRequest(String id, PGObjectData noOpIn) {
    super(id, "PackageGroupGetNoOpRequest");
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
