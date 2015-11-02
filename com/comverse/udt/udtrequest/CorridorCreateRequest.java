/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorCreateRequest.java
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
 * Class used to create a CorridorCreateRequest Udt Request
 *
 */

public class CorridorCreateRequest extends CorridorSubRequestParent {
/**
 *
 * Constructor to create a  CorridorCreateRequest
 * @param id Unique request name
 * @param CorrCreateIn CorridorObjectData for CorridorCreateRequest
 *
 */
@JsonCreator
  public CorridorCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Corridor")CorridorObjectData CorrCreateIn) {
    super(id, "CorridorCreate");
    if (CorrCreateIn != null) {
      addInput("Corridor", CorridorObjectHelper.toMap(CorrCreateIn, new HashMap(), "Corridor").get("Corridor"));
    }
  }

/**
 *
 * Retrieves the CorridorObjectData that results from the CorridorCreateRequest call
 * @return CorridorObjectData resulting from udt call
 *
 */

  public CorridorObjectData getOutput() {
    return CorridorObjectHelper.fromMap(outputMap, "Corridor");
  }
}
