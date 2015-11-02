/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * FranchiseCodeFindRequest.java
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
 * Class used to create a FranchiseCodeFindRequest Udt Request
 *
 */

public class FranchiseCodeFindRequest extends FranchiseCodeRequest {
/**
 *
 * Constructor to create a  FranchiseCodeFindRequest
 * @param id Unique request name
 * @param FCFindIn FranchiseCodeObjectFilter for FranchiseCodeFindRequest
 *
 */
@JsonCreator
  public FranchiseCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("FranchiseCode")FranchiseCodeObjectFilter FCFindIn) {
    super(id, "FranchiseCodeFind");
    if (FCFindIn != null) {
      Integer index =  FCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("FranchiseCode", FranchiseCodeObjectHelper.toMap(FCFindIn, new HashMap(), "FranchiseCode").get("FranchiseCode"));
    }
  }

/**
 *
 * Retrieves the FranchiseCodeObjectDataList that results from the FranchiseCodeFindRequest call
 * @return FranchiseCodeObjectDataList resulting from udt call
 *
 */

  public FranchiseCodeObjectDataList getOutput() {
    return FranchiseCodeObjectHelper.fromMapList(outputMap, "FranchiseCodeList");
  }
}
