/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusChgReasonDeleteRequest.java
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
 * Class used to create a CmfStatusChgReasonDeleteRequest Udt Request
 *
 */

public class CmfStatusChgReasonDeleteRequest extends CmfStatusChgReasonSubRequestParent {
/**
 *
 * Constructor to create a  CmfStatusChgReasonDeleteRequest
 * @param id Unique request name
 * @param CSCRDeleteIn CmfStatusChgReasonObjectKeyData for CmfStatusChgReasonDeleteRequest
 *
 */
@JsonCreator
  public CmfStatusChgReasonDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfStatusChgReason")CmfStatusChgReasonObjectKeyData CSCRDeleteIn) {
    super(id, "CmfStatusChgReasonDelete");
    if (CSCRDeleteIn != null) {
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectKeyHelper.toMap(CSCRDeleteIn, new HashMap(), "CmfStatusChgReasonObjectKeyData").get("CmfStatusChgReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CmfStatusChgReasonObjectData that results from the CmfStatusChgReasonDeleteRequest call
 * @return CmfStatusChgReasonObjectData resulting from udt call
 *
 */

  public CmfStatusChgReasonObjectData getOutput() {
    return CmfStatusChgReasonObjectHelper.fromMap(outputMap, "CmfStatusChgReason");
  }
}
