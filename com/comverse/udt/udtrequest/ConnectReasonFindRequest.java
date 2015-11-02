/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConnectReasonFindRequest.java
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
 * Class used to create a ConnectReasonFindRequest Udt Request
 *
 */

public class ConnectReasonFindRequest extends ConnectReasonRequest {
/**
 *
 * Constructor to create a  ConnectReasonFindRequest
 * @param id Unique request name
 * @param CRFindIn ConnectReasonObjectFilter for ConnectReasonFindRequest
 *
 */
@JsonCreator
  public ConnectReasonFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConnectReason")ConnectReasonObjectFilter CRFindIn) {
    super(id, "ConnectReasonFind");
    if (CRFindIn != null) {
      Integer index =  CRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ConnectReason", ConnectReasonObjectHelper.toMap(CRFindIn, new HashMap(), "ConnectReason").get("ConnectReason"));
    }
  }

/**
 *
 * Retrieves the ConnectReasonObjectDataList that results from the ConnectReasonFindRequest call
 * @return ConnectReasonObjectDataList resulting from udt call
 *
 */

  public ConnectReasonObjectDataList getOutput() {
    return ConnectReasonObjectHelper.fromMapList(outputMap, "ConnectReasonList");
  }
}
