/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectInstanceUpdateRequest.java
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
 * Class used to create a ProjectInstanceUpdateRequest Udt Request
 *
 */

public class ProjectInstanceUpdateRequest extends ProjectInstanceSubRequestParent {
/**
 *
 * Constructor to create a  ProjectInstanceUpdateRequest
 * @param id Unique request name
 * @param piUpdateIn ProjectInstanceObjectData for ProjectInstanceUpdateRequest
 *
 */
@JsonCreator
  public ProjectInstanceUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProjectInstance")ProjectInstanceObjectData piUpdateIn) {
    super(id, "ProjectInstanceUpdate");
    if (piUpdateIn != null) {
      addInput("ProjectInstance", ProjectInstanceObjectHelper.toMap(piUpdateIn, new HashMap(), "ProjectInstance").get("ProjectInstance"));
    }
  }

/**
 *
 * Retrieves the ProjectInstanceObjectData that results from the ProjectInstanceUpdateRequest call
 * @return ProjectInstanceObjectData resulting from udt call
 *
 */

  public ProjectInstanceObjectData getOutput() {
    return ProjectInstanceObjectHelper.fromMap(outputMap, "ProjectInstance");
  }
}
