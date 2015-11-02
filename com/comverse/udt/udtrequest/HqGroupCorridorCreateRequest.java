/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupCorridorCreateRequest.java
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
 * Class used to create a HqGroupCorridorCreateRequest Udt Request
 *
 */

public class HqGroupCorridorCreateRequest extends HqGroupCorridorSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupCorridorCreateRequest
 * @param id Unique request name
 * @param HQGCcreateIn HqGroupCorridorObjectData for HqGroupCorridorCreateRequest
 *
 */
@JsonCreator
  public HqGroupCorridorCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupCorridor")HqGroupCorridorObjectData HQGCcreateIn) {
    super(id, "HqGroupCorridorCreate");
    if (HQGCcreateIn != null) {
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(HQGCcreateIn, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }

/**
 *
 * Retrieves the HqGroupCorridorObjectData that results from the HqGroupCorridorCreateRequest call
 * @return HqGroupCorridorObjectData resulting from udt call
 *
 */

  public HqGroupCorridorObjectData getOutput() {
    return HqGroupCorridorObjectHelper.fromMap(outputMap, "HqGroupCorridor");
  }
}
