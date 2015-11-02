/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceXferDiffFindRequest.java
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
 * Class used to create a BalanceXferDiffFindRequest Udt Request
 *
 */

public class BalanceXferDiffFindRequest extends BalanceXferDiffRequest {
/**
 *
 * Constructor to create a  BalanceXferDiffFindRequest
 * @param id Unique request name
 * @param BXDFindIn BXDObjectFilter for BalanceXferDiffFindRequest
 *
 */
@JsonCreator
  public BalanceXferDiffFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BalanceXferDiff")BXDObjectFilter BXDFindIn) {
    super(id, "BalanceXferDiffFind");
    if (BXDFindIn != null) {
      Integer index =  BXDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BalanceXferDiff", BXDObjectHelper.toMap(BXDFindIn, new HashMap(), "BalanceXferDiff").get("BalanceXferDiff"));
    }
  }

/**
 *
 * Retrieves the BXDObjectDataList that results from the BalanceXferDiffFindRequest call
 * @return BXDObjectDataList resulting from udt call
 *
 */

  public BXDObjectDataList getOutput() {
    return BXDObjectHelper.fromMapList(outputMap, "BalanceXferDiffList");
  }
}
