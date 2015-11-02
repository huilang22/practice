/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupFindRequest.java
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
 * Class used to create a GroupFindRequest Udt Request
 *
 */

public class GroupFindRequest extends GroupRequest {
/**
 *
 * Constructor to create a  GroupFindRequest
 * @param id Unique request name
 * @param GfindIn GroupObjectFilter for GroupFindRequest
 *
 */
@JsonCreator
  public GroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Group")GroupObjectFilter GfindIn) {
    super(id, "GroupFind");
    if (GfindIn != null) {
      Integer index =  GfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Group", GroupObjectHelper.toMap(GfindIn, new HashMap(), "Group").get("Group"));
    }
  }

/**
 *
 * Retrieves the GroupObjectDataList that results from the GroupFindRequest call
 * @return GroupObjectDataList resulting from udt call
 *
 */

  public GroupObjectDataList getOutput() {
    return GroupObjectHelper.fromMapList(outputMap, "GroupList");
  }
}
