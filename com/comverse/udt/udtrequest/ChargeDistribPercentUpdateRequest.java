/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDistribPercentUpdateRequest.java
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
 * Class used to create a ChargeDistribPercentUpdateRequest Udt Request
 *
 */

public class ChargeDistribPercentUpdateRequest extends ChargeDistribPercentSubRequestParent {
/**
 *
 * Constructor to create a  ChargeDistribPercentUpdateRequest
 * @param id Unique request name
 * @param CDPupdate_In ChargeDistribPercentObjectData for ChargeDistribPercentUpdateRequest
 *
 */
@JsonCreator
  public ChargeDistribPercentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ChargeDistribPercent")ChargeDistribPercentObjectData CDPupdate_In) {
    super(id, "ChargeDistribPercentUpdate");
    if (CDPupdate_In != null) {
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectHelper.toMap(CDPupdate_In, new HashMap(), "ChargeDistribPercent").get("ChargeDistribPercent"));
    }
  }

/**
 *
 * Retrieves the ChargeDistribPercentObjectData that results from the ChargeDistribPercentUpdateRequest call
 * @return ChargeDistribPercentObjectData resulting from udt call
 *
 */

  public ChargeDistribPercentObjectData getOutput() {
    return ChargeDistribPercentObjectHelper.fromMap(outputMap, "ChargeDistribPercent");
  }
}
