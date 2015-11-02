/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorFindRequest.java
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
 * Class used to create a CorridorFindRequest Udt Request
 *
 */

public class CorridorFindRequest extends CorridorRequest {
/**
 *
 * Constructor to create a  CorridorFindRequest
 * @param id Unique request name
 * @param CCFindIn CorridorObjectFilter for CorridorFindRequest
 *
 */
@JsonCreator
  public CorridorFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Corridor")CorridorObjectFilter CCFindIn) {
    super(id, "CorridorFind");
    if (CCFindIn != null) {
      Integer index =  CCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Corridor", CorridorObjectHelper.toMap(CCFindIn, new HashMap(), "Corridor").get("Corridor"));
    }
  }

/**
 *
 * Retrieves the CorridorObjectDataList that results from the CorridorFindRequest call
 * @return CorridorObjectDataList resulting from udt call
 *
 */

  public CorridorObjectDataList getOutput() {
    return CorridorObjectHelper.fromMapList(outputMap, "CorridorList");
  }
}
