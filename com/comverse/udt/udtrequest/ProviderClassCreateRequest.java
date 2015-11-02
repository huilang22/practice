/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProviderClassCreateRequest.java
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
 * Class used to create a ProviderClassCreateRequest Udt Request
 *
 */

public class ProviderClassCreateRequest extends ProviderClassSubRequestParent {
/**
 *
 * Constructor to create a  ProviderClassCreateRequest
 * @param id Unique request name
 * @param ProvClsCreateIn ProvClsObjectData for ProviderClassCreateRequest
 *
 */
@JsonCreator
  public ProviderClassCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProviderClass")ProvClsObjectData ProvClsCreateIn) {
    super(id, "ProviderClassCreate");
    if (ProvClsCreateIn != null) {
      addInput("ProviderClass", ProvClsObjectHelper.toMap(ProvClsCreateIn, new HashMap(), "ProviderClass").get("ProviderClass"));
    }
  }

/**
 *
 * Retrieves the ProvClsObjectData that results from the ProviderClassCreateRequest call
 * @return ProvClsObjectData resulting from udt call
 *
 */

  public ProvClsObjectData getOutput() {
    return ProvClsObjectHelper.fromMap(outputMap, "ProviderClass");
  }
}
