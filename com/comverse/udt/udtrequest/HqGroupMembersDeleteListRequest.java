/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupMembersDeleteListRequest.java
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
 * Class used to create a HqGroupMembersDeleteListRequest Udt Request
 *
 */

public class HqGroupMembersDeleteListRequest extends HqGroupMembersRequest {
/**
 *
 * Constructor to create a  HqGroupMembersDeleteListRequest
 * @param id Unique request name
 * @param HGMDlIn HqGroupMembersObjectFilter for HqGroupMembersDeleteListRequest
 * @param HGMDlInactiveDate Date for HqGroupMembersDeleteListRequest
 * @param HGMDlDiscRe Integer for HqGroupMembersDeleteListRequest
 *
 */
@JsonCreator
  public HqGroupMembersDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupMembers")HqGroupMembersObjectFilter HGMDlIn, @JsonProperty("HGMDlInactiveDate")Date HGMDlInactiveDate, @JsonProperty("HGMDlDiscRe")Integer HGMDlDiscRe) {
    super(id, "HqGroupMembersDeleteList");
    if (HGMDlIn != null) {
      Integer index =  HGMDlIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(HGMDlIn, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
    if (HGMDlInactiveDate != null) {
      addInput("HGMDlInactiveDate", HGMDlInactiveDate);
    }
    if (HGMDlDiscRe != null) {
      addInput("HGMDlDiscRe", HGMDlDiscRe);
    }
  }

/**
 *
 * Retrieves the HqGroupMembersObjectDataList that results from the HqGroupMembersDeleteListRequest call
 * @return HqGroupMembersObjectDataList resulting from udt call
 *
 */

  public HqGroupMembersObjectDataList getOutput() {
    return HqGroupMembersObjectHelper.fromMapList(outputMap, "HqGroupMembersList");
  }
}
