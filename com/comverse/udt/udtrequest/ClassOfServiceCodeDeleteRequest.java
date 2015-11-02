/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClassOfServiceCodeDeleteRequest.java
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
 * Class used to create a ClassOfServiceCodeDeleteRequest Udt Request
 *
 */

public class ClassOfServiceCodeDeleteRequest extends ClassOfServiceCodeSubRequestParent {
/**
 *
 * Constructor to create a  ClassOfServiceCodeDeleteRequest
 * @param id Unique request name
 * @param COSCDeleteIn COSCObjectKeyData for ClassOfServiceCodeDeleteRequest
 *
 */
@JsonCreator
  public ClassOfServiceCodeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ClassOfServiceCode")COSCObjectKeyData COSCDeleteIn) {
    super(id, "ClassOfServiceCodeDelete");
    if (COSCDeleteIn != null) {
      addInput("ClassOfServiceCode", COSCObjectKeyHelper.toMap(COSCDeleteIn, new HashMap(), "COSCObjectKeyData").get("COSCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the COSCObjectData that results from the ClassOfServiceCodeDeleteRequest call
 * @return COSCObjectData resulting from udt call
 *
 */

  public COSCObjectData getOutput() {
    return COSCObjectHelper.fromMap(outputMap, "ClassOfServiceCode");
  }
}
