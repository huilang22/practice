/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClassOfServiceCodeUpdateRequest.java
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
 * Class used to create a ClassOfServiceCodeUpdateRequest Udt Request
 *
 */

public class ClassOfServiceCodeUpdateRequest extends ClassOfServiceCodeSubRequestParent {
/**
 *
 * Constructor to create a  ClassOfServiceCodeUpdateRequest
 * @param id Unique request name
 * @param COSCUpdateIn COSCObjectData for ClassOfServiceCodeUpdateRequest
 *
 */
@JsonCreator
  public ClassOfServiceCodeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ClassOfServiceCode")COSCObjectData COSCUpdateIn) {
    super(id, "ClassOfServiceCodeUpdate");
    if (COSCUpdateIn != null) {
      addInput("ClassOfServiceCode", COSCObjectHelper.toMap(COSCUpdateIn, new HashMap(), "ClassOfServiceCode").get("ClassOfServiceCode"));
    }
  }

/**
 *
 * Retrieves the COSCObjectData that results from the ClassOfServiceCodeUpdateRequest call
 * @return COSCObjectData resulting from udt call
 *
 */

  public COSCObjectData getOutput() {
    return COSCObjectHelper.fromMap(outputMap, "ClassOfServiceCode");
  }
}
