/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransferReasonFindRequest.java
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
 * Class used to create a TransferReasonFindRequest Udt Request
 *
 */

public class TransferReasonFindRequest extends TransferReasonRequest {
/**
 *
 * Constructor to create a  TransferReasonFindRequest
 * @param id Unique request name
 * @param XRFindIn TransferReasonObjectFilter for TransferReasonFindRequest
 *
 */
@JsonCreator
  public TransferReasonFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("TransferReason")TransferReasonObjectFilter XRFindIn) {
    super(id, "TransferReasonFind");
    if (XRFindIn != null) {
      Integer index =  XRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TransferReason", TransferReasonObjectHelper.toMap(XRFindIn, new HashMap(), "TransferReason").get("TransferReason"));
    }
  }

/**
 *
 * Retrieves the TransferReasonObjectDataList that results from the TransferReasonFindRequest call
 * @return TransferReasonObjectDataList resulting from udt call
 *
 */

  public TransferReasonObjectDataList getOutput() {
    return TransferReasonObjectHelper.fromMapList(outputMap, "TransferReasonList");
  }
}
