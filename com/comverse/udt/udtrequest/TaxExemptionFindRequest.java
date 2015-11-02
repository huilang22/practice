/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxExemptionFindRequest.java
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
 * Class used to create a TaxExemptionFindRequest Udt Request
 *
 */

public class TaxExemptionFindRequest extends TaxExemptionRequest {
/**
 *
 * Constructor to create a  TaxExemptionFindRequest
 * @param id Unique request name
 * @param TEfindIn TaxExemptionObjectFilter for TaxExemptionFindRequest
 *
 */
@JsonCreator
  public TaxExemptionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxExemption")TaxExemptionObjectFilter TEfindIn) {
    super(id, "TaxExemptionFind");
    if (TEfindIn != null) {
      Integer index =  TEfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(TEfindIn, new HashMap(), "TaxExemption").get("TaxExemption"));
    }
  }

/**
 *
 * Retrieves the TaxExemptionObjectDataList that results from the TaxExemptionFindRequest call
 * @return TaxExemptionObjectDataList resulting from udt call
 *
 */

  public TaxExemptionObjectDataList getOutput() {
    return TaxExemptionObjectHelper.fromMapList(outputMap, "TaxExemptionList");
  }
}
