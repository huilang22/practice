/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConnectReasonGetRequest.java
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
 * Class used to create a ConnectReasonGetRequest Udt Request
 *
 */

public class ConnectReasonGetRequest extends ConnectReasonSubRequestParent {
/**
 *
 * Constructor to create a  ConnectReasonGetRequest
 * @param id Unique request name
 * @param CRGetIn ConnectReasonObjectKeyData for ConnectReasonGetRequest
 *
 */
@JsonCreator
  public ConnectReasonGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConnectReason")ConnectReasonObjectKeyData CRGetIn) {
    super(id, "ConnectReasonGet");
    if (CRGetIn != null) {
      addInput("ConnectReason", ConnectReasonObjectKeyHelper.toMap(CRGetIn, new HashMap(), "ConnectReasonObjectKeyData").get("ConnectReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ConnectReasonObjectData that results from the ConnectReasonGetRequest call
 * @return ConnectReasonObjectData resulting from udt call
 *
 */

  public ConnectReasonObjectData getOutput() {
    return ConnectReasonObjectHelper.fromMap(outputMap, "ConnectReason");
  }
}
