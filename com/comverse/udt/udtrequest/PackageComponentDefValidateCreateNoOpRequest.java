/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefValidateCreateNoOpRequest.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a PackageComponentDefValidateCreateNoOpRequest Udt Request/Response
 *
 */
public class PackageComponentDefValidateCreateNoOpRequest extends PackageComponentDefValidateSubRequestParent {
/**
 *
 * Constructor to create a   PackageComponentDefValidateCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageComponentDefValidateCreateNoOpRequest(String id, PCDObjectData noOpIn) {
    super(id, "PackageComponentDefValidateCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("PackageComponentDefValidate", PCDObjectHelper.toMap(noOpIn, new HashMap(), "PackageComponentDefValidate").get("PackageComponentDefValidate"));
    }
  }
/**
 *
 * Retrieves the PCDObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PCDObjectData getOutput() {
    return PCDObjectHelper.fromMap(outputMap, "PackageComponentDefValidate");
  }
}
