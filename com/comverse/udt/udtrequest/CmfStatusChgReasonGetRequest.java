/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusChgReasonGetRequest.java
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
 * Class used to create a CmfStatusChgReasonGetRequest Udt Request
 *
 */

public class CmfStatusChgReasonGetRequest extends CmfStatusChgReasonSubRequestParent {
/**
 *
 * Constructor to create a  CmfStatusChgReasonGetRequest
 * @param id Unique request name
 * @param CSCRGetIn CmfStatusChgReasonObjectKeyData for CmfStatusChgReasonGetRequest
 *
 */
@JsonCreator
  public CmfStatusChgReasonGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfStatusChgReason")CmfStatusChgReasonObjectKeyData CSCRGetIn) {
    super(id, "CmfStatusChgReasonGet");
    if (CSCRGetIn != null) {
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectKeyHelper.toMap(CSCRGetIn, new HashMap(), "CmfStatusChgReasonObjectKeyData").get("CmfStatusChgReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CmfStatusChgReasonObjectData that results from the CmfStatusChgReasonGetRequest call
 * @return CmfStatusChgReasonObjectData resulting from udt call
 *
 */

  public CmfStatusChgReasonObjectData getOutput() {
    return CmfStatusChgReasonObjectHelper.fromMap(outputMap, "CmfStatusChgReason");
  }
}
