/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupMapFindRequest.java
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
 * Class used to create a BillMessageGroupMapFindRequest Udt Request
 *
 */

public class BillMessageGroupMapFindRequest extends BillMessageGroupMapRequest {
/**
 *
 * Constructor to create a  BillMessageGroupMapFindRequest
 * @param id Unique request name
 * @param BMGFindIn BillMessageGroupMapObjectFilter for BillMessageGroupMapFindRequest
 *
 */
@JsonCreator
  public BillMessageGroupMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillMessageGroupMap")BillMessageGroupMapObjectFilter BMGFindIn) {
    super(id, "BillMessageGroupMapFind");
    if (BMGFindIn != null) {
      Integer index =  BMGFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillMessageGroupMap", BillMessageGroupMapObjectHelper.toMap(BMGFindIn, new HashMap(), "BillMessageGroupMap").get("BillMessageGroupMap"));
    }
  }

/**
 *
 * Retrieves the BillMessageGroupMapObjectDataList that results from the BillMessageGroupMapFindRequest call
 * @return BillMessageGroupMapObjectDataList resulting from udt call
 *
 */

  public BillMessageGroupMapObjectDataList getOutput() {
    return BillMessageGroupMapObjectHelper.fromMapList(outputMap, "BillMessageGroupMapList");
  }
}
