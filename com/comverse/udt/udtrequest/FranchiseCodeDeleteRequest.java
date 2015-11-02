/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * FranchiseCodeDeleteRequest.java
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
 * Class used to create a FranchiseCodeDeleteRequest Udt Request
 *
 */

public class FranchiseCodeDeleteRequest extends FranchiseCodeSubRequestParent {
/**
 *
 * Constructor to create a  FranchiseCodeDeleteRequest
 * @param id Unique request name
 * @param FCDeleteIn FranchiseCodeObjectKeyData for FranchiseCodeDeleteRequest
 *
 */
@JsonCreator
  public FranchiseCodeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("FranchiseCode")FranchiseCodeObjectKeyData FCDeleteIn) {
    super(id, "FranchiseCodeDelete");
    if (FCDeleteIn != null) {
      addInput("FranchiseCode", FranchiseCodeObjectKeyHelper.toMap(FCDeleteIn, new HashMap(), "FranchiseCodeObjectKeyData").get("FranchiseCodeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the FranchiseCodeObjectData that results from the FranchiseCodeDeleteRequest call
 * @return FranchiseCodeObjectData resulting from udt call
 *
 */

  public FranchiseCodeObjectData getOutput() {
    return FranchiseCodeObjectHelper.fromMap(outputMap, "FranchiseCode");
  }
}
