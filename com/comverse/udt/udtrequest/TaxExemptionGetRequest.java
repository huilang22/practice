/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxExemptionGetRequest.java
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
 * Class used to create a TaxExemptionGetRequest Udt Request
 *
 */

public class TaxExemptionGetRequest extends TaxExemptionSubRequestParent {
/**
 *
 * Constructor to create a  TaxExemptionGetRequest
 * @param id Unique request name
 * @param TEgetIn TaxExemptionObjectKeyData for TaxExemptionGetRequest
 *
 */
@JsonCreator
  public TaxExemptionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxExemption")TaxExemptionObjectKeyData TEgetIn) {
    super(id, "TaxExemptionGet");
    if (TEgetIn != null) {
      addInput("TaxExemption", TaxExemptionObjectKeyHelper.toMap(TEgetIn, new HashMap(), "TaxExemptionObjectKeyData").get("TaxExemptionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the TaxExemptionObjectData that results from the TaxExemptionGetRequest call
 * @return TaxExemptionObjectData resulting from udt call
 *
 */

  public TaxExemptionObjectData getOutput() {
    return TaxExemptionObjectHelper.fromMap(outputMap, "TaxExemption");
  }
}
