/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDistribPercentCreateRequest.java
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
 * Class used to create a ChargeDistribPercentCreateRequest Udt Request
 *
 */

public class ChargeDistribPercentCreateRequest extends ChargeDistribPercentSubRequestParent {
/**
 *
 * Constructor to create a  ChargeDistribPercentCreateRequest
 * @param id Unique request name
 * @param CDPcreate_In ChargeDistribPercentObjectData for ChargeDistribPercentCreateRequest
 *
 */
@JsonCreator
  public ChargeDistribPercentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ChargeDistribPercent")ChargeDistribPercentObjectData CDPcreate_In) {
    super(id, "ChargeDistribPercentCreate");
    if (CDPcreate_In != null) {
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectHelper.toMap(CDPcreate_In, new HashMap(), "ChargeDistribPercent").get("ChargeDistribPercent"));
    }
  }

/**
 *
 * Retrieves the ChargeDistribPercentObjectData that results from the ChargeDistribPercentCreateRequest call
 * @return ChargeDistribPercentObjectData resulting from udt call
 *
 */

  public ChargeDistribPercentObjectData getOutput() {
    return ChargeDistribPercentObjectHelper.fromMap(outputMap, "ChargeDistribPercent");
  }
}
