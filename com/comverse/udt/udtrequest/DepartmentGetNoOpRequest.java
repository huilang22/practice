/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepartmentGetNoOpRequest.java
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
 * NoOp class used to simulate a DepartmentGetNoOpRequest Udt Request/Response
 *
 */
public class DepartmentGetNoOpRequest extends DepartmentSubRequestParent {
/**
 *
 * Constructor to create a   DepartmentGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DepartmentGetNoOpRequest(String id, DepartmentObjectData noOpIn) {
    super(id, "DepartmentGetNoOpRequest");
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
