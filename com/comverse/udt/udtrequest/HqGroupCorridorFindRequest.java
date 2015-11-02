/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupCorridorFindRequest.java
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
 * Class used to create a HqGroupCorridorFindRequest Udt Request
 *
 */

public class HqGroupCorridorFindRequest extends HqGroupCorridorRequest {
/**
 *
 * Constructor to create a  HqGroupCorridorFindRequest
 * @param id Unique request name
 * @param HQGCfindIn HqGroupCorridorObjectFilter for HqGroupCorridorFindRequest
 *
 */
@JsonCreator
  public HqGroupCorridorFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupCorridor")HqGroupCorridorObjectFilter HQGCfindIn) {
    super(id, "HqGroupCorridorFind");
    if (HQGCfindIn != null) {
      Integer index =  HQGCfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(HQGCfindIn, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }

/**
 *
 * Retrieves the HqGroupCorridorObjectDataList that results from the HqGroupCorridorFindRequest call
 * @return HqGroupCorridorObjectDataList resulting from udt call
 *
 */

  public HqGroupCorridorObjectDataList getOutput() {
    return HqGroupCorridorObjectHelper.fromMapList(outputMap, "HqGroupCorridorList");
  }
}
