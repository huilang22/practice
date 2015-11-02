/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepartmentUpdateNoOpRequest.java
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

import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a DepartmentUpdateNoOpRequest Udt Request/Response
 *
 */
public class DepartmentUpdateNoOpRequest extends DepartmentSubRequestParent {
/**
 *
 * Constructor to create a   DepartmentUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DepartmentUpdateNoOpRequest(String id, DepartmentObjectData noOpIn) {
    super(id, "DepartmentUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Department", DepartmentObjectHelper.toMap(noOpIn, new HashMap(), "Department").get("Department"));
    }
  }
/**
 *
 * Retrieves the DepartmentObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public DepartmentObjectData getOutput() {
    return DepartmentObjectHelper.fromMap(outputMap, "Department");
  }
}
