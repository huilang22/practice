/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcInvElementFindRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SvcInvElementFindRequest Udt Request
 *
 */

public class SvcInvElementFindRequest extends SvcInventoryRequest {
/**
 *
 * Constructor to create a  SvcInvElementFindRequest
 * @param id Unique request name
 * @param SvcInvElementFindIn SvcInvElementObjectFilter for SvcInvElementFindRequest
 *
 */
@JsonCreator
  public SvcInvElementFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("SvcInventory")SvcInvElementObjectFilter SvcInvElementFindIn) {
    super(id, "SvcInvElementFind");
    if (SvcInvElementFindIn != null) {
      Integer index =  SvcInvElementFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SvcInventory", SvcInvElementObjectHelper.toMap(SvcInvElementFindIn, new HashMap(), "SvcInventory").get("SvcInventory"));
    }
  }

/**
 *
 * Retrieves the SvcInvElementObjectDataList that results from the SvcInvElementFindRequest call
 * @return SvcInvElementObjectDataList resulting from udt call
 *
 */

  public SvcInvElementObjectDataList getOutput() {
    return SvcInvElementObjectHelper.fromMapList(outputMap, "SvcInventoryList");
  }
}
