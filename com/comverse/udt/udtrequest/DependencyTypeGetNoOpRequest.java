/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyTypeGetNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a DependencyTypeGetNoOpRequest Udt Request/Response
 *
 */
public class DependencyTypeGetNoOpRequest extends DependencyTypeSubRequestParent {
/**
 *
 * Constructor to create a   DependencyTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DependencyTypeGetNoOpRequest(String id, DependencyTypeObjectData noOpIn) {
    super(id, "DependencyTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("DependencyType", DependencyTypeObjectHelper.toMap(noOpIn, new HashMap(), "DependencyType").get("DependencyType"));
    }
  }
/**
 *
 * Retrieves the DependencyTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public DependencyTypeObjectData getOutput() {
    return DependencyTypeObjectHelper.fromMap(outputMap, "DependencyType");
  }
}
