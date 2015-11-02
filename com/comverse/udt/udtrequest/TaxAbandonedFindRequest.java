/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxAbandonedFindRequest.java
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
 * Class used to create a TaxAbandonedFindRequest Udt Request
 *
 */

public class TaxAbandonedFindRequest extends TaxAbandonedRequest {
/**
 *
 * Constructor to create a  TaxAbandonedFindRequest
 * @param id Unique request name
 * @param TAfind_In TaxAbandonedObjectFilter for TaxAbandonedFindRequest
 *
 */
@JsonCreator
  public TaxAbandonedFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxAbandoned")TaxAbandonedObjectFilter TAfind_In) {
    super(id, "TaxAbandonedFind");
    if (TAfind_In != null) {
      Integer index =  TAfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxAbandoned", TaxAbandonedObjectHelper.toMap(TAfind_In, new HashMap(), "TaxAbandoned").get("TaxAbandoned"));
    }
  }

/**
 *
 * Retrieves the TaxAbandonedObjectDataList that results from the TaxAbandonedFindRequest call
 * @return TaxAbandonedObjectDataList resulting from udt call
 *
 */

  public TaxAbandonedObjectDataList getOutput() {
    return TaxAbandonedObjectHelper.fromMapList(outputMap, "TaxAbandonedList");
  }
}
