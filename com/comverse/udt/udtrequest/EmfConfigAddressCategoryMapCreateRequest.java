/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigAddressCategoryMapCreateRequest.java
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
 * Class used to create a EmfConfigAddressCategoryMapCreateRequest Udt Request
 *
 */

public class EmfConfigAddressCategoryMapCreateRequest extends EmfConfigAddressCategoryMapSubRequestParent {
/**
 *
 * Constructor to create a  EmfConfigAddressCategoryMapCreateRequest
 * @param id Unique request name
 * @param ECACMCreateIn EmfConfigAddressCategoryMapObjectData for EmfConfigAddressCategoryMapCreateRequest
 *
 */
@JsonCreator
  public EmfConfigAddressCategoryMapCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EmfConfigAddressCategoryMap")EmfConfigAddressCategoryMapObjectData ECACMCreateIn) {
    super(id, "EmfConfigAddressCategoryMapCreate");
    if (ECACMCreateIn != null) {
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(ECACMCreateIn, new HashMap(), "EmfConfigAddressCategoryMap").get("EmfConfigAddressCategoryMap"));
    }
  }

/**
 *
 * Retrieves the EmfConfigAddressCategoryMapObjectData that results from the EmfConfigAddressCategoryMapCreateRequest call
 * @return EmfConfigAddressCategoryMapObjectData resulting from udt call
 *
 */

  public EmfConfigAddressCategoryMapObjectData getOutput() {
    return EmfConfigAddressCategoryMapObjectHelper.fromMap(outputMap, "EmfConfigAddressCategoryMap");
  }
}
