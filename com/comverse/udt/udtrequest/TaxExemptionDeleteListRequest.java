/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxExemptionDeleteListRequest.java
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
 * Class used to create a TaxExemptionDeleteListRequest Udt Request
 *
 */

public class TaxExemptionDeleteListRequest extends TaxExemptionRequest {
/**
 *
 * Constructor to create a  TaxExemptionDeleteListRequest
 * @param id Unique request name
 * @param TELdelIn TaxExemptionObjectFilter for TaxExemptionDeleteListRequest
 * @param TELInactiveDate Date for TaxExemptionDeleteListRequest
 *
 */
@JsonCreator
  public TaxExemptionDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxExemption")TaxExemptionObjectFilter TELdelIn, @JsonProperty("InactiveDate")Date TELInactiveDate) {
    super(id, "TaxExemptionDeleteList");
    if (TELdelIn != null) {
      Integer index =  TELdelIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(TELdelIn, new HashMap(), "Void").get("Void"));
    }
    if (TELInactiveDate != null) {
      addInput("InactiveDate", TELInactiveDate);
    }
  }

}
