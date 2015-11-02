/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressExtendedDataFindRequest.java
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
 * Class used to create a MasterAddressExtendedDataFindRequest Udt Request
 *
 */

public class MasterAddressExtendedDataFindRequest extends MasterAddressRequest {
/**
 *
 * Constructor to create a  MasterAddressExtendedDataFindRequest
 * @param id Unique request name
 * @param medfIn MasterAddressObjectKeyData for MasterAddressExtendedDataFindRequest
 *
 */
@JsonCreator
  public MasterAddressExtendedDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("MasterAddress")MasterAddressObjectKeyData medfIn) {
    super(id, "MasterAddressExtendedDataFind");
    if (medfIn != null) {
      addInput("MasterAddress", MasterAddressObjectKeyHelper.toMap(medfIn, new HashMap(), "MasterAddressObjectKeyData").get("MasterAddressObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the MasterAddressEDObjectDataList that results from the MasterAddressExtendedDataFindRequest call
 * @return MasterAddressEDObjectDataList resulting from udt call
 *
 */

  public MasterAddressEDObjectDataList getOutput() {
    return MasterAddressEDObjectHelper.fromMapList(outputMap, "MasterAddressExtendedDataList");
  }
}
