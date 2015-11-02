/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAttributesDefCreateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CcAttributesDefCreateRequest Udt Request
 *
 */

public class CcAttributesDefCreateRequest extends CcAttributesDefSubRequestParent {
/**
 *
 * Constructor to create a  CcAttributesDefCreateRequest
 * @param id Unique request name
 * @param CADcreate_In CcAttributesDefObjectData for CcAttributesDefCreateRequest
 *
 */
@JsonCreator
  public CcAttributesDefCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CcAttributesDef")CcAttributesDefObjectData CADcreate_In) {
    super(id, "CcAttributesDefCreate");
    if (CADcreate_In != null) {
      addInput("CcAttributesDef", CcAttributesDefObjectHelper.toMap(CADcreate_In, new HashMap(), "CcAttributesDef").get("CcAttributesDef"));
    }
  }

/**
 *
 * Retrieves the CcAttributesDefObjectData that results from the CcAttributesDefCreateRequest call
 * @return CcAttributesDefObjectData resulting from udt call
 *
 */

  public CcAttributesDefObjectData getOutput() {
    return CcAttributesDefObjectHelper.fromMap(outputMap, "CcAttributesDef");
  }
}
