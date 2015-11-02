/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressUpdateRequest.java
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
 * Class used to create a MasterAddressUpdateRequest Udt Request
 *
 */

public class MasterAddressUpdateRequest extends MasterAddressSubRequestParent {
/**
 *
 * Constructor to create a  MasterAddressUpdateRequest
 * @param id Unique request name
 * @param MasterAddressUpdateIn MasterAddressObjectData for MasterAddressUpdateRequest
 *
 */
@JsonCreator
  public MasterAddressUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("MasterAddress")MasterAddressObjectData MasterAddressUpdateIn) {
    super(id, "MasterAddressUpdate");
    if (MasterAddressUpdateIn != null) {
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(MasterAddressUpdateIn, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }

/**
 *
 * Retrieves the MasterAddressObjectData that results from the MasterAddressUpdateRequest call
 * @return MasterAddressObjectData resulting from udt call
 *
 */

  public MasterAddressObjectData getOutput() {
    return MasterAddressObjectHelper.fromMap(outputMap, "MasterAddress");
  }
}
