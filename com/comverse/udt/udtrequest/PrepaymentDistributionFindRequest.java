/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentDistributionFindRequest.java
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
 * Class used to create a PrepaymentDistributionFindRequest Udt Request
 *
 */

public class PrepaymentDistributionFindRequest extends PrepaymentDistributionRequest {
/**
 *
 * Constructor to create a  PrepaymentDistributionFindRequest
 * @param id Unique request name
 * @param PDFindIn PrepaymentDistributionObjectFilter for PrepaymentDistributionFindRequest
 *
 */
@JsonCreator
  public PrepaymentDistributionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PrepaymentDistribution")PrepaymentDistributionObjectFilter PDFindIn) {
    super(id, "PrepaymentDistributionFind");
    if (PDFindIn != null) {
      Integer index =  PDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PrepaymentDistribution", PrepaymentDistributionObjectHelper.toMap(PDFindIn, new HashMap(), "PrepaymentDistribution").get("PrepaymentDistribution"));
    }
  }

/**
 *
 * Retrieves the PrepaymentDistributionObjectDataList that results from the PrepaymentDistributionFindRequest call
 * @return PrepaymentDistributionObjectDataList resulting from udt call
 *
 */

  public PrepaymentDistributionObjectDataList getOutput() {
    return PrepaymentDistributionObjectHelper.fromMapList(outputMap, "PrepaymentDistributionList");
  }
}
