/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigAddressCategoryMapUpdateRequest.java
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
 * Class used to create a EmfConfigAddressCategoryMapUpdateRequest Udt Request
 *
 */

public class EmfConfigAddressCategoryMapUpdateRequest extends EmfConfigAddressCategoryMapSubRequestParent {
/**
 *
 * Constructor to create a  EmfConfigAddressCategoryMapUpdateRequest
 * @param id Unique request name
 * @param ECACMUpdateIn EmfConfigAddressCategoryMapObjectData for EmfConfigAddressCategoryMapUpdateRequest
 *
 */
@JsonCreator
  public EmfConfigAddressCategoryMapUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EmfConfigAddressCategoryMap")EmfConfigAddressCategoryMapObjectData ECACMUpdateIn) {
    super(id, "EmfConfigAddressCategoryMapUpdate");
    if (ECACMUpdateIn != null) {
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(ECACMUpdateIn, new HashMap(), "EmfConfigAddressCategoryMap").get("EmfConfigAddressCategoryMap"));
    }
  }

/**
 *
 * Retrieves the EmfConfigAddressCategoryMapObjectData that results from the EmfConfigAddressCategoryMapUpdateRequest call
 * @return EmfConfigAddressCategoryMapObjectData resulting from udt call
 *
 */

  public EmfConfigAddressCategoryMapObjectData getOutput() {
    return EmfConfigAddressCategoryMapObjectHelper.fromMap(outputMap, "EmfConfigAddressCategoryMap");
  }
}
