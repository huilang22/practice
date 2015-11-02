/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxExemptionDeleteRequest.java
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
 * Class used to create a TaxExemptionDeleteRequest Udt Request
 *
 */

public class TaxExemptionDeleteRequest extends TaxExemptionSubRequestParent {
/**
 *
 * Constructor to create a  TaxExemptionDeleteRequest
 * @param id Unique request name
 * @param TEdelIn TaxExemptionObjectKeyData for TaxExemptionDeleteRequest
 * @param TEInactiveDate Date for TaxExemptionDeleteRequest
 *
 */
@JsonCreator
  public TaxExemptionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxExemption")TaxExemptionObjectKeyData TEdelIn, @JsonProperty("InactiveDate")Date TEInactiveDate) {
    super(id, "TaxExemptionDelete");
    if (TEdelIn != null) {
      addInput("TaxExemption", TaxExemptionObjectKeyHelper.toMap(TEdelIn, new HashMap(), "TaxExemptionObjectKeyData").get("TaxExemptionObjectKeyData"));
    }
    if (TEInactiveDate != null) {
      addInput("InactiveDate", TEInactiveDate);
    }
  }

/**
 *
 * Retrieves the TaxExemptionObjectData that results from the TaxExemptionDeleteRequest call
 * @return TaxExemptionObjectData resulting from udt call
 *
 */

  public TaxExemptionObjectData getOutput() {
    return TaxExemptionObjectHelper.fromMap(outputMap, "TaxExemption");
  }
}
