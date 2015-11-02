/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxStatusFindRequest.java
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
 * Class used to create a TaxStatusFindRequest Udt Request
 *
 */

public class TaxStatusFindRequest extends TaxStatusRequest {
/**
 *
 * Constructor to create a  TaxStatusFindRequest
 * @param id Unique request name
 * @param TSFindIn TSObjectFilter for TaxStatusFindRequest
 *
 */
@JsonCreator
  public TaxStatusFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxStatus")TSObjectFilter TSFindIn) {
    super(id, "TaxStatusFind");
    if (TSFindIn != null) {
      Integer index =  TSFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxStatus", TSObjectHelper.toMap(TSFindIn, new HashMap(), "TaxStatus").get("TaxStatus"));
    }
  }

/**
 *
 * Retrieves the TSObjectDataList that results from the TaxStatusFindRequest call
 * @return TSObjectDataList resulting from udt call
 *
 */

  public TSObjectDataList getOutput() {
    return TSObjectHelper.fromMapList(outputMap, "TaxStatusList");
  }
}
