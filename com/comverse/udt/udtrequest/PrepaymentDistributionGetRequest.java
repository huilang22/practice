/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentDistributionGetRequest.java
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
 * Class used to create a PrepaymentDistributionGetRequest Udt Request
 *
 */

public class PrepaymentDistributionGetRequest extends PrepaymentDistributionSubRequestParent {
/**
 *
 * Constructor to create a  PrepaymentDistributionGetRequest
 * @param id Unique request name
 * @param PDGetIn PrepaymentDistributionObjectKeyData for PrepaymentDistributionGetRequest
 *
 */
@JsonCreator
  public PrepaymentDistributionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PrepaymentDistribution")PrepaymentDistributionObjectKeyData PDGetIn) {
    super(id, "PrepaymentDistributionGet");
    if (PDGetIn != null) {
      addInput("PrepaymentDistribution", PrepaymentDistributionObjectKeyHelper.toMap(PDGetIn, new HashMap(), "PrepaymentDistributionObjectKeyData").get("PrepaymentDistributionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PrepaymentDistributionObjectData that results from the PrepaymentDistributionGetRequest call
 * @return PrepaymentDistributionObjectData resulting from udt call
 *
 */

  public PrepaymentDistributionObjectData getOutput() {
    return PrepaymentDistributionObjectHelper.fromMap(outputMap, "PrepaymentDistribution");
  }
}
