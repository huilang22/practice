/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionDeleteNoOpRequest.java
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
 * NoOp class used to simulate a PackageDefinitionDeleteNoOpRequest Udt Request/Response
 *
 */
public class PackageDefinitionDeleteNoOpRequest extends PackageDefinitionSubRequestParent {
/**
 *
 * Constructor to create a   PackageDefinitionDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageDefinitionDeleteNoOpRequest(String id, PDObjectData noOpIn) {
    super(id, "PackageDefinitionDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("PackageDefinition", PDObjectHelper.toMap(noOpIn, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
  }
/**
 *
 * Retrieves the PDObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PDObjectData getOutput() {
    return PDObjectHelper.fromMap(outputMap, "PackageDefinition");
  }
}
