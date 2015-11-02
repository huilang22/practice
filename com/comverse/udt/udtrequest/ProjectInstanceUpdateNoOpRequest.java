/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectInstanceUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ProjectInstanceUpdateNoOpRequest Udt Request/Response
 *
 */
public class ProjectInstanceUpdateNoOpRequest extends ProjectInstanceSubRequestParent {
/**
 *
 * Constructor to create a   ProjectInstanceUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProjectInstanceUpdateNoOpRequest(String id, ProjectInstanceObjectData noOpIn) {
    super(id, "ProjectInstanceUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ProjectInstance", ProjectInstanceObjectHelper.toMap(noOpIn, new HashMap(), "ProjectInstance").get("ProjectInstance"));
    }
  }
/**
 *
 * Retrieves the ProjectInstanceObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ProjectInstanceObjectData getOutput() {
    return ProjectInstanceObjectHelper.fromMap(outputMap, "ProjectInstance");
  }
}
