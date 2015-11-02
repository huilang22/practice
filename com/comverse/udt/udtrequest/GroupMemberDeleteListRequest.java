/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberDeleteListRequest.java
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
 * Class used to create a GroupMemberDeleteListRequest Udt Request
 *
 */

public class GroupMemberDeleteListRequest extends GroupMemberRequest {
/**
 *
 * Constructor to create a  GroupMemberDeleteListRequest
 * @param id Unique request name
 * @param GMLdeleteIn GroupMemberObjectFilter for GroupMemberDeleteListRequest
 * @param GMLInactiveDate Date for GroupMemberDeleteListRequest
 *
 */
@JsonCreator
  public GroupMemberDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("GroupMember")GroupMemberObjectFilter GMLdeleteIn, @JsonProperty("InactiveDate")Date GMLInactiveDate) {
    super(id, "GroupMemberDeleteList");
    if (GMLdeleteIn != null) {
      Integer index =  GMLdeleteIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GroupMember", GroupMemberObjectHelper.toMap(GMLdeleteIn, new HashMap(), "Void").get("Void"));
    }
    if (GMLInactiveDate != null) {
      addInput("InactiveDate", GMLInactiveDate);
    }
  }

}
