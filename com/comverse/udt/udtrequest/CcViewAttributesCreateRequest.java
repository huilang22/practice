/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewAttributesCreateRequest.java
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
 * Class used to create a CcViewAttributesCreateRequest Udt Request
 *
 */

public class CcViewAttributesCreateRequest extends CcViewAttributesSubRequestParent {
/**
 *
 * Constructor to create a  CcViewAttributesCreateRequest
 * @param id Unique request name
 * @param CVAcreate_In CcViewAttributesObjectData for CcViewAttributesCreateRequest
 *
 */
@JsonCreator
  public CcViewAttributesCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CcViewAttributes")CcViewAttributesObjectData CVAcreate_In) {
    super(id, "CcViewAttributesCreate");
    if (CVAcreate_In != null) {
      addInput("CcViewAttributes", CcViewAttributesObjectHelper.toMap(CVAcreate_In, new HashMap(), "CcViewAttributes").get("CcViewAttributes"));
    }
  }

/**
 *
 * Retrieves the CcViewAttributesObjectData that results from the CcViewAttributesCreateRequest call
 * @return CcViewAttributesObjectData resulting from udt call
 *
 */

  public CcViewAttributesObjectData getOutput() {
    return CcViewAttributesObjectHelper.fromMap(outputMap, "CcViewAttributes");
  }
}
