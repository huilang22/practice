/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusCreateRequest.java
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
 * Class used to create a CmfStatusCreateRequest Udt Request
 *
 */

public class CmfStatusCreateRequest extends CmfStatusSubRequestParent {
/**
 *
 * Constructor to create a  CmfStatusCreateRequest
 * @param id Unique request name
 * @param CSCreateIn CmfStatusObjectData for CmfStatusCreateRequest
 *
 */
@JsonCreator
  public CmfStatusCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfStatus")CmfStatusObjectData CSCreateIn) {
    super(id, "CmfStatusCreate");
    if (CSCreateIn != null) {
      addInput("CmfStatus", CmfStatusObjectHelper.toMap(CSCreateIn, new HashMap(), "CmfStatus").get("CmfStatus"));
    }
  }

/**
 *
 * Retrieves the CmfStatusObjectData that results from the CmfStatusCreateRequest call
 * @return CmfStatusObjectData resulting from udt call
 *
 */

  public CmfStatusObjectData getOutput() {
    return CmfStatusObjectHelper.fromMap(outputMap, "CmfStatus");
  }
}
