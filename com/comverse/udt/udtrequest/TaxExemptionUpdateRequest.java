/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxExemptionUpdateRequest.java
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
 * Class used to create a TaxExemptionUpdateRequest Udt Request
 *
 */

public class TaxExemptionUpdateRequest extends TaxExemptionSubRequestParent {
/**
 *
 * Constructor to create a  TaxExemptionUpdateRequest
 * @param id Unique request name
 * @param TEupdateIn TaxExemptionObjectData for TaxExemptionUpdateRequest
 *
 */
@JsonCreator
  public TaxExemptionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxExemption")TaxExemptionObjectData TEupdateIn) {
    super(id, "TaxExemptionUpdate");
    if (TEupdateIn != null) {
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(TEupdateIn, new HashMap(), "TaxExemption").get("TaxExemption"));
    }
  }

/**
 *
 * Retrieves the TaxExemptionObjectData that results from the TaxExemptionUpdateRequest call
 * @return TaxExemptionObjectData resulting from udt call
 *
 */

  public TaxExemptionObjectData getOutput() {
    return TaxExemptionObjectHelper.fromMap(outputMap, "TaxExemption");
  }
}
