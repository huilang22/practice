/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConnectReasonUpdateRequest.java
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
 * Class used to create a ConnectReasonUpdateRequest Udt Request
 *
 */

public class ConnectReasonUpdateRequest extends ConnectReasonSubRequestParent {
/**
 *
 * Constructor to create a  ConnectReasonUpdateRequest
 * @param id Unique request name
 * @param CRUpdateIn ConnectReasonObjectData for ConnectReasonUpdateRequest
 *
 */
@JsonCreator
  public ConnectReasonUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConnectReason")ConnectReasonObjectData CRUpdateIn) {
    super(id, "ConnectReasonUpdate");
    if (CRUpdateIn != null) {
      addInput("ConnectReason", ConnectReasonObjectHelper.toMap(CRUpdateIn, new HashMap(), "ConnectReason").get("ConnectReason"));
    }
  }

/**
 *
 * Retrieves the ConnectReasonObjectData that results from the ConnectReasonUpdateRequest call
 * @return ConnectReasonObjectData resulting from udt call
 *
 */

  public ConnectReasonObjectData getOutput() {
    return ConnectReasonObjectHelper.fromMap(outputMap, "ConnectReason");
  }
}
