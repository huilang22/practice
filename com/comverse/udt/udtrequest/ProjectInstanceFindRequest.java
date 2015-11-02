/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectInstanceFindRequest.java
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
 * Class used to create a ProjectInstanceFindRequest Udt Request
 *
 */

public class ProjectInstanceFindRequest extends ProjectInstanceRequest {
/**
 *
 * Constructor to create a  ProjectInstanceFindRequest
 * @param id Unique request name
 * @param piFindIn ProjectInstanceObjectFilter for ProjectInstanceFindRequest
 *
 */
@JsonCreator
  public ProjectInstanceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProjectInstance")ProjectInstanceObjectFilter piFindIn) {
    super(id, "ProjectInstanceFind");
    if (piFindIn != null) {
      Integer index =  piFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProjectInstance", ProjectInstanceObjectHelper.toMap(piFindIn, new HashMap(), "ProjectInstance").get("ProjectInstance"));
    }
  }

/**
 *
 * Retrieves the ProjectInstanceObjectDataList that results from the ProjectInstanceFindRequest call
 * @return ProjectInstanceObjectDataList resulting from udt call
 *
 */

  public ProjectInstanceObjectDataList getOutput() {
    return ProjectInstanceObjectHelper.fromMapList(outputMap, "ProjectInstanceList");
  }
}
