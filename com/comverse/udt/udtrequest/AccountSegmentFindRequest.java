/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentFindRequest.java
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
 * Class used to create a AccountSegmentFindRequest Udt Request
 *
 */

public class AccountSegmentFindRequest extends AccountSegmentRequest {
/**
 *
 * Constructor to create a  AccountSegmentFindRequest
 * @param id Unique request name
 * @param ASFindIn AccountSegmentObjectFilter for AccountSegmentFindRequest
 *
 */
@JsonCreator
  public AccountSegmentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountSegment")AccountSegmentObjectFilter ASFindIn) {
    super(id, "AccountSegmentFind");
    if (ASFindIn != null) {
      Integer index =  ASFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountSegment", AccountSegmentObjectHelper.toMap(ASFindIn, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
  }

/**
 *
 * Retrieves the AccountSegmentObjectDataList that results from the AccountSegmentFindRequest call
 * @return AccountSegmentObjectDataList resulting from udt call
 *
 */

  public AccountSegmentObjectDataList getOutput() {
    return AccountSegmentObjectHelper.fromMapList(outputMap, "AccountSegmentList");
  }
}
