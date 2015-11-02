/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositTypeUpdateRequest.java
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
 * Class used to create a DepositTypeUpdateRequest Udt Request
 *
 */

public class DepositTypeUpdateRequest extends DepositTypeSubRequestParent {
/**
 *
 * Constructor to create a  DepositTypeUpdateRequest
 * @param id Unique request name
 * @param DTUpdateIn DepositTypeObjectData for DepositTypeUpdateRequest
 *
 */
@JsonCreator
  public DepositTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DepositType")DepositTypeObjectData DTUpdateIn) {
    super(id, "DepositTypeUpdate");
    if (DTUpdateIn != null) {
      addInput("DepositType", DepositTypeObjectHelper.toMap(DTUpdateIn, new HashMap(), "DepositType").get("DepositType"));
    }
  }

/**
 *
 * Retrieves the DepositTypeObjectData that results from the DepositTypeUpdateRequest call
 * @return DepositTypeObjectData resulting from udt call
 *
 */

  public DepositTypeObjectData getOutput() {
    return DepositTypeObjectHelper.fromMap(outputMap, "DepositType");
  }
}
