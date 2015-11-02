/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundReasonFindRequest.java
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
 * Class used to create a RefundReasonFindRequest Udt Request
 *
 */

public class RefundReasonFindRequest extends RefundReasonRequest {
/**
 *
 * Constructor to create a  RefundReasonFindRequest
 * @param id Unique request name
 * @param RRFindIn RefundReasonObjectFilter for RefundReasonFindRequest
 *
 */
@JsonCreator
  public RefundReasonFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RefundReason")RefundReasonObjectFilter RRFindIn) {
    super(id, "RefundReasonFind");
    if (RRFindIn != null) {
      Integer index =  RRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RefundReason", RefundReasonObjectHelper.toMap(RRFindIn, new HashMap(), "RefundReason").get("RefundReason"));
    }
  }

/**
 *
 * Retrieves the RefundReasonObjectDataList that results from the RefundReasonFindRequest call
 * @return RefundReasonObjectDataList resulting from udt call
 *
 */

  public RefundReasonObjectDataList getOutput() {
    return RefundReasonObjectHelper.fromMapList(outputMap, "RefundReasonList");
  }
}
