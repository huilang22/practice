/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClassOfServiceCodeCreateRequest.java
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
 * Class used to create a ClassOfServiceCodeCreateRequest Udt Request
 *
 */

public class ClassOfServiceCodeCreateRequest extends ClassOfServiceCodeSubRequestParent {
/**
 *
 * Constructor to create a  ClassOfServiceCodeCreateRequest
 * @param id Unique request name
 * @param COSCCreateIn COSCObjectData for ClassOfServiceCodeCreateRequest
 *
 */
@JsonCreator
  public ClassOfServiceCodeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ClassOfServiceCode")COSCObjectData COSCCreateIn) {
    super(id, "ClassOfServiceCodeCreate");
    if (COSCCreateIn != null) {
      addInput("ClassOfServiceCode", COSCObjectHelper.toMap(COSCCreateIn, new HashMap(), "ClassOfServiceCode").get("ClassOfServiceCode"));
    }
  }

/**
 *
 * Retrieves the COSCObjectData that results from the ClassOfServiceCodeCreateRequest call
 * @return COSCObjectData resulting from udt call
 *
 */

  public COSCObjectData getOutput() {
    return COSCObjectHelper.fromMap(outputMap, "ClassOfServiceCode");
  }
}
