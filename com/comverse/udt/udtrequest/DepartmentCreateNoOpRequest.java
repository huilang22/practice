/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepartmentCreateNoOpRequest.java
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
 * NoOp class used to simulate a DepartmentCreateNoOpRequest Udt Request/Response
 *
 */
public class DepartmentCreateNoOpRequest extends DepartmentSubRequestParent {
/**
 *
 * Constructor to create a   DepartmentCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DepartmentCreateNoOpRequest(String id, DepartmentObjectData noOpIn) {
    super(id, "DepartmentCreateNoOpRequest");
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
