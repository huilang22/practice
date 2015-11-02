/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * FranchiseCodeCreateRequest.java
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
 * Class used to create a FranchiseCodeCreateRequest Udt Request
 *
 */

public class FranchiseCodeCreateRequest extends FranchiseCodeSubRequestParent {
/**
 *
 * Constructor to create a  FranchiseCodeCreateRequest
 * @param id Unique request name
 * @param FCCreateIn FranchiseCodeObjectData for FranchiseCodeCreateRequest
 *
 */
@JsonCreator
  public FranchiseCodeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("FranchiseCode")FranchiseCodeObjectData FCCreateIn) {
    super(id, "FranchiseCodeCreate");
    if (FCCreateIn != null) {
      addInput("FranchiseCode", FranchiseCodeObjectHelper.toMap(FCCreateIn, new HashMap(), "FranchiseCode").get("FranchiseCode"));
    }
  }

/**
 *
 * Retrieves the FranchiseCodeObjectData that results from the FranchiseCodeCreateRequest call
 * @return FranchiseCodeObjectData resulting from udt call
 *
 */

  public FranchiseCodeObjectData getOutput() {
    return FranchiseCodeObjectHelper.fromMap(outputMap, "FranchiseCode");
  }
}
