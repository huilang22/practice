/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefGetNoOpRequest.java
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
 * NoOp class used to simulate a PackageComponentDefGetNoOpRequest Udt Request/Response
 *
 */
public class PackageComponentDefGetNoOpRequest extends PackageComponentDefSubRequestParent {
/**
 *
 * Constructor to create a   PackageComponentDefGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageComponentDefGetNoOpRequest(String id, PCDObjectData noOpIn) {
    super(id, "PackageComponentDefGetNoOpRequest");
    if (noOpIn != null) {
      addInput("PackageComponentDef", PCDObjectHelper.toMap(noOpIn, new HashMap(), "PackageComponentDef").get("PackageComponentDef"));
    }
  }
/**
 *
 * Retrieves the PCDObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PCDObjectData getOutput() {
    return PCDObjectHelper.fromMap(outputMap, "PackageComponentDef");
  }
}
