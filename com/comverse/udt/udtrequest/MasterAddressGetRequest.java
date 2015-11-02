/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressGetRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a MasterAddressGetRequest Udt Request
 *
 */

public class MasterAddressGetRequest extends MasterAddressSubRequestParent {
/**
 *
 * Constructor to create a  MasterAddressGetRequest
 * @param id Unique request name
 * @param MasterAddressGetIn MasterAddressObjectKeyData for MasterAddressGetRequest
 *
 */
@JsonCreator
  public MasterAddressGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("MasterAddress")MasterAddressObjectKeyData MasterAddressGetIn) {
    super(id, "MasterAddressGet");
    if (MasterAddressGetIn != null) {
      addInput("MasterAddress", MasterAddressObjectKeyHelper.toMap(MasterAddressGetIn, new HashMap(), "MasterAddressObjectKeyData").get("MasterAddressObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the MasterAddressObjectData that results from the MasterAddressGetRequest call
 * @return MasterAddressObjectData resulting from udt call
 *
 */

  public MasterAddressObjectData getOutput() {
    return MasterAddressObjectHelper.fromMap(outputMap, "MasterAddress");
  }
}
