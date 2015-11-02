/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClassOfServiceCodeGetRequest.java
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
 * Class used to create a ClassOfServiceCodeGetRequest Udt Request
 *
 */

public class ClassOfServiceCodeGetRequest extends ClassOfServiceCodeSubRequestParent {
/**
 *
 * Constructor to create a  ClassOfServiceCodeGetRequest
 * @param id Unique request name
 * @param COSCGetIn COSCObjectKeyData for ClassOfServiceCodeGetRequest
 *
 */
@JsonCreator
  public ClassOfServiceCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ClassOfServiceCode")COSCObjectKeyData COSCGetIn) {
    super(id, "ClassOfServiceCodeGet");
    if (COSCGetIn != null) {
      addInput("ClassOfServiceCode", COSCObjectKeyHelper.toMap(COSCGetIn, new HashMap(), "COSCObjectKeyData").get("COSCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the COSCObjectData that results from the ClassOfServiceCodeGetRequest call
 * @return COSCObjectData resulting from udt call
 *
 */

  public COSCObjectData getOutput() {
    return COSCObjectHelper.fromMap(outputMap, "ClassOfServiceCode");
  }
}
