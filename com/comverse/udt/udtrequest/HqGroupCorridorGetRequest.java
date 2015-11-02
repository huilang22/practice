/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupCorridorGetRequest.java
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
 * Class used to create a HqGroupCorridorGetRequest Udt Request
 *
 */

public class HqGroupCorridorGetRequest extends HqGroupCorridorSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupCorridorGetRequest
 * @param id Unique request name
 * @param HQGCgetIn HqGroupCorridorObjectData for HqGroupCorridorGetRequest
 *
 */
@JsonCreator
  public HqGroupCorridorGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupCorridor")HqGroupCorridorObjectData HQGCgetIn) {
    super(id, "HqGroupCorridorGet");
    if (HQGCgetIn != null) {
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(HQGCgetIn, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }

/**
 *
 * Retrieves the HqGroupCorridorObjectData that results from the HqGroupCorridorGetRequest call
 * @return HqGroupCorridorObjectData resulting from udt call
 *
 */

  public HqGroupCorridorObjectData getOutput() {
    return HqGroupCorridorObjectHelper.fromMap(outputMap, "HqGroupCorridor");
  }
}
