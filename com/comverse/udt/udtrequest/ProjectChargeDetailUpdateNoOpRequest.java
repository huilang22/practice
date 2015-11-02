/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectChargeDetailUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ProjectChargeDetailUpdateNoOpRequest Udt Request/Response
 *
 */
public class ProjectChargeDetailUpdateNoOpRequest extends ProjectChargeDetailSubRequestParent {
/**
 *
 * Constructor to create a   ProjectChargeDetailUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProjectChargeDetailUpdateNoOpRequest(String id, ProjectChargeDetailObjectData noOpIn) {
    super(id, "ProjectChargeDetailUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ProjectChargeDetail", ProjectChargeDetailObjectHelper.toMap(noOpIn, new HashMap(), "ProjectChargeDetail").get("ProjectChargeDetail"));
    }
  }
/**
 *
 * Retrieves the ProjectChargeDetailObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ProjectChargeDetailObjectData getOutput() {
    return ProjectChargeDetailObjectHelper.fromMap(outputMap, "ProjectChargeDetail");
  }
}
