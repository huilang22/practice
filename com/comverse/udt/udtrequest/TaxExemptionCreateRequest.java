/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxExemptionCreateRequest.java
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
 * Class used to create a TaxExemptionCreateRequest Udt Request
 *
 */

public class TaxExemptionCreateRequest extends TaxExemptionSubRequestParent {
/**
 *
 * Constructor to create a  TaxExemptionCreateRequest
 * @param id Unique request name
 * @param TEcreateIn TaxExemptionObjectData for TaxExemptionCreateRequest
 *
 */
@JsonCreator
  public TaxExemptionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxExemption")TaxExemptionObjectData TEcreateIn) {
    super(id, "TaxExemptionCreate");
    if (TEcreateIn != null) {
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(TEcreateIn, new HashMap(), "TaxExemption").get("TaxExemption"));
    }
  }

/**
 *
 * Retrieves the TaxExemptionObjectData that results from the TaxExemptionCreateRequest call
 * @return TaxExemptionObjectData resulting from udt call
 *
 */

  public TaxExemptionObjectData getOutput() {
    return TaxExemptionObjectHelper.fromMap(outputMap, "TaxExemption");
  }
}
