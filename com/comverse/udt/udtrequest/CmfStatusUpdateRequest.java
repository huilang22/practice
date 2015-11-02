/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusUpdateRequest.java
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
 * Class used to create a CmfStatusUpdateRequest Udt Request
 *
 */

public class CmfStatusUpdateRequest extends CmfStatusSubRequestParent {
/**
 *
 * Constructor to create a  CmfStatusUpdateRequest
 * @param id Unique request name
 * @param CSUpdateIn CmfStatusObjectData for CmfStatusUpdateRequest
 *
 */
@JsonCreator
  public CmfStatusUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfStatus")CmfStatusObjectData CSUpdateIn) {
    super(id, "CmfStatusUpdate");
    if (CSUpdateIn != null) {
      addInput("CmfStatus", CmfStatusObjectHelper.toMap(CSUpdateIn, new HashMap(), "CmfStatus").get("CmfStatus"));
    }
  }

/**
 *
 * Retrieves the CmfStatusObjectData that results from the CmfStatusUpdateRequest call
 * @return CmfStatusObjectData resulting from udt call
 *
 */

  public CmfStatusObjectData getOutput() {
    return CmfStatusObjectHelper.fromMap(outputMap, "CmfStatus");
  }
}
