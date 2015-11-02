/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyGroupMemberFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a DependencyGroupMemberFindRequest Udt Request
 *
 */

public class DependencyGroupMemberFindRequest extends DependencyGroupMemberRequest {
/**
 *
 * Constructor to create a  DependencyGroupMemberFindRequest
 * @param id Unique request name
 * @param entTypeGrpFindIn DependencyGroupMemberObjectFilter for DependencyGroupMemberFindRequest
 *
 */
@JsonCreator
  public DependencyGroupMemberFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("DependencyGroupMember")DependencyGroupMemberObjectFilter entTypeGrpFindIn) {
    super(id, "DependencyGroupMemberFind");
    if (entTypeGrpFindIn != null) {
      Integer index =  entTypeGrpFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DependencyGroupMember", DependencyGroupMemberObjectHelper.toMap(entTypeGrpFindIn, new HashMap(), "DependencyGroupMember").get("DependencyGroupMember"));
    }
  }

/**
 *
 * Retrieves the DependencyGroupMemberObjectDataList that results from the DependencyGroupMemberFindRequest call
 * @return DependencyGroupMemberObjectDataList resulting from udt call
 *
 */

  public DependencyGroupMemberObjectDataList getOutput() {
    return DependencyGroupMemberObjectHelper.fromMapList(outputMap, "DependencyGroupMemberList");
  }
}
