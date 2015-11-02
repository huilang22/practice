/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentUpdateRequest.java
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
 * Class used to create a AccountSegmentUpdateRequest Udt Request
 *
 */

public class AccountSegmentUpdateRequest extends AccountSegmentSubRequestParent {
/**
 *
 * Constructor to create a  AccountSegmentUpdateRequest
 * @param id Unique request name
 * @param ASUpdateIn AccountSegmentObjectData for AccountSegmentUpdateRequest
 * @param ASUpdateFilter AccountSegmentObjectFilter for AccountSegmentUpdateRequest
 *
 */
@JsonCreator
  public AccountSegmentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountSegment")AccountSegmentObjectData ASUpdateIn, @JsonProperty("ASUpdateFilter")AccountSegmentObjectFilter ASUpdateFilter) {
    super(id, "AccountSegmentUpdate");
    if (ASUpdateIn != null) {
      addInput("AccountSegment", AccountSegmentObjectHelper.toMap(ASUpdateIn, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
    if (ASUpdateFilter != null) {
      Integer index =  ASUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ASUpdateFilter", AccountSegmentObjectHelper.toMap(ASUpdateFilter, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
  }

/**
 *
 * Retrieves the AccountSegmentObjectData that results from the AccountSegmentUpdateRequest call
 * @return AccountSegmentObjectData resulting from udt call
 *
 */

  public AccountSegmentObjectData getOutput() {
    return AccountSegmentObjectHelper.fromMap(outputMap, "AccountSegment");
  }
}
