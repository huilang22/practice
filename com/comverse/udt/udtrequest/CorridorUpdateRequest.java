/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorUpdateRequest.java
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
 * Class used to create a CorridorUpdateRequest Udt Request
 *
 */

public class CorridorUpdateRequest extends CorridorSubRequestParent {
/**
 *
 * Constructor to create a  CorridorUpdateRequest
 * @param id Unique request name
 * @param CorrUpdateIn CorridorObjectData for CorridorUpdateRequest
 *
 */
@JsonCreator
  public CorridorUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Corridor")CorridorObjectData CorrUpdateIn) {
    super(id, "CorridorUpdate");
    if (CorrUpdateIn != null) {
      addInput("Corridor", CorridorObjectHelper.toMap(CorrUpdateIn, new HashMap(), "Corridor").get("Corridor"));
    }
  }

/**
 *
 * Retrieves the CorridorObjectData that results from the CorridorUpdateRequest call
 * @return CorridorObjectData resulting from udt call
 *
 */

  public CorridorObjectData getOutput() {
    return CorridorObjectHelper.fromMap(outputMap, "Corridor");
  }
}
