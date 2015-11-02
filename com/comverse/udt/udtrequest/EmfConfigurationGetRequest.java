/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigurationGetRequest.java
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
 * Class used to create a EmfConfigurationGetRequest Udt Request
 *
 */

public class EmfConfigurationGetRequest extends EmfConfigurationSubRequestParent {
/**
 *
 * Constructor to create a  EmfConfigurationGetRequest
 * @param id Unique request name
 * @param EmfConfigurationGetIn EmfConfigurationObjectKeyData for EmfConfigurationGetRequest
 *
 */
@JsonCreator
  public EmfConfigurationGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("EmfConfiguration")EmfConfigurationObjectKeyData EmfConfigurationGetIn) {
    super(id, "EmfConfigurationGet");
    if (EmfConfigurationGetIn != null) {
      addInput("EmfConfiguration", EmfConfigurationObjectKeyHelper.toMap(EmfConfigurationGetIn, new HashMap(), "EmfConfigurationObjectKeyData").get("EmfConfigurationObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EmfConfigurationObjectData that results from the EmfConfigurationGetRequest call
 * @return EmfConfigurationObjectData resulting from udt call
 *
 */

  public EmfConfigurationObjectData getOutput() {
    return EmfConfigurationObjectHelper.fromMap(outputMap, "EmfConfiguration");
  }
}
