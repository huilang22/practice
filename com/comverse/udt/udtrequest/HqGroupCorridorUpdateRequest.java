/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupCorridorUpdateRequest.java
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
 * Class used to create a HqGroupCorridorUpdateRequest Udt Request
 *
 */

public class HqGroupCorridorUpdateRequest extends HqGroupCorridorSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupCorridorUpdateRequest
 * @param id Unique request name
 * @param HQGCupdateIn HqGroupCorridorObjectData for HqGroupCorridorUpdateRequest
 *
 */
@JsonCreator
  public HqGroupCorridorUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupCorridor")HqGroupCorridorObjectData HQGCupdateIn) {
    super(id, "HqGroupCorridorUpdate");
    if (HQGCupdateIn != null) {
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(HQGCupdateIn, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }

/**
 *
 * Retrieves the HqGroupCorridorObjectData that results from the HqGroupCorridorUpdateRequest call
 * @return HqGroupCorridorObjectData resulting from udt call
 *
 */

  public HqGroupCorridorObjectData getOutput() {
    return HqGroupCorridorObjectHelper.fromMap(outputMap, "HqGroupCorridor");
  }
}
