/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProviderClassDeleteRequest.java
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
 * Class used to create a ProviderClassDeleteRequest Udt Request
 *
 */

public class ProviderClassDeleteRequest extends ProviderClassSubRequestParent {
/**
 *
 * Constructor to create a  ProviderClassDeleteRequest
 * @param id Unique request name
 * @param ProvClsDeleteIn ProvClsObjectKeyData for ProviderClassDeleteRequest
 *
 */
@JsonCreator
  public ProviderClassDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProviderClass")ProvClsObjectKeyData ProvClsDeleteIn) {
    super(id, "ProviderClassDelete");
    if (ProvClsDeleteIn != null) {
      addInput("ProviderClass", ProvClsObjectKeyHelper.toMap(ProvClsDeleteIn, new HashMap(), "ProvClsObjectKeyData").get("ProvClsObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ProvClsObjectData that results from the ProviderClassDeleteRequest call
 * @return ProvClsObjectData resulting from udt call
 *
 */

  public ProvClsObjectData getOutput() {
    return ProvClsObjectHelper.fromMap(outputMap, "ProviderClass");
  }
}
