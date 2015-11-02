/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentFindCountRequest.java
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
 * Class used to create a AdjustmentFindCountRequest Udt Request
 *
 */

public class AdjustmentFindCountRequest extends AdjustmentRequest {
/**
 *
 * Constructor to create a  AdjustmentFindCountRequest
 * @param id Unique request name
 * @param findCountIn AdjustmentObjectFilter for AdjustmentFindCountRequest
 *
 */
@JsonCreator
  public AdjustmentFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("Adjustment")AdjustmentObjectFilter findCountIn) {
    super(id, "AdjustmentFindCount");
    if (findCountIn != null) {
      Integer index =  findCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Adjustment", AdjustmentObjectHelper.toMap(findCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the AdjustmentFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
