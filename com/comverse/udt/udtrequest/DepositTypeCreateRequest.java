/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositTypeCreateRequest.java
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
 * Class used to create a DepositTypeCreateRequest Udt Request
 *
 */

public class DepositTypeCreateRequest extends DepositTypeSubRequestParent {
/**
 *
 * Constructor to create a  DepositTypeCreateRequest
 * @param id Unique request name
 * @param DTCreateIn DepositTypeObjectData for DepositTypeCreateRequest
 *
 */
@JsonCreator
  public DepositTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DepositType")DepositTypeObjectData DTCreateIn) {
    super(id, "DepositTypeCreate");
    if (DTCreateIn != null) {
      addInput("DepositType", DepositTypeObjectHelper.toMap(DTCreateIn, new HashMap(), "DepositType").get("DepositType"));
    }
  }

/**
 *
 * Retrieves the DepositTypeObjectData that results from the DepositTypeCreateRequest call
 * @return DepositTypeObjectData resulting from udt call
 *
 */

  public DepositTypeObjectData getOutput() {
    return DepositTypeObjectHelper.fromMap(outputMap, "DepositType");
  }
}
