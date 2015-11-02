/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SuspendedReasonFindRequest.java
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

import com.csgsystems.ar.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SuspendedReasonFindRequest Udt Request
 *
 */

public class SuspendedReasonFindRequest extends SuspendedReasonRequest {
/**
 *
 * Constructor to create a  SuspendedReasonFindRequest
 * @param id Unique request name
 * @param SRFindIn SuspendedReasonObjectFilter for SuspendedReasonFindRequest
 *
 */
@JsonCreator
  public SuspendedReasonFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("SuspendedReason")SuspendedReasonObjectFilter SRFindIn) {
    super(id, "SuspendedReasonFind");
    if (SRFindIn != null) {
      Integer index =  SRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SuspendedReason", SuspendedReasonObjectHelper.toMap(SRFindIn, new HashMap(), "SuspendedReason").get("SuspendedReason"));
    }
  }

/**
 *
 * Retrieves the SuspendedReasonObjectDataList that results from the SuspendedReasonFindRequest call
 * @return SuspendedReasonObjectDataList resulting from udt call
 *
 */

  public SuspendedReasonObjectDataList getOutput() {
    return SuspendedReasonObjectHelper.fromMapList(outputMap, "SuspendedReasonList");
  }
}
