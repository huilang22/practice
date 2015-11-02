/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxAssignmentFindRequest.java
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
 * Class used to create a TaxAssignmentFindRequest Udt Request
 *
 */

public class TaxAssignmentFindRequest extends TaxAssignmentRequest {
/**
 *
 * Constructor to create a  TaxAssignmentFindRequest
 * @param id Unique request name
 * @param TAfindIn TaxAssignmentObjectFilter for TaxAssignmentFindRequest
 *
 */
@JsonCreator
  public TaxAssignmentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxAssignment")TaxAssignmentObjectFilter TAfindIn) {
    super(id, "TaxAssignmentFind");
    if (TAfindIn != null) {
      Integer index =  TAfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxAssignment", TaxAssignmentObjectHelper.toMap(TAfindIn, new HashMap(), "TaxAssignment").get("TaxAssignment"));
    }
  }

/**
 *
 * Retrieves the TaxAssignmentObjectDataList that results from the TaxAssignmentFindRequest call
 * @return TaxAssignmentObjectDataList resulting from udt call
 *
 */

  public TaxAssignmentObjectDataList getOutput() {
    return TaxAssignmentObjectHelper.fromMapList(outputMap, "TaxAssignmentList");
  }
}
