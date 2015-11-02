/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectChargeDetailFindRequest.java
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
 * Class used to create a ProjectChargeDetailFindRequest Udt Request
 *
 */

public class ProjectChargeDetailFindRequest extends ProjectChargeDetailRequest {
/**
 *
 * Constructor to create a  ProjectChargeDetailFindRequest
 * @param id Unique request name
 * @param ProjectChargeDetailFindIn ProjectChargeDetailObjectFilter for ProjectChargeDetailFindRequest
 *
 */
@JsonCreator
  public ProjectChargeDetailFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProjectChargeDetail")ProjectChargeDetailObjectFilter ProjectChargeDetailFindIn) {
    super(id, "ProjectChargeDetailFind");
    if (ProjectChargeDetailFindIn != null) {
      Integer index =  ProjectChargeDetailFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProjectChargeDetail", ProjectChargeDetailObjectHelper.toMap(ProjectChargeDetailFindIn, new HashMap(), "ProjectChargeDetail").get("ProjectChargeDetail"));
    }
  }

/**
 *
 * Retrieves the ProjectChargeDetailObjectDataList that results from the ProjectChargeDetailFindRequest call
 * @return ProjectChargeDetailObjectDataList resulting from udt call
 *
 */

  public ProjectChargeDetailObjectDataList getOutput() {
    return ProjectChargeDetailObjectHelper.fromMapList(outputMap, "ProjectChargeDetailList");
  }
}
