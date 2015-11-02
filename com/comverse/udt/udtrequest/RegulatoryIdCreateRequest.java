/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RegulatoryIdCreateRequest.java
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
 * Class used to create a RegulatoryIdCreateRequest Udt Request
 *
 */

public class RegulatoryIdCreateRequest extends RegulatoryIdSubRequestParent {
/**
 *
 * Constructor to create a  RegulatoryIdCreateRequest
 * @param id Unique request name
 * @param RICreateIn RegulatoryIdObjectData for RegulatoryIdCreateRequest
 *
 */
@JsonCreator
  public RegulatoryIdCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RegulatoryId")RegulatoryIdObjectData RICreateIn) {
    super(id, "RegulatoryIdCreate");
    if (RICreateIn != null) {
      addInput("RegulatoryId", RegulatoryIdObjectHelper.toMap(RICreateIn, new HashMap(), "RegulatoryId").get("RegulatoryId"));
    }
  }

/**
 *
 * Retrieves the RegulatoryIdObjectData that results from the RegulatoryIdCreateRequest call
 * @return RegulatoryIdObjectData resulting from udt call
 *
 */

  public RegulatoryIdObjectData getOutput() {
    return RegulatoryIdObjectHelper.fromMap(outputMap, "RegulatoryId");
  }
}
