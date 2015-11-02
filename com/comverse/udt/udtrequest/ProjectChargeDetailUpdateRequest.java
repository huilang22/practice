/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectChargeDetailUpdateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ProjectChargeDetailUpdateRequest Udt Request
 *
 */

public class ProjectChargeDetailUpdateRequest extends ProjectChargeDetailSubRequestParent {
/**
 *
 * Constructor to create a  ProjectChargeDetailUpdateRequest
 * @param id Unique request name
 * @param ProjectChargeDetailUpdateIn ProjectChargeDetailObjectData for ProjectChargeDetailUpdateRequest
 *
 */
@JsonCreator
  public ProjectChargeDetailUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProjectChargeDetail")ProjectChargeDetailObjectData ProjectChargeDetailUpdateIn) {
    super(id, "ProjectChargeDetailUpdate");
    if (ProjectChargeDetailUpdateIn != null) {
      addInput("ProjectChargeDetail", ProjectChargeDetailObjectHelper.toMap(ProjectChargeDetailUpdateIn, new HashMap(), "ProjectChargeDetail").get("ProjectChargeDetail"));
    }
  }

/**
 *
 * Retrieves the ProjectChargeDetailObjectData that results from the ProjectChargeDetailUpdateRequest call
 * @return ProjectChargeDetailObjectData resulting from udt call
 *
 */

  public ProjectChargeDetailObjectData getOutput() {
    return ProjectChargeDetailObjectHelper.fromMap(outputMap, "ProjectChargeDetail");
  }
}
