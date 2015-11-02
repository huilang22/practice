/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigAddressCategoryMapGetRequest.java
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
 * Class used to create a EmfConfigAddressCategoryMapGetRequest Udt Request
 *
 */

public class EmfConfigAddressCategoryMapGetRequest extends EmfConfigAddressCategoryMapSubRequestParent {
/**
 *
 * Constructor to create a  EmfConfigAddressCategoryMapGetRequest
 * @param id Unique request name
 * @param ECACMGetIn EmfConfigAddressCategoryMapObjectKeyData for EmfConfigAddressCategoryMapGetRequest
 *
 */
@JsonCreator
  public EmfConfigAddressCategoryMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("EmfConfigAddressCategoryMap")EmfConfigAddressCategoryMapObjectKeyData ECACMGetIn) {
    super(id, "EmfConfigAddressCategoryMapGet");
    if (ECACMGetIn != null) {
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectKeyHelper.toMap(ECACMGetIn, new HashMap(), "EmfConfigAddressCategoryMapObjectKeyData").get("EmfConfigAddressCategoryMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EmfConfigAddressCategoryMapObjectData that results from the EmfConfigAddressCategoryMapGetRequest call
 * @return EmfConfigAddressCategoryMapObjectData resulting from udt call
 *
 */

  public EmfConfigAddressCategoryMapObjectData getOutput() {
    return EmfConfigAddressCategoryMapObjectHelper.fromMap(outputMap, "EmfConfigAddressCategoryMap");
  }
}
