/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentUpdateNoOpRequest.java
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
 * NoOp class used to simulate a PackageComponentUpdateNoOpRequest Udt Request/Response
 *
 */
public class PackageComponentUpdateNoOpRequest extends PackageComponentSubRequestParent {
/**
 *
 * Constructor to create a   PackageComponentUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageComponentUpdateNoOpRequest(String id, PCObjectData noOpIn) {
    super(id, "PackageComponentUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("PackageComponent", PCObjectHelper.toMap(noOpIn, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
  }
/**
 *
 * Retrieves the PCObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PCObjectData getOutput() {
    return PCObjectHelper.fromMap(outputMap, "PackageComponent");
  }
}
