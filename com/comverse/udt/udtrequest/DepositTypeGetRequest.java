/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositTypeGetRequest.java
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
 * Class used to create a DepositTypeGetRequest Udt Request
 *
 */

public class DepositTypeGetRequest extends DepositTypeSubRequestParent {
/**
 *
 * Constructor to create a  DepositTypeGetRequest
 * @param id Unique request name
 * @param DTGetIn DepositTypeObjectKeyData for DepositTypeGetRequest
 *
 */
@JsonCreator
  public DepositTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("DepositType")DepositTypeObjectKeyData DTGetIn) {
    super(id, "DepositTypeGet");
    if (DTGetIn != null) {
      addInput("DepositType", DepositTypeObjectKeyHelper.toMap(DTGetIn, new HashMap(), "DepositTypeObjectKeyData").get("DepositTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DepositTypeObjectData that results from the DepositTypeGetRequest call
 * @return DepositTypeObjectData resulting from udt call
 *
 */

  public DepositTypeObjectData getOutput() {
    return DepositTypeObjectHelper.fromMap(outputMap, "DepositType");
  }
}
