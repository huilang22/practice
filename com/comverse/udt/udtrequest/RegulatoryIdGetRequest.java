/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RegulatoryIdGetRequest.java
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
 * Class used to create a RegulatoryIdGetRequest Udt Request
 *
 */

public class RegulatoryIdGetRequest extends RegulatoryIdSubRequestParent {
/**
 *
 * Constructor to create a  RegulatoryIdGetRequest
 * @param id Unique request name
 * @param RIGetIn RegulatoryIdObjectKeyData for RegulatoryIdGetRequest
 *
 */
@JsonCreator
  public RegulatoryIdGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RegulatoryId")RegulatoryIdObjectKeyData RIGetIn) {
    super(id, "RegulatoryIdGet");
    if (RIGetIn != null) {
      addInput("RegulatoryId", RegulatoryIdObjectKeyHelper.toMap(RIGetIn, new HashMap(), "RegulatoryIdObjectKeyData").get("RegulatoryIdObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RegulatoryIdObjectData that results from the RegulatoryIdGetRequest call
 * @return RegulatoryIdObjectData resulting from udt call
 *
 */

  public RegulatoryIdObjectData getOutput() {
    return RegulatoryIdObjectHelper.fromMap(outputMap, "RegulatoryId");
  }
}
