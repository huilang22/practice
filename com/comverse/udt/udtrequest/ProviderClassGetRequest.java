/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProviderClassGetRequest.java
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
 * Class used to create a ProviderClassGetRequest Udt Request
 *
 */

public class ProviderClassGetRequest extends ProviderClassSubRequestParent {
/**
 *
 * Constructor to create a  ProviderClassGetRequest
 * @param id Unique request name
 * @param ProvClsGetIn ProvClsObjectKeyData for ProviderClassGetRequest
 *
 */
@JsonCreator
  public ProviderClassGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProviderClass")ProvClsObjectKeyData ProvClsGetIn) {
    super(id, "ProviderClassGet");
    if (ProvClsGetIn != null) {
      addInput("ProviderClass", ProvClsObjectKeyHelper.toMap(ProvClsGetIn, new HashMap(), "ProvClsObjectKeyData").get("ProvClsObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ProvClsObjectData that results from the ProviderClassGetRequest call
 * @return ProvClsObjectData resulting from udt call
 *
 */

  public ProvClsObjectData getOutput() {
    return ProvClsObjectHelper.fromMap(outputMap, "ProviderClass");
  }
}
