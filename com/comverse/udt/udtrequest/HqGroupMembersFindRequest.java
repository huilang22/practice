/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupMembersFindRequest.java
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
 * Class used to create a HqGroupMembersFindRequest Udt Request
 *
 */

public class HqGroupMembersFindRequest extends HqGroupMembersRequest {
/**
 *
 * Constructor to create a  HqGroupMembersFindRequest
 * @param id Unique request name
 * @param HGMFindIn HqGroupMembersObjectFilter for HqGroupMembersFindRequest
 *
 */
@JsonCreator
  public HqGroupMembersFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupMembers")HqGroupMembersObjectFilter HGMFindIn) {
    super(id, "HqGroupMembersFind");
    if (HGMFindIn != null) {
      Integer index =  HGMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(HGMFindIn, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }

/**
 *
 * Retrieves the HqGroupMembersObjectDataList that results from the HqGroupMembersFindRequest call
 * @return HqGroupMembersObjectDataList resulting from udt call
 *
 */

  public HqGroupMembersObjectDataList getOutput() {
    return HqGroupMembersObjectHelper.fromMapList(outputMap, "HqGroupMembersList");
  }
}
