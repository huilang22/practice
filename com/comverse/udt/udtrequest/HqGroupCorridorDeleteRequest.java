/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupCorridorDeleteRequest.java
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
 * Class used to create a HqGroupCorridorDeleteRequest Udt Request
 *
 */

public class HqGroupCorridorDeleteRequest extends HqGroupCorridorSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupCorridorDeleteRequest
 * @param id Unique request name
 * @param HQGCdeleteIn HqGroupCorridorObjectData for HqGroupCorridorDeleteRequest
 *
 */
@JsonCreator
  public HqGroupCorridorDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupCorridor")HqGroupCorridorObjectData HQGCdeleteIn) {
    super(id, "HqGroupCorridorDelete");
    if (HQGCdeleteIn != null) {
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(HQGCdeleteIn, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }

/**
 *
 * Retrieves the HqGroupCorridorObjectData that results from the HqGroupCorridorDeleteRequest call
 * @return HqGroupCorridorObjectData resulting from udt call
 *
 */

  public HqGroupCorridorObjectData getOutput() {
    return HqGroupCorridorObjectHelper.fromMap(outputMap, "HqGroupCorridor");
  }
}
