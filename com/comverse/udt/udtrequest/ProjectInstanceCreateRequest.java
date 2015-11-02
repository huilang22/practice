/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectInstanceCreateRequest.java
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
 * Class used to create a ProjectInstanceCreateRequest Udt Request
 *
 */

public class ProjectInstanceCreateRequest extends ProjectInstanceSubRequestParent {
/**
 *
 * Constructor to create a  ProjectInstanceCreateRequest
 * @param id Unique request name
 * @param piCreateIn ProjectInstanceObjectData for ProjectInstanceCreateRequest
 *
 */
@JsonCreator
  public ProjectInstanceCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProjectInstance")ProjectInstanceObjectData piCreateIn) {
    super(id, "ProjectInstanceCreate");
    if (piCreateIn != null) {
      addInput("ProjectInstance", ProjectInstanceObjectHelper.toMap(piCreateIn, new HashMap(), "ProjectInstance").get("ProjectInstance"));
    }
  }

/**
 *
 * Retrieves the ProjectInstanceObjectData that results from the ProjectInstanceCreateRequest call
 * @return ProjectInstanceObjectData resulting from udt call
 *
 */

  public ProjectInstanceObjectData getOutput() {
    return ProjectInstanceObjectHelper.fromMap(outputMap, "ProjectInstance");
  }
}
