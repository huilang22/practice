/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentMapFindRequest.java
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
 * Class used to create a AccountSegmentMapFindRequest Udt Request
 *
 */

public class AccountSegmentMapFindRequest extends AccountSegmentMapRequest {
/**
 *
 * Constructor to create a  AccountSegmentMapFindRequest
 * @param id Unique request name
 * @param ASMFindIn AccountSegmentMapObjectFilter for AccountSegmentMapFindRequest
 *
 */
@JsonCreator
  public AccountSegmentMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountSegmentMap")AccountSegmentMapObjectFilter ASMFindIn) {
    super(id, "AccountSegmentMapFind");
    if (ASMFindIn != null) {
      Integer index =  ASMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountSegmentMap", AccountSegmentMapObjectHelper.toMap(ASMFindIn, new HashMap(), "AccountSegmentMap").get("AccountSegmentMap"));
    }
  }

/**
 *
 * Retrieves the AccountSegmentMapObjectDataList that results from the AccountSegmentMapFindRequest call
 * @return AccountSegmentMapObjectDataList resulting from udt call
 *
 */

  public AccountSegmentMapObjectDataList getOutput() {
    return AccountSegmentMapObjectHelper.fromMapList(outputMap, "AccountSegmentMapList");
  }
}
