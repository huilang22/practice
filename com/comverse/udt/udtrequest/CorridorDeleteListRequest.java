/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorDeleteListRequest.java
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
 * Class used to create a CorridorDeleteListRequest Udt Request
 *
 */

public class CorridorDeleteListRequest extends CorridorRequest {
/**
 *
 * Constructor to create a  CorridorDeleteListRequest
 * @param id Unique request name
 * @param CorridorDeleteListIn CorridorObjectFilter for CorridorDeleteListRequest
 * @param InactiveDate Date for CorridorDeleteListRequest
 *
 */
@JsonCreator
  public CorridorDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("Corridor")CorridorObjectFilter CorridorDeleteListIn, @JsonProperty("InactiveDate")Date InactiveDate) {
    super(id, "CorridorDeleteList");
    if (CorridorDeleteListIn != null) {
      Integer index =  CorridorDeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Corridor", CorridorObjectHelper.toMap(CorridorDeleteListIn, new HashMap(), "Corridor").get("Corridor"));
    }
    if (InactiveDate != null) {
      addInput("InactiveDate", InactiveDate);
    }
  }

/**
 *
 * Retrieves the CorridorObjectDataList that results from the CorridorDeleteListRequest call
 * @return CorridorObjectDataList resulting from udt call
 *
 */

  public CorridorObjectDataList getOutput() {
    return CorridorObjectHelper.fromMapList(outputMap, "CorridorList");
  }
}
