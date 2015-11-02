/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDistribPercentGetRequest.java
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
 * Class used to create a ChargeDistribPercentGetRequest Udt Request
 *
 */

public class ChargeDistribPercentGetRequest extends ChargeDistribPercentSubRequestParent {
/**
 *
 * Constructor to create a  ChargeDistribPercentGetRequest
 * @param id Unique request name
 * @param CDPget_In ChargeDistribPercentObjectKeyData for ChargeDistribPercentGetRequest
 *
 */
@JsonCreator
  public ChargeDistribPercentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ChargeDistribPercent")ChargeDistribPercentObjectKeyData CDPget_In) {
    super(id, "ChargeDistribPercentGet");
    if (CDPget_In != null) {
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectKeyHelper.toMap(CDPget_In, new HashMap(), "ChargeDistribPercentObjectKeyData").get("ChargeDistribPercentObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ChargeDistribPercentObjectData that results from the ChargeDistribPercentGetRequest call
 * @return ChargeDistribPercentObjectData resulting from udt call
 *
 */

  public ChargeDistribPercentObjectData getOutput() {
    return ChargeDistribPercentObjectHelper.fromMap(outputMap, "ChargeDistribPercent");
  }
}
