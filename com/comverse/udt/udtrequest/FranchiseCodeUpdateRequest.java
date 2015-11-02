/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * FranchiseCodeUpdateRequest.java
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
 * Class used to create a FranchiseCodeUpdateRequest Udt Request
 *
 */

public class FranchiseCodeUpdateRequest extends FranchiseCodeSubRequestParent {
/**
 *
 * Constructor to create a  FranchiseCodeUpdateRequest
 * @param id Unique request name
 * @param FCUpdateIn FranchiseCodeObjectData for FranchiseCodeUpdateRequest
 *
 */
@JsonCreator
  public FranchiseCodeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("FranchiseCode")FranchiseCodeObjectData FCUpdateIn) {
    super(id, "FranchiseCodeUpdate");
    if (FCUpdateIn != null) {
      addInput("FranchiseCode", FranchiseCodeObjectHelper.toMap(FCUpdateIn, new HashMap(), "FranchiseCode").get("FranchiseCode"));
    }
  }

/**
 *
 * Retrieves the FranchiseCodeObjectData that results from the FranchiseCodeUpdateRequest call
 * @return FranchiseCodeObjectData resulting from udt call
 *
 */

  public FranchiseCodeObjectData getOutput() {
    return FranchiseCodeObjectHelper.fromMap(outputMap, "FranchiseCode");
  }
}
