/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorDeleteRequest.java
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
 * Class used to create a CorridorDeleteRequest Udt Request
 *
 */

public class CorridorDeleteRequest extends CorridorSubRequestParent {
/**
 *
 * Constructor to create a  CorridorDeleteRequest
 * @param id Unique request name
 * @param CCDeleteIn CorridorObjectKeyData for CorridorDeleteRequest
 * @param CDCeaseDate Date for CorridorDeleteRequest
 *
 */
@JsonCreator
  public CorridorDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("Corridor")CorridorObjectKeyData CCDeleteIn, @JsonProperty("CDCeaseDate")Date CDCeaseDate) {
    super(id, "CorridorDelete");
    if (CCDeleteIn != null) {
      addInput("Corridor", CorridorObjectKeyHelper.toMap(CCDeleteIn, new HashMap(), "CorridorObjectKeyData").get("CorridorObjectKeyData"));
    }
    if (CDCeaseDate != null) {
      addInput("CDCeaseDate", CDCeaseDate);
    }
  }

/**
 *
 * Retrieves the CorridorObjectData that results from the CorridorDeleteRequest call
 * @return CorridorObjectData resulting from udt call
 *
 */

  public CorridorObjectData getOutput() {
    return CorridorObjectHelper.fromMap(outputMap, "Corridor");
  }
}
