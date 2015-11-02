/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionUpdateNoOpRequest.java
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
 * NoOp class used to simulate a PackageDefinitionUpdateNoOpRequest Udt Request/Response
 *
 */
public class PackageDefinitionUpdateNoOpRequest extends PackageDefinitionSubRequestParent {
/**
 *
 * Constructor to create a   PackageDefinitionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageDefinitionUpdateNoOpRequest(String id, PDObjectData noOpIn) {
    super(id, "PackageDefinitionUpdateNoOpRequest");
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
