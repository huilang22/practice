/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectInstanceExtendedDataFindRequest.java
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
 * Class used to create a ProjectInstanceExtendedDataFindRequest Udt Request
 *
 */

public class ProjectInstanceExtendedDataFindRequest extends ProjectInstanceRequest {
/**
 *
 * Constructor to create a  ProjectInstanceExtendedDataFindRequest
 * @param id Unique request name
 * @param piedfIn ProjectInstanceObjectKeyData for ProjectInstanceExtendedDataFindRequest
 *
 */
@JsonCreator
  public ProjectInstanceExtendedDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProjectInstance")ProjectInstanceObjectKeyData piedfIn) {
    super(id, "ProjectInstanceExtendedDataFind");
    if (piedfIn != null) {
      addInput("ProjectInstance", ProjectInstanceObjectKeyHelper.toMap(piedfIn, new HashMap(), "ProjectInstanceObjectKeyData").get("ProjectInstanceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ProjectInstanceEDObjectDataList that results from the ProjectInstanceExtendedDataFindRequest call
 * @return ProjectInstanceEDObjectDataList resulting from udt call
 *
 */

  public ProjectInstanceEDObjectDataList getOutput() {
    return ProjectInstanceEDObjectHelper.fromMapList(outputMap, "ProjectInstanceExtendedDataList");
  }
}
