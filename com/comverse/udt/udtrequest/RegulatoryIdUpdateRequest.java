/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RegulatoryIdUpdateRequest.java
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
 * Class used to create a RegulatoryIdUpdateRequest Udt Request
 *
 */

public class RegulatoryIdUpdateRequest extends RegulatoryIdSubRequestParent {
/**
 *
 * Constructor to create a  RegulatoryIdUpdateRequest
 * @param id Unique request name
 * @param RIUpdateIn RegulatoryIdObjectData for RegulatoryIdUpdateRequest
 *
 */
@JsonCreator
  public RegulatoryIdUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RegulatoryId")RegulatoryIdObjectData RIUpdateIn) {
    super(id, "RegulatoryIdUpdate");
    if (RIUpdateIn != null) {
      addInput("RegulatoryId", RegulatoryIdObjectHelper.toMap(RIUpdateIn, new HashMap(), "RegulatoryId").get("RegulatoryId"));
    }
  }

/**
 *
 * Retrieves the RegulatoryIdObjectData that results from the RegulatoryIdUpdateRequest call
 * @return RegulatoryIdObjectData resulting from udt call
 *
 */

  public RegulatoryIdObjectData getOutput() {
    return RegulatoryIdObjectHelper.fromMap(outputMap, "RegulatoryId");
  }
}
