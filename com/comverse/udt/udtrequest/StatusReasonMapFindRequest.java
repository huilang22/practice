/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonMapFindRequest.java
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
 * Class used to create a StatusReasonMapFindRequest Udt Request
 *
 */

public class StatusReasonMapFindRequest extends StatusReasonMapRequest {
/**
 *
 * Constructor to create a  StatusReasonMapFindRequest
 * @param id Unique request name
 * @param SRMFindIn SRMObjectFilter for StatusReasonMapFindRequest
 *
 */
@JsonCreator
  public StatusReasonMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatusReasonMap")SRMObjectFilter SRMFindIn) {
    super(id, "StatusReasonMapFind");
    if (SRMFindIn != null) {
      Integer index =  SRMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("StatusReasonMap", SRMObjectHelper.toMap(SRMFindIn, new HashMap(), "StatusReasonMap").get("StatusReasonMap"));
    }
  }

/**
 *
 * Retrieves the SRMObjectDataList that results from the StatusReasonMapFindRequest call
 * @return SRMObjectDataList resulting from udt call
 *
 */

  public SRMObjectDataList getOutput() {
    return SRMObjectHelper.fromMapList(outputMap, "StatusReasonMapList");
  }
}
