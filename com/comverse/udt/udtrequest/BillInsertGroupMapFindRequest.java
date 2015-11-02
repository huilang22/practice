/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupMapFindRequest.java
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
 * Class used to create a BillInsertGroupMapFindRequest Udt Request
 *
 */

public class BillInsertGroupMapFindRequest extends BillInsertGroupMapRequest {
/**
 *
 * Constructor to create a  BillInsertGroupMapFindRequest
 * @param id Unique request name
 * @param BIGFindIn BillInsertGroupMapObjectFilter for BillInsertGroupMapFindRequest
 *
 */
@JsonCreator
  public BillInsertGroupMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillInsertGroupMap")BillInsertGroupMapObjectFilter BIGFindIn) {
    super(id, "BillInsertGroupMapFind");
    if (BIGFindIn != null) {
      Integer index =  BIGFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectHelper.toMap(BIGFindIn, new HashMap(), "BillInsertGroupMap").get("BillInsertGroupMap"));
    }
  }

/**
 *
 * Retrieves the BillInsertGroupMapObjectDataList that results from the BillInsertGroupMapFindRequest call
 * @return BillInsertGroupMapObjectDataList resulting from udt call
 *
 */

  public BillInsertGroupMapObjectDataList getOutput() {
    return BillInsertGroupMapObjectHelper.fromMapList(outputMap, "BillInsertGroupMapList");
  }
}
