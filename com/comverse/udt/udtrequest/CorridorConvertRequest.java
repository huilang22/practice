/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorConvertRequest.java
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
 * Class used to create a CorridorConvertRequest Udt Request
 *
 */

public class CorridorConvertRequest extends CorridorSubRequestParent {
/**
 *
 * Constructor to create a  CorridorConvertRequest
 * @param id Unique request name
 * @param CorrConvertIn CorridorObjectData for CorridorConvertRequest
 *
 */
@JsonCreator
  public CorridorConvertRequest(@JsonProperty("RequestId") String id, @JsonProperty("Corridor")CorridorObjectData CorrConvertIn) {
    super(id, "CorridorConvert");
    if (CorrConvertIn != null) {
      addInput("Corridor", CorridorObjectHelper.toMap(CorrConvertIn, new HashMap(), "Corridor").get("Corridor"));
    }
  }

/**
 *
 * Retrieves the CorridorObjectData that results from the CorridorConvertRequest call
 * @return CorridorObjectData resulting from udt call
 *
 */

  public CorridorObjectData getOutput() {
    return CorridorObjectHelper.fromMap(outputMap, "Corridor");
  }
}
