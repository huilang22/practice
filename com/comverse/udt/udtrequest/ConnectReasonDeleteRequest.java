/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConnectReasonDeleteRequest.java
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
 * Class used to create a ConnectReasonDeleteRequest Udt Request
 *
 */

public class ConnectReasonDeleteRequest extends ConnectReasonSubRequestParent {
/**
 *
 * Constructor to create a  ConnectReasonDeleteRequest
 * @param id Unique request name
 * @param CRDeleteIn ConnectReasonObjectKeyData for ConnectReasonDeleteRequest
 *
 */
@JsonCreator
  public ConnectReasonDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConnectReason")ConnectReasonObjectKeyData CRDeleteIn) {
    super(id, "ConnectReasonDelete");
    if (CRDeleteIn != null) {
      addInput("ConnectReason", ConnectReasonObjectKeyHelper.toMap(CRDeleteIn, new HashMap(), "ConnectReasonObjectKeyData").get("ConnectReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ConnectReasonObjectData that results from the ConnectReasonDeleteRequest call
 * @return ConnectReasonObjectData resulting from udt call
 *
 */

  public ConnectReasonObjectData getOutput() {
    return ConnectReasonObjectHelper.fromMap(outputMap, "ConnectReason");
  }
}
