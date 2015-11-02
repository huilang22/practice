/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConnectReasonCreateRequest.java
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
 * Class used to create a ConnectReasonCreateRequest Udt Request
 *
 */

public class ConnectReasonCreateRequest extends ConnectReasonSubRequestParent {
/**
 *
 * Constructor to create a  ConnectReasonCreateRequest
 * @param id Unique request name
 * @param CRCreateIn ConnectReasonObjectData for ConnectReasonCreateRequest
 *
 */
@JsonCreator
  public ConnectReasonCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConnectReason")ConnectReasonObjectData CRCreateIn) {
    super(id, "ConnectReasonCreate");
    if (CRCreateIn != null) {
      addInput("ConnectReason", ConnectReasonObjectHelper.toMap(CRCreateIn, new HashMap(), "ConnectReason").get("ConnectReason"));
    }
  }

/**
 *
 * Retrieves the ConnectReasonObjectData that results from the ConnectReasonCreateRequest call
 * @return ConnectReasonObjectData resulting from udt call
 *
 */

  public ConnectReasonObjectData getOutput() {
    return ConnectReasonObjectHelper.fromMap(outputMap, "ConnectReason");
  }
}
