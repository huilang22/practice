/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillClassFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BillClassFindRequest Udt Request
 *
 */

public class BillClassFindRequest extends BillClassRequest {
/**
 *
 * Constructor to create a  BillClassFindRequest
 * @param id Unique request name
 * @param BCFindIn BCObjectFilter for BillClassFindRequest
 *
 */
@JsonCreator
  public BillClassFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillClass")BCObjectFilter BCFindIn) {
    super(id, "BillClassFind");
    if (BCFindIn != null) {
      Integer index =  BCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillClass", BCObjectHelper.toMap(BCFindIn, new HashMap(), "BillClass").get("BillClass"));
    }
  }

/**
 *
 * Retrieves the BCObjectDataList that results from the BillClassFindRequest call
 * @return BCObjectDataList resulting from udt call
 *
 */

  public BCObjectDataList getOutput() {
    return BCObjectHelper.fromMapList(outputMap, "BillClassList");
  }
}
