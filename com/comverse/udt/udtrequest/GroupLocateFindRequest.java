/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupLocateFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a GroupLocateFindRequest Udt Request
 *
 */

public class GroupLocateFindRequest extends GroupLocateRequest {
/**
 *
 * Constructor to create a  GroupLocateFindRequest
 * @param id Unique request name
 * @param GLFindIn GroupLocateObjectFilter for GroupLocateFindRequest
 *
 */
@JsonCreator
  public GroupLocateFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GroupLocate")GroupLocateObjectFilter GLFindIn) {
    super(id, "GroupLocateFind");
    if (GLFindIn != null) {
      Integer index =  GLFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GroupLocate", GroupLocateObjectHelper.toMap(GLFindIn, new HashMap(), "GroupLocate").get("GroupLocate"));
    }
  }

/**
 *
 * Retrieves the GroupLocateObjectDataList that results from the GroupLocateFindRequest call
 * @return GroupLocateObjectDataList resulting from udt call
 *
 */

  public GroupLocateObjectDataList getOutput() {
    return GroupLocateObjectHelper.fromMapList(outputMap, "GroupLocateList");
  }
}
