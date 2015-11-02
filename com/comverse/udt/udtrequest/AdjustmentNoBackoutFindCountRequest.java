/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentNoBackoutFindCountRequest.java
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
 * Class used to create a AdjustmentNoBackoutFindCountRequest Udt Request
 *
 */

public class AdjustmentNoBackoutFindCountRequest extends AdjustmentRequest {
/**
 *
 * Constructor to create a  AdjustmentNoBackoutFindCountRequest
 * @param id Unique request name
 * @param nbfindCountIn AdjustmentObjectFilter for AdjustmentNoBackoutFindCountRequest
 *
 */
@JsonCreator
  public AdjustmentNoBackoutFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("Adjustment")AdjustmentObjectFilter nbfindCountIn) {
    super(id, "AdjustmentNoBackoutFindCount");
    if (nbfindCountIn != null) {
      Integer index =  nbfindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Adjustment", AdjustmentObjectHelper.toMap(nbfindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the AdjustmentNoBackoutFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
