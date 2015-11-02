/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * FranchiseCodeGetRequest.java
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
 * Class used to create a FranchiseCodeGetRequest Udt Request
 *
 */

public class FranchiseCodeGetRequest extends FranchiseCodeSubRequestParent {
/**
 *
 * Constructor to create a  FranchiseCodeGetRequest
 * @param id Unique request name
 * @param FCGetIn FranchiseCodeObjectKeyData for FranchiseCodeGetRequest
 *
 */
@JsonCreator
  public FranchiseCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("FranchiseCode")FranchiseCodeObjectKeyData FCGetIn) {
    super(id, "FranchiseCodeGet");
    if (FCGetIn != null) {
      addInput("FranchiseCode", FranchiseCodeObjectKeyHelper.toMap(FCGetIn, new HashMap(), "FranchiseCodeObjectKeyData").get("FranchiseCodeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the FranchiseCodeObjectData that results from the FranchiseCodeGetRequest call
 * @return FranchiseCodeObjectData resulting from udt call
 *
 */

  public FranchiseCodeObjectData getOutput() {
    return FranchiseCodeObjectHelper.fromMap(outputMap, "FranchiseCode");
  }
}
