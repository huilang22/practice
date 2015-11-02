/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProviderClassUpdateRequest.java
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
 * Class used to create a ProviderClassUpdateRequest Udt Request
 *
 */

public class ProviderClassUpdateRequest extends ProviderClassSubRequestParent {
/**
 *
 * Constructor to create a  ProviderClassUpdateRequest
 * @param id Unique request name
 * @param ProvClsUpdateIn ProvClsObjectData for ProviderClassUpdateRequest
 *
 */
@JsonCreator
  public ProviderClassUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProviderClass")ProvClsObjectData ProvClsUpdateIn) {
    super(id, "ProviderClassUpdate");
    if (ProvClsUpdateIn != null) {
      addInput("ProviderClass", ProvClsObjectHelper.toMap(ProvClsUpdateIn, new HashMap(), "ProviderClass").get("ProviderClass"));
    }
  }

/**
 *
 * Retrieves the ProvClsObjectData that results from the ProviderClassUpdateRequest call
 * @return ProvClsObjectData resulting from udt call
 *
 */

  public ProvClsObjectData getOutput() {
    return ProvClsObjectHelper.fromMap(outputMap, "ProviderClass");
  }
}
