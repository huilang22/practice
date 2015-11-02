/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectChargeDetailGetNoOpRequest.java
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
 * NoOp class used to simulate a ProjectChargeDetailGetNoOpRequest Udt Request/Response
 *
 */
public class ProjectChargeDetailGetNoOpRequest extends ProjectChargeDetailSubRequestParent {
/**
 *
 * Constructor to create a   ProjectChargeDetailGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProjectChargeDetailGetNoOpRequest(String id, ProjectChargeDetailObjectData noOpIn) {
    super(id, "ProjectChargeDetailGetNoOpRequest");
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
