/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RegulatoryIdDeleteRequest.java
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
 * Class used to create a RegulatoryIdDeleteRequest Udt Request
 *
 */

public class RegulatoryIdDeleteRequest extends RegulatoryIdSubRequestParent {
/**
 *
 * Constructor to create a  RegulatoryIdDeleteRequest
 * @param id Unique request name
 * @param RIDeleteIn RegulatoryIdObjectKeyData for RegulatoryIdDeleteRequest
 *
 */
@JsonCreator
  public RegulatoryIdDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RegulatoryId")RegulatoryIdObjectKeyData RIDeleteIn) {
    super(id, "RegulatoryIdDelete");
    if (RIDeleteIn != null) {
      addInput("RegulatoryId", RegulatoryIdObjectKeyHelper.toMap(RIDeleteIn, new HashMap(), "RegulatoryIdObjectKeyData").get("RegulatoryIdObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RegulatoryIdObjectData that results from the RegulatoryIdDeleteRequest call
 * @return RegulatoryIdObjectData resulting from udt call
 *
 */

  public RegulatoryIdObjectData getOutput() {
    return RegulatoryIdObjectHelper.fromMap(outputMap, "RegulatoryId");
  }
}
