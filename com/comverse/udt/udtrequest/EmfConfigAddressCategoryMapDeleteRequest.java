/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigAddressCategoryMapDeleteRequest.java
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
 * Class used to create a EmfConfigAddressCategoryMapDeleteRequest Udt Request
 *
 */

public class EmfConfigAddressCategoryMapDeleteRequest extends EmfConfigAddressCategoryMapRequest {
/**
 *
 * Constructor to create a  EmfConfigAddressCategoryMapDeleteRequest
 * @param id Unique request name
 * @param ECACMDeleteIn EmfConfigAddressCategoryMapObjectData for EmfConfigAddressCategoryMapDeleteRequest
 *
 */
@JsonCreator
  public EmfConfigAddressCategoryMapDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("EmfConfigAddressCategoryMap")EmfConfigAddressCategoryMapObjectData ECACMDeleteIn) {
    super(id, "EmfConfigAddressCategoryMapDelete");
    if (ECACMDeleteIn != null) {
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(ECACMDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }

}
