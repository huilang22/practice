/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectInstanceGetRequest.java
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
 * Class used to create a ProjectInstanceGetRequest Udt Request
 *
 */

public class ProjectInstanceGetRequest extends ProjectInstanceSubRequestParent {
/**
 *
 * Constructor to create a  ProjectInstanceGetRequest
 * @param id Unique request name
 * @param piGetIn ProjectInstanceObjectKeyData for ProjectInstanceGetRequest
 *
 */
@JsonCreator
  public ProjectInstanceGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProjectInstance")ProjectInstanceObjectKeyData piGetIn) {
    super(id, "ProjectInstanceGet");
    if (piGetIn != null) {
      addInput("ProjectInstance", ProjectInstanceObjectKeyHelper.toMap(piGetIn, new HashMap(), "ProjectInstanceObjectKeyData").get("ProjectInstanceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ProjectInstanceObjectData that results from the ProjectInstanceGetRequest call
 * @return ProjectInstanceObjectData resulting from udt call
 *
 */

  public ProjectInstanceObjectData getOutput() {
    return ProjectInstanceObjectHelper.fromMap(outputMap, "ProjectInstance");
  }
}
