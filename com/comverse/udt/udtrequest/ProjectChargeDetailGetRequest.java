/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectChargeDetailGetRequest.java
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
 * Class used to create a ProjectChargeDetailGetRequest Udt Request
 *
 */

public class ProjectChargeDetailGetRequest extends ProjectChargeDetailSubRequestParent {
/**
 *
 * Constructor to create a  ProjectChargeDetailGetRequest
 * @param id Unique request name
 * @param ProjectChargeDetailGetIn ProjectChargeDetailObjectKeyData for ProjectChargeDetailGetRequest
 *
 */
@JsonCreator
  public ProjectChargeDetailGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProjectChargeDetail")ProjectChargeDetailObjectKeyData ProjectChargeDetailGetIn) {
    super(id, "ProjectChargeDetailGet");
    if (ProjectChargeDetailGetIn != null) {
      addInput("ProjectChargeDetail", ProjectChargeDetailObjectKeyHelper.toMap(ProjectChargeDetailGetIn, new HashMap(), "ProjectChargeDetailObjectKeyData").get("ProjectChargeDetailObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ProjectChargeDetailObjectData that results from the ProjectChargeDetailGetRequest call
 * @return ProjectChargeDetailObjectData resulting from udt call
 *
 */

  public ProjectChargeDetailObjectData getOutput() {
    return ProjectChargeDetailObjectHelper.fromMap(outputMap, "ProjectChargeDetail");
  }
}
