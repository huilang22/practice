/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressFindWithExtendedDataRequest.java
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
 * Class used to create a MasterAddressFindWithExtendedDataRequest Udt Request
 *
 */

public class MasterAddressFindWithExtendedDataRequest extends MasterAddressRequest {
/**
 *
 * Constructor to create a  MasterAddressFindWithExtendedDataRequest
 * @param id Unique request name
 * @param MAFindWithIn MasterAddressObjectFilter for MasterAddressFindWithExtendedDataRequest
 *
 */
@JsonCreator
  public MasterAddressFindWithExtendedDataRequest(@JsonProperty("RequestId") String id, @JsonProperty("MasterAddress")MasterAddressObjectFilter MAFindWithIn) {
    super(id, "MasterAddressFindWithExtendedData");
    if (MAFindWithIn != null) {
      Integer index =  MAFindWithIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(MAFindWithIn, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }

/**
 *
 * Retrieves the MasterAddressObjectDataList that results from the MasterAddressFindWithExtendedDataRequest call
 * @return MasterAddressObjectDataList resulting from udt call
 *
 */

  public MasterAddressObjectDataList getOutput() {
    return MasterAddressObjectHelper.fromMapList(outputMap, "MasterAddressList");
  }
}
